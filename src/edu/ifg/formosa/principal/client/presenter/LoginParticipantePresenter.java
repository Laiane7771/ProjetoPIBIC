package edu.ifg.formosa.principal.client.presenter;

import org.omg.CORBA.INTERNAL;


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;


import edu.ifg.formosa.principal.client.PrincipalServiceAsync;
import edu.ifg.formosa.principal.client.view.LoginParticipanteView;

public class LoginParticipantePresenter implements Presenter{
	
	private LoginParticipanteView lpv;
	private int idevento = 0;
	private PrincipalServiceAsync rpcService = null;
	
	
	public LoginParticipantePresenter(LoginParticipanteView lpv, PrincipalServiceAsync rpcService){
		this.lpv = lpv;
		this.rpcService = rpcService;
		bind();
	}
	
	public LoginParticipantePresenter(LoginParticipanteView lpv, int idEvento, PrincipalServiceAsync rpcService){
		this.idevento = idEvento;
		this.rpcService = rpcService;
		this.lpv = lpv;
		Window.alert(""+idevento);
		bind();
	}

	public void bind(){
		
		lpv.getBtnLogin().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				Window.alert(""+idevento);
				if(idevento!=0){
					rpcService.setaIdEventoSessao(idevento, new AsyncCallback<Boolean>() {
						public void onSuccess(Boolean result) {
							Window.alert(""+result);
							Window.Location.replace("http://127.0.0.1:8888/Participante.html#listaratividades");
						};
						public void onFailure(Throwable caught) {
							Window.alert(""+caught.getMessage());
						};
					});
					
				}else{
					Window.Location.replace("http://127.0.0.1:8888/Participante.html#home");
				}
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
