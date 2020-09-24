package com.arb.ziarat.ashura.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.arb.ziarat.ashura.R
import com.arb.ziarat.ashura.dataClass.MyDataClass

class AdapterMainRecy(private val data: List<MyDataClass>) :
    RecyclerView.Adapter<AdapterMainRecy.viewHolder>() {

    inner class viewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val tv_er = view.findViewById<TextView>(R.id.tv_custom_er)
        val tv_fa = view.findViewById<TextView>(R.id.tv_custom_fa)

    }

    @SuppressLint("InflateParams")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder =
        viewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_view, null))

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

        holder.tv_er.text = data[position].er
        holder.tv_fa.text = data[position].fa

    }

}