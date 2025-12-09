package com.example.blackfridaysale.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.example.blackfridaysale.model.SupportedLanguage
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")

class LanguageStorage(private val context: Context) {

    companion object {
        val LANGUAGE_KEY = stringPreferencesKey("selected_language_code")
    }

    val languageFlow: Flow<SupportedLanguage> = context.dataStore.data
        .map { preferences ->
            val code = preferences[LANGUAGE_KEY] ?: SupportedLanguage.ENGLISH.code
            SupportedLanguage.values().find { it.code == code } ?: SupportedLanguage.ENGLISH
        }

    suspend fun saveLanguage(language: SupportedLanguage) {
        context.dataStore.edit { preferences ->
            preferences[LANGUAGE_KEY] = language.code
        }
    }
}
