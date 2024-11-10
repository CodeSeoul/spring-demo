package com.codeseoul.demo.partFiveAOP

import org.springframework.stereotype.Service

@Service
class OrderService {
    fun placeOrder(productName: String, amount: Long) {
        println("Placing order: $amount x $productName")
    }
}