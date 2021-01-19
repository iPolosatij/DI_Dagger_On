package space.digitallab.di_dager_on.dagger;

import dagger.Module;
import dagger.Provides;
import space.digitallab.di_dager_on.DatabaseHelper;

@Module
public class StorageModule {

    @Provides
    DatabaseHelper provideDatabaseHelper() {
        return new DatabaseHelper();
    }

}
