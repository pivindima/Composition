package com.sumin.composition.domain.repository

import com.sumin.composition.domain.entity.GameSettings
import com.sumin.composition.domain.entity.Level
import com.sumin.composition.domain.entity.Question

interface GameRepository {
    fun generateQuestion(maxSumValue: Int, countOfOptions: Int): Question
    fun getGameSettings(level: Level): GameSettings
}