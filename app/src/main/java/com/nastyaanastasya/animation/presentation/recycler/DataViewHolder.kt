package com.nastyaanastasya.animation.presentation.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nastyaanastasya.animation.data.DataItem
import com.nastyaanastasya.animation.databinding.ItemDataBinding
import com.nastyaanastasya.animation.presentation.recycler.utils.rotateHorizontally

class DataViewHolder(
    private val binding: ItemDataBinding
) : RecyclerView.ViewHolder(binding.root) {

    init {
        with(binding) {
            itemView.setOnClickListener {
                it.isSelected = !it.isSelected
            }
            arrowBtn.setOnClickListener {
                it.rotateHorizontally(180f)
            }
        }
    }

    fun bind(item: DataItem) {
        with(binding) {
            descText.text = item.desc
        }
    }

    companion object {
        fun create(
            parent: ViewGroup,
        ) = DataViewHolder(
            ItemDataBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
        )
    }
}
