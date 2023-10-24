package com.stnsystem.quizgame.data.repository

import com.stnsystem.quizgame.data.entities.GameSettings
import com.stnsystem.quizgame.data.entities.Level
import com.stnsystem.quizgame.data.entities.Question

interface GameRepository {
    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question
    fun getGameSettings(level: Level): GameSettings
}