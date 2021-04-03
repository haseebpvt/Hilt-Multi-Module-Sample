package com.pensource.data

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object SharedModule {

    @Singleton
    @Provides
    fun provideStringHelper(): StringHelper {
        return DefaultStringHelper()
    }
}