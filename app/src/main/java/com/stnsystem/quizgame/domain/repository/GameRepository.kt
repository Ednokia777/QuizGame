package com.stnsystem.quizgame.domain.repository

import com.stnsystem.quizgame.domain.entities.GameSettings
import com.stnsystem.quizgame.domain.entities.Level
import com.stnsystem.quizgame.domain.entities.Question

interface GameRepository {
    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}