package org.dodgson.hello

import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class HelloControllerTest {
    @Inject
    @field:Client("/")
    lateinit var client : RxHttpClient

    @Test
    fun testGreet() {
        val res = client.toBlocking().retrieve("/greet/Hello", Greet::class.java)
        Assertions.assertEquals(res.message, "Hello")
    }
}