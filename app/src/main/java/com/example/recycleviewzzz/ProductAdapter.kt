package com.example.recycleviewzzz

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewzzz.databinding.ListViewBinding

class ProductAdapter(val context:Context,val layout:Int, val products:MutableList<Product>):
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    private var inflater: LayoutInflater? = null

    init {
        this.inflater = LayoutInflater.from(context);
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgView: ImageView
        val nameView: TextView

        init {
            val binding = view.let { ListViewBinding.bind(it) }
            imgView = binding.img
            nameView = binding.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View? = inflater?.inflate(layout, parent, false)
        return ViewHolder(view!!)
    }

    override fun getItemCount(): Int {
        return products.size;
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products[position]
        holder.imgView.setImageResource(product.img)
        holder.nameView.text = product.name
    }
}