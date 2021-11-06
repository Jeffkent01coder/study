package com.jeff.study

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jeff.study.databinding.RowitemBinding

class MyAdapter:RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    inner class MyViewHolder(myItem: RowitemBinding):RecyclerView.ViewHolder(myItem.root){


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val item = RowitemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(item)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {


    }

    override fun getItemCount(): Int {
        return 10
    }


}