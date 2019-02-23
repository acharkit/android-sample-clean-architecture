package ir.acharkit.android.sampleCleanArchitecture.base;

public interface BaseView <T extends BasePresenter> {
    void setPresenter(T presenter);
}