package edu.ifg.formosa.gerente.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.UmbrellaException;
import com.google.gwt.user.client.ui.RootPanel;



public class Gerente1 implements EntryPoint {

	public void onModuleLoad() {
		
		HandlerManager eventBus = new HandlerManager(null);
		GerenteServiceAsync rpcService = GWT.create(GerenteService.class);
		AppControllerGerente ac = new AppControllerGerente(eventBus,rpcService);
		ac.go(RootPanel.get("painelEsquerdo"), RootPanel.get("painelDireito"), RootPanel.get("painelRodape"));
		
		GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
			
			@Override
			public void onUncaughtException(Throwable e) {
				Throwable unwrapped = unwrap(e);

			}
			public Throwable unwrap(Throwable e) {
			    if(e instanceof UmbrellaException) {
			      UmbrellaException ue = (UmbrellaException) e;
			      if(ue.getCauses().size() == 1) {
			        return unwrap(ue.getCauses().iterator().next());
			      }
			    }
			    return e;
			  }
		});
		
	}
}
