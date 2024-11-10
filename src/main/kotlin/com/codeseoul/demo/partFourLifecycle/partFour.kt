package com.codeseoul.demo.partFourLifecycle

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun partFourSingletonBeans() {
    val context = AnnotationConfigApplicationContext(PartFourConfig::class.java)
    val bean1 = context.getBean(IAmASingleton::class.java)
    val bean2 = context.getBean(IAmASingleton::class.java)

    println("Both singleton beans should be equal")
    if (bean1 == bean2) {
        println("We're the same bean")
    } else {
        println("We're not the same bean")
    }
}

fun partFourPrototypeBeans() {
    val context = AnnotationConfigApplicationContext(PartFourConfig::class.java)
    val bean1 = context.getBean(IAmAPrototype::class.java)
    val bean2 = context.getBean(IAmAPrototype::class.java)

    println("Both prototype beans should not be equal")
    if (bean1 == bean2) {
        println("We're the same bean")
    } else {
        println("We're not the same bean")
    }
}

fun partFourStereotypesAndLazyInit() {
    val context = AnnotationConfigApplicationContext(PartFourConfig::class.java)
    val bean = context.getBean(IAmARestController::class.java)
    println("lazy bean should not be loaded")
    bean.doSomething1()
    println("lazy bean should still not be loaded")
    bean.doSomething2()
    println("lazy bean has been loaded after being used")
}