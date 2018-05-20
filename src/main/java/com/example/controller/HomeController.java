package com.example.controller;

import com.example.data.PersonDao;
import com.example.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping("/phonebook")
@Controller
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model uiModel) {
        List<Person> personList = PersonDao.listAllPerson();
        uiModel.addAttribute("persons", personList);
        return "test"; // это название jsp файла
    }
}
