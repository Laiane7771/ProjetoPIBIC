package edu.ifg.formosa.principal.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.UmbrellaException;
import com.google.gwt.user.client.ui.RootPanel;


public class Eventif implements EntryPoint {

	public void onModuleLoad() {
		HandlerManager eventBus = new HandlerManager(null);
		PrincipalServiceAsync rpcService = (PrincipalServiceAsync)GWT.create(PrincipalService.class);
		AppController ac = new AppController(eventBus, rpcService);
		ac.go(RootPanel.get("cabecalho"), RootPanel.get("corpo"));

		GWT.setUncaughtExceptionHandler(new
				GWT.UncaughtExceptionHandler() {
			public void onUncaughtException(Throwable e) {
				Throwable unwrapped = unwrap(e);
				// do exception handling stuff
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
