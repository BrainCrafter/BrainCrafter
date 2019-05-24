import { Component, OnInit } from '@angular/core';
import { Item } from '../item';

@Component({
  selector: 'app-items',
  templateUrl: './items.component.html',
  styleUrls: ['./items.component.css']
})
export class ItemsComponent implements OnInit {

  item: Item = {
    id: 1,
    itemdesc: 'string',
    url: 'string',
    avgrating: 1.0,
    avgsentiment: 100,
    feedback: ['f1', 'f2'],
    category: 'string',
    numberofreviews: 1,
    sources: [{
      website: 'string',
      price: 1,
      avgrating: 1,
      avgsentiment: 1,
      numberofreviews: 1
    }]
  };

  constructor() { }

  ngOnInit() {
  }

}
