import { TestBed, inject } from '@angular/core/testing';

import { OrdemServicoService } from './ordemservico.service';

describe('OrdemServicoService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [OrdemServicoService]
    });
  });

  it('should be created', inject([OrdemServicoService], (service: OrdemServicoService) => {
    expect(service).toBeTruthy();
  }));
});
