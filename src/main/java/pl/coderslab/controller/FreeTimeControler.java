package pl.coderslab.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller

public class FreeTimeControler {

    @GetMapping("date")
    @ResponseBody
    public String getDate() {
        LocalDateTime date = LocalDateTime.now();


        if (date.getDayOfWeek().equals("SUNDAY") || date.getDayOfWeek().equals("SATURDAY")) {
            return "Wolne" + date.getDayOfWeek() + " " + date.getHour();

        } else if (date.getHour() > 9 && date.getHour() < 17) {
            return "Pracuje, nie dzwoń " + date.getDayOfWeek() + " " + date.getHour();
        }
        return " po pracy " + date.getDayOfWeek() + " " + date.getHour();
    }

}
