import { InMemoryDbService } from 'angular-in-memory-web-api';
import { Item } from './item';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class InMemoryDataService implements InMemoryDbService {

  createDb() {
    const items = [
      {
        id: 1,
        itemdesc: 'Asics Gel Kayano 25',
        url: 'https://cdn.runrepeat.com/i/asics/27945/asics-men-s-gel-kayano-25-running-shoes-blue-indigo-blue-cream-400-8-uk-men-s-blue-indigo-blue-cream-400-cd4d-600.jpg',
        avgrating: 1.0,
        avgsentiment: 100,
        feedback: [
          'The Kayano 25 is very comfortable to wear even for long hours, said several users.',
          'A few lauded the shoe’s appealing design and color options.'
        ],
        category: 'string',
        numberofreviews: 1,
        sources: [{
          website: 'http://google.com',
          price: 100,
          avgrating: 1,
          avgsentiment: 1,
          numberofreviews: 1
        }]
      },
      {
        id: 2,
        itemdesc: 'Nike Air Zoom Pegasus 35',
        url: 'https://cdn.runrepeat.com/i/nike/28162/nike-air-zoom-pegasus-35-mens-942851-002-black-oil-grey-white-6f1d-600.jpg',
        avgrating: 1.0,
        avgsentiment: 100,
        feedback: [
          'Many people liked the aesthetics of the Nike Air Zoom Pegasus 35, emphasizing the freshness of the color schemes.',
          'The zigzag stitching of the engineered mesh was appreciated because it kept the façade durable.'
        ],
        category: 'string',
        numberofreviews: 1,
        sources: [{
          website: 'http://google.com',
          price: 1,
          avgrating: 1,
          avgsentiment: 1,
          numberofreviews: 1
        }, {
          website: 'http://walmart.ca',
          price: 1,
          avgrating: 10,
          avgsentiment: 10,
          numberofreviews: 500
        }, {
          website: 'http://walmart.com',
          price: 1,
          avgrating: 1,
          avgsentiment: 10,
          numberofreviews: 10
        }]
      }
    ];
    return { items };
  }

  // Overrides the genId method to ensure that a item always has an id.
  // If the items array is empty,
  // the method below returns the initial number (11).
  // if the items array is not empty, the method below returns the highest
  // item id + 1.
  genId(items: Item[]): number {
    return items.length > 0 ? Math.max(...items.map(item => item.id)) + 1 : 3;
  }
}
