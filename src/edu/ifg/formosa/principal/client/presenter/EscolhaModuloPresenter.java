package edu.ifg.formosa.principal.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.principal.client.view.EscolhaModuloView;
import edu.ifg.formosa.principal.client.view.LoginCoordenadorView;
import edu.ifg.formosa.principal.client.view.LoginGerenteView;
import edu.ifg.formosa.principal.client.view.LoginParticipanteView;

public class EscolhaModuloPresenter implements Presenter{
	
	private EscolhaModuloView escModView;
	
	public EscolhaModuloPresenter(EscolhaModuloView escModView){
		this.escModView = escModView;
	}
	
	public void bind(){
		escModView.getLbGerente().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				escModView.hide();
				LoginGerenteView login = new LoginGerenteView();
				LoginGerentePresenter lp = new LoginGerentePresenter(login);
				lp.go(null, null);
			}
		});
			
		
		escModView.getLbCoordenador().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				escModView.hide();
				LoginCoordenadorView loginCoor = new LoginCoordenadorView();
				LoginCoordenadorPresenter lc = new LoginCoordenadorPresenter(loginCoor);
				
				
			}
		});
		
		escModView.getLbParticipante().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				escModView.hide();
				LoginParticipanteView lpv = new LoginParticipanteView();
				LoginParticipantePresenter lpp = new LoginParticipantePresenter(lpv);
				lpp.go(null, null);
			}
		});
		
		escModView.getBtnFechar().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				
				escModView.hide();
			}
		});
	}

	public void go(HasWidgets container,HasWidgets containerDois ) {
		bind();
	}
	
	
}
