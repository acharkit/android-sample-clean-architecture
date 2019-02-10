package ir.acharkit.android.sampleCleanArchitecture.data.source.local;


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
}
