package com.codeseoul.demo.partThreeAbstraction

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun partThreeUsingAbstractions() {
    val context = AnnotationConfigApplicationContext(PartThreeConfig::class.java)
    val deliveryService = context.getBean(DeliveryService::class.java)
    deliveryService.completeDelivery()
}