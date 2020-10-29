package com.example.countryexample.recyclerview

import androidx.recyclerview.widget.DiffUtil
import com.example.countryexample.data.Country

class DiffCallback :
    DiffUtil.ItemCallback<Country>() {

    override fun areItemsTheSame(
        oldItem: Country,
        newItem: Country
    ): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(
        oldItem: Country,
        newItem: Country
    ): Boolean {
        return oldItem == newItem
    }
}
