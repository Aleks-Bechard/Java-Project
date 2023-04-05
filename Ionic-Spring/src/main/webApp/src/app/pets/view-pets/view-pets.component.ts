import { Component, OnInit } from '@angular/core';
import { Pet } from '../pet.module';
import { PetService } from '../pet.service';

@Component({
  selector: 'app-view-pets',
  templateUrl: './view-pets.component.html',
  styleUrls: ['./view-pets.component.scss'],
})
export class ViewPetsComponent  implements OnInit {


	addName:string = '';
	addSpecies:string =''
	addDescription:string = '' 
	addIsAlive:boolean = true;

	pets:Pet[]=[];

  	constructor(private petService:PetService) { }


	ngOnInit(){
		
		this.petService.AddPet.subscribe(
			(pet:Pet)=>this.pets.push(pet)
		);
		
		this.petService.getPets()
			.subscribe(
		(p:any[])=>{
			this.pets=p
			},
			(error)=>console.log(error)
		);
	}
	
	RemovePet(id:number){
		
		console.log(id);
		this.petService.deleteAPet(id).subscribe(
			(newPet: any) => {
				this.petService.AddPet.emit(newPet);
			}
		)
		window.location.reload();
		
	}
	
	
	onPetAdd() {

		let pet: Pet =
			new Pet(0,this.addName,this.addSpecies, this.addDescription, this.addIsAlive);
	
			this.petService.addPet(pet).subscribe(
				(newFood: any) => {
					this.petService.AddPet.emit(newFood);
				}
			)
			this.addName = ''
			this.addSpecies=''
			this.addDescription = ''
		window.location.reload();	
		
	}

}
