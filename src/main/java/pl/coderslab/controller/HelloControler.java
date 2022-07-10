package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloControler {

    @GetMapping("hello")
    @ResponseBody // zeby nie szukal widowu jsp
    public String helloWorld() {
        return "Hello";
    }
}
