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


@Aspect
@Component
class InterceptingLoggingAspect {
    @Around("@annotation(DetailedMeasureTime)")
    fun log(joinPoint: ProceedingJoinPoint): Any? {
        val methodName = joinPoint.signature.name
        val args = joinPoint.args
        println("method name: $methodName, arguments: ${args.toList()}")
        val startTime = System.currentTimeMillis()
        val returned = joinPoint.proceed()
        val endTime = System.currentTimeMillis()
        println("time taken: ${endTime - startTime} milliseconds")
        println("will return: $returned")
        return returned
    }
}

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
annotation class DetailedMeasureTime