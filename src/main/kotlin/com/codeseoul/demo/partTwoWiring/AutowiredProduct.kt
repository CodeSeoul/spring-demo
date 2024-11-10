package com.codeseoul.demo.partTwoWiring

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class AutowiredProduct(
    private val name: String = "Autowired Tshirt",
) {
    @Autowired
    private lateinit var size: Size

    override fun toString(): String {
        return "$name - $size"
    }
}