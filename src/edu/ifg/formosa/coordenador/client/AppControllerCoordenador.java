package edu.ifg.formosa.coordenador.client;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.coordenador.client.event.CadastrarAtividadeEvent;
import edu.ifg.formosa.coordenador.client.event.CadastrarAtividadeEventHandler;
import edu.ifg.formosa.coordenador.client.event.CadastrarMonitorEvent;
import edu.ifg.formosa.coordenador.client.event.CadastrarMonitorEventHandler;
import edu.ifg.formosa.coordenador.client.presenter.CoordenadorCadastrarAtividadesPresenter;
import edu.ifg.formosa.coordenador.client.presenter.CoordenadorCadastrarMonitorPresenter;
import edu.ifg.formosa.coordenador.client.presenter.CoordenadorPesquisarAtividadePresenter;
import edu.ifg.formosa.coordenador.client.presenter.CoordenadorPesquisarMonitorPresenter;
import edu.ifg.formosa.coordenador.client.presenter.MenuTelaInicialCoordenadorPresenter;
import edu.ifg.formosa.coordenador.client.presenter.Presenter;
import edu.ifg.formosa.coordenador.client.view.CoordenadorCadastrarAtividadesView;
import edu.ifg.formosa.coordenador.client.view.CoordenadorCadastrarMonitorView;
import edu.ifg.formosa.coordenador.client.view.CoordenadorPesquisarAtividadesView;
import edu.ifg.formosa.coordenador.client.view.CoordenadorPesquisarMonitorView;
import edu.ifg.formosa.coordenador.client.view.MenuTelaInicialCoordenadorView;

public class AppControllerCoordenador implements Presenter,  ValueChangeHandler<String>{
	
	private final HandlerManager eventBus; 
	private HasWidgets container1;
	private HasWidgets container2;
	private HasWidgets container3;
	
	public AppControllerCoordenador(HandlerManager eventBus){
		this.eventBus = eventBus;
		bind();
	}

	

	private void bind(){
		
		History.addValueChangeHandler(this);
		
		eventBus.addHandler(CadastrarAtividadeEvent.TYPE, new CadastrarAtividadeEventHandler() {
			
			@Override
			public void cadastrarAtividade(CadastrarAtividadeEvent event) {
				if("".equals(History.getToken())){
					History.newItem("home");
				}
				else if("home".equals(History.getToken())){
					History.newItem("cadastrarAtividade");
				}
				else if("cadastrarMonitor".equals(History.getToken())){
					History.newItem("cadastrarAtividade");
				}
				else if("alterarMonitor".equals(History.getToken())){
					History.newItem("cadastrarAtividade");
				}
				else if("pesquisarAtividade".equals(History.getToken())){
					History.newItem("cadastrarAtividade");
				}
				else if("pesquisarMonitor".equals(History.getToken())){
					History.newItem("cadastrarAtividade");
				}
			}
		});
		
		eventBus.addHandler(CadastrarMonitorEvent.TYPE, new CadastrarMonitorEventHandler() {
			
			@Override
			public void cadastrarMonitor(CadastrarMonitorEvent event) {
				if("".equals(History.getToken())){
					History.newItem("home");
				}
				else if("home".equals(History.getToken())){
					History.newItem("cadastrarMonitor");
				}
				else if("cadastrarAtividade".equals(History.getToken())){
					History.newItem("cadastrarMonitor");
				}
				else if("alterarMonitor".equals(History.getToken())){
					History.newItem("cadastrarMonitor");
				}
				else if("pesquisarAtividade".equals(History.getToken())){
					History.newItem("cadastrarMonitor");
				}
				else if("pesquisarMonitor".equals(History.getToken())){
					History.newItem("cadastrarMonitor");
				}
				
			}
		});
		
	}

	public void onValueChange(ValueChangeEvent<String>event){
		String token = event.getValue();
		
		if(token !=null){
			Presenter presenter = null;
			if(token.equals("home")){
				CoordenadorPesquisarAtividadesView pesquisarAtividade = new CoordenadorPesquisarAtividadesView();
				new CoordenadorPesquisarAtividadePresenter(pesquisarAtividade, eventBus);
				container2.clear();
				container2.add(pesquisarAtividade);
			}
			if(token.equals("cadastrarAtividade")){
				CoordenadorCadastrarAtividadesView cadastrarAtividade = new CoordenadorCadastrarAtividadesView();
				new CoordenadorCadastrarAtividadesPresenter(cadastrarAtividade, eventBus);
				container2.clear();
				container2.add(cadastrarAtividade);
				
			}
			if(token.equals("cadastrarMonitor")){
				CoordenadorCadastrarMonitorView cadastroMonitor = new CoordenadorCadastrarMonitorView();
				new CoordenadorCadastrarMonitorPresenter(cadastroMonitor, eventBus);
				container2.clear();
				container2.add(cadastroMonitor);
				
			}
			if(token.equals("alterarMonitor")){
				CoordenadorCadastrarMonitorView cadastroMonitor = new CoordenadorCadastrarMonitorView();
				new CoordenadorCadastrarMonitorPresenter(cadastroMonitor, eventBus);
				container2.clear();
				container2.add(cadastroMonitor);
				
			}
			if(token.equals("pesquisarAtividade")){
				CoordenadorPesquisarAtividadesView pesquisarAtividade = new CoordenadorPesquisarAtividadesView();
				new CoordenadorPesquisarAtividadePresenter(pesquisarAtividade, eventBus);
				container2.clear();
				container2.add(pesquisarAtividade);
			}
			if(token.equals("pesquisarMonitor")){
				CoordenadorPesquisarMonitorView pesquisarMonitor = new CoordenadorPesquisarMonitorView();
				new CoordenadorPesquisarMonitorPresenter(pesquisarMonitor, eventBus);
				container2.clear();
				container2.add(pesquisarMonitor);
				
			}
			
		}
		
		
		
		
	}
	
	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		this.container1 = container;
		this.container2 = containerDois;
		this.container3 = containerTres;
		
		MenuTelaInicialCoordenadorView MenuInicial = new MenuTelaInicialCoordenadorView();
		MenuTelaInicialCoordenadorPresenter MenuInicialPresenter = new MenuTelaInicialCoordenadorPresenter(MenuInicial, eventBus);
		container1.add(MenuInicial);
		
		CoordenadorPesquisarAtividadesView pesquisarAtividade = new CoordenadorPesquisarAtividadesView();
		new CoordenadorPesquisarAtividadePresenter(pesquisarAtividade, eventBus);
		container2.add(pesquisarAtividade);
		
		if("".equals(History.getToken())){
			History.newItem("home");
		}
		else{
			History.fireCurrentHistoryState();
		}
	}
}
