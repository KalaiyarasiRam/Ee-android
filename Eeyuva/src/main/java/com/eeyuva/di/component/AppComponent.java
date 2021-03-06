package com.eeyuva.di.component;

import android.content.Context;

import com.eeyuva.Application;
import com.eeyuva.apiservice.Api;
import com.eeyuva.di.module.AppModules;
import com.eeyuva.di.module.NetworkModule;
import com.eeyuva.di.scope.GsonRestAdapter;
import com.eeyuva.interactor.DriverInteractor;
import com.eeyuva.utils.preferences.PrefsManager;
import com.eeyuva.di.module.PresentationModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

@Singleton
@Component(modules = {AppModules.class, NetworkModule.class, PresentationModule.class})
public interface AppComponent {

    void inject(Application driverApplication);

    Context context();

    Api apiHal();

    @GsonRestAdapter
    Api apiGson();

    Retrofit retrofit();

    DriverInteractor driverInteractor();

    PrefsManager prefsManager();


}
