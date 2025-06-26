package com.apoorva.caffeineappui
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.media3.common.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.apoorva.caffeineappui.ForYouItem
import com.apoorva.caffeineappui.R

class ForYouAdapter(private val items: List<ForYouItem>) :
    RecyclerView.Adapter<ForYouAdapter.ForYouViewHolder>() {

    inner class ForYouViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val iconImage: ImageView = itemView.findViewById(R.id.iconImage)
        val discountText: TextView = itemView.findViewById(R.id.discountText)
        val inviteText: TextView = itemView.findViewById(R.id.inviteText)
        val appText: TextView = itemView.findViewById(R.id.appText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForYouViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_for_your_card, parent, false)
        return ForYouViewHolder(view)
    }

    override fun onBindViewHolder(holder: ForYouViewHolder, position: Int) {
        val item = items[position]
        Log.d("AdapterBind", "Item: ${item.discountText}")
        holder.iconImage.setImageResource(item.iconResId)
        holder.discountText.text = item.discountText
        holder.inviteText.text = item.inviteLine1
        holder.appText.text = item.inviteLine2
    }

    override fun getItemCount(): Int = items.size
}
