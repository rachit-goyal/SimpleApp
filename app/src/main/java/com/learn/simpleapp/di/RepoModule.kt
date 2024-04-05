package com.learn.simpleapp.di

import com.learn.simpleapp.data.userDataImpl
import com.learn.simpleapp.domain.UserData
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

/**
created by Rachit on 4/5/2024.
 */



@Module
@InstallIn(ViewModelComponent::class)
abstract class RepoModule {


    @Binds
    abstract fun getRepo(userDataImpl: userDataImpl):UserData

}