package com.rasimalimgulov.springboot.spring_boot.service;


import com.rasimalimgulov.springboot.spring_boot.dao.DancerRepository;
import com.rasimalimgulov.springboot.spring_boot.entities.Dancer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DancerServiceImpl implements DancerService{
    @Autowired
    private DancerRepository dancerRepository;
    public List<Dancer> getAllDancers() {
        return dancerRepository.findAll();
    }

    public Dancer getDancerById(int id) {
        return dancerRepository.findById(id).get();
    }

    public void addDancer(Dancer dancer) {
    dancerRepository.save(dancer);
    }

    public void deleteDancer(int id) {
    dancerRepository.deleteById(id);
    }

    public List<Dancer> findAllByName(String name) {
        return dancerRepository.findAllByName(name);
    }

    @Override
    public List<Dancer> findAllByDanceClub(String danceClub) {
        return dancerRepository.findAllByDanceClub(danceClub);
    }
}
