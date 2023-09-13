package com.example.wordsearch.model

/**
 * Process
 * 1. create board object
 * 2. set size (X, Y)
 * 3. initialize board
 * 4. put words from word list in random locations
 * 5. fill in blank areas with random letters
 *
 *
 *

[ [              ]
  [              ]
  [              ]
  [              ] ]



  */



class Board {
    /** Holds the letters for the board */
    private var data: Array<Array<Cell?>?>? = null

    // Board size must not have negative dimensions
    var width: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                // TODO: Choose a better exception for a negative size
                throw IndexOutOfBoundsException()
            }
        }
    var height: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                // TODO: Choose a better exception for a negative size
                throw IndexOutOfBoundsException()
            }
        }

    private class Cell(var letter: Char? = null) {
    }

    fun initialize() {
        data = Array(height) { Array(width) {null} }
        // TODO: Verify board was created successfully
    }

    fun setValue(height: Int, width: Int, value: Char?) {
        data!!.get(height)?.set(width, Cell(value))
        // TODO: Verify cell value has been changed
    }

    fun generateRandomBoard() {
        data = Array(height) { Array(width) {null} }

        for (h in 0..(height-1)) {
            for (w in 0..(width-1)) {
                //data.get(h).set(w,Cell(""))

            }
        }
    }
}

