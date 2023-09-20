package com.example.myprojectandroid.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myprojectandroid.R
import com.example.myprojectandroid.model.language

class languageAdapter(val data: ArrayList<language>)
    :RecyclerView.Adapter<languageAdapter.doaviewHolder>()
{
        class doaviewHolder (view: View):
                RecyclerView.ViewHolder(view){
                    val tvbpem: TextView = view.findViewById(R.id.tvbpem)
                    val ivlogopem: ImageView = view.findViewById(R.id.ivlogopem)

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): doaviewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_bhs_pemrograman,parent,false)
        return doaviewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: doaviewHolder, position: Int) {
        val item = data.get(position)
        holder.tvbpem.text = item.name
        holder.ivlogopem.setImageResource(item.image)
    }
}