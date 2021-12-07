package com.springcloud.clientserver.api

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RefreshScope
@RestController
class TestController {

    @Value("\${my.value}")
    lateinit var data:String

    @GetMapping("/read")
    fun read(): ResponseEntity<String>{
       return ResponseEntity.ok(data);
    }
}
