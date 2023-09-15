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

        boardView = contextActivity.findViewById<GridLayout>(R.id.board_grid)
    }

    fun drawBoard() {



    }


    fun generateRandomLetterGrid() {
        // create TextView with letter

        for (n in 1..10000) {
            val randomLetter: String = ('a'..'z').random().toString()

            var letterTextView = TextView(boardView.context)
            letterTextView.setBackgroundColor(context.resources.getColor(R.color.orange))
            letterTextView.height = 70
            letterTextView.width = 70
            letterTextView.textAlignment = TextView.TEXT_ALIGNMENT_CENTER
            letterTextView.text = randomLetter


            boardView.post {
                boardView.addView(letterTextView)
            }
        }
    }
}