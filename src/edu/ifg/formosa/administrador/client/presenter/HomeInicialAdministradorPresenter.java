package edu.ifg.formosa.administrador.client.presenter;

import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.administrador.client.view.HomeInicialAdministradorView;

public class HomeInicialAdministradorPresenter implements Presenter{

	private HomeInicialAdministradorView HomeAdm;
	
	public HomeInicialAdministradorPresenter(HomeInicialAdministradorView HomeAdm){
		this.HomeAdm = HomeAdm;
	}
	
	public void bind(){
		
	}

	@Override
	public void go(HasWidgets container1, HasWidgets container2, HasWidgets container3, HasWidgets container4) {
		container1.add(HomeAdm.getHpPainelCabecalhoHomeAdm().asWidget());
		container4.add(HomeAdm.getVpPainelRodapeAdm().asWidget());
		
	}
	
	
}
