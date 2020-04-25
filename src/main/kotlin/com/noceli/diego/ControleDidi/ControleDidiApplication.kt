package com.noceli.diego.ControleDidi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody


@SpringBootApplication
class ControleDidiApplication

fun main(args: Array<String>) {
	runApplication<ControleDidiApplication>(*args)
}
