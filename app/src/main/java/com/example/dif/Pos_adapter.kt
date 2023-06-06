package com.example.dif

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Pos_adapter(val con: ProfileActivity, val list:ArrayList<Pos>):RecyclerView.Adapter<Pos_adapter.Link>(){
    class Link(itemView: View):RecyclerView.ViewHolder(itemView) {
        val text1: ImageView  =  itemView.findViewById(R.id.img)
        val text2: TextView  =  itemView.findViewById(R.id.textView2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Link {
        val root = LayoutInflater.from(con).inflate(R.layout.pos_item, parent, false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: Link, position: Int) {
        holder.text1.setImageResource(list[position].img)
        holder.text2.setText(list[position].text2)
    }

    override fun getItemCount(): Int {
        return list.size
    }


}