package com.alephlab.fontstyle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alephlab.fontstyle.model.TextItem
import kotlinx.android.synthetic.main.item_font.view.*


class HomeAdapter() :
    RecyclerView.Adapter<HomeAdapter.HomeViewHolder<TextItem>>() {

    var items = ArrayList<TextItem>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    @Throws(RuntimeException::class)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder<TextItem> {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_font, parent, false)

        return AccountViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: HomeViewHolder<TextItem>, position: Int) {
        holder.bind(items[position]) {
            //onItemClickListener?.invoke(it)
        }
    }

    abstract class HomeViewHolder<in T : TextItem>(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        abstract fun bind(item: T, onItemClickListener: ((String) -> Unit)? = null)
    }

    class AccountViewHolder(itemView: View) : HomeViewHolder<TextItem>(itemView) {
        override fun bind(item: TextItem, onItemClickListener: ((String) -> Unit)?) {

            itemView.titleTextView.text = (item.title)
            itemView.descriptionTextView.text = (item.description)

        }
    }

}
