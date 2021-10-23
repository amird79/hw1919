package ir.busCompany.entity;

import ir.busCompany.base.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.util.List;

@Entity
public class Passenger extends BaseEntity<Long> {
    public static final String USERNAME = "UserName";
    public static final String PASSWORD = "Password";
    @Column(name = USERNAME)
    @NotBlank(message = "Please fill out")
    private String Username;

    @Column(name = PASSWORD)
    @NotBlank(message = "Please fill out")
    private String password;

    @ManyToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Ticket> tickets;
}
