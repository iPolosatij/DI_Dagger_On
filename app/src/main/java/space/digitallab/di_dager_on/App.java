package space.digitallab.di_dager_on;

import android.app.Application;

import space.digitallab.di_dager_on.dagger.AppComponent;
import space.digitallab.di_dager_on.dagger.DaggerAppComponent;


public class App extends Application {

    private static AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    public static AppComponent getComponent() {
        return component;
    }

}