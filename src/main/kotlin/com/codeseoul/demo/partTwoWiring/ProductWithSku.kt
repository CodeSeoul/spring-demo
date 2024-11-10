package com.codeseoul.demo.partTwoWiring


class ProductWithSku(
    private val name: String,
    private val size: Size
) {
    override fun toString() = "$name - $size"
}

class Size(private val size: String = "Medium") {
    override fun toString() = size
}

