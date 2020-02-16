package com.gmail.jeranjb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            generateBtn.setOnClickListener {
            val addIncome = addIncomeTxt.text.toString()
            val income = addIncome.toInt()
            val intent = Intent(this, OtherActivity::class.java)

            intent.putExtra("INCOME", income)
            startActivity(intent)
            println(income)
        }
    }
}
