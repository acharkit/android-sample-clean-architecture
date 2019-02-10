package ir.acharkit.android.sampleCleanArchitecture;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.runner.AndroidJUnit4;
import ir.acharkit.android.sampleCleanArchitecture.base.useCase.UseCaseHandler;
import ir.acharkit.android.sampleCleanArchitecture.di.Injection;
import ir.acharkit.android.sampleCleanArchitecture.domain.useCase.GetModelUseCase;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(AndroidJUnit4.class)
public class GetModelUseCaseTest {

    private final String TAG = GetModelUseCaseTest.class.getName();
    private GetModelUseCase getModelUseCase;
    private UseCaseHandler useCaseHandler;
    private int itemId = 1;

    @Before
    public void init() {
        useCaseHandler = Injection.provideUseCaseHandler();
        getModelUseCase = Injection.provideGetModelUseCase();
    }

    @Test
    public void testGetModelUseCaseSync() {
        GetModelUseCase.ResponseValue response = useCaseHandler.executeSync(getModelUseCase, new GetModelUseCase.RequestValues(itemId));
        assertThat(response.getModel() != null, is(true));

    }
}
