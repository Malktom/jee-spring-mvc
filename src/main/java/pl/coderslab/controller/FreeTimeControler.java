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
//        LocalDateTime date = LocalDateTime.now();
        LocalDateTime date2 = LocalDateTime.of(2022, 7, 15, 16, 13);
        String dayOfWeek = String.valueOf(date2.getDayOfWeek());
        int hour = date2.getHour();


//        Aby przetestować działanie aplikacji, możesz zamiast aktualnej daty,
//        pobrać wybraną przez siebie datę i godzinę.
//        LocalDateTime date = LocalDateTime.of(2022, 8, 11, 18, 13);

        if (dayOfWeek.equals("SUNDAY") || dayOfWeek.equals("SATURDAY")) {
            return "Wolne " + dayOfWeek+ " " + hour;

        } else if (hour >= 9 && hour<=17)  {
            return "Pracuje, nie dzwoń " +dayOfWeek+ " " + hour;
        }
        return " po pracy " + dayOfWeek+ " " + hour;
    }

}
