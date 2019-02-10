package ir.acharkit.android.sampleCleanArchitecture.di;


import ir.acharkit.android.sampleCleanArchitecture.base.useCase.UseCaseHandler;
import ir.acharkit.android.sampleCleanArchitecture.data.source.Repository;
import ir.acharkit.android.sampleCleanArchitecture.data.source.local.LocalRepository;
import ir.acharkit.android.sampleCleanArchitecture.data.source.remote.RemoteRepository;
import ir.acharkit.android.sampleCleanArchitecture.domain.useCase.AddExample;
import ir.acharkit.android.sampleCleanArchitecture.domain.useCase.GetExample;

/**
 * Author:  Alireza Tizfahm Fard
 * Date:    2/10/19
 * Email:   alirezat775@gmail.com
 */

public class Injection {

    private static Repository provideRepository() {
        return Repository.getInstance(RemoteRepository.getInstance(), LocalRepository.getInstance());
    }

    public static UseCaseHandler provideUseCaseHandler() {
        return UseCaseHandler.getInstance();
    }

    public static GetExample provideGetExample() {
        return new GetExample(provideRepository());
    }

    public static AddExample provideAddExample() {
        return new AddExample(provideRepository());
    }

}
