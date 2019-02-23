package ir.acharkit.android.sampleCleanArchitecture.data.source;

import ir.acharkit.android.sampleCleanArchitecture.data.source.local.ILocalRepository;
import ir.acharkit.android.sampleCleanArchitecture.data.source.remote.IRemoteRepository;

public class Repository implements IRepository {

    private static Repository instance = null;

    private IRemoteRepository remoteRepository;
    private ILocalRepository localRepository;

    private Repository(IRemoteRepository remoteRepository, ILocalRepository localRepository) {
        this.remoteRepository = remoteRepository;
        this.localRepository = localRepository;
    }

    public static Repository getInstance(IRemoteRepository remoteRepository, ILocalRepository localRepository) {
        if (instance == null) {
            instance = new Repository(remoteRepository, localRepository);
        }
        return instance;
    }

    public static void destroyInstance() {
        instance = null;
    }

}
