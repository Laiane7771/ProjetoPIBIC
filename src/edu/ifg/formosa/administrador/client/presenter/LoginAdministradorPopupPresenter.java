package edu.ifg.formosa.administrador.client.presenter;

import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.administrador.client.view.LoginAdministradorPopupView;

public class LoginAdministradorPopupPresenter implements Presenter {

	private LoginAdministradorPopupView LoginAdm;
	
	public LoginAdministradorPopupPresenter(LoginAdministradorPopupView LoginAdm){
		this.LoginAdm = LoginAdm;
		bind();
	}

	public void bind(){
		
	}
	@Override
	public void go(HasWidgets container1, HasWidgets container2, HasWidgets container3, HasWidgets container4) {
		bind();
	}
}
