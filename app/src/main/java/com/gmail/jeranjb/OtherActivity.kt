package com.gmail.jeranjb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_other.*
import java.math.RoundingMode
import java.text.DecimalFormat

class OtherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        val oIncome = intent.getIntExtra("INCOME", 0)

        val housingAmt = oIncome * .35
        val foodAmt = oIncome * .15
        val transportationAmt = oIncome * .1
        val savingsAmt = oIncome * .1
        val utilitiesAmt = oIncome * .05
        val goalAmt = oIncome * .25

        val df = DecimalFormat("##.##")
        df.roundingMode = RoundingMode.CEILING

        val dHousing = df.format(housingAmt)
        val dFood = df.format(foodAmt)
        val dTransportation = df.format(transportationAmt)
        val dSavings = df.format(savingsAmt)
        val dUtilities = df.format(utilitiesAmt)
        val dGoal = df.format(goalAmt)

        housingTxt.text = ("Housing: $$dHousing")
        foodTxt.text = ("Debt: $$dFood")
        transportationTxt.text = ("Transport: $$dTransportation")
        savingsTxt.text = ("Savings: $$dSavings")
        utilitiesTxt.text = ("Utilities: $$dUtilities")
        goalTxt.text = ("Goals: $$dGoal")

    }
}

