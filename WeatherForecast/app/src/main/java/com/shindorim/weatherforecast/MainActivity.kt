package com.shindorim.weatherforecast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHome = findViewById<ImageButton>(R.id.btn_main_home)
        val btnFavorite = findViewById<ImageButton>(R.id.btn_main_favorite)
        val btnCart = findViewById<ImageButton>(R.id.btn_main_cart)
        val btnSetting = findViewById<ImageButton>(R.id.btn_main_setting)

        supportFragmentManager.beginTransaction().replace(R.id.container, homeFragment()).commit()

        btnHome.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, homeFragment())
                .commit()
        }
        btnFavorite.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, favoriteFragment())
                .commit()
        }
        btnCart.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, cartFragment())
                .commit()
        }
        btnSetting.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, settingFragment())
                .commit()
        }
    }
}
