
package com.example.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/check")
    @ResponseBody
    public String check(
            @RequestParam String input1,
            @RequestParam String input2) {

        return "Your order for " + input1
                + " of quantity " + input2
                + " has been received";
    }
}
