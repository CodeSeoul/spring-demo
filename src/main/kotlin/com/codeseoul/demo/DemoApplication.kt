package com.codeseoul.demo

import com.codeseoul.demo.part1Beans.partOneAddingBeansManually
import com.codeseoul.demo.part1Beans.partOneComponentScan
import com.codeseoul.demo.part1Beans.partOneIntro
import com.codeseoul.demo.part1Beans.partOneManyOfSameType

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
    partOneIntro()
    partOneManyOfSameType()
    partOneComponentScan()
    partOneAddingBeansManually()
}