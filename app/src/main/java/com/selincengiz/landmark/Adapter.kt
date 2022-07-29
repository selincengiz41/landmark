package com.selincengiz.landmark

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.selincengiz.landmark.databinding.ResycleRowBinding

class Adapter(val landmarkList: ArrayList<Landmark>):RecyclerView.Adapter<Adapter.Holder>() {

    class Holder(val binding: ResycleRowBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
val binding=ResycleRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)

return Holder(binding)

    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
holder.binding.recyclerText.text=landmarkList.get(position).name
        holder.itemView.setOnClickListener(){
            val intent=Intent(holder.itemView.context,DetailsActivity::class.java)
         intent.putExtra("landmark",landmarkList.get(position))
            holder.itemView.context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
return  landmarkList.size
    }

}