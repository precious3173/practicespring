package com.springy.practicespring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.springy.com.springy.practicespring"])
class PracticespringApplication

fun main(args: Array<String>) {
	runApplication<PracticespringApplication>(*args)
}
