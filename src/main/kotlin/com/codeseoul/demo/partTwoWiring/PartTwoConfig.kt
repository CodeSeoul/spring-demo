package com.codeseoul.demo.partTwoWiring

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackages = ["com.codeseoul.demo.partTwoWiring"])
class PartTwoConfig {
    @Bean("DirectCall")
    fun productWithSkuDirectCall(): ProductWithSku {
        return ProductWithSku(
            name = "Tshirt",
            size = size()
        )
    }

    @Bean("MethodMapping")
    fun productWithSkuMethodMapping(size: Size): ProductWithSku {
        return ProductWithSku(
            name = "Tshirt",
            size = size
        )
    }

    @Bean
    fun autowiredProduct(): AutowiredProduct {
        return AutowiredProduct()
    }


    @Bean
    fun size(): Size {
        return Size()
    }
}