package webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import webapp.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    //define custom methods if necessary and implement them in the controller
}
