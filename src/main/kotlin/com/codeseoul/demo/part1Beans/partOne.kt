package com.codeseoul.demo.part1Beans

import com.codeseoul.demo.part1Beans.scanTarget.OtherProduct
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun partOneIntro() {
    val context = AnnotationConfigApplicationContext(PartOneConfig::class.java)

    val product = Product("Not in context")

    val inContextProduct = context.getBean(Product::class.java)

    val hello = context.getBean(String::class.java)

    val number = context.getBean(Int::class.java)

    println(product)

    println(inContextProduct)

    println(hello)

    println(number)
}

fun partOneManyOfSameType() {
    val context = AnnotationConfigApplicationContext(SameTypesConfig::class.java)

//    val product = context.getBean(Product::class.java)

    val jeans = context.getBean("Jeans", Product::class.java)

    println(jeans)
}

fun partOneComponentScan() {
    val context = AnnotationConfigApplicationContext(ComponentScanConfig::class.java)

    val autoScannedProduct = context.getBean(OtherProduct::class.java)

    println(autoScannedProduct)
}

fun partOneAddingBeansManually() {
    class ExampleClass(val name: String = "I have been added manually") {
        override fun toString() = name
    }

    val context = AnnotationConfigApplicationContext(ComponentScanConfig::class.java)

    val example = ExampleClass()

    val supplier: () -> ExampleClass = { example }

    context.registerBean("example", ExampleClass::class.java, supplier)

    val exampleFromContext = context.getBean(ExampleClass::class.java)

    println(exampleFromContext)
}