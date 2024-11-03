package org.example;

import java.util.concurrent.atomic.AtomicLong;

import org.example.record.Greeting;
import org.example.record.binary;
import org.example.record.lineal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    @GetMapping("/binary")
    public String binary3(@RequestParam(value = "list") String list, @RequestParam(value = "value") String value) {
        String respuesta=  mathServices.busquedabinaria(list.split(","),value);

        return respuesta;

    }


    @GetMapping("/lineal")
    public String lineal(@RequestParam(value = "list") String list, @RequestParam(value = "value") String value) {
        String respuesta=  mathServices.Busquedalineal(list.split(","),value);
        return respuesta;
    }



}