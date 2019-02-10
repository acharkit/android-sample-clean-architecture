package ir.acharkit.android.sampleCleanArchitecture.data.source;

import ir.acharkit.android.sampleCleanArchitecture.data.source.local.ILocalRepository;
import ir.acharkit.android.sampleCleanArchitecture.data.source.remote.IRemoteRepository;
import ir.acharkit.android.sampleCleanArchitecture.domain.model.ExampleModel;

/**
 * Author:  Alireza Tizfahm Fard
 * Date:    2/1/19
 * Email:   alirezat775@gmail.com
 */

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

    @Override
    public ExampleModel getExample(int id) {
        return localRepository.getExampleLocal(id);
    }

    @Override
    public void addExample(ExampleModel model) {
        localRepository.addExampleLocal(model);
    }
}
