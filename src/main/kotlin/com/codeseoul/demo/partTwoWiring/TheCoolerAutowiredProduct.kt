package com.codeseoul.demo.partTwoWiring

import org.springframework.stereotype.Component

@Component
class TheCoolerAutowiredProduct(
    val autowireTarget: ThingToBeAutowired
) {
    override fun toString(): String {
        return "I got autowired with this: $autowireTarget "
    }
}

@Component
class ThingToBeAutowired {
    override fun toString(): String = this.javaClass.simpleName
}