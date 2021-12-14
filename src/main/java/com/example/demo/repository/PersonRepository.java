package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Person;

/**
 * Person情報 Repository
 */

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
