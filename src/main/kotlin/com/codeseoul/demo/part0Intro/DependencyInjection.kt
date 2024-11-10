package com.codeseoul.demo.part0Intro


class NoDependencyInjection() {
    fun printFooBar() {
        val foo = FooDependency()
        val bar = BarDependency()
        foo.print()
        bar.print()
    }
}


class DependencyInjection(
    private val foo: FooDependency,
    private val bar: BarDependency
) {
    fun printFooBar() {
        foo.print()
        bar.print()
    }
}

class FooDependency {
    fun print() {
        println("foo")
    }
}

class BarDependency {
    fun print() {
        println("bar")
    }
}

fun partZeroDiDemo() {
    println("no dependency injection")
    val noDI = NoDependencyInjection()
    noDI.printFooBar()

    println("with dependency injection")
    val foo = FooDependency()
    val bar = BarDependency()
    val withDI = DependencyInjection(foo = foo, bar = bar)
    withDI.printFooBar()
}