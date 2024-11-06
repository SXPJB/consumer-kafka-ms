package com.fsociety.consumerkafkams

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConsumerKafkaMsApplication

fun main(args: Array<String>) {
    runApplication<ConsumerKafkaMsApplication>(*args)
}
