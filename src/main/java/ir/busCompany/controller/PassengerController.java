package ir.busCompany.controller;

import ir.busCompany.entity.Passenger;
import ir.busCompany.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller


public class PassengerController {
    @Autowired
    private PassengerService passengerService;

    @GetMapping("/signUp")
    public String signUp( Passenger passenger ) {
        return "add-passenger";
    }

    @PostMapping("/checkUser")
//    public String checkPassenger( Passenger passenger, BindingResult result, Model model ) {

    public String checkPassenger( String userName, String password, BindingResult result, Model model ) {
        if (result.hasErrors()) {
            return "add-passenger";
        }
        passengerService.checkUserNameAndPassword(userName, password);
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String passenger( Model model ) {
        return "index";
    }
}
