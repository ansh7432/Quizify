package com.example.quize

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.quize.databinding.ActivityMain3Binding
import com.example.quize.databinding.ActivityMainBinding

class MainActivity3 : AppCompatActivity(), View.OnClickListener{

    private var currentnumber= 1
    private var currentquestionlist:ArrayList<ques>?=null
    private var selectedoption:Int=0
    private var correctanswer:Int=0
    private var nusername:String? =null

    private lateinit var binding:ActivityMain3Binding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       binding=ActivityMain3Binding.inflate(layoutInflater)

        setContentView(binding.root)
        nusername= intent.getStringExtra(Constant.user)

        currentquestionlist= Constant.question()
        setQuestion()
        binding.option1.setOnClickListener(this)
        binding.option2.setOnClickListener(this)
        binding.option3.setOnClickListener(this)
        binding.option4.setOnClickListener(this)



    }
    @SuppressLint("SetTextI18n")

    private fun setQuestion(){

        val question= currentquestionlist!![currentnumber-1]
        value()
        if(currentnumber==currentquestionlist!!.size){
            binding.submit.text="Finish"
        }
        else{
            binding.submit.text="Submit"
        }
        binding.progressbar.progress= currentnumber
        binding.progresstext.text= "$currentnumber"+ "/" + binding.progressbar.max

        binding.sawal.text= question.question
        binding.image.setImageResource(question.image)
        binding.option1.text=question.option1
        binding.option2.text=question.option2
        binding.option3.text=question.option3
        binding.option4.text=question.option4
        binding.submit.setOnClickListener(this)
    }

    private fun value(){
        val options=ArrayList<TextView>()

        options.add(0,binding.option1)
        options.add(1,binding.option2)
        options.add(2,binding.option3)
        options.add(3,binding.option4)


        for(option in options){

            option.setTextColor(Color.parseColor("#7C5200"))
            option.typeface= Typeface.SANS_SERIF
            option.background=ContextCompat.getDrawable(this,R.drawable.optionborder)

        }

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.option1->{
                option(binding.option1,1)
            }
            R.id.option2->{
                option(binding.option2,2)
            }
            R.id.option3->{
                option(binding.option3,3)
            }
            R.id.option4->{
                option(binding.option4,4)
            }
            R.id.submit->{
                if(selectedoption==0){
                    currentnumber++

                    when{
                        currentnumber<=currentquestionlist!!.size->{
                            setQuestion()
                        }
                        else->{
                            val intent= Intent(this,Congratulation::class.java)
                            intent.putExtra(Constant.user,nusername)
                            intent.putExtra(Constant.correct, correctanswer)
                            intent.putExtra(Constant.total, currentquestionlist!!.size)
                            startActivity(intent)

                        }
                    }
                }else{
                    val question= currentquestionlist?.get(currentnumber-1)
                    if(question!!.correct!=selectedoption){
                        answer(selectedoption,R.drawable.wrong)
                    }
                    else{
                        correctanswer++;
                    }
                    answer(question.correct, R.drawable.correct)

                    if(currentnumber==currentquestionlist!!.size){
                        binding.submit.text="FINISHED"
                    }
                    else{
                        binding.submit.text="Next Question"
                    }
                    selectedoption=0

                }
            }
        }
    }
private fun answer(answer:Int, drawableView: Int){
    when(answer){
        1->{
            binding.option1.background= ContextCompat.getDrawable(this,drawableView)
        }
        2->{
            binding.option2.background= ContextCompat.getDrawable(this,drawableView)
        }
        3->{
            binding.option3.background= ContextCompat.getDrawable(this,drawableView)
        }
        4->{
            binding.option4.background= ContextCompat.getDrawable(this,drawableView)
        }
    }
}
    private fun option(tv: TextView,selected:Int) {
        value()
        selectedoption= selected

        tv.setTextColor(Color.parseColor("#7C5100"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background=ContextCompat.getDrawable(this,R.drawable.optionborder)
    }
}