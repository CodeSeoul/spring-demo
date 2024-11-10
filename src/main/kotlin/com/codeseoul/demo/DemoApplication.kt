package com.codeseoul.demo

import com.codeseoul.demo.partZeroIntro.partZeroDiDemo
import com.codeseoul.demo.partOneBeans.partOneAddingBeansManually
import com.codeseoul.demo.partOneBeans.partOneComponentScan
import com.codeseoul.demo.partOneBeans.partOneIntro
import com.codeseoul.demo.partOneBeans.partOneManyOfSameType
import com.codeseoul.demo.partTwoWiring.partTwoAutoWiring
import com.codeseoul.demo.partTwoWiring.partTwoManualWiring
import com.codeseoul.demo.partThreeAbstraction.partThreeUsingAbstractions
import com.codeseoul.demo.partFourLifecycle.partFourPrototypeBeans
import com.codeseoul.demo.partFourLifecycle.partFourSingletonBeans
import com.codeseoul.demo.partFourLifecycle.partFourStereotypesAndLazyInit
import com.codeseoul.demo.partFiveAOP.partFiveLoggingAspect


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
}