package com.learn.simpleapp.di

import android.app.Application
import androidx.room.Room
import com.learn.simpleapp.data.AppDatabase
import com.learn.simpleapp.data.Dao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
created by Rachit on 4/5/2024.
 */

@InstallIn(SingletonComponent::class)
@Module
object DatabseModule {

    @Provides
    @Singleton
    fun provideDb(application: Application): AppDatabase {
        return Room
            .databaseBuilder(
                application,
                AppDatabase::class.java,
                "MExpenseDb"
            ).build()
    }
    @Provides
    @Singleton
    fun provideTripRepository(mExpenseDb: AppDatabase): Dao {
        return mExpenseDb.userDao()

    }
}