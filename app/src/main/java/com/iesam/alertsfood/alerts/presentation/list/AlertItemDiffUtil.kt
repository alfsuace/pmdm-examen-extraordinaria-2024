package com.iesam.alertsfood.alerts.presentation.list

import androidx.recyclerview.widget.DiffUtil
import com.iesam.alertsfood.alerts.domain.Alert

class AlertItemDiffUtil : DiffUtil.ItemCallback<Alert>() {
    override fun areItemsTheSame(oldItem: Alert, newItem: Alert): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Alert, newItem: Alert): Boolean {
        return oldItem == newItem
    }
}