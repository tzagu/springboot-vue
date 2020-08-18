package webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import webapp.models.Deals;

public interface DealsRepository extends JpaRepository<Deals, Integer> {
}
