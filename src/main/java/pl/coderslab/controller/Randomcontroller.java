package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class Randomcontroller {

    @GetMapping("random/{max}")
    @ResponseBody
    public String generateRandomWithMax (@PathVariable("max") int max){
        int rand = new Random().nextInt(max)+1;
        return "Uzytkownik podal wartosc "
                + max + " Wysoloswano liczbe: "
                + rand;

    }
    @GetMapping("random/{min}/{max}")
    @ResponseBody
    public String generateRandomWithMax (@PathVariable("min") int min,
                                         @PathVariable("max") int max){
        int rand = new Random().nextInt(max-min)+min;
        return "Uzytkownik podal wartosc "
                + min
                + " - "
                + max + " Wysoloswano liczbe: "
                + rand;

    }
}
