package com.kissybnts.udemy_kotlin_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Japanses", "Chinese", "Italian", "Korean", "Pizza", "Hamburger")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideButton.setOnClickListener {
            val i = Random().nextInt(foodList.count())
            selectedDinnerText.text = foodList[i]
        }

        addFoodButton.setOnClickListener {
            val newFood = newFoodText.text.toString()
            foodList.add(newFood)
            newFoodText.text.clear()
        }
    }
}
