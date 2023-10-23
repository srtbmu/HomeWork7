package com.example.myapplication.ui.camera

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.example.myapplication.databinding.ItemCameraBinding
import com.example.myapplication.model.CameraModel

class CameraAdapter( private var list: ArrayList<CameraModel>) : Adapter<CameraAdapter.CameraHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CameraHolder {
       return CameraHolder(ItemCameraBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: CameraHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class CameraHolder(private val binding: ItemCameraBinding) : ViewHolder(binding.root) {

        fun bind(cameraModel: CameraModel) {
            binding.numberCamera.text = cameraModel.name
            binding.imgCamera.load(cameraModel.img)
        }

    }
}