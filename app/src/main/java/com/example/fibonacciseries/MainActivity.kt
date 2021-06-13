package com.example.fibonacciseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      fibonacciSequences(100)

    }

    fun fibonacciSequences(numbers: Int): List<BigInteger> {
        var numList = mutableListOf<BigInteger>()

        var rvNumbers = findViewById<RecyclerView>(R.id.rvnumbers)
        rvNumbers.layoutManager = LinearLayoutManager(baseContext)
        var numbersAdapter = FibonacciAdapter(numList)
        rvNumbers.adapter = numbersAdapter

        var sum = 0.toBigInteger()
        var numberOne = 0.toBigInteger()
        var numberTwo = 1.toBigInteger()
        var count = 0

        do {
            numList.add(numberOne)
            sum = numberOne + numberTwo
            numberOne = numberTwo
            numberTwo = sum
            count++
        }
        while (count < numbers)

        return numList

    }
}
