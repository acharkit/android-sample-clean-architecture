package ir.acharkit.android.sampleCleanArchitecture.presenter;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import ir.acharkit.android.sampleCleanArchitecture.R;
import ir.acharkit.android.sampleCleanArchitecture.di.Injection;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private static final String TAG = MainActivity.class.getSimpleName();
    private MainContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new MainPresenter(this, Injection.provideUseCaseHandler());

        presenter.init();

    }

    @Override
    public Activity getActivity() {
        return this;
    }


    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        this.presenter = presenter;
    }


}
