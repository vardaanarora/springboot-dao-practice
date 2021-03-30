package com.FirstProject.demo.service;

import com.FirstProject.demo.dao.PersonDao;
import com.FirstProject.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonService {
    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("Dao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.addPerson(person);
    }

    public List<Person> getAllPeople() {
        return personDao.selectAllPeople();
    }
}
