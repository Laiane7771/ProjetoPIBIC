package edu.ifg.formosa.gerente.client.presenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.gerente.client.view.GerentePesquisarAtividadesPopupView;

public class GerentePesquisarAtividadePopupPresenter implements Presenter{
	
	private GerentePesquisarAtividadesPopupView gpap;
	
	public GerentePesquisarAtividadePopupPresenter(GerentePesquisarAtividadesPopupView gpap){
		this.gpap = gpap;
		bind();
	}
	
	public void bind(){
		gpap.getBtnPesquisarAtividadeEvento().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				
				
			}
		});
		
		gpap.getBtnFecharPopupAtividades().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				gpap.hide();
				GWT.log("aqui no botao fechar");
			}
		});
	}

	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		
		
	}
}
