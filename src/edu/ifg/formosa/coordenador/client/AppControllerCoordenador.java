package edu.ifg.formosa.coordenador.client;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.coordenador.client.event.AlterarAtividadeEvent;
import edu.ifg.formosa.coordenador.client.event.AlterarAtividadeEventHandler;
import edu.ifg.formosa.coordenador.client.event.AlterarMonitorEvent;
import edu.ifg.formosa.coordenador.client.event.AlterarMonitorEventHandler;
import edu.ifg.formosa.coordenador.client.event.CadastrarAtividadeEvent;
import edu.ifg.formosa.coordenador.client.event.CadastrarAtividadeEventHandler;
import edu.ifg.formosa.coordenador.client.event.CadastrarMonitorEvent;
import edu.ifg.formosa.coordenador.client.event.CadastrarMonitorEventHandler;
import edu.ifg.formosa.coordenador.client.event.EditarPercentualEvent;
import edu.ifg.formosa.coordenador.client.event.EditarPercentualEventHandler;
import edu.ifg.formosa.coordenador.client.event.PesquisarAtividadeEvent;
import edu.ifg.formosa.coordenador.client.event.PesquisarAtividadeEventHandler;
import edu.ifg.formosa.coordenador.client.event.PesquisarMonitorEvent;
import edu.ifg.formosa.coordenador.client.event.PesquisarMonitorEventHandler;
import edu.ifg.formosa.coordenador.client.event.PesquisarPercentualEvent;
import edu.ifg.formosa.coordenador.client.presenter.CoordenadorCadastrarAtividadesPresenter;
import edu.ifg.formosa.coordenador.client.presenter.CoordenadorCadastrarMonitorPresenter;
import edu.ifg.formosa.coordenador.client.presenter.CoordenadorPesquisarAtividadePresenter;
import edu.ifg.formosa.coordenador.client.presenter.CoordenadorPesquisarMonitorPresenter;
import edu.ifg.formosa.coordenador.client.presenter.CoordenadorRodapePresenter;
import edu.ifg.formosa.coordenador.client.presenter.CoordenadorVisualizarPercentualParticipantePresenter;
import edu.ifg.formosa.coordenador.client.presenter.MenuTelaInicialCoordenadorPresenter;
import edu.ifg.formosa.coordenador.client.presenter.Presenter;
import edu.ifg.formosa.coordenador.client.view.CoordenadorCadastrarAtividadesView;
import edu.ifg.formosa.coordenador.client.view.CoordenadorCadastrarMonitorView;
import edu.ifg.formosa.coordenador.client.view.CoordenadorPesquisarAtividadesView;
import edu.ifg.formosa.coordenador.client.view.CoordenadorPesquisarMonitorView;
import edu.ifg.formosa.coordenador.client.view.CoordenadorRodapeView;
import edu.ifg.formosa.coordenador.client.view.CoordenadorVisualizarPercentualParticipanteView;
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
				else if("percentual".equals(History.getToken())){
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
				else if("percentual".equals(History.getToken())){
					History.newItem("cadastrarMonitor");
				}

			}
		});
		eventBus.addHandler(PesquisarAtividadeEvent.TYPE, new PesquisarAtividadeEventHandler() {

			@Override
			public void pesquisarAtividade(PesquisarAtividadeEvent event) {
				if("".equals(History.getToken())){
					History.newItem("home");
				}
				else if("home".equals(History.getToken())){
					History.newItem("pesquisarAtividade");
				}
				else if("cadastrarMonitor".equals(History.getToken())){
					History.newItem("pesquisarAtividade");
				}
				else if("alterarMonitor".equals(History.getToken())){
					History.newItem("pesquisarAtividade");
				}
				else if("cadastrarAtividade".equals(History.getToken())){
					History.newItem("pesquisarAtividade");
				}
				else if("pesquisarMonitor".equals(History.getToken())){
					History.newItem("pesquisarAtividade");
				}
				else if("percentual".equals(History.getToken())){
					History.newItem("pesquisarAtividade");
				}

			}
		});

		eventBus.addHandler(PesquisarMonitorEvent.TYPE, new PesquisarMonitorEventHandler() {

			@Override
			public void pesquisarMonitor(PesquisarMonitorEvent event) {
				if("".equals(History.getToken())){
					History.newItem("home");
				}
				else if("home".equals(History.getToken())){
					History.newItem("pesquisarMonitor");
				}
				else if("cadastrarMonitor".equals(History.getToken())){
					History.newItem("pesquisarMonitor");
				}
				else if("alterarMonitor".equals(History.getToken())){
					History.newItem("pesquisarMonitor");
				}
				else if("cadastrarAtividade".equals(History.getToken())){
					History.newItem("pesquisarMonitor");
				}
				else if("pesquisarAtividade".equals(History.getToken())){
					History.newItem("pesquisarMonitor");
				}
				else if("percentual".equals(History.getToken())){
					History.newItem("pesquisarMonitor");
				}

			}
		});

		eventBus.addHandler(AlterarMonitorEvent.TYPE, new AlterarMonitorEventHandler() {

			@Override
			public void alterarMonitor(AlterarMonitorEvent event) {
				if("".equals(History.getToken())){
					History.newItem("home");
				}
				else if("home".equals(History.getToken())){
					History.newItem("alterarMonitor");
				}
				else if("cadastrarMonitor".equals(History.getToken())){
					History.newItem("alterarMonitor");
				}
				else if("pesquisarMonitor".equals(History.getToken())){
					History.newItem("alterarMonitor");
				}
				else if("cadastrarAtividade".equals(History.getToken())){
					History.newItem("alterarMonitor");
				}
				else if("pesquisarAtividade".equals(History.getToken())){
					History.newItem("alterarMonitor");
				}
				else if("percentual".equals(History.getToken())){
					History.newItem("alterarMonitor");
				}


			}
		});

		eventBus.addHandler(EditarPercentualEvent.TYPE, new EditarPercentualEventHandler() {

			@Override
			public void editarPercentual(EditarPercentualEvent event) {
				if("".equals(History.getToken())){
					History.newItem("home");
				}
				else if("home".equals(History.getToken())){
					History.newItem("percentual");
				}
				else if("cadastrarMonitor".equals(History.getToken())){
					History.newItem("percentual");
				}
				else if("pesquisarMonitor".equals(History.getToken())){
					History.newItem("percentual");
				}
				else if("cadastrarAtividade".equals(History.getToken())){
					History.newItem("percentual");
				}
				else if("pesquisarAtividade".equals(History.getToken())){
					History.newItem("percentual");
				}

			}
		});


		eventBus.addHandler(AlterarAtividadeEvent.TYPE, new AlterarAtividadeEventHandler() {

			@Override
			public void alterarAtividade(AlterarAtividadeEvent event) {
				if("".equals(History.getToken())){
					History.newItem("home");
				}
				else if("home".equals(History.getToken())){
					History.newItem("alterarAtividade");
				}
				else if("cadastrarMonitor".equals(History.getToken())){
					History.newItem("alterarAtividade");
				}
				else if("pesquisarMonitor".equals(History.getToken())){
					History.newItem("alterarAtividade");
				}
				else if("cadastrarAtividade".equals(History.getToken())){
					History.newItem("alterarAtividade");
				}
				else if("pesquisarAtividade".equals(History.getToken())){
					History.newItem("alterarAtividade");
				}
				else if("percentual".equals(History.getToken())){
					History.newItem("alterarAtividade");
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
			if(token.equals("percentual")){
				CoordenadorVisualizarPercentualParticipanteView visualizar = new CoordenadorVisualizarPercentualParticipanteView();
				new CoordenadorVisualizarPercentualParticipantePresenter(visualizar, eventBus);
				container2.clear();
				container2.add(visualizar);
			}
		}
	}

	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		this.container1 = container;
		this.container2 = containerDois;
		this.container3 = containerTres;

		MenuTelaInicialCoordenadorView MenuInicial = new MenuTelaInicialCoordenadorView();
		MenuTelaInicialCoordenadorPresenter menuPresenter = new 
				MenuTelaInicialCoordenadorPresenter(MenuInicial, eventBus);
		container1.add(MenuInicial.asWidget());

		CoordenadorPesquisarAtividadesView pesquisarAtividade = new CoordenadorPesquisarAtividadesView();
		new CoordenadorPesquisarAtividadePresenter(pesquisarAtividade, eventBus);
		container2.add(pesquisarAtividade.asWidget());
		
		CoordenadorRodapeView rodape = new CoordenadorRodapeView();
		new CoordenadorRodapePresenter(rodape);
		container3.add(rodape.asWidget());

		if("".equals(History.getToken())){
			History.newItem("home");
		}
		else{
			History.fireCurrentHistoryState();
		}
	}
}
