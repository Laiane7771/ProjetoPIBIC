package edu.ifg.formosa.gerente.client.presenter;

import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.gerente.client.view.RodapeView;

public class RodapePresenter implements Presenter{
	
	private RodapeView rv;
	
	public RodapePresenter(RodapeView rv){
		this.rv = rv;
		
	}

	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		containerTres.add(rv.asWidget());
		
	}
	

}
