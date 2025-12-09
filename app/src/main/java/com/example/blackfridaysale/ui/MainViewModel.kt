package com.example.blackfridaysale.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.blackfridaysale.data.LanguageStorage
import com.example.blackfridaysale.model.SupportedLanguage
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

data class AppLanguageState(
    val currentLanguage: SupportedLanguage = SupportedLanguage.ENGLISH,
    val isLoading: Boolean = true
)

class MainViewModel(private val languageStorage: LanguageStorage) : ViewModel() {

    private val _uiState = MutableStateFlow(AppLanguageState())
    val uiState: StateFlow<AppLanguageState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            // Load initial language
            val savedLanguage = languageStorage.languageFlow.first()
            _uiState.value = AppLanguageState(currentLanguage = savedLanguage, isLoading = false)
            
            // Observe future changes if needed, though we update manually
            languageStorage.languageFlow.collect { lang ->
                _uiState.value = _uiState.value.copy(currentLanguage = lang)
            }
        }
    }

    fun setLanguage(language: SupportedLanguage) {
        viewModelScope.launch {
            languageStorage.saveLanguage(language)
            // State update will happen via flow collection
        }
    }
}

class MainViewModelFactory(private val languageStorage: LanguageStorage) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return MainViewModel(languageStorage) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
