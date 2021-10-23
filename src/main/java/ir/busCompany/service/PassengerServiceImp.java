package ir.busCompany.service;

import ir.busCompany.entity.Passenger;
import ir.busCompany.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerServiceImp implements PassengerService {
    @Autowired
    private PassengerRepository passengerRepository;

    @Override
    public Passenger checkUserNameAndPassword( String Username, String Password ) {
        return passengerRepository.findByUsernameAndPassword(Username, Password);
    }
}
