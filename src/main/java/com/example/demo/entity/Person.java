package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * Person情報 Entity
 */
@Entity
@Data
@Table(name = "person")
public class Person {

	/**
	 * ID
	 */
	@Id
	@Column(name = "id")
	private Long id;
	/**
	 * 名前
	 */
	@Column(name = "name")
	private String name;
	/**
	 * age
	 */
	@Column(name = "age")
	private Long age;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}

}
