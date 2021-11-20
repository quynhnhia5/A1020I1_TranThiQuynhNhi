package a03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("")
    public String index(){
        return "index";
    }
    @PostMapping("/calculator")
    public String calcutor(@RequestParam("num1") double num1, @RequestParam("num2") double num2, @RequestParam("btnHandle") String btnHandle, Model model){
        double result=0;
        model.addAttribute("num1",num1);
        model.addAttribute("num2",num2);
        if(btnHandle.equalsIgnoreCase("+")){
            result=  (num1+num2);
            model.addAttribute("operation","+");
        }
        if(btnHandle.equalsIgnoreCase("-")){
            result= (num1-num2);
            model.addAttribute("operation","-");
        }
        if(btnHandle.equalsIgnoreCase("*")){
            result= (num1*num2);
            model.addAttribute("operation","*");
        }
        if(btnHandle.equalsIgnoreCase("/")){
            result= (num1/num2);
            model.addAttribute("operation","/");
        }
        model.addAttribute("result",result);
        return "result";
    }

}
