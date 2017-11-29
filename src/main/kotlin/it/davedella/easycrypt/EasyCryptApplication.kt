package it.davedella.easycrypt

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class EasyCryptApplication

fun main(args: Array<String>) {
    SpringApplication.run(EasyCryptApplication::class.java, *args)
}