package edu.ifg.formosa.administrador.client.presenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.administrador.client.view.AdmCadastrarCampusView;
import edu.ifg.formosa.administrador.client.view.AdmPesquisarCampusView;

public class AdmPesquisarCampusPresenter implements Presenter{

	private AdmPesquisarCampusView pesquisarCampus;
	
	
	public AdmPesquisarCampusPresenter(AdmPesquisarCampusView pesquisarCampus){
		this.pesquisarCampus = pesquisarCampus;
		bind();
	}

	public void bind(){
		pesquisarCampus.getBtnAdicionarCampus().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				GWT.log("AQUI NO BOTAO");
				AdmCadastrarCampusView cadastrodeCampus = new AdmCadastrarCampusView();
				new AdmCadastrarCampusPresenter(cadastrodeCampus);
				
				
			}
		});
	}
	@Override
	public void go(HasWidgets container1, HasWidgets container2, HasWidgets container3, HasWidgets container4) {

		container3.add(pesquisarCampus.asWidget());
		
		
	}
}

