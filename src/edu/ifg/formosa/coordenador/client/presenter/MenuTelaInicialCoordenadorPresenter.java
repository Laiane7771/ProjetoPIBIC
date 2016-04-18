package edu.ifg.formosa.coordenador.client.presenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.coordenador.client.event.PesquisarAtividadeEvent;
import edu.ifg.formosa.coordenador.client.event.PesquisarMonitorEvent;
import edu.ifg.formosa.coordenador.client.view.MenuTelaInicialCoordenadorView;
import edu.ifg.formosa.coordenador.client.view.SubMenusTelaInicialCoordenadorView;
import edu.ifg.formosa.gerente.client.event.PesquisarParticipanteEvent;

public class MenuTelaInicialCoordenadorPresenter implements Presenter{
	
	private MenuTelaInicialCoordenadorView MenuInicial;
	private final HandlerManager eventBus;
	private SubMenusTelaInicialCoordenadorView subMenuView;
	private SubMenusTelaInicialCoordenadorPresenter subMenuPresenter;

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
				//MenuInicial.fireEvent(new VisualizarFrequenciaEvent() );
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
		SubMenusTelaInicialCoordenadorView subMenu = new SubMenusTelaInicialCoordenadorView();
		new SubMenusTelaInicialCoordenadorPresenter(subMenu, eventBus);
		MenuInicial.getVpPainelGuardaAtividades().add(subMenu.getHpPainelCadastrarAtividade());
		MenuInicial.getVpPainelGuardaAtividades().add(subMenu.getHpPainelImprimirAtividadeComQR());
		
	}
	
	public void adicionaItensMonitor(){
		SubMenusTelaInicialCoordenadorView subMenu = new SubMenusTelaInicialCoordenadorView();
		new SubMenusTelaInicialCoordenadorPresenter(subMenu, eventBus);
		MenuInicial.getVpPainelGuardaMonitores().add(subMenu.getHpPainelCadastrarMonitor());
		
	}
	
	public void adicionaItensParticipantes(){
		SubMenusTelaInicialCoordenadorView subMenu = new SubMenusTelaInicialCoordenadorView();
		new SubMenusTelaInicialCoordenadorPresenter(subMenu, eventBus);
		MenuInicial.getVpPainelGuardaParticipantes().add(subMenu.getHpPainelFrequenciaParticipantes());
	}
	
	
	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		container.add(MenuInicial.asWidget());
	}
}
