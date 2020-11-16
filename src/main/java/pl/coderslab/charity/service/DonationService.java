package pl.coderslab.charity.service;

import pl.coderslab.charity.entity.Donation;

import java.util.List;

public interface DonationService {
    List<Donation> findAll();
    Donation save(Donation donation);
}
