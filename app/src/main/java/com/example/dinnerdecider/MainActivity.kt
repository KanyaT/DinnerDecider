package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.dinnerdecider.databinding.ActivityMainBinding
import java.util.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    val arrayList = arrayListOf("dosa", "masal roast", "pongal", "idli", "upma", "sevai", "semiya", "appam")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        var name = "kanya"
        var isAwesome = true
        println("Is my name "+name+" awesome? The answer is "+isAwesome)

        binding.decideBtn.setOnClickListener {
            val random = Random()
            val foodRandom = random.nextInt(arrayList.count())
            binding.dishName.text = arrayList[foodRandom]
        }

        binding.addFood.setOnClickListener {
            val newFood = binding.newFoodTxt.text.toString()
            arrayList.add(newFood)
            binding.newFoodTxt.text.clear()
        }

    }
}