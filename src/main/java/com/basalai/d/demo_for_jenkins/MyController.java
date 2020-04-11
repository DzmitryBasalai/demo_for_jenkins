package com.basalai.d.demo_for_jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/api")
    public String test() {
        return "hello world";
    }
}
