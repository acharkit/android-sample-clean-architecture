package ir.acharkit.android.sampleCleanArchitecture.data.source.remote;

public class RemoteRepository implements IRemoteRepository {

    private static RemoteRepository instance;

    public static RemoteRepository getInstance() {
        if (instance == null)
            instance = new RemoteRepository();
        return instance;
    }
}
