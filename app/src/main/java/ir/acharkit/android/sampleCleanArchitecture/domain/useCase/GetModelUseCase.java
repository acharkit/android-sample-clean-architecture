package ir.acharkit.android.sampleCleanArchitecture.domain.useCase;

import ir.acharkit.android.sampleCleanArchitecture.base.useCase.UseCase;
import ir.acharkit.android.sampleCleanArchitecture.data.source.Repository;
import ir.acharkit.android.sampleCleanArchitecture.domain.model.ExampleModel;

/**
 * Author:  Alireza Tizfahm Fard
 * Date:    2/10/19
 * Email:   alirezat775@gmail.com
 */

public class GetModelUseCase extends UseCase<GetModelUseCase.RequestValues, GetModelUseCase.ResponseValue, GetModelUseCase.ErrorValue> {

    private final Repository repository;

    public GetModelUseCase(Repository repository) {
        this.repository = repository;
    }

    @Override
    protected void executeUseCase(RequestValues requestValues) {
    }

    @Override
    protected ResponseValue executeUseCaseSync(RequestValues requestValues) {
        return new ResponseValue(repository.getExample(requestValues.getId()));
    }

    public static class RequestValues implements UseCase.RequestValues {

        private int id;

        public RequestValues(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

    }

    public static class ResponseValue implements UseCase.ResponseValue {

        private ExampleModel model;

        public ResponseValue(ExampleModel model) {
            this.model = model;
        }

        public ExampleModel getModel() {
            return model;
        }
    }

    public static class ErrorValue implements UseCase.ErrorValue {

        private String message;

        public ErrorValue(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
