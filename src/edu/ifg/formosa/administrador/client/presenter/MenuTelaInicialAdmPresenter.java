package edu.ifg.formosa.administrador.client.presenter;

import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.administrador.client.view.MenuTelaInicialAdmView;

public class MenuTelaInicialAdmPresenter implements Presenter {
	
	private MenuTelaInicialAdmView MenuAdm;
	
	public MenuTelaInicialAdmPresenter(MenuTelaInicialAdmView MenuAdm){
		this.MenuAdm = MenuAdm;
	}

	public void bind(){
		
	}
	@Override
	public void go(HasWidgets container1, HasWidgets container2, HasWidgets container3, HasWidgets container4) {
		container2.add(MenuAdm.asWidget());
		
	}

}
