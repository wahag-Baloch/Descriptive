package com.example.newbaloch;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VCS {
    @RequestMapping("/")
    Public String rash(){
        return "Hello world";
    }
}
