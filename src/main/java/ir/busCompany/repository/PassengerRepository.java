package ir.busCompany.repository;

import ir.busCompany.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {
    Passenger findByUsernameAndPassword( String Username ,String Password);
}
