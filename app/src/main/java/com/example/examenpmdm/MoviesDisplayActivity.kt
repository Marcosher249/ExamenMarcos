package com.example.examenpmdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examenpmdm.databinding.ActivityMainBinding
import com.example.examenpmdm.databinding.ActivityMoviesDetailsBinding
import com.example.examenpmdm.databinding.ActivityMoviesDisplayBinding

class MoviesDisplayActivity : AppCompatActivity() {
    lateinit var binding: ActivityMoviesDisplayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoviesDisplayBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var pelicula = intent.getStringExtra("pelicula") as Pelicula
        pelicula(pelicula)
        borrar(pelicula)
        favoritos(pelicula)
        anterior()

    }
    private fun pelicula(pelicula: Pelicula){

        binding.textView2.text = pelicula.titulo
        binding.textView3.text = pelicula.duracion.toString()
        binding.textView4.text = pelicula.nomDirect
        binding.textView5.text = pelicula.año.toString()
    }
    private fun borrar(pelicula: Pelicula){
        binding.button5.setOnClickListener {
            binding.textView2.text = ""
            binding.textView3.text =""
            binding.textView4.text = ""
            binding.textView5.text = ""
            pelicula.año = 0
            pelicula.titulo=""
            pelicula.duracion =0
            pelicula.nomDirect =""

        }
    }
    private fun anterior(){
        val intent = Intent(this,MoviesTitleActivity::class.java)
        binding.button3.setOnClickListener {
            startActivity(intent)
        }
    }
    private fun favoritos (pelicula: Pelicula){
        val intent = Intent(this,FavoritosMoviesActivity::class.java)
        binding.button6.setOnClickListener {
            intent.putExtra("pelicula",pelicula)
            startActivity(intent)
        }


    }
}