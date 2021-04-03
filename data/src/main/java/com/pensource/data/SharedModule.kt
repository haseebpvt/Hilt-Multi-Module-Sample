package com.pensource.data

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object SharedModule {

    @Singleton
    @Provides
    fun provideStringHelper(preferences: SharedPreferences): StringHelper {
        return DefaultStringHelper(preferences)
    }

    @Singleton
    @Provides
    fun provideSharedPreference(@ApplicationContext context: Context): SharedPreferences {
        return context.getSharedPreferences("my_pref", Context.MODE_PRIVATE)
    }
}