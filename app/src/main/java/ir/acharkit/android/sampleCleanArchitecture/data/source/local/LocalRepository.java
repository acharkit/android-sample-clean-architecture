package ir.acharkit.android.sampleCleanArchitecture.data.source.local;

public class LocalRepository implements ILocalRepository {

    private static LocalRepository instance;

    public static LocalRepository getInstance() {
        if (instance == null)
            instance = new LocalRepository();
        return instance;
    }

}
