package ir.acharkit.android.sampleCleanArchitecture.presenter;

import android.app.Activity;

import ir.acharkit.android.sampleCleanArchitecture.base.BasePresenter;
import ir.acharkit.android.sampleCleanArchitecture.base.BaseView;

public class MainContract {

    public interface View extends BaseView<Presenter> {

        Activity getActivity();

    }

    public interface Presenter extends BasePresenter {

        void init();

        Activity getActivity();

    }
}
