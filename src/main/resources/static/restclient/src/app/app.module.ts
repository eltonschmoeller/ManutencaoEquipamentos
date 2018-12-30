import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes} from '@angular/router';
import { HttpModule} from '@angular/http';
import { FormsModule} from '@angular/forms';
import { AppComponent } from './app.component';
import { ListuserComponent } from './components/listuser/listuser.component';
import { UserFormComponent } from './components/user-form/user-form.component';
import { UserService} from './shared-service/user.service';
import { ListOrdemServicoComponent } from './components/ListOrdemServico/listordemservico.component';
import { OrdemServicoFormComponent } from './components/ordemservico-form/ordemservico-form.component';
import { OrdemServicoService} from './shared-service/ordemservico.service';

const appRoutes:Routes=[
 // {path:'', component:ListuserComponent},
  {path:'op', component:UserFormComponent},
  {path:'', component:ListOrdemServicoComponent},
  {path:'os', component:OrdemServicoFormComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    ListuserComponent,
    ListOrdemServicoComponent,
    UserFormComponent,
    OrdemServicoFormComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [UserService, OrdemServicoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
