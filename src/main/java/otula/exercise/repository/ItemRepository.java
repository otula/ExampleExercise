package otula.exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import otula.exercise.domain.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
    
}
