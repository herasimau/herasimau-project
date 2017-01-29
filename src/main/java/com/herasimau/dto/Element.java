package com.herasimau.dto;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by herasimau on 29/01/17.
 */

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Element implements Serializable{

    private static final long serialVersionUID = -5378396373373165919L;

    public Element(){

    }

    public Element(double weight, String name, Manufacturer manufacturer) {
        this.weight = weight;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private double weight;
    private String name;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="manufacturer_id")
    private Manufacturer manufacturer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
