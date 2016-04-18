package edu.ifg.formosa.principal.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.principal.client.view.LoginParticipanteView;

public class LoginParticipantePresenter implements Presenter{
	
	private LoginParticipanteView lpv;
	
	
	public LoginParticipantePresenter(LoginParticipanteView lpv){
		this.lpv = lpv;
		bind();
	}

	public void bind(){
		lpv.getBtnLogin().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				Window.Location.replace("http://127.0.0.1:8888/Participante.html#home");
			}
		});
		
		lpv.getBtnVoltar().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				lpv.hide();
				
			}
		});
		
		lpv.getBtnFecharLogin().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				lpv.hide();
				
			}
		});
	}

	public void go(HasWidgets container, HasWidgets containerDois) {
		
		
	}
	
}
