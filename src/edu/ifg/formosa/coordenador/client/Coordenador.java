package edu.ifg.formosa.coordenador.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.RootPanel;



public class Coordenador implements EntryPoint{

	public void onModuleLoad() {
		HandlerManager eventBus = new HandlerManager(null);
		AppControllerCoordenador appCoordenador = new AppControllerCoordenador(eventBus);
		appCoordenador.go(RootPanel.get("MenuCoordenadorEsquerdo"), RootPanel.get("AreaDireita"), RootPanel.get("rodapeCoordenador"));
		
	}

}
