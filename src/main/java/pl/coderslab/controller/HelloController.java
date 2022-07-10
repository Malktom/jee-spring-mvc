package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalTime;

import static java.time.LocalTime.*;

@Controller
public class HelloController {

    @GetMapping("hello")
    @ResponseBody // zeby nie szukal widowu jsp
    public String helloWorld() {
        return "Hello";
    }

    @GetMapping("helloView")
    public String helloView(Model model) {
        LocalTime now = LocalTime.now();
//        LocalTime now = LocalTime.of(21,0);
        String color, backgroundColor;

        if (now.isAfter(of(8, 0)) && now.isBefore(of(20, 0))) {  // import static
            color = "black";
            backgroundColor = "white";
        } else {
            color = "white";
            backgroundColor = "black";
        }

//
//        model.addAttribute("color", "yellow");
//        model.addAttribute("backgroundColor", "red");
        return "home";
    }
}
