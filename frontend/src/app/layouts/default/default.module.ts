import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SharedModule } from 'src/app/shared/shared.module';
import { HomeComponent } from 'src/app/modules/home/home.component';
import { DefaultComponent } from './default.component';



@NgModule({
  declarations: [
    HomeComponent,
    DefaultComponent
  ],
  imports: [
    CommonModule,
    SharedModule
  ]
})
export class DefaultModule { }
