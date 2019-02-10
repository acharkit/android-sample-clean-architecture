package ir.acharkit.android.sampleCleanArchitecture.data.source;

import ir.acharkit.android.sampleCleanArchitecture.data.source.local.LocalRepository;
import ir.acharkit.android.sampleCleanArchitecture.data.source.remote.RemoteRepository;

/**
 * Author:  Alireza Tizfahm Fard
 * Date:    2/1/19
 * Email:   alirezat775@gmail.com
 */

public class Repository implements IRepository {

    private static Repository instance = null;

    private RemoteRepository remoteRepository;
    private LocalRepository localRepository;

    private Repository(RemoteRepository remoteRepository, LocalRepository localRepository) {
        this.remoteRepository = remoteRepository;
        this.localRepository = localRepository;
    }

    public static Repository getInstance(RemoteRepository remoteRepository, LocalRepository localRepository) {
        if (instance == null) {
            instance = new Repository(remoteRepository, localRepository);
        }
        return instance;
    }

    public static void destroyInstance() {
        instance = null;
    }
}
