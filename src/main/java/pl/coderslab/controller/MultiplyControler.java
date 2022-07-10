package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MultiplyControler {

    @GetMapping("multiply")
    public String getSize (Model model, @RequestParam (defaultValue = "10", name="size" )int size) {
        model.addAttribute("size", size);

        return "/multiply";
    }

}
