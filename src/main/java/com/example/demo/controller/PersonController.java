package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;

/**
 * Person情報 Controller
 */
@Controller
public class PersonController {
	  /**
	   * ユーザー情報 Service
	   */
	  @Autowired
	  PersonService personService;
	  /**
	   * ユーザー情報一覧画面を表示
	   * @param model Model
	   * @return ユーザー情報一覧画面のHTML
	   */
	  @RequestMapping(value = "/person/list", method = RequestMethod.GET)
	  public String displayList(Model model) {
	    List<Person> personList = personService.searchAll();
	    model.addAttribute("personList", personList);
	    return "person/list";
	  }
}
