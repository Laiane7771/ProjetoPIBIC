package edu.ifg.formosa.principal.client.presenter;

import com.google.apphosting.client.serviceapp.RpcService;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.principal.client.PrincipalServiceAsync;
import edu.ifg.formosa.principal.client.view.EscolhaModuloView;
import edu.ifg.formosa.principal.client.view.LoginCoordenadorView;
import edu.ifg.formosa.principal.client.view.LoginGerenteView;
import edu.ifg.formosa.principal.client.view.LoginParticipanteView;

public class EscolhaModuloPresenter implements Presenter{
	
	private EscolhaModuloView escModView;
	private PrincipalServiceAsync rpcService;
	private int idEvento = 0;
	
	public EscolhaModuloPresenter(EscolhaModuloView escModView, PrincipalServiceAsync rpcService){
		this.escModView = escModView;
		this.rpcService = rpcService;
		bind();
	}
	
	public EscolhaModuloPresenter(EscolhaModuloView escModView,PrincipalServiceAsync rpcService, int idEvento){
		this.idEvento = idEvento;
		this.escModView = escModView;
		this.rpcService = rpcService;
		bind();
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
				LoginCoordenadorPresenter lc = new LoginCoordenadorPresenter(loginCoor,rpcService);
				
				
			}
		});
		
		escModView.getLbParticipante().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				escModView.hide();
				LoginParticipanteView lpv = new LoginParticipanteView();
				LoginParticipantePresenter lpp = new LoginParticipantePresenter(lpv, idEvento, rpcService );
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
