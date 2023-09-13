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
    fun testInitializeBoard() {
        this.board.initialize()
        this.board.width = 10
        this.board.height = 10


        // check if row is Array<Cell>
        assert(this.board.data is Array)

        // check if column in that roll
        assert(this.board.data?.get(0) is Array)

        // check if cell is type cell
        assert(this.board.data?.get(0)?.get(0) is Board.Cell)



    }

    @Test
    fun setSizeXTest() {
        val testValue: Int = 10

        this.board.width = testValue
        assert(this.board.width == testValue)
    }

    @Test
    fun negativeSizeX() {
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
    fun setSizeYTest() {
        val testValue: Int = 0
        this.board.height = testValue
        assert(this.board.height == testValue)
    }

}