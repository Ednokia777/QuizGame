package com.stnsystem.quizgame.data.entities

data class Question (
    val sum: Int,
    val visibleNumber: Int,
    val options: List<Int>
)