package com.codeseoul.demo.part5AOP

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.EnableAspectJAutoProxy

@Configuration
@ComponentScan(basePackages = ["com.codeseoul.demo.part5AOP"])
@EnableAspectJAutoProxy
class PartFiveConfig