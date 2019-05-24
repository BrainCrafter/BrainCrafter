import { Source } from './source';

export class Item {
    id: number;
    itemdesc: string;
    url: string;
    avgrating: number;
    avgsentiment: number;
    feedback: string[];
    category: string;
    numberofreviews: number;
    sources: Source[];
}
