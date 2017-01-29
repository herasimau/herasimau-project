package com.herasimau.services;

import com.herasimau.dto.Address;
import com.herasimau.dto.Manufacturer;
import com.herasimau.repository.AddressRepository;
import com.herasimau.repository.ManufacturerRepository;
import com.herasimau.repository.StoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by herasimau on 29/01/17.
 */
@Service
public class StoneService {

    @Autowired
    StoneRepository stoneRepository;

    @Autowired
    ManufacturerRepository manufacturerRepository;

    @Autowired
    AddressRepository addressRepository;

    @PostConstruct
    public void init(){
        Address address = addressRepository
                .save(new Address("AREZZO","50144","Via ponte alle mosse 15"));

        Manufacturer manufacturer = manufacturerRepository.save(
                new Manufacturer("Jolly Silver","05453453","2342342",address)
        );

        //Stone stone = stoneRepository.save(new Stone(5.5,"Peridot 4mm", manufacturer, StoneType.NATURAL, StoneColor.BLACK));


    }
}
