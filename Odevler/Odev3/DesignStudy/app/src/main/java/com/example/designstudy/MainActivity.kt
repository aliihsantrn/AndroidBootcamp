package com.example.designstudy

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.designstudy.adapter.HighlightsAdapter
import com.example.designstudy.adapter.TVSeriesAdapter
import com.example.designstudy.databinding.TabiiBinding
import com.example.designstudy.model.TVSeries

class MainActivity : AppCompatActivity() {
    private lateinit var binding: TabiiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = TabiiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mainSeriesList = listOf(
            TVSeries("Teşkilat", R.drawable.teskilat, "Aksiyon"),
            TVSeries("Seksenler", R.drawable.seksenler, "Komedi"),
            TVSeries("Aşk-ı Memnun", R.drawable.askimemnun, "Dram"),
        )

        val mainAdapter = TVSeriesAdapter(mainSeriesList)
        binding.mainViewPager.adapter = mainAdapter

        var highlightsSeriesList = listOf(
            TVSeries("Gassal", R.drawable.gassal, "Aksiyon"),
            TVSeries("İbn-i Sina", R.drawable.sina, "Komedi"),
            TVSeries("Gönül Dağı", R.drawable.gonul_dagi, "Aile"),
            TVSeries("Leyla ile Mecnun", R.drawable.leyla_mecnun, "Komedi"),
            TVSeries("Kasaba Doktoru", R.drawable.kasaba_doktoru, "Dram"),
        )

        val highlightsAdapter = HighlightsAdapter(highlightsSeriesList)
        binding.highlightRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.highlightRecyclerView.adapter = highlightsAdapter
    }
}

/*
font poppins
 */