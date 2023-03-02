package com.example.examenpmdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examenpmdm.databinding.ActivityMoviesDetailsBinding

class MoviesDetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityMoviesDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoviesDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        pasar()

    }
    private fun pasar (){
        var pelicula = Pelicula()
        pelicula.titulo = intent.getStringExtra("titulo").toString()
        pelicula.duracion = intent.getStringExtra("duracion").toString().toInt()
        pelicula.año = binding.editTextTextPersonName5.text.toString().toInt()
        pelicula.nomDirect = binding.editTextTextPersonName3.text.toString()
        val intent = Intent(this,MoviesDisplayActivity::class.java)
        if (binding.editTextTextPersonName3.text.isNotEmpty() && binding.editTextTextPersonName5.text.isNotEmpty()){
        binding.button4.setOnClickListener {
            intent.putExtra("pelicula",pelicula)
            startActivity(intent)
        }}
    }
    private fun anterior(){
        val intent = Intent(this,MoviesTitleActivity::class.java)
        binding.button3.setOnClickListener {
            startActivity(intent)
        }
    }
}