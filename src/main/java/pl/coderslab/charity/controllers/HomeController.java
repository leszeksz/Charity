package pl.coderslab.charity.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.entity.Donation;
import pl.coderslab.charity.entity.Institution;
import pl.coderslab.charity.service.DonationService;
import pl.coderslab.charity.service.InstitutionService;

import java.util.List;


@Controller
public class HomeController {

    InstitutionService institutionService;
    DonationService donationService;

    @Autowired
    public HomeController(DonationService donationService, InstitutionService institutionService){
        this.institutionService = institutionService;
        this.donationService = donationService;
    }

    @RequestMapping("/")
    public String homeAction(){

        return "index";
    }

    @ModelAttribute("institu")
    void institutionsList(Model model){
        List<Institution> institutions = institutionService.findAll();
        for (int i = 1; i < 2; i++) {
            institutionService.findAll();
//            model.addAttribute("allInstitutions", institutions);
        }
        model.addAttribute("allInstitutions", institutions);
    }

//    @ModelAttribute
//    void getAllInfoAboutDonations(Model model){
//        List<Donation> donations = donationService.findAll();
//        int generalQuantity = donations.stream().mapToInt(Donation::getQuantity).sum();
//        model.addAttribute("donationsQuantity",donations.size());
//        model.addAttribute("quantityOfPacks", generalQuantity);
//    }
}
