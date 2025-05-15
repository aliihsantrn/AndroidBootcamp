package com.example.designstudy.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.designstudy.databinding.HighlightsItemCardBinding
import com.example.designstudy.model.TVSeries

class HighlightsAdapter(private val seriesList: List<TVSeries>) :
    RecyclerView.Adapter<HighlightsAdapter.HighlightsVH>() {

    inner class HighlightsVH(val binding: HighlightsItemCardBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HighlightsVH {
        val binding = HighlightsItemCardBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return HighlightsVH(binding)
    }

    override fun onBindViewHolder(holder: HighlightsAdapter.HighlightsVH, position: Int) {
        val series = seriesList[position]
        holder.binding.imageTVSeries.setImageResource(series.imageResId)
    }

    override fun getItemCount(): Int = seriesList.size
}