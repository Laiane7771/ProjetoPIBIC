package edu.ifg.formosa.gerente.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;
import edu.ifg.formosa.gerente.client.GerenteServiceAsync;
import edu.ifg.formosa.gerente.client.event.PesquisarCoordenadorEvent;
import edu.ifg.formosa.gerente.client.view.GerenteCadastrarCoordenadorView;


public class GerenteCadastrarCoordenadorPresenter  implements Presenter{

	private GerenteCadastrarCoordenadorView cadastrarCoordenador;
	private final HandlerManager eventBus;
	private final GerenteServiceAsync rpcService;
	
	public GerenteCadastrarCoordenadorPresenter(GerenteCadastrarCoordenadorView gccv, HandlerManager eventBus, GerenteServiceAsync rpcService){
		this.cadastrarCoordenador = gccv;
		this.eventBus = eventBus;
		this.rpcService = rpcService;
		bind();
		
	}

	public void bind(){
		
		cadastrarCoordenador.getBtnSalvarCoordenador().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				
				rpcService.adicionaCoordenador(null, new AsyncCallback<Boolean>() {
					
					@Override
					public void onSuccess(Boolean result) {
						if(result == true){
							Window.alert("Coordenador cadastrado com sucesso!");
						}	
					}
					
					@Override
					public void onFailure(Throwable caught) {
						Window.alert("Não foi possível cadastrar o coordenador");
						
					}
				});
				
			}
		});
		
		cadastrarCoordenador.getBtnVoltarCoordenador().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new PesquisarCoordenadorEvent());
				
			}
		});
		
	}

	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		containerDois.add(cadastrarCoordenador.asWidget());
		bind();
	}
}
