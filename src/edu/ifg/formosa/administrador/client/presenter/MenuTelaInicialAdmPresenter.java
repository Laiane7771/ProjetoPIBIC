package edu.ifg.formosa.administrador.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.administrador.client.view.MenuTelaInicialAdmView;

public class MenuTelaInicialAdmPresenter implements Presenter {
	
	private MenuTelaInicialAdmView MenuAdm;
	
	public MenuTelaInicialAdmPresenter(MenuTelaInicialAdmView MenuAdm){
		this.MenuAdm = MenuAdm;
	}

	public void bind(){
		MenuAdm.getLbMenuCampus().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				
			}
		});
		MenuAdm.getLbMenuGerente().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				
			}
		});
		MenuAdm.getLbMenuSair().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				
			}
		});
	}
	@Override
	public void go(HasWidgets container1, HasWidgets container2, HasWidgets container3, HasWidgets container4) {
		container2.add(MenuAdm.asWidget());
		
	}
	
}
