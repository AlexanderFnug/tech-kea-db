package com.example.persondatabase.Service;

import com.example.persondatabase.Model.Person;
import com.example.persondatabase.Repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {


        @Autowired
        PersonRepo personRepo;
        public List<Person> fetchAll(){

            return personRepo.fetchAll();
        }

        public void addPerson(Person p){
            personRepo.addPerson(p);
        }

        public Person findPersonById(int id){
            return null;
        }

        public boolean deletePerson(int id){
            return true;
        }
        public void updatePerson(int id, Person p){

        }

    }

