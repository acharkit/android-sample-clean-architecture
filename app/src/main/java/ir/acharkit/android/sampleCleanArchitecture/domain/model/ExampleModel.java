package ir.acharkit.android.sampleCleanArchitecture.domain.model;

/**
 * Author:  Alireza Tizfahm Fard
 * Date:    2/10/19
 * Email:   alirezat775@gmail.com
 */

public class ExampleModel {

    private int id;
    private String name;

    public ExampleModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
