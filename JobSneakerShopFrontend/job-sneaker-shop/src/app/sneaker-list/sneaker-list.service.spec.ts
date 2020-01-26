import { TestBed } from '@angular/core/testing';

import { SneakerListService } from './sneaker-list.service';

describe('SneakerListService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SneakerListService = TestBed.get(SneakerListService);
    expect(service).toBeTruthy();
  });
});
