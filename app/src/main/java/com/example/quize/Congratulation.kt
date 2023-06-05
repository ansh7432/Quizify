package com.example.quize

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quize.databinding.ActivityCongratulationBinding

class Congratulation : AppCompatActivity() {
    private lateinit var binding: ActivityCongratulationBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCongratulationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username= intent.getStringExtra(Constant.user)
        binding.userName.text=username
        val correct= intent.getIntExtra(Constant.correct,0)
        val total= intent.getIntExtra(Constant.total,0)

        binding.score.text=("You have scored ${correct} / ${total}")
        binding.button.setOnClickListener{
            (startActivity(Intent(this,MainActivity::class.java)))
        }


    }
}