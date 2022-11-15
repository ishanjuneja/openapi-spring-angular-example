import { Component } from '@angular/core';
import { Employee, EmployeesService } from 'build/openapi';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  constructor(private employeeService:EmployeesService){

  }
  title = 'angular-frontend';
  $employees:Observable<Employee[]> = this.employeeService.getEmployees();
}
