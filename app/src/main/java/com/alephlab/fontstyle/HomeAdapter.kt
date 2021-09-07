package com.alephlab.fontstyle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.TextViewCompat
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

            when (item.id) {
                0 -> TextViewCompat.setTextAppearance(itemView.descriptionTextView, R.style.header_xlarge)
                1 -> TextViewCompat.setTextAppearance(itemView.descriptionTextView, R.style.header_large)
                2 -> TextViewCompat.setTextAppearance(itemView.descriptionTextView, R.style.header_medium)
                3 -> TextViewCompat.setTextAppearance(itemView.descriptionTextView, R.style.header_small)
                4 -> TextViewCompat.setTextAppearance(itemView.descriptionTextView, R.style.body)
                5 -> TextViewCompat.setTextAppearance(itemView.descriptionTextView, R.style.body_bold)
                6 -> TextViewCompat.setTextAppearance(itemView.descriptionTextView, R.style.call_out)
                7 -> TextViewCompat.setTextAppearance(itemView.descriptionTextView, R.style.label)
                8 -> TextViewCompat.setTextAppearance(itemView.descriptionTextView, R.style.foot_note)
                9 -> TextViewCompat.setTextAppearance(itemView.descriptionTextView, R.style.tab)
                10 -> TextViewCompat.setTextAppearance(itemView.descriptionTextView, R.style.note)
                else -> { // Note the block
                    TextViewCompat.setTextAppearance(itemView.descriptionTextView, R.style.strikehrough)
                }
            }
            itemView.titleTextView.text = (item.title)
            itemView.descriptionTextView.text = (item.description)

        }
    }

}
