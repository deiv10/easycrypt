package it.davedella.easycrypt.controller

import it.davedella.easycrypt.bean.Rot13Bean
import it.davedella.easycrypt.service.Rot13Service
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/rot13")
class Rot13Controller {

    @Autowired
    lateinit var rot13Service: Rot13Service

    @GetMapping("/crypt")
    fun rot13CryptGet(@RequestParam(value="stringValue", required=false) string: String): String {
        return rot13Service.crypt(string)
    }

    @PostMapping("/crypt")
    fun rot13CryptPost(@RequestBody rot13Bean: Rot13Bean): String {
        return rot13Service.crypt(rot13Bean.stringValue)
    }
}