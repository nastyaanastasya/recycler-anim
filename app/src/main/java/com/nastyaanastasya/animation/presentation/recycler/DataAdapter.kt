package com.nastyaanastasya.animation.presentation.recycler

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.nastyaanastasya.animation.data.DataItem

class DataAdapter() : ListAdapter<DataItem, DataViewHolder>(DataDiffUtilsCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder.create(parent)


    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(getItem(position))

    override fun submitList(list: MutableList<DataItem>?) {
        super.submitList(list?.let { ArrayList(it) })
    }
}

class DataDiffUtilsCallback : DiffUtil.ItemCallback<DataItem>() {
    override fun areItemsTheSame(oldItem: DataItem, newItem: DataItem) = oldItem.id == newItem.id
    override fun areContentsTheSame(oldItem: DataItem, newItem: DataItem) = oldItem == newItem
}

