package com.micronauttest.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/oi")
public class MicronautController {
    @Get 
    @Produces(MediaType.TEXT_PLAIN) 
    public String oi() {
        return "Oi Micronaut";
    }
}
