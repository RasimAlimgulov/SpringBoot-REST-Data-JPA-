package com.rasimalimgulov.springboot.spring_boot.controller;


import com.rasimalimgulov.springboot.spring_boot.entities.Dancer;
import com.rasimalimgulov.springboot.spring_boot.service.DancerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {
    @Autowired
    private DancerService service;

    @GetMapping("/dancers")
    public List<Dancer> getAllDancers(){
        return service.getAllDancers();
    }

    @GetMapping("/dancers/{id}")
    public Dancer getDancerById(@PathVariable int id){
     return service.getDancerById(id);
    }

    @PostMapping("/dancers")
    public Dancer addDancer(@RequestBody Dancer dancer){
        service.addDancer(dancer);
        return dancer;
    }
    @PutMapping("/dancers")
    public Dancer updateDancer(@RequestBody Dancer dancer){
        service.addDancer(dancer);
        return dancer;
    }
    @DeleteMapping("/dancers/{id}")
    public String  deleteDancer(@PathVariable int id){
        service.deleteDancer(id);
        return "Dancer was deleted";
    }

    @GetMapping("/dancers/name/{name}")
    public List<Dancer> showAllDancersWithName(@PathVariable String name){
        return service.findAllByName(name);
    }
    @GetMapping("/dancers/club/{club}")
    public List<Dancer> showAllDancersInDanceClub(@PathVariable String club){
        return service.findAllByDanceClub(club);
    }
}
