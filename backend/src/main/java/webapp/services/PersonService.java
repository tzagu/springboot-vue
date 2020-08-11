package webapp.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webapp.models.Person;
import webapp.repositories.PersonRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonService {

//
//    the above lombok @RequiredArgsConstructor will automatically generate the following variable and the constructor method
//    private final PersonRepository personRepository;
//
//    public ProductService(PersonRepository personRepository) {
//        this.personRepository = personRepository;
//    }

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
