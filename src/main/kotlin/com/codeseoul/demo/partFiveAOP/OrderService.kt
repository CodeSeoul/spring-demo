package com.codeseoul.demo.partFiveAOP

import org.springframework.stereotype.Service

@Service
class OrderService {
    @MeasureTime
    fun placeOrder(productName: String, amount: Long) {
        Thread.sleep(1000)
        println("Placing order: $amount x $productName")
    }
}