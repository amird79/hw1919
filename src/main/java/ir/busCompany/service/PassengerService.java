package ir.busCompany.service;

import ir.busCompany.entity.Passenger;

public interface PassengerService {
    Passenger checkUserNameAndPassword( String Username, String Password);
}
