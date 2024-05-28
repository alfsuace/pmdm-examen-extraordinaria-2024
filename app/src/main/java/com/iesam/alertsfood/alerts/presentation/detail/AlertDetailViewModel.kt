package com.iesam.alertsfood.alerts.presentation.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.iesam.alertsfood.alerts.domain.Alert
import com.iesam.alertsfood.alerts.domain.GetAlertUseCase

class AlertDetailViewModel(private val getAlertUseCase: GetAlertUseCase):ViewModel() {

    private var _uiState = MutableLiveData<UiState>()
    val uiState: LiveData<UiState> = _uiState


    fun loadAlerts(id: String){
        val response = getAlertUseCase.invoke(id)

    }
    data class UiState(
        val alert: Alert? = null
    )

}