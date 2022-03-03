package com.devanshu.thehappyplaces.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devanshu.thehappyplaces.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding:ActivityMainBinding?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.fabAddHappyPlaces?.setOnClickListener {
            val intent = Intent( this@MainActivity, AddHappyPlacesActivity::class.java)
            startActivity(intent)
        }
    }
}