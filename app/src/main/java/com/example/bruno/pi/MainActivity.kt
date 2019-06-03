package com.example.bruno.pi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

    }

    fun entrar(v: View){
        val mapsPage = Intent(this, MapsActivity::class.java)
        startActivity(mapsPage)
    }

}
