package a03.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class CustomerController {
    @GetMapping("/customers")
    public String showList() {
        return "customers/list.jsp";
    }
}
