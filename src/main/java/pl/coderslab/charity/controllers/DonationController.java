package pl.coderslab.charity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DonationController {

    @RequestMapping("/donate")
    public String donationAction(){
        return "form";
    }


}
