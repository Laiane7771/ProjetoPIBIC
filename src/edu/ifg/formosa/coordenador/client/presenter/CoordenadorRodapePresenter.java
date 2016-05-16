package edu.ifg.formosa.coordenador.client.presenter;

import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.coordenador.client.view.CoordenadorRodapeView;

public class CoordenadorRodapePresenter implements Presenter{

	private CoordenadorRodapeView rodape;
	
	public CoordenadorRodapePresenter( CoordenadorRodapeView rodape) {
		this.rodape = rodape;
	}
	@Override
	public void go(HasWidgets container, HasWidgets containerDois, HasWidgets containerTres) {
		containerTres.add(rodape.asWidget());
	}
	
	

}
