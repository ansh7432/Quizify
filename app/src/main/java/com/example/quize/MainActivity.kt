package com.example.quize

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quize.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.start.setOnClickListener{
            if (binding.name.text.toString().isEmpty()){
                Toast.makeText(this, "Please Enter the Name", Toast.LENGTH_LONG).show()
            }
            else
            {
                val intent= Intent(this,MainActivity3::class.java)
                intent.putExtra(Constant.user, binding.name.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}