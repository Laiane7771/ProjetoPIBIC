package edu.ifg.formosa.administrador.client.presenter;

import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.administrador.client.view.AdmCadastrarCampusView;

public class AdmCadastrarCampusPresenter implements Presenter{
	
	private AdmCadastrarCampusView CadastrodeCampus;

	public AdmCadastrarCampusPresenter(AdmCadastrarCampusView CadastrodeCampus){
		this.CadastrodeCampus = CadastrodeCampus;
	}

	@Override
	public void go(HasWidgets container1, HasWidgets container2, HasWidgets container3, HasWidgets container4) {
		container3.add(CadastrodeCampus.asWidget());
	}
}
