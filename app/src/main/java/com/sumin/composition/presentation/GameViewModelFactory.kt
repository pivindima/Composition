package com.sumin.composition.presentation

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sumin.composition.domain.entity.Level
import java.lang.RuntimeException

class GameViewModelFactory(
    private val application: Application,
    private val level: Level
): ViewModelProvider.AndroidViewModelFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GameViewModel::class.java)) {
            return GameViewModel(application, level) as T
        } else {
            throw RuntimeException("Unknown viewModel class $modelClass")
        }
    }
}