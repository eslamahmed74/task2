package com.example.test2

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.test2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.button.setOnClickListener {
            var h=binding.editText.text.toString().toFloat()
            var w=binding.editText2.text.toString().toFloat()

            var result=w/h
            binding.textView2.text="Your BMI = ${result.toString()}"
        }
    }
}