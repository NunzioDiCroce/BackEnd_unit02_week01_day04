package com.example.SpringBootJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPizzasRepository extends JpaRepository<Pizza, Integer> {

}
