package A03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("")
    public String greeting(){
        return "index";
    }

    @PostMapping("/greeting")
    public String greeting(@RequestParam String name, Model modle){
        modle.addAttribute("name", name);
        return "index";
    }
}
