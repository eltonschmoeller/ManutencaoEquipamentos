import { Component, OnInit } from '@angular/core';
import { OrdemServico } from '../../ordemservico';
import { Router } from '@angular/router';
import { OrdemServicoService } from '../../shared-service/ordemservico.service';

@Component({
  selector: 'app-ordemservico-form',
  templateUrl: './ordemservico-form.component.html',
  styleUrls: ['./ordemservico-form.component.css']
})
export class OrdemServicoFormComponent implements OnInit {
  private ordemServico:OrdemServico;

  constructor(private _ordemServicoService:OrdemServicoService,private _router:Router) { }

  ngOnInit() {
    this.ordemServico=this._ordemServicoService.getter();
  }

  processForm(){
    if(this.ordemServico.id==undefined){
       this._ordemServicoService.createOrdemServico(this.ordemServico).subscribe((ordemServico)=>{
         console.log(ordemServico);
         this._router.navigate(['/']);
       },(error)=>{
         console.log(error);
       });
    }else{
       this._ordemServicoService.updateOrdemServico(this.ordemServico).subscribe((ordemServico)=>{
         console.log(ordemServico);
         this._router.navigate(['/']);
       },(error)=>{
         console.log(error);
       });
    }
  }

}
