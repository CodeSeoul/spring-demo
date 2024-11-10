package com.codeseoul.demo.part5AOP

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun partFiveLoggingAspect() {
    val context = AnnotationConfigApplicationContext(PartFiveConfig::class.java)
    val orderService = context.getBean(OrderService::class.java)
    orderService.placeOrder("2 gallon barrel of industrial grade glycine")
}

fun partFiveLoggingAspectWithIntercept() {
    val context = AnnotationConfigApplicationContext(PartFiveConfig::class.java)
    val orderService = context.getBean(OrderService::class.java)
    orderService.cancelOrder("galvanized square steel")
}

fun partFiveLoggingAspectWithInterceptMutation() {
    val context = AnnotationConfigApplicationContext(PartFiveConfig::class.java)
    val orderService = context.getBean(OrderService::class.java)
    orderService.subscribeOrder("1 bag of dog food")
}