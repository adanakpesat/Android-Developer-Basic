package com.example.myprojectandroid.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myprojectandroid.R
import com.example.myprojectandroid.model.doa

class doaAdapter(val data: ArrayList<doa>)

    : RecyclerView.Adapter<doaAdapter.doaviewHolder>()
{
    class doaviewHolder (view: View):
        RecyclerView.ViewHolder(view){
        val pemdoa: TextView = view.findViewById(R.id.teks1)
        val doalogo: ImageView = view.findViewById(R.id.logo_doa)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): doaviewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_doa,parent,false)
        return doaviewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: doaviewHolder, position: Int) {
        val item = data.get(position)
        holder.pemdoa.text = item.name
        holder.doalogo.setImageResource(item.image)
    }
}