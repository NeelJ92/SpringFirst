package com.Neel.QuickStart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("Hello")
    public String SayHello(){


            return  "Hello nel";
    }
}
