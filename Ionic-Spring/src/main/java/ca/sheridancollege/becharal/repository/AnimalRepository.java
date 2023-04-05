package ca.sheridancollege.becharal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ca.sheridancollege.becharal.beans.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long>{

	public Optional<Animal> findByName(String name);
	
}
