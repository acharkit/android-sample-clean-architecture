package ir.acharkit.android.sampleCleanArchitecture.base.useCase;


public abstract class UseCase<Q extends UseCase.RequestValues, P extends UseCase.ResponseValue, Z extends UseCase.ErrorValue> {

    private Q mRequestValues;

    private UseCaseCallback<P, Z> mUseCaseCallback;

    public Q getRequestValues() {
        return mRequestValues;
    }

    public void setRequestValues(Q requestValues) {
        mRequestValues = requestValues;
    }

    public UseCaseCallback<P, Z> getUseCaseCallback() {
        return mUseCaseCallback;
    }

    public void setUseCaseCallback(UseCaseCallback<P, Z> useCaseCallback) {
        mUseCaseCallback = useCaseCallback;
    }

    void run() {
        executeUseCase(mRequestValues);
    }

    P runSync() {
        return executeUseCaseSync(mRequestValues);
    }

    protected abstract void executeUseCase(Q requestValues);

    protected abstract P executeUseCaseSync(Q requestValues);

    /**
     * Data passed to a request.
     */
    public interface RequestValues {
    }

    /**
     * Data received from a request.
     */
    public interface ResponseValue {
    }

    /**
     * Error received from a request.
     */
    public interface ErrorValue {
    }

    public interface UseCaseCallback<R, E> {
        void onSuccess(R response);

        void onError(E error);
    }
}
