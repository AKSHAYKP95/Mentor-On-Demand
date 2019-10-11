import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { AdmindashboardService } from './admindashboard.service';

@Component({
  selector: 'app-admindashboard',
  templateUrl: './admindashboard.component.html',
  styleUrls: ['./admindashboard.component.css']
})
export class AdmindashboardComponent {

 

  constructor(private router: Router, private admindashboardService: AdmindashboardService) {

  }

 
  

  

}


