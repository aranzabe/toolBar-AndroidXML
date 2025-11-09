package com.example.toolbar

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.ui.AppBarConfiguration
import com.example.toolbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)

        binding.toolbar.title = "Mi aplicación"
        binding.toolbar.subtitle = "Subtítulo de la aplicación"
        binding.toolbar.setLogo(R.drawable.ic_logo)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.toolbar.setNavigationOnClickListener {
            Toast.makeText(this,"Pulsado el retroceso", Toast.LENGTH_SHORT).show()
        }

    }


    //************************* Funciones auxiliares para los menú de puntos *****************************
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.mnOp1 -> {
                Toast.makeText(this, "Opción 1", Toast.LENGTH_SHORT).show()
            }
            R.id.mnOp2 -> {
                Toast.makeText(this, "Opción 2", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}