package com.example.examenpmdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examenpmdm.databinding.ActivityFavoritosMoviesBinding
import com.example.examenpmdm.databinding.ActivityMoviesDisplayBinding

class FavoritosMoviesActivity : AppCompatActivity() {
    lateinit var binding: ActivityFavoritosMoviesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoritosMoviesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var pelicula = intent.getStringExtra("pelicula") as Pelicula
        pelicula(pelicula)
        anterior()
    }
    private fun anterior(){
        val intent = Intent(this,MoviesTitleActivity::class.java)
        binding.button3.setOnClickListener {
            startActivity(intent)
        }
    }
    private fun pelicula(pelicula: Pelicula){

        binding.textView6.text = pelicula.titulo
        binding.textView7.text = pelicula.duracion.toString()
        binding.textView.text = pelicula.nomDirect
        binding.textView8.text = pelicula.año.toString()
    }
}