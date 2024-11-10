package com.codeseoul.demo.part1Beans

class Product(
    private val name: String = "default name"
) {
    override fun toString() = name
}
