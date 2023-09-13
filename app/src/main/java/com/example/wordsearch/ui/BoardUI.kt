package com.example.wordsearch.ui

import android.app.Activity
import android.content.Context
import android.widget.GridLayout
import android.widget.TextView
import com.example.wordsearch.R
import com.example.wordsearch.model.Board

class BoardUI(private val context: Context) {
    lateinit var board: Board

    lateinit var boardView: GridLayout
    var contextActivity = context as Activity

    fun initialize() {
        board = Board()
        board.generateRandomBoard()

        boardView = contextActivity.findViewById<GridLayout>(R.id.board_grid)
    }

    fun generateRandomLetterGrid() {
        // create TextView with letter

        for (n in 1..1000) {
            val randomLetter: String = ('a'..'z').random().toString()

            // create TextView
            var letterTextView = TextView(boardView.context)
            letterTextView.text = randomLetter

            boardView.addView(letterTextView)
        }
    }
}