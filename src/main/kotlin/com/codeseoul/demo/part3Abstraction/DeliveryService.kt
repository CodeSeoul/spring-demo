package com.codeseoul.demo.part3Abstraction

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class DeliveryService(
    @Qualifier("TEXT")
    private val notificationService: IDeliveryNotification,
    private val plottingService: IPlotNextDestination,
) {
    fun completeDelivery() {
        println("completed delivery")
        notificationService.notify("delivery is completed")
        plottingService.plotCourse()
    }
}