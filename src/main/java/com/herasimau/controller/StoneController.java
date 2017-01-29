package com.herasimau.controller;

import com.herasimau.dto.stones.Stone;
import com.herasimau.repository.ManufacturerRepository;
import com.herasimau.repository.StoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

/**
 * Created by herasimau on 29/01/17.
 */
@RestController
public class StoneController {

    @Autowired
    StoneRepository stoneRepository;

    @Autowired
    ManufacturerRepository manufacturerRepository;

    @RequestMapping(value="/stones" , method=RequestMethod.POST)
    public ResponseEntity<?> addStone(@RequestBody Stone stone){
        stoneRepository.save(stone);
        return new ResponseEntity<>( Collections.singletonMap("success", true), HttpStatus.CREATED);
    }

}
