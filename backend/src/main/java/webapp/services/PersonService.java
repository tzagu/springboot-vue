package webapp.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import webapp.models.Person;
import webapp.repositories.PersonRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public Optional<Person> findById(int id){
        return personRepository.findById(id);
    }

    public Person save(Person person){
        return personRepository.save(person);
    }

    public void deleteById(int id){
        personRepository.deleteById(id);
    }
}
