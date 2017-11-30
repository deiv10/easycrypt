package it.deiv10.easycrypto

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EasycryptoApplication

fun main(args: Array<String>) {
    println("Start Main Application")
    runApplication<EasycryptoApplication>(*args)
}
