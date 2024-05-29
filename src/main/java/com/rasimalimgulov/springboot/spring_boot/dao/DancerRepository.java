package com.rasimalimgulov.springboot.spring_boot.dao;


import com.rasimalimgulov.springboot.spring_boot.entities.Dancer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DancerRepository extends JpaRepository<Dancer,Integer> {
     List<Dancer> findAllByName(String name);
     List<Dancer> findAllByDanceClub(String danceClub);
}
