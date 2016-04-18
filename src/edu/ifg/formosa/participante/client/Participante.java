package edu.ifg.formosa.participante.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.RootPanel;

public class Participante implements EntryPoint{

	public void onModuleLoad() {
		HandlerManager eventBus = new HandlerManager(null);
		AppControllerParticipante appParticipante = new AppControllerParticipante(eventBus);
		appParticipante.go(RootPanel.get("PainelMenuEsquerdo"), RootPanel.get("painelDireito"), RootPanel.get("rodape"));
	}
}
