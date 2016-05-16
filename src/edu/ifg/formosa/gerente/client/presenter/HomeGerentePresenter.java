package edu.ifg.formosa.gerente.client.presenter;


import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.gerente.client.GerenteServiceAsync;
import edu.ifg.formosa.gerente.client.view.GerentePesquisarAtividadesPopupView;
import edu.ifg.formosa.gerente.client.view.HomeGerenteView;

public class HomeGerentePresenter  implements Presenter{

	private HomeGerenteView hvg;
	private final HandlerManager eventBus;
	private final GerenteServiceAsync rpcService;

	public HomeGerentePresenter( HomeGerenteView hvg, HandlerManager eventBus, GerenteServiceAsync rpcService){
		this.hvg = hvg;
		this.eventBus = eventBus;
		this.rpcService = rpcService;
		bind();
	}
	
	public void bind(){
		
		hvg.getBtnExcluirSelecionados().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
		
		hvg.getBtnPesquisar().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
			
			}
		});
		
		hvg.getBtnListarAtividadesEvento().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				
				GWT.log("aqui no botao");
				GerentePesquisarAtividadePopupPresenter gpapp = new GerentePesquisarAtividadePopupPresenter(
						new GerentePesquisarAtividadesPopupView());
				
			}
		});
		
	}


	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		container.add(hvg.asWidget());
		bind();
		
	}	
}
