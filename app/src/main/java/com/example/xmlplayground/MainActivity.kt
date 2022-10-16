package com.example.xmlplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.xmlplayground.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val data = DataProvider.mainData
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lifecycleOwner=this

        data.observe(this){
            binding.item = it
        }

        binding.button.setOnClickListener {
            DataProvider.enableDisable(DataProvider.enable)
            DataProvider.enable=!DataProvider.enable
        }

    }
}