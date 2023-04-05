package ca.sheridancollege.becharal.services;

import java.util.List;
import org.springframework.stereotype.Service;
import ca.sheridancollege.becharal.beans.Animal;

@Service
public interface AnimalService {

	public List<Animal> findAll();
	public Animal findById(Long id);
	public Animal findByName(String name);
	public Animal save(Animal animal);
	public int count();
	public void deleteByid(Long id);
	
}
