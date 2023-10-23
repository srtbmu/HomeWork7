package com.example.myapplication.ui.door

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.example.myapplication.databinding.ItemDoorBinding
import com.example.myapplication.model.CameraModel
import com.example.myapplication.model.DooModel

class DoorAdapter(private var list: ArrayList<DooModel>):Adapter<DoorAdapter.DoorHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoorHolder {
       return DoorHolder(ItemDoorBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount()=list.size

    override fun onBindViewHolder(holder: DoorHolder, position: Int) {
        holder.bind(list[position])
    }
    inner class DoorHolder(private var binding: ItemDoorBinding):ViewHolder(binding.root) {
            fun bind(dooModel: DooModel){
                binding.imgDoor.load(dooModel.img)
                binding.name.text=dooModel.name
                itemView.setOnClickListener {
                    if(binding.imgDoor.visibility==View.GONE){
                        binding.imgDoor.visibility=View.VISIBLE
                    }
                    else{
                        binding.imgDoor.visibility=View.GONE
                    }
                }
            }

    }
}