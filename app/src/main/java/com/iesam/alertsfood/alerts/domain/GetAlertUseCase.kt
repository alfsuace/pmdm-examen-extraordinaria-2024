package com.iesam.alertsfood.alerts.domain

import com.iesam.alertsfood.alerts.data.AlertDataRepository

class GetAlertUseCase(private val alertDataRepository: AlertDataRepository) {

    operator fun invoke(id :String): Alert? {
        return alertDataRepository.getAlert(id)
    }

}
