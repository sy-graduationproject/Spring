package com.rm.app.refrigerator_management_app.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class IndexController {

    @GetMapping("/")
    public String test() {
        return "Hello";
    }
}
