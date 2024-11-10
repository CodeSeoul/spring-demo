package com.codeseoul.demo.part3Abstraction

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

interface IPlotNextDestination {
    fun plotCourse()
}

@Component
class PlotClosestDestinationByDistance : IPlotNextDestination {
    override fun plotCourse() {
        println("plotting next destination by closest distance")
    }
}

@Primary
@Component
class PlotClosestDestinationByDeliveryPriority : IPlotNextDestination {
    override fun plotCourse() {
        println("plotting next destination by highest priority")
    }
}

