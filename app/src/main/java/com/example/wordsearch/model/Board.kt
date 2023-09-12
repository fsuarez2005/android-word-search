package com.example.wordsearch.model

/**
 * Process
 * 1. create board object
 * 2. set size (X, Y)
 * 3. initialize board
 * 4. put words from word list in random locations
 * 5. fill in blank areas with random letters
 *
  */



class Board {
    //val sizeY
    /** Holds the letters for the board */
    var board: Array<Array<Cell>?>? = null

    // Board size must not have negative dimensions
    var sizeX: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                // TODO: Choose a better exception for a negative size
                throw IndexOutOfBoundsException()
            }
        }
    var sizeY: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                // TODO: Choose a better exception for a negative size
                throw IndexOutOfBoundsException()
            }
        }



    class Cell(var letter: Char? = null) {
    }

    fun initializeBoard() {
        board = Array(sizeX) { Array(sizeY) {Cell()} }
        // TODO: Verify board was created successfully
    }

    fun setCellValue(x: Int,y: Int, value: Char?) {
        this.board!!.get(x)?.set(y, Cell(value))

        // TODO: Verify cell value has been changed
    }
}

