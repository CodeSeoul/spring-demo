package com.codeseoul.demo.partFourLifecycle

import org.springframework.context.annotation.Lazy
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RestController

@RestController
class IAmARestController(
    val service1: IAmAService,
    @Lazy
    val service2: LazyInitTarget
) {
    fun doSomething1() = service1.doSomething()

    fun doSomething2() = service2.doSomething()
}

@Service
class IAmAService(
    val repository: IAmARepository
) {
    fun doSomething() = println("Doing something!")
}

@Service
class LazyInitTarget(
    val repository: IAmARepository
) {
    fun doSomething() = println("I am lazily loaded")
}

@Repository
class IAmARepository

