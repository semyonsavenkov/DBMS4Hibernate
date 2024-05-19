package org.example.dbms4.controller;

import org.example.dbms4.repository.HibernateRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HibernateController {

    private final HibernateRepository repository;
    public HibernateController(HibernateRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    public ResponseEntity<?> getPersonsByCity(@RequestParam String city) {
        return new ResponseEntity<>(repository.getPersonsByCity(city), HttpStatus.OK);
    }

}
