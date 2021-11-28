package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_row.view.*

class RecyclerViewAdapter(private val messages: List<String>): RecyclerView.Adapter<RecyclerViewAdapter.itemViewHolder>() {
    class itemViewHolder (itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        return itemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.rv_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        val message = messages[position]
        holder.itemView.apply {
            textItem.text = message
        }
    }

    override fun getItemCount() = messages.size

}