package com.herasimau.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

/**
 * Created by herasimau on 29/01/17.
 */
@Entity
public class Manufacturer {

    public Manufacturer(Long id){
        this.id=id;
    }

    public Manufacturer(String name, String pIva, String cFiscale, Address address) {
        this.name = name;
        this.pIva = pIva;
        this.cFiscale = cFiscale;
        this.address = address;
    }



    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "manufacturer_id")
    private Long id;

    private String name;
    private String pIva;
    private String cFiscale;

    @JsonProperty("address")
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="address_id")
    private Address address;

    public Manufacturer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpIva() {
        return pIva;
    }

    public void setpIva(String pIva) {
        this.pIva = pIva;
    }

    public String getcFiscale() {
        return cFiscale;
    }

    public void setcFiscale(String cFiscale) {
        this.cFiscale = cFiscale;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
