package com.tozzz.ikealistapp

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tozzz.ikealistapp.databinding.CardDesignBinding

class ProductAdapter(var mContext:Context, var productList:List<Products>) :RecyclerView.Adapter<ProductAdapter.CardDesign>(){
    inner class CardDesign(desing:CardDesignBinding):RecyclerView.ViewHolder(desing.root){
        var desing:CardDesignBinding
        init {
            this.desing = desing
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesign {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CardDesign, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return productList.size
    }
}