package com.example.wordsearch

import android.os.Bundle
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



        boardUI.initialize()
        boardUI.generateRandomLetterGrid()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

}



