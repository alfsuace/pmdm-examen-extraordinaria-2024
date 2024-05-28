package com.iesam.alertsfood.alerts.domain

import com.iesam.alertsfood.alerts.data.AlertDataRepository

class GetAlertsUseCase(private val alertDataRepository: AlertDataRepository) {

    operator fun invoke():List<Alert>{
        return alertDataRepository.getAlerts()
    }

}
