package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
//@RequestMapping("/first") // remove
public class FormController {

    @GetMapping("/form")
    public String hello() {
        return "/form";
    }

    @PostMapping("/form")
    @ResponseBody
    public String getParameters(@RequestParam(name="paramName") String paramName,
                                   @RequestParam(name ="paramDate") String paramDate) {
        LocalDate paramDateInLocalFormat = LocalDate.parse(paramDate);
        return paramName +" "+ paramDateInLocalFormat;

    }




}
