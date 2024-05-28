package com.iesam.alertsfood.alerts.presentation.list.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.iesam.alertsfood.alerts.domain.Alert
import com.iesam.alertsfood.alerts.presentation.list.AlertItemDiffUtil

class AlertItemAdapter:ListAdapter<Alert, AlertItemViewHolder>(AlertItemDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlertItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return AlertItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlertItemViewHolder, position: Int) {

    }
}