package com.dannycodes.bank_transfer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {


        @GetMapping
        public String getCustomerDetails(){
        return "This customer name is daniel\n" +
                "and he is a java developer";
    }

    @GetMapping("/details")
    public String getDetails(){
        return "This customer name is daniel\n" +
                "and this are his details";
    }





}
