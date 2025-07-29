import { Component } from '@angular/core';
import { IonInput, IonItem, IonList } from '@ionic/angular/standalone';
import { MapComponent } from './map/map.component';

@Component({
  selector: 'app-root',
  //standalone: true,
  //imports: [MapComponent],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  title = 'Traffic Tracker';
}
