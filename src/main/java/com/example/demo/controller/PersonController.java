package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;

/**
 * Person情報 Controller
 */
@Controller
@RequestMapping("/person")
public class PersonController {
	/**
	 * ユーザー情報 Service
	 */
	@Autowired
	PersonService personService;

	/**
	 * ユーザー情報一覧画面を表示
	 * 
	 * @param model Model
	 * @return ユーザー情報一覧画面のHTML
	 */
	@GetMapping("list")
	public String displayList(Model model) {
		List<Person> personList = personService.searchAll();
		model.addAttribute("personList", personList);
		return "person/list";
	}

	/**
	 * ユーザー作成画面表示
	 * 
	 * @param model Model
	 * @return ユーザー作成画面のHTML
	 */
	@GetMapping("new")
	String newPerson(@RequestBody(required = false) Model model) {
		return "person/new";
	}

	/**
	 * ユーザー個別編集画面表示
	 * 
	 * @param model Model
	 * @return ユーザー個別編集画面のHTML
	 */
	@GetMapping("{id}/edit")
	public String edit(@PathVariable Long id, Model model) {
		Person person = personService.findOne(id);
		model.addAttribute("person", person);
		return "person/edit";
	}

	/**
	 * ユーザー個別画面表示
	 * 
	 * @param model Model
	 * @return 個別画面のHTML
	 */
	@GetMapping("{id}")
	public String show(@PathVariable Long id, Model model) {
		Person person = personService.findOne(id);
		model.addAttribute("person", person);
		return "person/show";
	}

	/**
	 * ユーザー作成
	 * 
	 * @param model Model
	 * @return ユーザー一覧画面のHTML
	 */
	@PostMapping("new")
	public String create(@ModelAttribute Person person) {
		personService.save(person);
		return "redirect:/person/list";
	}

	/**
	 * ユーザー更新
	 * 
	 * @param model Model
	 * @return ユーザー一覧画面のHTML
	 */

	@PostMapping("{id}")
	public String update(@PathVariable Long id, @ModelAttribute Person person) {
		person.setId(id);
		personService.save(person);
		return "redirect:/person/list";

	}

	/**
	 * ユーザー削除
	 * 
	 * @param model Model
	 * @return ユーザー一覧画面のHTML
	 */
	@PostMapping("{id}/delete")
	public String destroy(@PathVariable Long id) {
		personService.delete(id);
		return "redirect:/person/list";
	}
}
