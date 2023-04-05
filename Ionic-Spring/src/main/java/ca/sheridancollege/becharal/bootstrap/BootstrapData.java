package ca.sheridancollege.becharal.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.becharal.beans.Animal;
import ca.sheridancollege.becharal.repository.AnimalRepository;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner {
	
	private AnimalRepository aRepo;
	
	@Override
	public void run(String... args) throws Exception {
	
		Animal a1 = new Animal().builder().name("Felix").
				species("Cat").description("Rangdoll Bengle Mix")
				.isAlive(false).build();
		
		Animal a2 = new Animal().builder().name("Misa")
				.species("Cat").description("Black and White")
				.isAlive(false).build();
		
		Animal a3 = new Animal().builder().name("Rocket")
				.species("Cat").description("Black and White")
				.isAlive(true).build();
		
		Animal a4 = new Animal().builder().name("Fury")
				.species("Cat").description("White and Orange, Missing an eye")
				.isAlive(true).build();
		
		Animal a5 = new Animal().builder().name("Bailey")
				.species("Golden Retriver").description("Perfect Angle Baby").build();
	
		Animal a6 = new Animal().builder().name("Monty")
				.species("Dashhound").description("short brown hair")
				.isAlive(false).build();
		
		aRepo.save(a1);
		aRepo.save(a2);
		aRepo.save(a3);
		aRepo.save(a4);
		aRepo.save(a5);
		aRepo.save(a6);
	}

}
