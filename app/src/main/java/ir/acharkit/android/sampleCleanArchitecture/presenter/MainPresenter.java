package ir.acharkit.android.sampleCleanArchitecture.presenter;

import android.app.Activity;

import ir.acharkit.android.sampleCleanArchitecture.base.useCase.UseCaseHandler;
import ir.acharkit.android.sampleCleanArchitecture.domain.model.ExampleModel;
import ir.acharkit.android.sampleCleanArchitecture.domain.useCase.GetModelUseCase;

/**
 * Author:  Alireza Tizfahm Fard
 * Date:    $date
 * Email:   alirezat775@gmail.com
 */

public class MainPresenter implements MainContract.Presenter {

    private final GetModelUseCase getModelUseCase;
    private final MainContract.View view;
    private final UseCaseHandler useCaseHandler;

    public MainPresenter(MainContract.View view, UseCaseHandler useCaseHandler, GetModelUseCase getModelUseCase) {
        this.view = view;
        this.useCaseHandler = useCaseHandler;
        this.getModelUseCase = getModelUseCase;
        view.setPresenter(this);
    }

    @Override
    public void init() {
        // initialize
    }

    @Override
    public Activity getActivity() {
        return view.getActivity();
    }

    @Override
    public ExampleModel getItem(int id) {
        GetModelUseCase.ResponseValue response = useCaseHandler.executeSync(getModelUseCase, new GetModelUseCase.RequestValues(id));
        return response.getModel();
    }
}
