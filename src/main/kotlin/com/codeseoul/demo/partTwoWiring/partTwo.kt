package com.codeseoul.demo.partTwoWiring

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun partTwoManualWiring() {
    val context = AnnotationConfigApplicationContext(PartTwoConfig::class.java)
    val directCall = context.getBean("DirectCall", ProductWithSku::class.java)
    val methodMapping = context.getBean("MethodMapping", ProductWithSku::class.java)
    println("from direct calling: $directCall")
    println("from method mapping: $methodMapping")
}

fun partTwoAutoWiring() {
    val context = AnnotationConfigApplicationContext(PartTwoConfig::class.java)
    val autowiredProduct = context.getBean(AutowiredProduct::class.java)
    val coolerAutowiredProduct = context.getBean(TheCoolerAutowiredProduct::class.java)
    println(autowiredProduct)
    println(coolerAutowiredProduct)
}