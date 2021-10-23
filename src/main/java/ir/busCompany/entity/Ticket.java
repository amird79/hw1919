package ir.busCompany.entity;

import ir.busCompany.base.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ticket extends BaseEntity<Long> {
    public static final String DESTINATION = "destination";
    public static final String ORIGIN = "origin";
    public static final String TIME = "time";
    public static final String FIRSTNAME = "FirstName";
    public static final String LASTNAME = "LastName";
    public static final String GENDER = "Gender";
    public static final String DATE = "DATE";
    public static final String TRAVELID = "TravelId";
    public static final String TICKETID = "TicketId";
    public static final String PASSENGER = "passenger";


    @Column(name = FIRSTNAME)
    @NotBlank(message = "Please fill out")
    private String firstName;

    @Column(name = LASTNAME)
    @NotBlank(message = "Please fill out")
    private String lastName;

    @Column(name = GENDER)
    @NotBlank(message = "Please fill out")
    private String gender;

    @Column(name = ORIGIN)
    @NotBlank(message = "Please fill out")
    private String origin;

    @Column(name = DESTINATION)
    @NotBlank(message = "Please fill out")
    private String destination;

    @Column(name = DATE)
    @NotBlank(message = "Please fill out")
    private LocalDateTime date;

    @Column(name = TIME)
    @NotBlank(message = "Please fill out")
    private LocalDateTime time;

    @Column(name = TRAVELID)
    @NotBlank(message = "Please fill out")
    private Long TravelId;

    @Column(name = TICKETID)
    @NotBlank(message = "Please fill out")
    private Long TicketID;

    @ManyToMany
    @JoinColumn(name = PASSENGER)
    private List<Passenger> customer = new ArrayList<>();

}
