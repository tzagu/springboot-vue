package webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webapp.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> { }
