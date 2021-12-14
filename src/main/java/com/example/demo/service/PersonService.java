package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;

/**
 * Person情報 Service
 */
@Service
public class PersonService {
	/**
	 * ユーザー情報 Repository
	 */
	@Autowired
	PersonRepository personRepository;

	public List<Person> searchAll() {
		// ユーザーTBLの内容を全検索
		return personRepository.findAll();
	}
}
