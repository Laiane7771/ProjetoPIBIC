package edu.ifg.formosa.principal.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;

import edu.ifg.formosa.principal.client.view.EscolhaModuloView;
import edu.ifg.formosa.principal.client.view.LoginCoordenadorView;

public class LoginCoordenadorPresenter {
	
	private LoginCoordenadorView lcv;
	
	public LoginCoordenadorPresenter(LoginCoordenadorView lcv){
		this.lcv = lcv;
		bind();
	}
	
	public void bind(){
		lcv.getBtnFecharLogin().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				lcv.hide();
			}
		});
		
		lcv.getBtnLogin().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				Window.Location.replace("http://127.0.0.1:8888/Coordenador.html");
			}
		});
		
		lcv.getBtnVoltar().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				lcv.hide(); 
				EscolhaModuloView emv = new EscolhaModuloView();
				EscolhaModuloPresenter emp = new EscolhaModuloPresenter(emv);				
				emp.go(null, null);
				
			}
		});
	}
}
