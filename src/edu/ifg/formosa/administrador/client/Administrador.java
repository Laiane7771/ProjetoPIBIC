package edu.ifg.formosa.administrador.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.RootPanel;



public class Administrador implements EntryPoint{

	@Override
	public void onModuleLoad() {
		HandlerManager eventBus = new HandlerManager(null);
		AppControlerAdm appAdministrador = new AppControlerAdm(eventBus);
		appAdministrador.go(RootPanel.get("cabecalho"), RootPanel.get("menu"), RootPanel.get("PainelTroca"), RootPanel.get("rodape"));
		
	}
	
	

}
