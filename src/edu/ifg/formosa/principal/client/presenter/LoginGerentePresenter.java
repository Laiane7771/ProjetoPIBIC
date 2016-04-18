package edu.ifg.formosa.principal.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.principal.client.view.EscolhaModuloView;
import edu.ifg.formosa.principal.client.view.LoginGerenteView;

public class LoginGerentePresenter implements Presenter{
	
	private LoginGerenteView loginView;
	
	public LoginGerentePresenter(LoginGerenteView loginView){
		this.loginView = loginView;
	}
	
	public void bind(){
		
		loginView.getBtnVoltar().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				loginView.hide(); 
				EscolhaModuloView emv = new EscolhaModuloView();
				EscolhaModuloPresenter emp = new EscolhaModuloPresenter(emv);				
				emp.go(null, null);
			}
		});
		
		loginView.getBtnLogin().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				Window.Location.replace("http://127.0.0.1:8888/Gerente.html");
				
			}
		});
		
		loginView.getBtnFecharLogin().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				loginView.hide();
			}
		});
	}

	public void go(HasWidgets container, HasWidgets containerDois) {
		bind();
	}
}
