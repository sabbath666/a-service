package com.sabbath.aservice

import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.lang.IllegalArgumentException
import java.lang.RuntimeException
import kotlin.random.Random

private val logger = KotlinLogging.logger {}

@RestController
class AController {

    @GetMapping("/")
    fun test(): String {
        logger.info { "OK pressed" }
        return "OK"
    }

    @GetMapping("/e")
    fun testException() {
        try{
           efun()
        }
        catch (e:Exception)
        {
            logger.error(e.message,e)
            throw(e)
        }
    }

    fun efun(){
        throw IllegalArgumentException()
    }
}