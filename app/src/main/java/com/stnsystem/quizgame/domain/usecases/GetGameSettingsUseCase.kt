package com.stnsystem.quizgame.domain.usecases

import com.stnsystem.quizgame.domain.entities.GameSettings
import com.stnsystem.quizgame.domain.entities.Level
import com.stnsystem.quizgame.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
)
{
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}