package com.example.blackfridaysale

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import com.example.blackfridaysale.data.LanguageStorage
import com.example.blackfridaysale.ui.MainViewModel
import com.example.blackfridaysale.ui.MainViewModelFactory
import com.example.blackfridaysale.ui.SaleScreen
import com.example.blackfridaysale.ui.theme.GlobalDealsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val languageStorage = LanguageStorage(applicationContext)
        val factory = MainViewModelFactory(languageStorage)
        val viewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]

        setContent {
            GlobalDealsTheme {
                SaleScreen(viewModel)
            }
        }
    }
}
