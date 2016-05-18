package edu.ifg.formosa.gerente.client.presenter;


import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.RootPanel;

import edu.ifg.formosa.gerente.client.GerenteServiceAsync;
import edu.ifg.formosa.gerente.client.event.PesquisarCoordenadorEvent;
import edu.ifg.formosa.gerente.client.event.PesquisarEventoEvent;
import edu.ifg.formosa.gerente.client.event.PesquisarParticipanteEvent;
import edu.ifg.formosa.gerente.client.view.MenuTelaInicialGerenteView;
import edu.ifg.formosa.gerente.client.view.SubMenusGerenteView;
import edu.ifg.formosa.gerente.shared.Gerente;


public class MenuTelaInicialGerentePresenter implements Presenter{

	private MenuTelaInicialGerenteView mtig;
	private final HandlerManager eventBus;
	private boolean abertoEvento = false;
	private boolean abertoCoordenador = false;
	private boolean abertoParticipante = false;
	private boolean apagamenu = false;
	private SubMenusGerenteView smgv = new SubMenusGerenteView();
	private SubMenusGerentePresenter prese = null;
	private GerenteServiceAsync rpcService;

	public MenuTelaInicialGerentePresenter(MenuTelaInicialGerenteView mtig, HandlerManager eventBus, GerenteServiceAsync rpcService){
		this.mtig =  mtig;
		this.eventBus = eventBus;
		this.rpcService = rpcService;
		bind();
		prese = new SubMenusGerentePresenter(smgv, eventBus);
		//exibeNomeGerente();
	}

	public void bind(){
		mtig.getLbEvento().addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event){
				adicionaItemMenuEvento();
			}
		});
		mtig.getLbCoordenadores().addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				adicionaItemMenuCoordenador();
			}
		});

		mtig.getLbParticipantes().addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				adicionaItemMenuParticipantes();

			}
		});

		mtig.getiMenu().addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				if(apagamenu == false){
					apagamenu = true;
					mtig.apagaLabelMenus();
					SubMenusGerenteView sub = new SubMenusGerenteView();
					
					mtig.getVpAdicionaItensEvento().remove(sub.getVpPainelItemCadastrarEvento());
					mtig.getVpAdicionaItensCoordenador().remove(sub.getVpPainelItemCadastrarCoordenador());
					mtig.getVpAdicionaItensCoordenador().remove(sub.getVpPainelItemCrachaCoordenador());
					mtig.getVpAdicionaItensCoordenador().remove(sub.getVpPainelItemCertificadoCoordenador());
					
					mtig.getVpAdicionaItensParticipante().remove(sub.getVpPainelItemCadastrarParticipante());
					mtig.getVpAdicionaItensParticipante().remove(sub.getVpPainelItemCracha());
					mtig.getVpAdicionaItensParticipante().remove(sub.getVpPainelItemCertificado());
					GWT.log("removeu os paineis");
					
					RootPanel.get("painelDireito").getElement().getStyle().setWidth(95, Unit.PCT);
				}
				else{
					apagamenu = false;
					mtig.voltaMenu();
					RootPanel.get("painelDireito").getElement().getStyle().setWidth(80.9, Unit.PCT);
					
				}
			}
		});

		mtig.getLbSair().addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				Window.Location.replace("http://127.0.0.1:8888/Eventif.html");

			}
		});

		mtig.getiEvento().addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new PesquisarEventoEvent());

			}
		});

		mtig.getiParticipantes().addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new PesquisarParticipanteEvent());

			}
		});
		
		mtig.getiCoordenador().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new PesquisarCoordenadorEvent());
				
			}
		});

		mtig.getiSair().addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				Window.Location.replace("http://127.0.0.1:8888/Eventif.html");
			}
		});
	}

	public void exibeNomeGerente(){
		Gerente gerente = new Gerente();
		gerente.getUsuario().setIdUsuario(6);
		rpcService.buscaNomeGerente(gerente, new AsyncCallback<ArrayList<String>>() {
			
			@Override
			public void onSuccess(ArrayList<String> result) {
				if(result!=null){
					String nome = result.get(0);
					Window.alert(nome);
				}
				
			}
			
			@Override
			public void onFailure(Throwable caught) {
				Window.alert("erro");
				GWT.log(caught.getMessage());
				
			}
		});
		
	}
	public void adicionaItemMenuEvento(){
		
		//eventBus.fireEvent(new PesquisarEventoEvent());
		mtig.getHplbCoordenadores().removeStyleName("novolbCoordenadores");
		mtig.getHplbParticipantes().removeStyleName("novolbParticipantes");
		mtig.getHplbEvento().addStyleName("novolbEvento");
		
		if(abertoEvento == false){
			abertoEvento = true;
			//eventBus.fireEvent(new PesquisarEventoEvent());
			
			mtig.getVpAdicionaItensEvento().add(smgv.getVpPainelItemPesquisarEvento());
			mtig.getVpAdicionaItensEvento().add(smgv.getVpPainelItemCadastrarEvento());
		}
		else{
			mtig.getVpAdicionaItensEvento().remove(smgv.getVpPainelItemPesquisarEvento());
			mtig.getVpAdicionaItensEvento().remove(smgv.getVpPainelItemCadastrarEvento());
			abertoEvento = false;
		}
	}

	public void adicionaItemMenuCoordenador(){

		mtig.getHplbEvento().removeStyleName("novolbEvento");
		mtig.getHplbParticipantes().removeStyleName("novolbParticipantes");
		mtig.getHplbCoordenadores().addStyleName("novolbCoordenadores");
		//eventBus.fireEvent(new PesquisarCoordenadorEvent());

		if(abertoCoordenador == false){
			abertoCoordenador = true;
			//eventBus.fireEvent(new PesquisarCoordenadorEvent());
			mtig.getVpAdicionaItensCoordenador().add(smgv.getVpPainelItemPesquisarCoordenador());
			mtig.getVpAdicionaItensCoordenador().add(smgv.getVpPainelItemCadastrarCoordenador());
			mtig.getVpAdicionaItensCoordenador().add(smgv.getVpPainelItemCrachaCoordenador());
			mtig.getVpAdicionaItensCoordenador().add(smgv.getVpPainelItemCertificadoCoordenador());
		}
		else{
			mtig.getVpAdicionaItensCoordenador().remove(smgv.getVpPainelItemPesquisarCoordenador());
			mtig.getVpAdicionaItensCoordenador().remove(smgv.getVpPainelItemCadastrarCoordenador());
			mtig.getVpAdicionaItensCoordenador().remove(smgv.getVpPainelItemCrachaCoordenador());
			mtig.getVpAdicionaItensCoordenador().remove(smgv.getVpPainelItemCertificadoCoordenador());
			abertoCoordenador = false;
		}

	}
	public void adicionaItemMenuParticipantes(){

		//eventBus.fireEvent(new PesquisarParticipanteEvent());
		mtig.getHplbEvento().removeStyleName("novolbEvento");
		mtig.getHplbCoordenadores().removeStyleName("novolbCoordenadores");
		mtig.getHplbParticipantes().addStyleName("novolbParticipantes");

		if(abertoParticipante == false){
			abertoParticipante = true;
			//eventBus.fireEvent(new PesquisarParticipanteEvent());
			mtig.getVpAdicionaItensParticipante().add(smgv.getVpPainelItemPesquisarParticipante());
			mtig.getVpAdicionaItensParticipante().add(smgv.getVpPainelItemCadastrarParticipante());
			mtig.getVpAdicionaItensParticipante().add(smgv.getVpPainelItemCracha());
			mtig.getVpAdicionaItensParticipante().add(smgv.getVpPainelItemCertificado());
		}
		else{
			mtig.getVpAdicionaItensParticipante().remove(smgv.getVpPainelItemPesquisarParticipante());
			mtig.getVpAdicionaItensParticipante().remove(smgv.getVpPainelItemCadastrarParticipante());
			mtig.getVpAdicionaItensParticipante().remove(smgv.getVpPainelItemCracha());
			mtig.getVpAdicionaItensParticipante().remove(smgv.getVpPainelItemCertificado());
			
			abertoParticipante = false;
		}

	}

	public void remove(){
		mtig.getVpAdicionaItensEvento().clear();
		mtig.getVpAdicionaItensCoordenador().clear();
		mtig.getVpAdicionaItensParticipante().clear();
	}


	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {

		
	}

}
