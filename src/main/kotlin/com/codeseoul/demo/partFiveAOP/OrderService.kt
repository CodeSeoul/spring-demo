package com.codeseoul.demo.partFiveAOP

import org.springframework.stereotype.Service
import java.util.*

@Service
class OrderService {
    @MeasureTime
    fun placeOrder(productName: String, amount: Long): UUID {
        Thread.sleep(200)
        println("Placing order: $amount x $productName")
        return UUID.randomUUID()
    }

    @DetailedMeasureTime
    fun cancelOrder(productName: String, amount: Long): UUID {
        Thread.sleep(200)
        println("Cancelling order: $amount x $productName")
        return UUID.randomUUID()
    }
}