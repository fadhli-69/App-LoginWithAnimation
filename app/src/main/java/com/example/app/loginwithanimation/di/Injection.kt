package com.example.app.loginwithanimation.di

import android.content.Context
import com.example.app.loginwithanimation.data.UserRepository
import com.example.app.loginwithanimation.data.pref.UserPreference
import com.example.app.loginwithanimation.data.pref.dataStore

object Injection {
    fun provideRepository(context: Context): UserRepository {
        val pref = UserPreference.getInstance(context.dataStore)
        return UserRepository.getInstance(pref)
    }
}