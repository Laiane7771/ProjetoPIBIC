package edu.ifg.formosa.gerente.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.RootPanel;



public class Gerente implements EntryPoint {

	public void onModuleLoad() {

		HandlerManager eventBus = new HandlerManager(null);
		GerenteServiceAsync rpcService = GWT.create(GerenteService.class);
		AppControllerGerente ac = new AppControllerGerente(eventBus,rpcService);
		ac.go(RootPanel.get("painelEsquerdo"), RootPanel.get("painelDireito"), RootPanel.get("painelRodape"));

	}
}
