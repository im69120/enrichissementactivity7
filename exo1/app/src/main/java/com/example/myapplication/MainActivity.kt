package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        //Create six sides dice and roll it
        val dice = Dice(6);
        val diceRoll = dice.roll();

        //update the result on screen
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString();
    }
}

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random();
    }
}