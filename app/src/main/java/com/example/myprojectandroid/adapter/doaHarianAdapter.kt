package com.example.myprojectandroid.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myprojectandroid.R
import com.example.myprojectandroid.model.doaHarian

class doaHarianAdapter(val data : ArrayList<doaHarian>)
    : RecyclerView.Adapter<doaHarianAdapter.doaHarianViewHolder>() {
    class doaHarianViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val jdoa : TextView = view.findViewById(R.id.teks1)
        val tvdoaarab: TextView = view.findViewById(R.id.tvdoaarab)
        val tvdoalatin: TextView = view.findViewById(R.id.tvdoalatin)
        val ibcollapse: ImageButton = view.findViewById(R.id.ibcollapse)
        val rlisi: RelativeLayout = view.findViewById(R.id.rlisi)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): doaHarianViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_doa_harian, parent, false)
        return doaHarianViewHolder(view)
    }

    override fun onBindViewHolder(holder: doaHarianViewHolder, position: Int) {
        val item = data.get(position)
        holder.jdoa.text = item.judul
        holder.tvdoaarab.text = item.textarab
        holder.tvdoalatin.text = item.textlatin
        holder.ibcollapse.setOnClickListener {
            if (holder.rlisi.visibility == View.GONE) {
                holder.rlisi.visibility = View.VISIBLE
            } else {
                holder.rlisi.visibility = View.GONE
            }
        }
    }

    override fun getItemCount(): Int = data.size


}