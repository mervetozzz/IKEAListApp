package com.tozzz.ikealistapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.tozzz.ikealistapp.databinding.CardDesignBinding

class ProductAdapter(var mContext:Context, var productList:List<Products>) :RecyclerView.Adapter<ProductAdapter.CardDesign>(){
    inner class CardDesign(desing:CardDesignBinding):RecyclerView.ViewHolder(desing.root){
        var desing:CardDesignBinding
        init {
            this.desing = desing
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesign {
        val layoutInflater = LayoutInflater.from(mContext)
        val desing = CardDesignBinding.inflate(layoutInflater,parent,false)
        return CardDesign(desing)
    }

    override fun onBindViewHolder(holder: CardDesign, position: Int) {
        val product = productList.get(position)
        val p = holder.desing

        p.imageViewPName.setImageResource(mContext.resources.getIdentifier(product.pImage,"drawable",mContext.packageName))
        p.textViewPName.text = product.pName
        p.textViewPColor.text = product.pColor
        p.textViewPPrice.text = "${product.pPrice}₺"
        p.textViewPPrice.setOnClickListener {
            Snackbar.make(it,"${product.pName} sepete eklendi",Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return productList.size
    }
}