package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {
    @GetMapping("/show-random")
    @ResponseBody
    public String getRandom() {
        int number;
        Random random = new Random();
        number = random.nextInt(100);
        return "Wylosowano liczbę: "+number;
    }


}
