package it.deiv10.easycrypto

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class Rot13Controller {
    init{
        println("Start Rot13Controller")
    }

    @GetMapping("/crypt")
    fun rot13crypt(@RequestParam(value = "string", defaultValue = "Hello World") name: String) =
            "Uryyb Jbeyq"

}
