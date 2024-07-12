package com.example.customerlist;

import com.example.customerlist.models.Customer;
import com.example.customerlist.services.IService;
import com.example.customerlist.services.impl.CustomerServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private IService customerService;
    @GetMapping("/customers")
    public ModelAndView showList(Model model){
        ModelAndView modelAndView = new ModelAndView("list");
        List<Customer> customers = customerService.findAll();
        modelAndView.addObject("customers",customers);
        return modelAndView;
    }
}