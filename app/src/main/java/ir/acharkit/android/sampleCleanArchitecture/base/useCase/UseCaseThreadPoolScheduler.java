package ir.acharkit.android.sampleCleanArchitecture.base.useCase;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class UseCaseThreadPoolScheduler implements UseCaseScheduler {

    private static final int POOL_SIZE = 2;
    private static final int MAX_POOL_SIZE = 4;
    private static final int TIMEOUT = 30;
    private ThreadPoolExecutor mThreadPoolExecutor;

    UseCaseThreadPoolScheduler() {
        mThreadPoolExecutor = new ThreadPoolExecutor(POOL_SIZE, MAX_POOL_SIZE, TIMEOUT, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(POOL_SIZE));
    }

    @Override
    public void execute(Runnable runnable) {
        mThreadPoolExecutor.execute(runnable);
    }

    @Override
    public <V extends UseCase.ResponseValue, E extends UseCase.ErrorValue> void notifyResponse(final V response, final UseCase.UseCaseCallback<V, E> useCaseCallback) {
        useCaseCallback.onSuccess(response);
    }

    @Override
    public <V extends UseCase.ResponseValue, E extends UseCase.ErrorValue> void onError(final E error, final UseCase.UseCaseCallback<V, E> useCaseCallback) {
        useCaseCallback.onError(error);
    }

}
