package com.example.wordsearch.model

import org.junit.Before
import org.junit.Test

class BoardTest {

    var board: Board = Board()

    val testSizeX = 10
    val testSizeY = 10


    @Before
    fun init() {
        this.board = Board()
    }

    @Test
    fun initializeBoard() {
        this.board.width = 10
        this.board.height = 10
        this.board.initialize()

        // check if board is an Array
        assert(this.board.data is Array)

        // check if first row is an Array
        assert(this.board.data!!.get(0) is Array)

        // check if 0, 0 is a Char
        assert(this.board.data!!.get(0).get(0) is Char)

        // check if char at 0, 0 is ' '
        assert(this.board.data!!.get(0).get(0) == ' ')
    }

    @Test
    fun setWidth() {
        val testValue: Int = 10

        this.board.width = testValue
        assert(this.board.width == testValue)
    }

    @Test
    fun setNegativeWidth() {
        // test for negative size
        try {
            this.board.width = -1

            // should not get here
            assert(false)
        } catch(e: Exception) {
            assert(true)
        }
    }

    @Test
    fun setHeight() {
        val testValue: Int = 0
        this.board.height = testValue
        assert(this.board.height == testValue)
    }

    @Test
    fun setNegativeHeight() {
        // test for negative size
        try {
            this.board.height = -1

            // should not get here
            assert(false)
        } catch(e: Exception) {
            assert(true)
        }
    }

    @Test
    fun generateRandomBoard() {
    }

}