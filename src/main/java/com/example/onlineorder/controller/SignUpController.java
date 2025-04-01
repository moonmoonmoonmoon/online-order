package com.example.onlineorder.controller;
import com.example.onlineorder.entity.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.example.onlineorder.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;



//@Controller
//public class SignUpController {
//    @RequestMapping(value = "/signup", method = RequestMethod.POST)
//    @ResponseStatus(value = HttpStatus.CREATED)
//    public void signUp(@RequestBody Customer customer) {
//    }
//}
@Controller
public class SignUpController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void signUp(@RequestBody Customer customer) {
//        System.out.println("custom name: " + customer.getFirstName());
        customerService.signUp(customer);
    }
}

