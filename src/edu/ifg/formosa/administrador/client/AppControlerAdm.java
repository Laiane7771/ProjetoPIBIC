package edu.ifg.formosa.administrador.client;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.administrador.client.event.PesquisarEventoEvent;
import edu.ifg.formosa.administrador.client.presenter.AdmPesquisarCampusPresenter;
import edu.ifg.formosa.administrador.client.presenter.HomeInicialAdministradorPresenter;
import edu.ifg.formosa.administrador.client.presenter.LoginAdministradorPopupPresenter;
import edu.ifg.formosa.administrador.client.presenter.MenuTelaInicialAdmPresenter;
import edu.ifg.formosa.administrador.client.presenter.Presenter;
import edu.ifg.formosa.administrador.client.view.AdmPesquisarCampusView;
import edu.ifg.formosa.administrador.client.view.HomeInicialAdministradorView;
import edu.ifg.formosa.administrador.client.view.LoginAdministradorPopupView;
import edu.ifg.formosa.administrador.client.view.MenuTelaInicialAdmView;

public class AppControlerAdm implements Presenter, ValueChangeHandler<String>{

	private final HandlerManager eventBus;
	private HasWidgets container1;
	private HasWidgets container2;
	private HasWidgets container3;
	private HasWidgets container4;

	public AppControlerAdm(HandlerManager eventBus) {
		this.eventBus = eventBus;
		bind();
	}
	
	public void bind(){
		History.addValueChangeHandler(this);	
	
	}
	
	@Override
	public void onValueChange(ValueChangeEvent<String> event) {
		String token = event.getValue();
		if(token !=null){
			Presenter presenter = null;
			if(token.equals("Home")){
				HomeInicialAdministradorView homeAdm = new HomeInicialAdministradorView();
				new HomeInicialAdministradorPresenter(homeAdm);
				container1.add(homeAdm.getHpPainelCabecalhoHomeAdm().asWidget());
				container4.add(homeAdm.getVpPainelRodapeAdm());
			}
		}
	}
	@Override
	public void go(HasWidgets container1, HasWidgets container2, HasWidgets container3, HasWidgets container4) {
		
		this.container1 = container1;
		this.container2 = container2;
		this.container3 = container3;
		this.container4 = container4;
		
		HomeInicialAdministradorView homeAdm = new HomeInicialAdministradorView();
		new HomeInicialAdministradorPresenter(homeAdm);
		container1.add(homeAdm.getHpPainelCabecalhoHomeAdm().asWidget());
		container4.add(homeAdm.getVpPainelRodapeAdm());
		
		MenuTelaInicialAdmView menuAdm = new MenuTelaInicialAdmView();
		new MenuTelaInicialAdmPresenter(menuAdm);
		container2.add(menuAdm);
		
		AdmPesquisarCampusView pesquisarCampus = new AdmPesquisarCampusView();
		new AdmPesquisarCampusPresenter(pesquisarCampus);
		container3.add(pesquisarCampus);
		
		/*LoginAdministradorPopupView loginAdm = new LoginAdministradorPopupView();
		new LoginAdministradorPopupPresenter(loginAdm);
		container1.add(loginAdm);*/
	

		if ("".equals(History.getToken())) {
			History.newItem("home");
			
		}
		else {
			History.fireCurrentHistoryState();
		}
	}
	

}
