package com.codeseoul.demo.partOneBeans.scanTarget

import org.springframework.stereotype.Component

@Component
class OtherProduct(
    private val name: String = "I have been component scanned!"
) {
    override fun toString() = name
}