package com.codeseoul.demo.part5AOP

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackages = ["com.codeseoul.demo.part4Lifecycle"])
class PartFiveConfig {
}