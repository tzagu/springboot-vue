package webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import webapp.models.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{
    //define    methods
    //findByDealCount()
    //findByStatus()
    //implement the controller methods in the api class
}
