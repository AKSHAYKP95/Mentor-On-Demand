import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Mentor } from '../models/mentor.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class MentorprofileService {

  constructor(private http:HttpClient) {}

  private mentorUrl = 'http://localhost:8071/mentors';
  //private userUrl = '/api';

  public getMentors() {
    return this.http.get<Mentor[]>(this.mentorUrl);
  }

  public deleteMentor(mentor) {
    return this.http.delete(this.mentorUrl + "/"+ mentor.id);
  }

  public createMentor(mentor) {
    return this.http.post<Mentor>(this.mentorUrl, mentor);
  }
public updateMentor(mentor) {
console.log('In service mentor =',mentor)
    return this.http.put<Mentor>(this.mentorUrl  + "/"+ mentor.id,mentor);
  }
}
