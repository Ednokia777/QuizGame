package com.stnsystem.quizgame.domain.usecases

import com.stnsystem.quizgame.domain.entities.Question
import com.stnsystem.quizgame.domain.repository.GameRepository

class GenerateQuestionUseCase (
    private val repository: GameRepository
) {
    operator fun invoke(maxSumValue: Int): Question
    {
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {
        private const val COUNT_OF_OPTIONS = 6
    }
}