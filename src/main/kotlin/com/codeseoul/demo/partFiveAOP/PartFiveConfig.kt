package com.codeseoul.demo.partFiveAOP

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.EnableAspectJAutoProxy

@Configuration
@ComponentScan(basePackages = ["com.codeseoul.demo.partFiveAOP"])
@EnableAspectJAutoProxy
class PartFiveConfig {
    @Bean
    fun aspect(): Logger {
        return Logger()
    }
}