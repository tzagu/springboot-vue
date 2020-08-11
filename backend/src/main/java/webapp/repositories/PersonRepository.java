package webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import webapp.models.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{
}
