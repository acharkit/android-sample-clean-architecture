package ir.acharkit.android.sampleCleanArchitecture.domain.useCase;

import ir.acharkit.android.sampleCleanArchitecture.base.useCase.UseCase;
import ir.acharkit.android.sampleCleanArchitecture.data.source.Repository;
import ir.acharkit.android.sampleCleanArchitecture.domain.model.ExampleModel;

/**
 * Author:  Alireza Tizfahm Fard
 * Date:    2/10/19
 * Email:   alirezat775@gmail.com
 */

public class AddExample extends UseCase<AddExample.RequestValues, AddExample.ResponseValue, AddExample.ErrorValue> {

    private final Repository repository;

    public AddExample(Repository repository) {
        this.repository = repository;
    }

    @Override
    protected void executeUseCase(RequestValues requestValues) {

    }

    @Override
    protected ResponseValue executeUseCaseSync(RequestValues requestValues) {
        repository.addExample(requestValues.getModel());
        return new ResponseValue();
    }

    public static class RequestValues implements UseCase.RequestValues {

        private ExampleModel model;

        public RequestValues(ExampleModel model) {
            this.model = model;
        }

        public ExampleModel getModel() {
            return model;
        }

    }

    public static class ResponseValue implements UseCase.ResponseValue {

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
