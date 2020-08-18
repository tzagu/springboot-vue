package webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webapp.models.ItemPerson;

import java.util.List;

@Repository
public interface ItemPersonRepository extends JpaRepository<ItemPersonRepository, Integer> {
    List<ItemPerson> filterByDeliveryLocation(String locationName);
    List<ItemPerson> findByItem(Integer itemId);
}
