package org.dodgson.hello

import io.micronaut.core.annotation.Introspected
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Introspected
data class Greet(val message: String)

@Controller("/")
class HelloController {
    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    fun index() : String = "Hello, World!"

    @Get("/greet/{message}")
    @Produces(MediaType.APPLICATION_JSON)
    fun greet(message: String) : Greet = Greet(message)
}