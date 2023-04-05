package ca.sheridancollege.becharal.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.becharal.beans.Animal;
import ca.sheridancollege.becharal.services.AnimalService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/animals")
public class AnimalRestController {

	private AnimalService aService;
	
	

	//GET - for all animals
	@GetMapping(value={"/", ""})
	public List<Animal> getAllAnimals(Model model) {		
		return (List<Animal>) aService.findAll();
	}
	
	
	
	
	//GET - for a single animal by ID
	@GetMapping("/{id}")
	public Animal  GetAnumalByID(@PathVariable Long id) {
		Animal animal = aService.findById(id);
		if (animal != null)
			return animal;
		else
			return null;
	}
	
	
	
	
	//POST - add a new animal
	@PostMapping(value={"/",""}, headers={"Content-type=application/json"})
	public String postAAnimal(@RequestBody Animal animal) {
		Animal a = aService.save(animal);
		return "Record was added at Index: " + a.getId();
	}
	
	
	
	
	//PUT - an edited Animal by ID
	@PutMapping(value={"/{id}",""}, headers={"Content-type=application/json"})
	public String EditAnimal(@RequestBody Animal animal) {
		aService.save(animal);
		return "Records Updated:" + aService.count();
	}
	
	
	
	
	//DELETE - Delete an item by ID
	@DeleteMapping("/{id}")
	public String DeleteAnimal(@PathVariable Long id){	
		Animal animal = aService.findById(id);
		if (animal != null) {
			aService.deleteByid(id);
			return "Records Deleted:" + aService.count();
		}	 
		else
			return "No Such Record";
	}
	
}
