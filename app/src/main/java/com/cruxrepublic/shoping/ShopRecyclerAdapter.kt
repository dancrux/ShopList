package com.cruxrepublic.shoping

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class ShopRecyclerAdapter():
RecyclerView.Adapter<ShopRecyclerAdapter.MyViewHolder>() {

    private  val titles = arrayOf("kid shoes","Electronics", "Unisex", "For men", "For Women",
    "Automobiles", "Health Care", "Agriculture")
    private val details = arrayOf("Get the Best Shoes For Kids", "Get Quality electronics",
        "Get Unisex Accesories", "Shop For Men", "Shop The Best For Women","Get the best Deals On Auto"
    ,"Buy Quality Health Stuff", "Get Agric Equipments At an Affordable rate")
    private val image = R.drawable.background

     class MyViewHolder(listView:View) : RecyclerView.ViewHolder(listView){
        var itemTitle : TextView
       var itemDetail: TextView


        init {
            itemTitle = listView.findViewById(R.id.title)
            itemDetail =listView.findViewById(R.id.description)

            listView.setOnClickListener {v: View ->
                var detailFragment: DetailFragment = DetailFragment()



            }

        }
    }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val listView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return MyViewHolder(listView)
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
      holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
//        holder.itemImage.setImageResource(image)


    }

}