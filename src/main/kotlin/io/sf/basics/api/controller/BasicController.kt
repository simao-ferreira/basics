package io.sf.basics.api.controller

import org.springframework.http.HttpStatus.OK
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/v1/basics"])
internal class BasicController(){

    @ResponseStatus(OK)
    @GetMapping(value = ["/int"])
    fun getInteger(): Int {
        return (0..Int.MAX_VALUE).random()
    }

}