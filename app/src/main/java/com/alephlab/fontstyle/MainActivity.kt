package com.alephlab.fontstyle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alephlab.fontstyle.databinding.ActivityMainBinding
import com.alephlab.fontstyle.model.TextItem

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val adapter = HomeAdapter()
    private lateinit var listOfFontNames: ArrayList<TextItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addValue()

        val recyclerView: RecyclerView = binding.accountRecyclerView
        // Prepare views
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        val dividerItemDecoration = DividerItemDecoration(
            recyclerView.context,
            layoutManager.orientation
        )
        recyclerView.addItemDecoration(dividerItemDecoration)
        recyclerView.adapter = adapter
        adapter.items = listOfFontNames

    }

    private fun addValue() {
        val item = TextItem("bold", "Lorem Ispum")
        val item2 = TextItem("Italic", "Lorem Ispum")
        val item3 = TextItem("Normal", "Lorem Ispum")


        listOfFontNames = ArrayList<TextItem>()
        listOfFontNames.add(item)
        listOfFontNames.add(item2)
        listOfFontNames.add(item3)
    }


}