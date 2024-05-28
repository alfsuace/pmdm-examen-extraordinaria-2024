package com.iesam.alertsfood.alerts.presentation.list.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.iesam.alertsfood.alerts.domain.Alert
import com.iesam.alertsfood.databinding.ViewAlertItemBinding

class AlertItemViewHolder(itemView: View) : ViewHolder(itemView) {

     lateinit var binding: ViewAlertItemBinding

    fun bind(alert: Alert) {
        binding = ViewAlertItemBinding(itemView)
        binding.apply {
            //glide
            itemAlertType.text=alert.typeAlert.toString()
            itemDate.text=alert.publishData.toString()
            itemDescription.text=alert.body

        }
    }
}