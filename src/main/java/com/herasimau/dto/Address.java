package com.herasimau.dto;

import javax.persistence.*;

/**
 * Created by herasimau on 29/01/17.
 */
@Entity
public class Address {

    public Address(){

    }
    public Address(String city, String cap, String via) {
        this.city = city;
        this.cap = cap;
        this.via = via;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="address_id")
    Long id;

    private String city;
    private String cap;
    private String via;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

}
