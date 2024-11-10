package com.codeseoul.demo.partFiveAOP

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect

@Aspect
class Logger {
    @Around("execution(* partFiveAOP.*.*(..))")
    fun log(joinPoint: ProceedingJoinPoint) {
        println("logging start")
        joinPoint.proceed()
        println("logging done")
    }
}