package com.stnsystem.quizgame.data.usecases

import com.stnsystem.quizgame.data.entities.GameSettings
import com.stnsystem.quizgame.data.entities.Level
import com.stnsystem.quizgame.data.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository)
{
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}