package edu.ifg.formosa.principal.client.presenter;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.UmbrellaException;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;
import edu.ifg.formosa.principal.client.PrincipalServiceAsync;
import edu.ifg.formosa.principal.client.view.EscolhaModuloView;
import edu.ifg.formosa.principal.client.view.LoginGerenteView;
import edu.ifg.formosa.principal.shared.Gerente;

public class LoginGerentePresenter implements Presenter{
	
	private LoginGerenteView loginView;
	private PrincipalServiceAsync rpcService;
	
	public LoginGerentePresenter(LoginGerenteView loginView){
		this.loginView = loginView;
		bind();
	}
	
	public void bind(){
		
		loginView.getBtnLogin().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				GWT.log("Antes da função");
				if(true){
					//verificaLogin();
				}
			}
		});
		
		loginView.getBtnVoltar().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				loginView.hide(); 
				EscolhaModuloView emv = new EscolhaModuloView();
				EscolhaModuloPresenter emp = new EscolhaModuloPresenter(emv, rpcService);				
				emp.go(null, null);
				
				
			}
		});
		
		loginView.getBtnFecharLogin().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				loginView.hide();
			}
		});
	}
	/*public boolean verificaLogin(){
		Gerente gerente = new Gerente();
		gerente.setMatriculaSiape(loginView.getTbNome().getText());
		gerente.setSenha(loginView.getTbSenha().getText());
		
		rpcService.buscaLogin(new AsyncCallback<Gerente>() {
			
			@Override
			public void onSuccess(Gerente result) {
				try{
					if(result!=null){
					
						if(gerente.getMatriculaSiape().equals(result.getMatriculaSiape())&& gerente.getSenha().equals(result.getSenha())){
							Window.Location.replace("http://127.0.0.1:8888/Gerente.html");
						}
						Window.alert(""+result);
					}
				}catch(UmbrellaException ex){
					GWT.log(ex.getMessage());
					Window.alert("Erro no botao login");
				}
				
			}
			
			@Override
			public void onFailure(Throwable caught) {
				Window.alert("Erro no botao");
			}
		});
		return true;
	}*/
	public void go(HasWidgets container, HasWidgets containerDois) {
		bind();
	}

}
