package space.digitallab.di_dager_on.dagger;

import dagger.Component;
import space.digitallab.di_dager_on.DatabaseHelper;
import space.digitallab.di_dager_on.MainActivity;
import space.digitallab.di_dager_on.NetworkUtils;

@Component(modules = {StorageModule.class, NetworkModule.class})
public interface AppComponent {
    NetworkUtils getNetworkUtils();
    DatabaseHelper getDatabaseHelper();
    void injectsMainActivity(MainActivity mainActivity);
}