package it.davedella.easycrypt.service

import it.davedella.easycrypt.engine.Rot13Engine
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class Rot13Service{

    @Autowired
    lateinit var rot13Engine: Rot13Engine

    fun crypt(string: String): String {return rot13Engine.crypt(string)}

}