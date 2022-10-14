package com.example.myapplication4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.myapplication4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bc:ActivityMainBinding
    private var launcher:ActivityResultLauncher<Intent>? = null
    override fun onPostCreate(savedInstanceState: Bundle?) {
        bc = ActivityMainBinding.inflate(layoutInflater)
        super.onPostCreate(savedInstanceState)
        setContentView(bc.root)

        launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result:ActivityResult ->

        }

    }
}