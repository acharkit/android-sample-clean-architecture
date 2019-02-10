package ir.acharkit.android.sampleCleanArchitecture.data.source;

import ir.acharkit.android.sampleCleanArchitecture.domain.model.ExampleModel;

/**
 * Author:  Alireza Tizfahm Fard
 * Date:    2/1/19
 * Email:   alirezat775@gmail.com
 */

public interface IRepository {

    ExampleModel getExample(int id);

    void addExample(ExampleModel model);
}
