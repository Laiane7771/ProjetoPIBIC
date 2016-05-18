package edu.ifg.formosa.gerente.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.gerente.client.event.CadastraEventoEvent;
import edu.ifg.formosa.gerente.client.event.CadastraParticipanteEvent;
import edu.ifg.formosa.gerente.client.event.CadastrarCoordenadorEvent;
import edu.ifg.formosa.gerente.client.event.CadastrarCoordenadorEventHandler;
import edu.ifg.formosa.gerente.client.event.CadastrarEventoEventHandler;
import edu.ifg.formosa.gerente.client.event.CadastrarParticipanteEventHandler;
import edu.ifg.formosa.gerente.client.event.ImprimirCertificadoCoordenadorEvent;
import edu.ifg.formosa.gerente.client.event.ImprimirCertificadoCoordenadorEventHandler;
import edu.ifg.formosa.gerente.client.event.ImprimirCertificadoParticipanteEvent;
import edu.ifg.formosa.gerente.client.event.ImprimirCertificadoParticipanteEventHandler;
import edu.ifg.formosa.gerente.client.event.ImprimirCrachaCoordenadorEvent;
import edu.ifg.formosa.gerente.client.event.ImprimirCrachaCoordenadorEventHandler;
import edu.ifg.formosa.gerente.client.event.ImprimirCrachaParticipanteEvent;
import edu.ifg.formosa.gerente.client.event.ImprimirCrachaParticipanteEventHandler;
import edu.ifg.formosa.gerente.client.event.PesquisarEventoEvent;
import edu.ifg.formosa.gerente.client.event.PesquisarEventoEventHandler;
import edu.ifg.formosa.gerente.client.event.PesquisarParticipanteEvent;
import edu.ifg.formosa.gerente.client.event.PesquisarParticipanteEventHandler;
import edu.ifg.formosa.gerente.client.event.PesquisarCoordenadorEvent;
import edu.ifg.formosa.gerente.client.event.PesquisarCoordenadorEventHandler;
import edu.ifg.formosa.gerente.client.presenter.GerenteCadastrarCoordenadorPresenter;
import edu.ifg.formosa.gerente.client.presenter.GerenteCadastrarEventoPresenter;
import edu.ifg.formosa.gerente.client.presenter.GerenteCadastrarParticipantePresenter;
import edu.ifg.formosa.gerente.client.presenter.GerenteImprimirCertificadoCoordenadorPresenter;
import edu.ifg.formosa.gerente.client.presenter.GerenteImprimirCertificadoParticipantePresenter;
import edu.ifg.formosa.gerente.client.presenter.GerenteImprimirCrachaCoordenadorPresenter;
import edu.ifg.formosa.gerente.client.presenter.GerenteImprimirCrachaParticipantePresenter;
import edu.ifg.formosa.gerente.client.presenter.GerentePesquisarCoordenadorPresenter;
import edu.ifg.formosa.gerente.client.presenter.HomeGerentePresenter;
import edu.ifg.formosa.gerente.client.presenter.MenuTelaInicialGerentePresenter;
import edu.ifg.formosa.gerente.client.presenter.Presenter;
import edu.ifg.formosa.gerente.client.presenter.GerentePesquisarParticipantePresenter;
import edu.ifg.formosa.gerente.client.presenter.RodapePresenter;
import edu.ifg.formosa.gerente.client.view.GerenteCadastrarCoordenadorView;
import edu.ifg.formosa.gerente.client.view.GerenteCadastrarEventoView;
import edu.ifg.formosa.gerente.client.view.GerenteCadastrarParticipanteView;
import edu.ifg.formosa.gerente.client.view.GerenteImprimirCertificadoCoordenadorView;
import edu.ifg.formosa.gerente.client.view.GerenteImprimirCertificadoParticipanteView;
import edu.ifg.formosa.gerente.client.view.GerenteImprimirCrachaCoordenadorView;
import edu.ifg.formosa.gerente.client.view.GerenteImprimirCrachaParticipanteView;
import edu.ifg.formosa.gerente.client.view.GerentePesquisarCoordenadorView;
import edu.ifg.formosa.gerente.client.view.HomeGerenteView;
import edu.ifg.formosa.gerente.client.view.MenuTelaInicialGerenteView;
import edu.ifg.formosa.gerente.client.view.GerentePesquisarParticipanteView;
import edu.ifg.formosa.gerente.client.view.RodapeView;


public class AppControllerGerente  implements Presenter, ValueChangeHandler<String> {

	private HasWidgets containerEsquerda;
	private HasWidgets containerDireita;
	private HasWidgets containerTres;
	private final HandlerManager eventBus;
	private final GerenteServiceAsync rpcService;

	public AppControllerGerente(HandlerManager eventBus, GerenteServiceAsync rpcService){
		this.eventBus = eventBus;
		this.rpcService = rpcService;
	}

	private void bind(){
		
		//RodapeView roda = new RodapeView();
		//RodapePresenter rp = new RodapePresenter(roda);
		
		History.addValueChangeHandler(this);
		
		eventBus.addHandler(CadastraEventoEvent.TYPE, new CadastrarEventoEventHandler() {
			
			public void cadastrarEvento(CadastraEventoEvent event) {
				if("".equals(History.getToken())){
					History.newItem("home");
				}
				else if("ImprimindoCertificadoCoordenador".equals(History.getToken())){
					History.newItem("AdicionandoEvento");
				}
				else if("home".equals(History.getToken())){
					History.newItem("AdicionandoEvento");
				}
				else if("PesquisarParticipante".equals(History.getToken())){
					History.newItem("AdicionandoEvento");
				}
				else if("PesquisarCoordenador".equals(History.getToken())){
					History.newItem("AdicionandoEvento");
				}
				else if("CadastrarParticipante".equals(History.getToken())){
					History.newItem("AdicionandoEvento");
				}
				else if("ImprimirCrachaCoordenador".equals(History.getToken())){
					History.newItem("AdicionandoEvento");
				}
				else if("CadastrarCoordenador".equals(History.getToken())){
					History.newItem("AdicionandoEvento");
				}
				else{
					History.fireCurrentHistoryState();
				}
				
			}
		});
		
		eventBus.addHandler(PesquisarEventoEvent.TYPE, new PesquisarEventoEventHandler() {
			
			public void pesquisarEvento(PesquisarEventoEvent event) {
				if("".equals(History.getToken())){
					History.newItem("home");
				}
				else if("AdicionandoEvento".equals(History.getToken())){
					History.newItem("home");
				}
				else if("PesquisarCoordenador".equals(History.getToken())){
					History.newItem("home");
				}
				else if("PesquisarParticipante".equals(History.getToken())){
					History.newItem("home");
				}
				else if("CadastrarCoordenador".equals(History.getToken())){
					History.newItem("home");
				}
				else if("CadastrarParticipante".equals(History.getToken())){
					History.newItem("home");
				}
				else if("ImprimirCertificadoParticipante".equals(History.getToken())){
					History.newItem("home");
				}
				else if("ImprimirCrachaCoordenador".equals(History.getToken())){
					History.newItem("home");
				}
				else if("ImprimindoCertificadoCoordenador".equals(History.getToken())){
					History.newItem("home");
				}
				
				else{
					History.fireCurrentHistoryState();
				}
			}
		});
		
		eventBus.addHandler(PesquisarParticipanteEvent.TYPE, new PesquisarParticipanteEventHandler() {
			
			public void pesquisarParticipante(PesquisarParticipanteEvent event) {
				if("".equals(History.getToken())){
					History.newItem("home");
				}
				else if("home".equals(History.getToken())){
					History.newItem("PesquisarParticipante");
				}
				else if("home".equals(History.getToken())){
					History.newItem("PesquisarParticipante");
				}
				else if("PesquisarCoordenador".equals(History.getToken())){
					History.newItem("PesquisarParticipante");
				}
				else if("PesquisarEvento".equals(History.getToken())){
					History.newItem("PesquisarParticipante");
				}
				else if("PesquisarParticipante".equals(History.getToken())){
					History.newItem("PesquisarParticipante");
				}
				else if("AdicionandoParticipante".equals(History.getToken())){
					History.newItem("PesquisarParticipante");
				}
				else if("CadastrarParticipante".equals(History.getToken())){
					History.newItem("PesquisarParticipante");
				}
				else if("AdicionandoEvento".equals(History.getToken())){
					History.newItem("PesquisarParticipante");
				}
				else if("CadastrarCoordenador".equals(History.getToken())){
					History.newItem("PesquisarParticipante");
				}
				else if("ImprimindoCertificadoCoordenador".equals(History.getToken())){
					History.newItem("PesquisarParticipante");
				}
				else {
					History.fireCurrentHistoryState();
					
				}
			}
		});
		
		eventBus.addHandler(PesquisarCoordenadorEvent.TYPE,new PesquisarCoordenadorEventHandler() {
			
			public void pesquisarCoordenador(PesquisarCoordenadorEvent event) {
				if("".equals(History.getToken())){
					History.newItem("home");
				}
				else if("home".equals(History.getToken())){
					History.newItem("PesquisarCoordenador");
				}
				else if("CadastrarCoordenador".equals(History.getToken())){
					History.newItem("PesquisarCoordenador");
				}
				else if("PesquisarParticipante".equals(History.getToken())){
					History.newItem("PesquisarCoordenador");
				}
				else if("AdicionandoEvento".equals(History.getToken())){
					History.newItem("PesquisarCoordenador");
				}
				else if("ImprimindoCertificadoCoordenador".equals(History.getToken())){
					History.newItem("PesquisarCoordenador");
				}
				else if("ImprimirCrachaCoordenador".equals(History.getToken())){
					History.newItem("PesquisarCoordenador");
				}
				else if("CadastrarParticipante".equals(History.getToken())){
					History.newItem("PesquisarCoordenador");
				}
				else if("ImprimirCertificadoParticipante".equals(History.getToken())){
					History.newItem("PesquisarCoordenador");
				}
				else {
					History.fireCurrentHistoryState();
					
				}
			}
			
		});
		
		eventBus.addHandler(CadastrarCoordenadorEvent.TYPE, new CadastrarCoordenadorEventHandler() {
			
			public void cadastrarCoordenador(CadastrarCoordenadorEvent event) {
				if("".equals(History.getToken())){
					History.newItem("home");
				}
				else if("home".equals(History.getToken())){
					History.newItem("CadastrarCoordenador");
				}
				else if("home".equals(History.getToken())){
					History.newItem("CadastrarCoordenador");
				}
				else if("PesquisarCoordenador".equals(History.getToken())){
					History.newItem("CadastrarCoordenador");
				}
				else if("PesquisarEvento".equals(History.getToken())){
					History.newItem("CadastrarCoordenador");
				}
				else if("PesquisarParticipante".equals(History.getToken())){
					History.newItem("CadastrarCoordenador");
				}
				else if("AdicionandoParticipante".equals(History.getToken())){
					History.newItem("CadastrarCoordenador");
				}
				else if("ImprimirCrachaCoordenador".equals(History.getToken())){
					History.newItem("CadastrarCoordenador");
				}
				else if("ImprimindoCertificadoCoordenador".equals(History.getToken())){
					History.newItem("CadastrarCoordenador");
				}
				else {
					History.fireCurrentHistoryState();
					
				}
			}
		});
		
		eventBus.addHandler(CadastraParticipanteEvent.TYPE, new CadastrarParticipanteEventHandler() {
			
			public void cadastrarParticipante(CadastraParticipanteEvent event) {
				if("".equals(History.getToken())){
					History.newItem("home");
				}
				else if("home".equals(History.getToken())){
					History.newItem("CadastrarParticipante");
				}
				else if("home".equals(History.getToken())){
					History.newItem("CadastrarParticipante");
				}
				else if("PesquisarCoordenador".equals(History.getToken())){
					History.newItem("CadastrarParticipante");
				}
				else if("PesquisarEvento".equals(History.getToken())){
					History.newItem("CadastrarParticipante");
				}
				else if("PesquisarParticipante".equals(History.getToken())){
					History.newItem("CadastrarParticipante");
				}
				else if("AdicionandoParticipante".equals(History.getToken())){
					History.newItem("CadastrarParticipante");
				}
				else if("ImprimindoCrachaParticipante".equals(History.getToken())){
					History.newItem("CadastrarParticipante");
				}
				else if("ImprimirCertificadoParticipante".equals(History.getToken())){
					History.newItem("CadastrarParticipante");
				}
				else if("AdicionandoEvento".equals(History.getToken())){
					History.newItem("CadastrarParticipante");
				}
				
				else {
					History.fireCurrentHistoryState();
					
				}
				
			}
		});
		
		eventBus.addHandler(ImprimirCrachaParticipanteEvent.TYPE, new ImprimirCrachaParticipanteEventHandler() {
			
			public void imprimirCrachaParticipante(ImprimirCrachaParticipanteEvent event) {
				if("".equals(History.getToken())){
					History.newItem("home");
				}
				else if("home".equals(History.getToken())){
					History.newItem("ImprimindoCrachaParticipante");
				}
				else if("home".equals(History.getToken())){
					History.newItem("ImprimindoCrachaParticipante");
				}
				else if("PesquisarCoordenador".equals(History.getToken())){
					History.newItem("ImprimindoCrachaParticipante");
				}
				else if("PesquisarEvento".equals(History.getToken())){
					History.newItem("ImprimindoCrachaParticipante");
				}
				else if("PesquisarParticipante".equals(History.getToken())){
					History.newItem("ImprimindoCrachaParticipante");
				}
				else if("AdicionandoParticipante".equals(History.getToken())){
					History.newItem("ImprimindoCrachaParticipante");
				}
				else if("CadastrarParticipante".equals(History.getToken())){
					History.newItem("ImprimindoCrachaParticipante");
				}
				else if("ImprimirCertificadoParticipante".equals(History.getToken())){
					History.newItem("ImprimindoCrachaParticipante");
				}
				else if("AdicionandoEvento".equals(History.getToken())){
					History.newItem("ImprimindoCrachaParticipante");
				}
				
				else {
					History.fireCurrentHistoryState();
					
				}
				
			}
		});
		
		eventBus.addHandler(ImprimirCrachaCoordenadorEvent.TYPE, new ImprimirCrachaCoordenadorEventHandler() {
			
			public void imprimirCrachaCoordenador(ImprimirCrachaCoordenadorEvent event) {
				
				if("".equals(History.getToken())){
					History.newItem("home");
				}
				else if("home".equals(History.getToken())){
					History.newItem("ImprimirCrachaCoordenador");
				}
				else if("PesquisarCoordenador".equals(History.getToken())){
					History.newItem("ImprimirCrachaCoordenador");
				}
				else if("PesquisarEvento".equals(History.getToken())){
					History.newItem("ImprimirCrachaCoordenador");
				}
				else if("PesquisarParticipante".equals(History.getToken())){
					History.newItem("ImprimirCrachaCoordenador");
				}
				else if("AdicionandoParticipante".equals(History.getToken())){
					History.newItem("ImprimirCrachaCoordenador");
				}
				else if("CadastrarCoordenador".equals(History.getToken())){
					History.newItem("ImprimirCrachaCoordenador");
				}
				else if("ImprimindoCertificadoCoordenador".equals(History.getToken())){
					History.newItem("ImprimirCrachaCoordenador");
				}
				else {
					History.fireCurrentHistoryState();
					
				}
			}
		});
		
		eventBus.addHandler(ImprimirCertificadoCoordenadorEvent.TYPE, new ImprimirCertificadoCoordenadorEventHandler() {
			
			public void imprimirCertificadoCoordenador(
					ImprimirCertificadoCoordenadorEvent event) {

				if("".equals(History.getToken())){
					History.newItem("home");
				}
				else if("home".equals(History.getToken())){
					History.newItem("ImprimindoCertificadoCoordenador");
				}
				else if("home".equals(History.getToken())){
					History.newItem("ImprimindoCertificadoCoordenador");
				}
				else if("PesquisarCoordenador".equals(History.getToken())){
					History.newItem("ImprimindoCertificadoCoordenador");
				}
				else if("PesquisarEvento".equals(History.getToken())){
					History.newItem("ImprimindoCertificadoCoordenador");
				}
				else if("PesquisarParticipante".equals(History.getToken())){
					History.newItem("ImprimindoCertificadoCoordenador");
				}
				else if("AdicionandoParticipante".equals(History.getToken())){
					History.newItem("ImprimindoCertificadoCoordenador");
				}
				else if("ImprimirCrachaCoordenador".equals(History.getToken())){
					History.newItem("ImprimindoCertificadoCoordenador");
				}
				else if("CadastrarCoordenador".equals(History.getToken())){
					History.newItem("ImprimindoCertificadoCoordenador");
				}
				else if("ImprimirCertificadoParticipante".equals(History.getToken())){
					History.newItem("ImprimindoCertificadoCoordenador");
				}
				else {
					History.fireCurrentHistoryState();
					
				}
				
			}
		});
		
		eventBus.addHandler(ImprimirCertificadoParticipanteEvent.TYPE, new ImprimirCertificadoParticipanteEventHandler() {
			
			public void imprimirCertificadoParticipante(
					ImprimirCertificadoParticipanteEvent event) {
				if("".equals(History.getToken())){
					History.newItem("home");
				}
				else if("home".equals(History.getToken())){
					History.newItem("ImprimirCertificadoParticipante");
				}
				else if("home".equals(History.getToken())){
					History.newItem("ImprimirCertificadoParticipante");
				}
				else if("PesquisarCoordenador".equals(History.getToken())){
					History.newItem("ImprimirCertificadoParticipante");
				}
				else if("PesquisarEvento".equals(History.getToken())){
					History.newItem("ImprimirCertificadoParticipante");
				}
				else if("PesquisarParticipante".equals(History.getToken())){
					History.newItem("ImprimirCertificadoParticipante");
				}
				else if("AdicionandoParticipante".equals(History.getToken())){
					History.newItem("ImprimirCertificadoParticipante");
				}
				else if("ImprimirCrachaCoordenador".equals(History.getToken())){
					History.newItem("ImprimirCertificadoParticipante");
				}
				else if("ImprimindoCrachaParticipante".equals(History.getToken())){
					History.newItem("ImprimirCertificadoParticipante");
				}
				else if("CadastrarParticipante".equals(History.getToken())){
					History.newItem("ImprimirCertificadoParticipante");
				}
				
				else {
					History.fireCurrentHistoryState();
					
				}
				
			}
		});
	}
	


	public void onValueChange(ValueChangeEvent<String> event) {
		String token = event.getValue();
		if (token != null) {
			Presenter presenter = null;
			if(token.equals("AdicionandoEvento")){
				GerenteCadastrarEventoView gcev = new GerenteCadastrarEventoView();
				new GerenteCadastrarEventoPresenter(gcev, eventBus);
				containerDireita.clear();
				containerDireita.add(gcev.asWidget());
			}
			if(token.equals("home")){
				HomeGerenteView hgv = new HomeGerenteView();
				new HomeGerentePresenter(hgv, eventBus, rpcService);
				containerDireita.clear();
				containerDireita.add(hgv.asWidget());
			}
			if(token.equals("PesquisarParticipante")){
				GerentePesquisarParticipanteView tigp = new GerentePesquisarParticipanteView();
				new GerentePesquisarParticipantePresenter(tigp, eventBus);
				containerDireita.clear();
				containerDireita.add(tigp.asWidget());
			}
			if(token.equals("PesquisarCoordenador")){
				GerentePesquisarCoordenadorView gpc = new GerentePesquisarCoordenadorView();
				new GerentePesquisarCoordenadorPresenter(gpc,  eventBus, rpcService);
				containerDireita.clear();
				containerDireita.add(gpc.asWidget());
			}
			if(token.equals("CadastrarCoordenador")){
				GerenteCadastrarCoordenadorView gccv = new GerenteCadastrarCoordenadorView();
				new GerenteCadastrarCoordenadorPresenter(gccv, eventBus, rpcService);
				containerDireita.clear();
				containerDireita.add(gccv.asWidget());
			}
			if(token.equals("CadastrarParticipante")){
				GerenteCadastrarParticipanteView gcpv = new GerenteCadastrarParticipanteView();
				new GerenteCadastrarParticipantePresenter(gcpv, eventBus);
				containerDireita.clear();
				containerDireita.add(gcpv.asWidget());
			}
			if(token.equals("ImprimindoCrachaParticipante")){
				GerenteImprimirCrachaParticipanteView gicpv = new GerenteImprimirCrachaParticipanteView();
				new GerenteImprimirCrachaParticipantePresenter(gicpv, eventBus);
				containerDireita.clear();
				containerDireita.add(gicpv.asWidget());
			}
			if(token.equals("ImprimindoCertificadoCoordenador")){
				GerenteImprimirCertificadoCoordenadorView certificadoCoordenador = new GerenteImprimirCertificadoCoordenadorView();
				new GerenteImprimirCertificadoCoordenadorPresenter(certificadoCoordenador, eventBus);
				containerDireita.clear();
				containerDireita.add(certificadoCoordenador.asWidget());
			}
			if(token.equals("ImprimirCrachaCoordenador")){
				GerenteImprimirCrachaCoordenadorView crachaCoordenador = new GerenteImprimirCrachaCoordenadorView();
				new GerenteImprimirCrachaCoordenadorPresenter(crachaCoordenador, eventBus);
				containerDireita.clear();
				containerDireita.add(crachaCoordenador.asWidget());
			}
			if(token.equals("ImprimirCertificadoParticipante")){
				GerenteImprimirCertificadoParticipanteView certificadoParticipante = new GerenteImprimirCertificadoParticipanteView();
				new GerenteImprimirCertificadoParticipantePresenter(certificadoParticipante, eventBus);
				containerDireita.clear();
				containerDireita.add(certificadoParticipante.asWidget());
			}
			if(token.equals("PesquisarEvento")){
				HomeGerenteView hgv = new HomeGerenteView();
				new HomeGerentePresenter(hgv, eventBus, rpcService);
				containerDireita.clear();
				containerDireita.add(hgv.asWidget());
				containerDireita.clear();
				containerDireita.add(hgv.asWidget());
			}
		}
	}
	public void go(HasWidgets containerEsquerda, HasWidgets containerDireita, HasWidgets containerTres) {
		bind();
		GWT.log("go");
		this.containerEsquerda = containerEsquerda;
		this.containerDireita = containerDireita;
		this.containerTres = containerTres;
		
		MenuTelaInicialGerenteView mtigv = new MenuTelaInicialGerenteView();
		MenuTelaInicialGerentePresenter mtigp = new MenuTelaInicialGerentePresenter(mtigv, eventBus,rpcService);
		containerEsquerda.add(mtigv.asWidget());
		
		HomeGerenteView hgv = new HomeGerenteView();
		HomeGerentePresenter hgp = new HomeGerentePresenter(hgv, eventBus, rpcService);
		containerDireita.add(hgv.asWidget());
		
		RodapeView roda = new RodapeView();
		RodapePresenter rp = new RodapePresenter(roda);
		containerTres.add(roda.asWidget());
		
		GWT.log("aqui no app controller");
		
		if ("".equals(History.getToken())) {
			History.newItem("home");
			
		}
		else {
			History.fireCurrentHistoryState();
		}
	}
}
