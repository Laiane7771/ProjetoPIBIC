package edu.ifg.formosa.gerente.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.RootPanel;


public class Gerente implements EntryPoint {

	public void onModuleLoad() {

		HandlerManager eventBus = new HandlerManager(null);
		AppControllerGerente ac = new AppControllerGerente(eventBus);
		ac.go(RootPanel.get("painelEsquerdo"), RootPanel.get("painelDireito"), RootPanel.get("painelRodape"));

	}
}
