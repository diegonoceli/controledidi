package com.noceli.diego.ControleDidi.Controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*


@RestController
class TestController {

    @get:RequestMapping(value = ["/getString"], produces = [MediaType.APPLICATION_JSON_VALUE])
    val string: Map<*, *>
        get() = Collections.singletonMap("response", "Hello World")
}
