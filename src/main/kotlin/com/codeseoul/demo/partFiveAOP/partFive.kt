package com.codeseoul.demo.partFiveAOP

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun partFiveLoggingAspect() {
    val context = AnnotationConfigApplicationContext(PartFiveConfig::class.java)
    val orderService = context.getBean(OrderService::class.java)
    orderService.placeOrder(productName = "Cat Food", amount = 5)
}

fun partFiveLoggingAspectWithIntercept() {
    val context = AnnotationConfigApplicationContext(PartFiveConfig::class.java)
}