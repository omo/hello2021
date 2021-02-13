package org.dodgson.hello

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("org.dodgson.hello")
		.start()
}

