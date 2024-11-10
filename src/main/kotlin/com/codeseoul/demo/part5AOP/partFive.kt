package com.codeseoul.demo.part5AOP

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun partFiveLoggingAspect() {
    val context = AnnotationConfigApplicationContext(PartFiveConfig::class.java)

}

fun partFiveLoggingAspectWithIntercept() {
    val context = AnnotationConfigApplicationContext(PartFiveConfig::class.java)
}