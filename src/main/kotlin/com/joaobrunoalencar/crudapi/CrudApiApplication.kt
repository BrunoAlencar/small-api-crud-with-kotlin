package com.joaobrunoalencar.crudapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CrudApiApplication

fun main(args: Array<String>) {
	runApplication<CrudApiApplication>(*args)
}
