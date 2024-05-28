package com.iesam.alertsfood.alerts.presentation.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.iesam.alertsfood.alerts.domain.Alert
import com.iesam.alertsfood.alerts.domain.GetAlertsUseCase

class ListAlertViewModel(private val getAlertsUseCase: GetAlertsUseCase): ViewModel() {

    private var _uiState = MutableLiveData<UiState>()
    val uiState: LiveData<UiState> = _uiState


    fun loadAlerts(){

    }
    data class UiState(
        val alerts: List<Alert>
    )
}