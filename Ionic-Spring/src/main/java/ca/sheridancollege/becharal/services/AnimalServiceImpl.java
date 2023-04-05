package ca.sheridancollege.becharal.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ca.sheridancollege.becharal.beans.Animal;
import ca.sheridancollege.becharal.repository.AnimalRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AnimalServiceImpl implements AnimalService {

	private AnimalRepository aRepo;
	
	@Override
	public List<Animal> findAll() {
		
		return aRepo.findAll();
	}

	@Override
	public Animal findById(Long id) {
		return aRepo.findById(id).get();
	}

	@Override
	public Animal findByName(String name) {
		return aRepo.findByName(name).get();
	}

	@Override
	public Animal save(Animal animal) {
		return aRepo.save(animal);
	}

	@Override
	public int count() {
		return (int) aRepo.count();
	}

	@Override
	public void deleteByid(Long id) {
		aRepo.deleteById(id);
	}

}
