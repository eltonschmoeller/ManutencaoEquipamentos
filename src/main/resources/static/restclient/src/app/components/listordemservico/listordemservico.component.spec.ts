import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListOrdemServicoComponent } from './listordemservico.component';

describe('ListOrdemServicoComponent', () => {
  let component: ListOrdemServicoComponent;
  let fixture: ComponentFixture<ListOrdemServicoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListOrdemServicoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListOrdemServicoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
