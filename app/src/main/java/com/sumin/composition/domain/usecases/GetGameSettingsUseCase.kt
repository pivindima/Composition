package com.sumin.composition.domain.usecases

import com.sumin.composition.domain.entity.GameSettings
import com.sumin.composition.domain.entity.Level
import com.sumin.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }

}