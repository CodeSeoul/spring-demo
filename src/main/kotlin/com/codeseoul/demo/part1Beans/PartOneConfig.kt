package com.codeseoul.demo.part1Beans

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
class PartOneConfig {

    @Bean
    fun product(): Product {
        return Product("Shoe")
    }

    @Bean
    fun hello(): String {
        return "Hello"
    }

    @Bean
    fun ten(): Int {
        return 10
    }
}

@Configuration
class SameTypesConfig {

    @Bean("Shoe")
    fun product1(): Product {
        return Product("Shoe")
    }

    @Bean("Tshirt")
    fun product2(): Product {
        return Product("T-Shirt")
    }

    @Bean("Jeans")
    fun product3(): Product {
        return Product("Jeans")
    }
}

@Configuration
@ComponentScan(basePackages = ["com.codeseoul.demo.part1Beans.scanTarget"])
class ComponentScanConfig