export class Pet{

	public id:number;
	public name:string;
	public species:string;
	public description:string;
	public isAlive:Boolean;
	

	constructor(id:number,name:string,species:string,description:string,
					isAlive:Boolean){
		this.id = id;
		this.name=name;
		this.species = species;
		this.description = description;
		this.isAlive = isAlive;
	} 
}


