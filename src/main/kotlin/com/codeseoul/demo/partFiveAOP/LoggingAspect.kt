package com.codeseoul.demo.partFiveAOP

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.springframework.stereotype.Component

@Aspect
@Component
class LoggingAspect {
    @Around("@annotation(MeasureTime)")
    fun log(joinPoint: ProceedingJoinPoint) {
        val startTime = System.currentTimeMillis()
        joinPoint.proceed()
        val endTime = System.currentTimeMillis()
        println("time taken: ${endTime - startTime} milliseconds")
    }
}

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
annotation class MeasureTime
