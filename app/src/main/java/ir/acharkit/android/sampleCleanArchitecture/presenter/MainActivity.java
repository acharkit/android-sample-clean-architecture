package ir.acharkit.android.sampleCleanArchitecture.presenter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import ir.acharkit.android.sampleCleanArchitecture.R;
import ir.acharkit.android.sampleCleanArchitecture.di.Injection;
import ir.acharkit.android.sampleCleanArchitecture.domain.model.ExampleModel;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private static final String TAG = MainActivity.class.getSimpleName();
    private MainContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new MainPresenter(this, Injection.provideUseCaseHandler(), Injection.provideGetModelUseCase());

        presenter.init();

        showModel();
    }

    @Override
    public Activity getActivity() {
        return this;
    }

    @Override
    public void showModel() {
        ExampleModel model = presenter.getItem(1);
        Log.d(TAG, "showModel: " + model.getId() + " -- " + model.getName());
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        this.presenter = presenter;
    }


}
