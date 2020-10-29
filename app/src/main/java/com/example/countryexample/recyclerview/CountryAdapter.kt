package com.example.countryexample.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.countryexample.data.Country
import com.example.countryexample.databinding.ListItemsBinding

class CountryAdapter(private val context: Context) :
    ListAdapter<Country, CountryAdapter.CountryViewHolder>(DiffCallback()) {

    private lateinit var binding: ListItemsBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        binding = ListItemsBinding.inflate(LayoutInflater.from(parent.context))
        return CountryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class CountryViewHolder(private val binding: ListItemsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        private val countryFlag: ImageView = binding.flagImageView
        fun bind(country: Country) {
            binding.country = country
            Glide.with(context)
                .load(country.flags[1])
                .into(countryFlag)
        }
    }
}



