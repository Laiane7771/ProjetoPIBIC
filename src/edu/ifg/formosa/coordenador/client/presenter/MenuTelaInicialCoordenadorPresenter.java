package edu.ifg.formosa.coordenador.client.presenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.coordenador.client.event.CadastrarMonitorEvent;
import edu.ifg.formosa.coordenador.client.event.PesquisarAtividadeEvent;
import edu.ifg.formosa.coordenador.client.event.PesquisarMonitorEvent;
import edu.ifg.formosa.coordenador.client.view.MenuTelaInicialCoordenadorView;
import edu.ifg.formosa.coordenador.client.view.SubMenusTelaInicialCoordenadorView;



public class MenuTelaInicialCoordenadorPresenter implements Presenter{
	
	private MenuTelaInicialCoordenadorView MenuInicial;
	private final HandlerManager eventBus;
	private SubMenusTelaInicialCoordenadorView subMenuView = new SubMenusTelaInicialCoordenadorView();
	private SubMenusTelaInicialCoordenadorPresenter subMenuPresenter = null;
	private boolean abertoAtividade = false;
	private boolean abertoMonitor = false;
	private boolean abertoParticipante = false;
	private boolean apagamenu = false;
	
	public MenuTelaInicialCoordenadorPresenter(MenuTelaInicialCoordenadorView MenuInicial, HandlerManager eventBus){
		this.MenuInicial = MenuInicial;
		this.eventBus = eventBus;
		bind();
	}

	public void bind(){
		MenuInicial.getLbAtividadeCoordenador().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				MenuInicial.fireEvent(new PesquisarAtividadeEvent());
				adicionaItensAtividade();
				
			}
		});
		
		
		MenuInicial.getLbParticipanteCoordenador().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				adicionaItensParticipantes();
				
			}
		});
		
		MenuInicial.getLbMonitoresCoordenador().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				MenuInicial.fireEvent(new PesquisarMonitorEvent());
				adicionaItensMonitor();
				
			}
		});
		MenuInicial.getiLogoutCoordenador().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				GWT.log("antesdoevento");
				Window.Location.replace("http://127.0.0.1:8888/Eventif.html");
				GWT.log("depoisdoEvento");
			}
		});
		MenuInicial.getLbLogoutCoordenador().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				GWT.log("antesdoevento");
				Window.Location.replace("http://127.0.0.1:8888/Eventif.html");
				GWT.log("depoisdoEvento");
				
			}
		});
		
		
		
	}
	
	
	public void adicionaItensAtividade(){
		
		MenuInicial.getHpPainelCoordenadorEmAtividades().removeStyleName("novoPainelCoordenadorAtividade");
		MenuInicial.getHpPainelCoordenadorEmMonitores().removeStyleName("novoPainelCoordenadorMonitor");
		MenuInicial.getHpPainelCoordenadorEmParticipantes().removeStyleName("novoPainelCoordenadorParticipantes");
		MenuInicial.getHpPainelCoordenadorEmAtividades().addStyleName("novoPainelAtividades");
		
		if(abertoAtividade == false){
			abertoAtividade = true;
			MenuInicial.getVpPainelGuardaAtividades().add(subMenuView.getHpPainelPesquisarAtividade());
			MenuInicial.getVpPainelGuardaAtividades().add(subMenuView.getHpPainelCadastrarAtividade());
			MenuInicial.getVpPainelGuardaAtividades().add(subMenuView.getHpPainelImprimirAtividadeComQR());
			
			
		}
		else{
			MenuInicial.getVpPainelGuardaAtividades().remove(subMenuView.getHpPainelPesquisarAtividade());
			MenuInicial.getVpPainelGuardaAtividades().remove(subMenuView.getHpPainelCadastrarAtividade());
			MenuInicial.getVpPainelGuardaAtividades().remove(subMenuView.getHpPainelImprimirAtividadeComQR());
			abertoAtividade = false;
		}
		
	}
	
	public void adicionaItensMonitor(){
		MenuInicial.getHpPainelCoordenadorEmMonitores().removeStyleName("novoPainelCoordenadorMonitor");
		MenuInicial.getHpPainelCoordenadorEmAtividades().removeStyleName("novoPainelCoordenadorAtividade");
		MenuInicial.getHpPainelCoordenadorEmParticipantes().removeStyleName("novoPainelCoordenadorParticipante");
		
		if(abertoMonitor == false){
			abertoMonitor = true;
			MenuInicial.getVpPainelGuardaMonitores().add(subMenuView.getHpPainelPesquisarMonitor());
			MenuInicial.getVpPainelGuardaMonitores().add(subMenuView.getHpPainelCadastrarMonitor());
			
			
		}
		else{
			MenuInicial.getVpPainelGuardaMonitores().remove(subMenuView.getHpPainelPesquisarMonitor());
			MenuInicial.getVpPainelGuardaMonitores().remove(subMenuView.getHpPainelCadastrarMonitor());
			abertoMonitor = false;
		}
		
		
		
	}
	
	public void adicionaItensParticipantes(){
		MenuInicial.getHpPainelCoordenadorEmAtividades().removeStyleName("hpPainelCoordenadorEmAtividades");
		MenuInicial.getHpPainelCoordenadorEmMonitores().removeStyleName("hpPainelCoordenadorEmMonitores");
		MenuInicial.getHpPainelCoordenadorEmParticipantes().removeStyleName("hpPainelCoordenadorEmParticipantes");
		
		if(abertoParticipante==false){
			abertoParticipante=true;
			MenuInicial.getVpPainelGuardaParticipantes().add(subMenuView.getHpPainelPesquisarParticipantes());
			MenuInicial.getVpPainelGuardaParticipantes().add(subMenuView.getHpPainelFrequenciaParticipantes());
			
		}
		else{
			MenuInicial.getVpPainelGuardaParticipantes().remove(subMenuView.getHpPainelPesquisarParticipantes());
			MenuInicial.getVpPainelGuardaParticipantes().remove(subMenuView.getHpPainelFrequenciaParticipantes());
			abertoParticipante = false;
		}
	}
	
	
	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		container.add(MenuInicial.asWidget());
	}
}
