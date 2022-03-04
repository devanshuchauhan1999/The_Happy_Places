package com.devanshu.thehappyplaces.adapters

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.devanshu.thehappyplaces.R
import com.devanshu.thehappyplaces.databinding.ItemHappyPlaceBinding
import com.devanshu.thehappyplaces.models.HapplyPlaceModel

class HappyPlacesAdapter(
    private val context: Context,
    private var list: ArrayList<HapplyPlaceModel>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return MyViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_happy_place,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model = list[position]

        if (holder is MyViewHolder) {
            //holder.itemView.iv_place_image.setImageURI(Uri.parse(model.image))
            //holder.itemView.tvTitle.text = model.title
            //holder.itemView.tvDescription.text = model.description
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    private class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){

    }
}