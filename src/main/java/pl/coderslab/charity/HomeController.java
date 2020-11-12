package pl.coderslab.charity;

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

    public HomeController(DonationService donationService, InstitutionService institutionService){
        this.institutionService = institutionService;
        this.donationService = donationService;
    }

    @RequestMapping("/")
    public String homeAction(Model model){

        return "index";
    }

    @ModelAttribute
    void institutionsList(Model model){
        List<Institution> institutions = institutionService.findAll();
        model.addAttribute("allInstitutions", institutions);
    }

    @ModelAttribute
    void getAllInfoAboutDonations(Model model){
        List<Donation> donations = donationService.findAll();
        model.addAttribute("donationsQuantity",donations.size());
    }
}
