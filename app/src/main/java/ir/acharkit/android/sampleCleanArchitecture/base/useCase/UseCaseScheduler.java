package ir.acharkit.android.sampleCleanArchitecture.base.useCase;

public interface UseCaseScheduler {

    void execute(Runnable runnable);

    <V extends UseCase.ResponseValue, E extends UseCase.ErrorValue> void notifyResponse(final V response,
                                                                                        final UseCase.UseCaseCallback<V, E> useCaseCallback);

    <V extends UseCase.ResponseValue, E extends UseCase.ErrorValue> void onError(final E error,
                                                                                 final UseCase.UseCaseCallback<V, E> useCaseCallback);

}
