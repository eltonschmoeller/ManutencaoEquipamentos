import { Injectable } from '@angular/core';
import { Http, Response, Headers, RequestOptions} from '@angular/http';
import { Observable}   from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
import { OrdemServico }  from '../ordemservico';



@Injectable()
export class OrdemServicoService {
  private baseUrl:string='http://localhost:8080/api';
  private headers = new Headers({'Content-Type':'application/json'});
  private options = new RequestOptions({headers:this.headers});
  private ordemServico = new OrdemServico();
  constructor(private _http:Http) { }

  getOrdens(){

    return this._http.get(this.baseUrl+'/ordens',this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  getOrdemServico(id:Number){

    return this._http.get(this.baseUrl+'/ordemServico/'+id,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  deleteOrdemServico(id:Number){

    return this._http.delete(this.baseUrl+'/ordemServico/'+id,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }

  createOrdemServico(ordemServico:OrdemServico){

    return this._http.post(this.baseUrl+'/ordemServico',JSON.stringify(ordemServico),  this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
   
   updateOrdemServico(ordemServico:OrdemServico){

    return this._http.put(this.baseUrl+'/ordemServico',JSON.stringify(ordemServico),  this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  
  errorHandler(error:Response){

     return Observable.throw(error||"SERVER ERROR");
  }

   setter(ordemServico:OrdemServico){
     this.ordemServico=ordemServico;
   }

  getter(){
    return this.ordemServico;
  }
}
