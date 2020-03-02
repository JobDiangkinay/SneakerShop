import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SneakerListBrandComponent } from './sneaker-list-brand.component';

describe('SneakerListBrandComponent', () => {
  let component: SneakerListBrandComponent;
  let fixture: ComponentFixture<SneakerListBrandComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SneakerListBrandComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SneakerListBrandComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
