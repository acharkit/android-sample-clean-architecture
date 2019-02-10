package ir.acharkit.android.sampleCleanArchitecture.data.source.local;


import ir.acharkit.android.sampleCleanArchitecture.domain.model.ExampleModel;

/**
 * Author:  Alireza Tizfahm Fard
 * Date:    2/1/19
 * Email:   alirezat775@gmail.com
 */

public class LocalRepository implements ILocalRepository {

    private static LocalRepository instance;

    public static LocalRepository getInstance() {
        if (instance == null)
            instance = new LocalRepository();
        return instance;
    }

    @Override
    public ExampleModel getExampleLocal(int id) {
        // implement application storage (db , preferences, ......)

        // for test return fake response
        return new ExampleModel(1, "hello clean architecture");
    }

    @Override
    public void addExampleLocal(ExampleModel model) {
        // implement application storage (db , preferences, ......)
    }
}
