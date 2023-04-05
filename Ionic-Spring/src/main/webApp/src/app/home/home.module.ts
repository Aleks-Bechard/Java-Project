import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { IonicModule } from '@ionic/angular';
import { FormsModule } from '@angular/forms';
import { HomePage } from './home.page';
import { ViewPetsComponent } from '../pets/view-pets/view-pets.component';
import { PetsComponent } from '../pets/pets.component';

import { HomePageRoutingModule } from './home-routing.module';


@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    HomePageRoutingModule,
  ],
  declarations: [HomePage,ViewPetsComponent,PetsComponent]
})
export class HomePageModule {}
