package webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webapp.models.Person;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

    List<Person> findByMobile(String mobile); // should fetch from mobile1 and mobile2
    List<Person> filterByDealCount(Integer dealCount);
    List<Person> filterByStatus(String status);

    //implement the controller methods in the api class
}
