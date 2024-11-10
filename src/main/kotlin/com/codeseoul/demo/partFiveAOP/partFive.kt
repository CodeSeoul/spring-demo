package com.codeseoul.demo.partFiveAOP

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun partFiveLoggingAspect() {
    val context = AnnotationConfigApplicationContext(PartFiveConfig::class.java)
    val orderService = context.getBean(OrderService::class.java)
    orderService.placeOrder(productName = "2 gallon barrel of industrial grade glycine", amount = 5)
}

fun partFiveLoggingAspectWithIntercept() {
    val context = AnnotationConfigApplicationContext(PartFiveConfig::class.java)
    val orderService = context.getBean(OrderService::class.java)
    orderService.cancelOrder(productName = "galvanized square steel", amount = 3)
}