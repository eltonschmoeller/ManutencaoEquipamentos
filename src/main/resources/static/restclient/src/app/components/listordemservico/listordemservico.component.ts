import { Component, OnInit } from '@angular/core';
import { OrdemServicoService } from '../../shared-service/ordemservico.service';
import { OrdemServico } from '../../ordemservico';
import { Router } from '@angular/router';

@Component({
  selector: 'app-listordemservico',
  templateUrl: './listordemservico.component.html',
  styleUrls: ['./listordemservico.component.css']
})
export class ListOrdemServicoComponent implements OnInit {
  private ordens:OrdemServico[];
  constructor(private _ordemServicoService:OrdemServicoService, private _router:Router) { }

  ngOnInit() {
      this._ordemServicoService.getOrdens().subscribe((ordens)=>{
        console.log(ordens);
        this.ordens=ordens;
      },(error)=>{
        console.log(error);
      })
  }
  deleteOrdemServico(ordemservico){
    this._ordemServicoService.deleteOrdemServico(ordemservico.id).subscribe((data)=>{
        this.ordens.splice(this.ordens.indexOf(ordemservico),1);
    },(error)=>{
      console.log(error);
    });
  }

   updateOrdenServico(ordemservico){  
     this._ordemServicoService.setter(ordemservico);
     this._router.navigate(['/os']);


   }
   newOrdemServico(){
   let ordemServico = new OrdemServico();
    this._ordemServicoService.setter(ordemServico);
     this._router.navigate(['/os']);
   
   }

}
