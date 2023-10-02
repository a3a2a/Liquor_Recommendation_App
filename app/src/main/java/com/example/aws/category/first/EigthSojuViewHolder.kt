package com.example.aws.category.first

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.aws.databinding.CategorySojuEightItemBinding
import com.example.aws.databinding.CategorySojuThirdItemBinding

class EigthSojuViewHolder(val context: Context, private val binding: CategorySojuEightItemBinding): RecyclerView.ViewHolder(binding.root) {

    fun view(item:EigthSojuItemData){
        Glide.with(binding.itemIm).load(item.itemim).into(binding.itemIm)
        binding.itemName.text = item.name
        binding.itemPrice.text = item.price
        binding.itemSt.text = item.star
        binding.itemKeyword.text = item.review
        binding.itemId.text = item.ITEM_ID
        binding.keword1.text = item.keyword1
        binding.keword2.text = item.keyword2
    }
}