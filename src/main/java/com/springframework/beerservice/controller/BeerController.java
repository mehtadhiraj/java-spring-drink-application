package com.springframework.beerservice.controller;

import com.springframework.beerservice.model.BeerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDTO> getBeerById(@PathVariable("beerId") UUID id){
        // Todo
        return new ResponseEntity<>(BeerDTO.builder().build(), HttpStatus.OK);
    }

    @PostMapping("/savebeer")
    public ResponseEntity saveBeerBy(@ModelAttribute BeerDTO beerDetails){
        // Todo
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("updatebeer/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID id, @ModelAttribute BeerDTO beerDetails){
        // Todo
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
