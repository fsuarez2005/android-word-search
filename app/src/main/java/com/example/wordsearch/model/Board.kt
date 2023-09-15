package com.example.wordsearch.model

/*
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
    var data: Array<Array<Char>>? = null

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


    fun initialize() {
        data = Array(height) { Array(width) { ' ' } }
        // TODO: Verify board was created successfully

    }


    fun setValue(height: Int, width: Int, value: Char) {
        data!!.get(height).set(width, value)
        // TODO: Verify cell value has been changed
    }

    fun generateRandomLetter(): Char = ('A'..'Z').random()

    fun generateRandomBoard() {
        data = Array(height) { Array(width) { ' ' } }

        for (h in 0..(height - 1)) {
            for (w in 0..(width - 1)) {
                data!!.get(h).set(w, generateRandomLetter())
            }
        }
    }

    /** Inserts a word in the board starting at startHeight and start Width */
    fun insertWord(startHeight: Int, startWidth: Int, direction: Direction, word: String) {
        TODO("insertWord")

        // should error is cannot fit at this location
        val wordLength = word.length

        var currentHeight = startHeight
        var currentWidth = startWidth

        var heightModifier: Int = 0
        var widthModifier: Int = 0



        when (direction) {
            Direction.NORTH -> {
                heightModifier = -1
                widthModifier = 0
            }

            Direction.NORTHEAST -> {
                heightModifier = -1
                widthModifier = 1
            }

            Direction.EAST -> {
                heightModifier = 0
                widthModifier = 1
            }

            Direction.SOUTHEAST -> TODO()
            Direction.SOUTH -> TODO()
            Direction.SOUTHWEST -> TODO()
            Direction.WEST -> TODO()
            Direction.NORTHWEST -> TODO()
        }

        for (n in 0..(wordLength - 1)) {


        }


    }


    fun canWordFit(
        startHeight: Int,
        startWidth: Int,
        direction: Direction,
        word: String
    ): Boolean {
        // STUB: canWordFit
        

        return true
    }

    enum class Direction {
        NORTH,
        NORTHEAST,
        EAST,
        SOUTHEAST,
        SOUTH,
        SOUTHWEST,
        WEST,
        NORTHWEST,

    }

}

