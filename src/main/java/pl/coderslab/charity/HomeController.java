package pl.coderslab.charity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.entity.Donation;
import pl.coderslab.charity.service.DonationService;

import java.util.List;


@Controller
public class HomeController {

    DonationService donationService;

    public HomeController(DonationService donationService){
        this.donationService = donationService;
    }

    @RequestMapping("/")
    public String homeAction(Model model){

        return "index";
    }

    @ModelAttribute
    void getAllInfoAboutDonations(Model model){
        List<Donation> donations = donationService.findAll();
        model.addAttribute("donationsQuantity",donations.size());
    }
}
