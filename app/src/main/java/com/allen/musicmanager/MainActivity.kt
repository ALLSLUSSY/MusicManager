package com.allen.musicmanager

import android.R.attr.text
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.allen.musicmanager.song

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
          // code starts here
        // parallel arrays
          val songs = arrayOf("Song blue", "Song tears" , "Song lovely" , "song outside" , "Song barbie")
val artists = arrayOf("Artist billie eilish", "Artist dake" , "Artist kendrik" , "Artist cardi b" , "Artist nicki minaj")
val ratings = arrayOf("4,5", "3" , "2.9" , "4" , "4.7")
val comments = arrayOf("Comment great", "Comment ok" , "Comment bad" , "Comment good" , "Comment fun")

var index = 0
 val song = songs[index]
val rating = ratings[index]
val comment = comments[index]
val artist = artists[index]

   val btnNextScreen = findViewById<Button>(
       R.id.btnNextScreen,
       Int = TODO()
   )
   btnNextScreen.setOnClickListener

fun song(function: Any): Int {
    TODO("Not yet implemented")
}

fun finish() {
    TODO("Not yet implemented")
}

val txtSong =findViewById<TextView>(
        btnNextScreen.setOnClickListener(fun() {
        TODO("Not yet implemented")
    }).private(
        fun Unit.setOnClickListener(function: () -> Unit) {
            TODO("Not yet implemented")
        }
    ) fun song(function: () -> Unit): Int {
        return TODO("Provide the return value")
    } fun findViewById(i: Int) {
        text = song {
            findViewById(R.id.edtSongTitel) {
                TODO("Not yet implemented")
            }

            {
                index++
                if (index < songs.size) {
                    val song = songs[index]
                    val rating = ratings[index]
                    val comment = comments[index]
                    val artist = artists[index]
                    val txtSong = findViewById<TextView>(
                        R.id.edtSongTitel,
                        Int = TODO()
                    )
                    txtSong.text = song
                    val txtArtist = findViewById<TextView>(
                        R.id.edtArtistName,
                        Int = TODO()
                    )
                    txtArtist.text = artist
                    val txtRating = findViewById<TextView>(
                        R.id.edtRatings,
                        Int = TODO()
                    )
                    txtRating.text = rating
                    val txtComment = findViewById<TextView>(
                        R.id.edtComments,
                        Int = TODO()
                    )
                    txtComment.text = comment
                }
                val btnExitApp = findViewById<Button>(
                    R.id.btnExitApp,
                    Int = TODO()
                )
                btnExitApp.setOnClickListener { finish() }
            }
        }
    }
}
}

