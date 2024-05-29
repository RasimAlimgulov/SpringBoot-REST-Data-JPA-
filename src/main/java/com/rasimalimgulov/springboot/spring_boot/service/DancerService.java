package com.rasimalimgulov.springboot.spring_boot.service;



import com.rasimalimgulov.springboot.spring_boot.entities.Dancer;

import java.util.List;

public interface DancerService {
    List<Dancer> getAllDancers();
    Dancer getDancerById (int id);
    void addDancer(Dancer dancer);
    void deleteDancer(int id);
    List<Dancer> findAllByName(String name);
    List<Dancer> findAllByDanceClub(String danceClub);
}
