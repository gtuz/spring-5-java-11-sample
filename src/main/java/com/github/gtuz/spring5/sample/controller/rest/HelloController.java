package com.github.gtuz.spring5.sample.controller.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Random;

@RestController
@RequestMapping("hello")
public class HelloController {

    private static Random generator = new Random();

    @GetMapping(value = "/random", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseBody
    public Flux<Integer> getRandomHelloMessage() {
        return Flux.interval(Duration.ofSeconds(2L)).map(t -> generator.nextInt());
    }

    @GetMapping(value = "/random-blocking", produces = "application/json")
    public Integer getRandomHelloMessageBlocking() {
        return generator.nextInt();
    }
}
