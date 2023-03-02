package com.example.examenpmdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examenpmdm.databinding.ActivityMainBinding

class MoviesTitleActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        pasar()


    }
    private fun pasar (){
        val intent = Intent(this,MoviesDetailsActivity::class.java)
        var titulo = binding.editTextTextPersonName.text
        var minutos = binding.editTextTextPersonName2.text
        if (binding.editTextTextPersonName.text.isNotEmpty() && binding.editTextTextPersonName2.text.isNotEmpty()){
        binding.button.setOnClickListener {
            intent.putExtra("duracion",minutos)
            intent.putExtra("titulo",titulo)
            startActivity(intent)

        }
        }
    }

}