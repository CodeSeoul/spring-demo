package com.codeseoul.demo.part5AOP

import org.springframework.stereotype.Service
import java.util.*

@Service
class OrderService {
    @MeasureTime
    fun placeOrder(productName: String): UUID {
        Thread.sleep(200)
        println("Placing order: $productName")
        return UUID.randomUUID()
    }

    @DetailedMeasureTime
    fun cancelOrder(productName: String): UUID {
        Thread.sleep(200)
        println("Cancelling order: $productName")
        return UUID.randomUUID()
    }

    @DangerousAnnotation
    fun subscribeOrder(productName: String): UUID {
        Thread.sleep(200)
        println("Subscribe order: $productName")
        return UUID.randomUUID()
    }
}