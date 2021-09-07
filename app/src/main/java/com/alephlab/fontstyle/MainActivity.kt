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
        val item0 = TextItem(0,"Header XLarge", getString(R.string.description))
        val item1 = TextItem(1, "Header Large", getString(R.string.description))
        val item2 = TextItem(2, "Header Medium", getString(R.string.description))
        val item3 = TextItem(3, "Header Small", getString(R.string.description))
        val item4 = TextItem(4, "Body", getString(R.string.description))
        val item5 = TextItem(5, "Body Bold", getString(R.string.description))
        val item6 = TextItem(6, "Callout", getString(R.string.description))
        val item7 = TextItem(7, "Label", getString(R.string.description))
        val item8 = TextItem(8, "Footnote", getString(R.string.description))
        val item9 = TextItem(9, "Tab", getString(R.string.description))
        val item10 = TextItem(10, "Note", getString(R.string.description))
        val item11 = TextItem(11, "Strikethrough", getString(R.string.description))


        listOfFontNames = ArrayList<TextItem>()
        listOfFontNames.add(item0)
        listOfFontNames.add(item1)
        listOfFontNames.add(item2)
        listOfFontNames.add(item3)
        listOfFontNames.add(item4)
        listOfFontNames.add(item5)
        listOfFontNames.add(item6)
        listOfFontNames.add(item7)
        listOfFontNames.add(item8)
        listOfFontNames.add(item9)
        listOfFontNames.add(item10)
        listOfFontNames.add(item11)
    }


}