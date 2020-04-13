import {Component} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  // title of page
  title = 'Angular Project';
  // URL which contains requested JSON objects
  target = 'http://localhost8080/records/';
  records = {id: 3};
}

  // constructor(private http: HttpClient) {
  // }

//   ngOnInit(): void {
//     this.getRecords();
//   }
//
//   getRecords() {
//     this.http.get(this.target).subscribe((data : Record) => this.records = {
//       id : data['id'],
//       productId: data['productId'],
//       userId: data['userId'],
//       profileName : data['pofileName'],
//       score : data['score'],
//       time : data['time'],
//       summary : data['summary'],
//       text : data['text']
//       });
//   }
// }
//
// export interface Record {
//   id : number;
//   productId : string;
//   userId : string;
//   profileName : string;
//   score : number;
//   time : string;
//   summary : string;
//   text : string;
// }
