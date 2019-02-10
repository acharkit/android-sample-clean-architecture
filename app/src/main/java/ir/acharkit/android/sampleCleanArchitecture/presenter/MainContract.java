package ir.acharkit.android.sampleCleanArchitecture.presenter;

import android.app.Activity;

import ir.acharkit.android.sampleCleanArchitecture.base.BasePresenter;
import ir.acharkit.android.sampleCleanArchitecture.base.BaseView;
import ir.acharkit.android.sampleCleanArchitecture.domain.model.ExampleModel;

/**
 * Author:  Alireza Tizfahm Fard
 * Date:    $date
 * Email:   alirezat775@gmail.com
 */

public class MainContract {

    public interface View extends BaseView<Presenter> {

        Activity getActivity();

        void showModel();

    }

    public interface Presenter extends BasePresenter {

        void init();

        Activity getActivity();

        ExampleModel getItem(int id);

    }
}
