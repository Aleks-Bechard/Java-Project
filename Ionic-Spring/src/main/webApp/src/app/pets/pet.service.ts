import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Pet } from "./pet.module";
import { EventEmitter } from "@angular/core";

@Injectable()
export class PetService {
	
	AddPet = new EventEmitter<Pet>();
	
	constructor(private http:HttpClient){}

	getPets(){
		return this.http.get<Pet[]>('/api/animals');
	}
	
	deleteAPet(id:number){
		return this.http.delete(`api/animals/${id}`);

	}
	
	addPet(pet:Pet){
		return this.http.post('/api/animals/',pet);

	}
}