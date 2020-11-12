package pl.coderslab.charity.service;

import pl.coderslab.charity.entity.Donation;
import pl.coderslab.charity.repository.DonationRepository;

import java.util.List;

public class DonationServiceDb implements DonationService {
    DonationRepository donationRepository;

    public DonationServiceDb(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    @Override
    public List<Donation> findAll() {
        return donationRepository.findAll();
    }
}
