package com.example.designstudy.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.designstudy.databinding.MainItemCardBinding
import com.example.designstudy.model.TVSeries

class TVSeriesAdapter(private val seriesList: List<TVSeries>) :
    RecyclerView.Adapter<TVSeriesAdapter.TVSeriesViewHolder>() {

    inner class TVSeriesViewHolder(val binding: MainItemCardBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TVSeriesViewHolder {
        val binding = MainItemCardBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return TVSeriesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TVSeriesViewHolder, position: Int) {
        val series = seriesList[position]
        holder.binding.txtCategory.text = series.category
        holder.binding.image.setImageResource(series.imageResId)
    }

    override fun getItemCount(): Int = seriesList.size
}
