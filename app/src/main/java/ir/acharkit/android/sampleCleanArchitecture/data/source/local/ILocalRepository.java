package ir.acharkit.android.sampleCleanArchitecture.data.source.local;

import ir.acharkit.android.sampleCleanArchitecture.domain.model.ExampleModel;

/**
 * Author:  Alireza Tizfahm Fard
 * Date:    2/1/19
 * Email:   alirezat775@gmail.com
 */

public interface ILocalRepository {

    ExampleModel getExampleLocal(int id);

    void addExampleLocal(ExampleModel model);

}
