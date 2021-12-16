package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;

/**
 * Person情報 Service
 */
@Service
@Transactional
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
	
    public Person findOne(Long id) {
    	//個人データ参照
        return personRepository.getById(id);
    }

    public Person save(Person person) {
    	//個人データ保存
        return personRepository.save(person);
    }

    public void delete(Long id) {
    	//個人データ削除
    	personRepository.deleteById(id);
    }
}
