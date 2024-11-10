package com.codeseoul.demo

import com.codeseoul.demo.part0Intro.partZeroDiDemo
import com.codeseoul.demo.part1Beans.partOneAddingBeansManually
import com.codeseoul.demo.part1Beans.partOneComponentScan
import com.codeseoul.demo.part1Beans.partOneIntro
import com.codeseoul.demo.part1Beans.partOneManyOfSameType
import com.codeseoul.demo.part2Wiring.partTwoAutoWiring
import com.codeseoul.demo.part2Wiring.partTwoManualWiring
import com.codeseoul.demo.part3Abstraction.partThreeUsingAbstractions
import com.codeseoul.demo.part4Lifecycle.partFourPrototypeBeans
import com.codeseoul.demo.part4Lifecycle.partFourSingletonBeans
import com.codeseoul.demo.part4Lifecycle.partFourStereotypesAndLazyInit
import com.codeseoul.demo.part5AOP.partFiveLoggingAspect
import com.codeseoul.demo.part5AOP.partFiveLoggingAspectWithIntercept
import com.codeseoul.demo.part5AOP.partFiveLoggingAspectWithInterceptMutation


//import org.springframework.boot.autoconfigure.SpringBootApplication
//import org.springframework.boot.runApplication
//
//@SpringBootApplication
//class DemoApplication
//
//fun main(args: Array<String>) {
//	runApplication<DemoApplication>(*args)
//}

fun main() {
    partZeroDiDemo()
    println()
    partOneIntro()
    partOneManyOfSameType()
    partOneComponentScan()
    partOneAddingBeansManually()
    println()
    partTwoManualWiring()
    partTwoAutoWiring()
    println()
    partThreeUsingAbstractions()
    println()
    partFourSingletonBeans()
    partFourPrototypeBeans()
    partFourStereotypesAndLazyInit()
    println()
    partFiveLoggingAspect()
    partFiveLoggingAspectWithIntercept()
    partFiveLoggingAspectWithInterceptMutation()
}