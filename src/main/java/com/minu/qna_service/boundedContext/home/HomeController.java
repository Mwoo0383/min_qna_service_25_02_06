package com.minu.qna_service.boundedContext.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/home/main")
    @ResponseBody
    public String showHome() {
        return "안녕~ 같이 공부하자!";
    }
}
