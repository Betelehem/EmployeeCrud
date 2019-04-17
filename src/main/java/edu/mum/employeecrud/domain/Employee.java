package edu.mum.employeecrud.domain;

import org.springframework.stereotype.Controller;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name="employee_id")
    Long id;
    @NotEmpty(message = "First Name is required")
    @Column(name="first_name")
    String firstname;
    @Column(name="last_name")
    String lastname;
    String email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="address_id")
    Address address;
    @OneToOne
    Position position;

    public Employee() {
    }

    public Employee(String firstname, String lastname, String email, Address address, Position position) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.position = position;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
