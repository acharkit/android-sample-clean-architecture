package ir.acharkit.android.sampleCleanArchitecture.di;


import ir.acharkit.android.sampleCleanArchitecture.base.useCase.UseCaseHandler;
import ir.acharkit.android.sampleCleanArchitecture.data.source.Repository;
import ir.acharkit.android.sampleCleanArchitecture.data.source.local.LocalRepository;
import ir.acharkit.android.sampleCleanArchitecture.data.source.remote.RemoteRepository;

/**
 * Author:  Alireza Tizfahm Fard
 * Date:    2/1/19
 * Email:   alirezat775@gmail.com
 */

public class Injection {

    private static Repository provideRepository() {
        return Repository.getInstance(RemoteRepository.getInstance(), LocalRepository.getInstance());
    }

    public static UseCaseHandler provideUseCaseHandler() {
        return UseCaseHandler.getInstance();
    }


}
