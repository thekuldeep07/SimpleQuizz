package com.example.simplequizz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val userName:String = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text=userName
        val totalQuestion: Int =intent.getIntExtra(Constants.TOTAL_QUESTION,0)
        val correctAnswer:Int = intent.getIntExtra(Constants.CORRECT_ANSWER,0)

        tv_score.text="Your Score is ${correctAnswer} out of ${totalQuestion}"

        btn_finish.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}