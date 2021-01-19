package space.digitallab.di_dager_on.dagger;

import dagger.Module;
import dagger.Provides;
import space.digitallab.di_dager_on.NetworkUtils;

@Module
public class NetworkModule {

    @Provides
    NetworkUtils provideNetworkUtils() {
        return new NetworkUtils();
    }

}
