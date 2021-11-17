package a03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConversionController {
    @GetMapping("")
    public String index(){
        return "index";
    }
    @PostMapping("/converter")
    public String conver(@RequestParam("rate") String rate, @RequestParam("usd") String usd, Model model){
        double rateDouble=Double.parseDouble(rate);
        double usdDouble=Double.parseDouble(usd);
        double vnd=rateDouble*usdDouble;
        model.addAttribute("vnd",vnd);
        return "result";

    }
}
