package ir.acharkit.android.sampleCleanArchitecture.presenter;

import android.app.Activity;

import ir.acharkit.android.sampleCleanArchitecture.base.useCase.UseCaseHandler;

public class MainPresenter implements MainContract.Presenter {

    private final MainContract.View view;
    private final UseCaseHandler useCaseHandler;

    public MainPresenter(MainContract.View view, UseCaseHandler useCaseHandler) {
        this.view = view;
        this.useCaseHandler = useCaseHandler;
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

}
