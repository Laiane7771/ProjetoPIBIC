package edu.ifg.formosa.principal.client.presenter;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.principal.client.view.HomeTesteView;

public class HomeTestePresenter implements Presenter{

	public HomeTesteView htv;
	private final HandlerManager eventBus;
	
	
	public HomeTestePresenter(HomeTesteView htv, HandlerManager eventBus){
		this.htv = htv;
		this.eventBus = eventBus;
		
	}
	
	public void go(HasWidgets container, HasWidgets containerDois) {
		container.add(htv.asWidget());
		
	}

}
