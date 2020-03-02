import { TestBed } from '@angular/core/testing';

import { SneakerDetailService } from './sneaker-detail.service';

describe('SneakerDetailService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SneakerDetailService = TestBed.get(SneakerDetailService);
    expect(service).toBeTruthy();
  });
});
