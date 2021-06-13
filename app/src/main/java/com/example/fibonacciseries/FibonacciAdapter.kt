package com.example.fibonacciseries

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class FibonacciAdapter(var numberList:List<BigInteger>):RecyclerView.Adapter<NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
     var numViews= LayoutInflater.from(parent.context).inflate(R.layout.number_list_items,parent,false)
        return NumbersViewHolder(numViews)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
       holder.tvNumber.text= numberList.get(position).toString()
    }

    override fun getItemCount(): Int {
       return numberList.size
    }
}
class NumbersViewHolder(numViews:View):RecyclerView.ViewHolder(numViews){
    var tvNumber= numViews.findViewById<TextView>(R.id.tvNumber)

}



