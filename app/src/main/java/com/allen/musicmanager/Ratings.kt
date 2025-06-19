package com.allen.musicmanager

import android.inputmethodservice.Keyboard.Row
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.allen.musicmanager.R.id.btnDisplay
import kotlin.contracts.Returns

class Ratings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ratings)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
} // code starts here
  val btnDisplay = findViewById<Button>(btnDisplay)
  val btnCalcAvrg = findViewById<Button>(R.id.btnCalcAvrg)
  val btnReturn = findViewById<Button>(R.id.btnReturn)

  val ratings = ArrayList<Int>()
  val btnIretun = findViewById<Button>(R.id.btnReturn)
   onsetOnClickListener { btnReturn
       fun View.setOnClickListener(returns: Returns: () -> Unit) {
           TODO("Not yet implemented")


   }


