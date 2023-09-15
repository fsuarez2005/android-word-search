package com.example.wordsearch

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.GridLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.wordsearch.ui.BoardUI

class MainActivity : AppCompatActivity() {
    val boardUI = BoardUI(this)



    var boardGrid: GridLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))


        Thread(
            Runnable {
                boardUI.initialize()
                boardUI.generateRandomLetterGrid()
            }).start()




        findViewById<GridLayout>(R.id.board_grid).setOnTouchListener { v, event ->


            Log.v("WORDSEARCH", "Touched")
            true
            }


    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }


}



