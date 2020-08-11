package webapp.api;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import webapp.models.Person;
import webapp.services.PersonService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/person")
@RequiredArgsConstructor
public class PersonAPI {

    @Autowired
    PersonService personService;

    @GetMapping
    public ResponseEntity<List<Person>> findAll(){
        return ResponseEntity.ok(personService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Person>> findById(int id){
        return ResponseEntity.ok(personService.findById(id));
    }

    @PostMapping("/{id}")
    public ResponseEntity<?> save(@Valid @RequestBody Person person){
        return ResponseEntity.ok(personService.save(person));
    }



}
