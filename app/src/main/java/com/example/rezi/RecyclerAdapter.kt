package com.example.rezi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rezi.databinding.UserListItemBinding

class RecyclerAdapter():RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private val userList = mutableListOf<String>()

    inner class ViewHolder(private val binding:UserListItemBinding):
        RecyclerView.ViewHolder(binding.root){
        fun onBind(position: Int){
            binding.userTv.text = userList[position]
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(UserListItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(position)
    }

    override fun getItemCount() = userList.size

    fun setData(list:List<String>){
        userList.clear()
        userList.addAll(list)
        notifyDataSetChanged()
    }
}