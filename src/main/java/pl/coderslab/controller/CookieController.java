package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CookieController {

    @GetMapping("setcookie/{value1}/{value2}")
    @ResponseBody
    public void createCookies (@PathVariable("value1") String value1,
                                @PathVariable("value2") String value2,
                               HttpServletResponse response) {

        Cookie cookie1 = new Cookie("cookie1", value1);
        Cookie cookie2 = new Cookie("cookie2", value2);
        cookie1.setPath("/");
        cookie2.setPath("/");
        response.addCookie(cookie1);
        response.addCookie(cookie2);

    }
    @GetMapping("getcookies")
    @ResponseBody
    public String getCookies(@CookieValue("cookie1") String cookie1,
                            @CookieValue("cookie2") String cookie2) {
        return "cookie1:" + cookie1+" "+"cookie2: "+ cookie2;
    }

}
