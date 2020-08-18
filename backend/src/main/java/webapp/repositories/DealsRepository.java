package webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webapp.models.Deals;

import java.util.List;

@Repository
public interface DealsRepository extends JpaRepository<Deals, Integer> {
    List<Deals> findDealBySeller(Integer sellerId);
    List<Deals> findDealsByBuyer(Integer buyerId);
}
