package ir.acharkit.android.sampleCleanArchitecture.data.source.remote;


import ir.acharkit.android.sampleCleanArchitecture.data.source.local.ILocalRepository;

/**
 * Author:  Alireza Tizfahm Fard
 * Date:    2/1/19
 * Email:   alirezat775@gmail.com
 */

public class RemoteRepository implements ILocalRepository {

    private static RemoteRepository instance;

    public static RemoteRepository getInstance() {
        if (instance == null)
            instance = new RemoteRepository();
        return instance;
    }
}
