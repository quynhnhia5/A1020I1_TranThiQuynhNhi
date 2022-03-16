package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.model.Province;
import com.example.demo.service.CustomerService;
import com.example.demo.service.ProvinceService;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @Autowired
    ProvinceService provinceService;



    @GetMapping("")
    public ModelAndView getCustomerList(@RequestParam(name="nameCus", required = false, defaultValue = "") String lastName,@PageableDefault(size = 2) @SortDefault("lastName") Pageable pageable ){

        Page<Customer> customers=customerService.searchByName(lastName,pageable);
        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("customers", customers);
        modelAndView.addObject("nameCus",lastName);

        return modelAndView;

    }


    @GetMapping("/create")
    public ModelAndView createCustomer(Model model){
        List<Province> provinces=provinceService.findAll();
        model.addAttribute("provinces",provinces);
        return new ModelAndView("create", "customer", new Customer());
    }

    @PostMapping("/create")
    public String  saveCustomer(@Valid @ModelAttribute Customer customer, BindingResult bindingResult, RedirectAttributes redirectAttributes,Model model){
        if(bindingResult.hasErrors()){
            List<Province> provinces=provinceService.findAll();
            model.addAttribute("provinces",provinces);
            return "create";
        }else {
            customerService.saveCustomer(customer);
            redirectAttributes.addFlashAttribute("message","Create Success");
            return "redirect:/";
        }

    }







}
