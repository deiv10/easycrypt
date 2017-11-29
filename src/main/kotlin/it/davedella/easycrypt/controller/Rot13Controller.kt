package it.davedella.easycrypt.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rot13")
class Rot13Controller {

    @GetMapping("/crypt")
    fun rot13Crypt(): String {
        return "uryyb jbeyq"
    }

    @GetMapping("/decrypt")
    fun rot13Decrypt(): String {
        return "hello world"
    }
}