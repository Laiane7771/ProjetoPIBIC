package edu.ifg.formosa.coordenador.client.presenter;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;

import edu.ifg.formosa.coordenador.client.event.CadastrarAtividadeEvent;
import edu.ifg.formosa.coordenador.client.event.CadastrarMonitorEvent;
import edu.ifg.formosa.coordenador.client.event.PesquisarAtividadeEvent;
import edu.ifg.formosa.coordenador.client.event.PesquisarMonitorEvent;
import edu.ifg.formosa.coordenador.client.view.SubMenusTelaInicialCoordenadorView;
import edu.ifg.formosa.gerente.client.event.CadastraEventoEvent;
import edu.ifg.formosa.gerente.client.event.PesquisarParticipanteEvent;

public class SubMenusTelaInicialCoordenadorPresenter {
	
	private SubMenusTelaInicialCoordenadorView SubMenus;
	private final HandlerManager eventBus;

	public SubMenusTelaInicialCoordenadorPresenter (SubMenusTelaInicialCoordenadorView SubMenus, HandlerManager eventBus){
		this.SubMenus = SubMenus;
		this.eventBus = eventBus;
		bind();
	}
	
	public void bind(){
		
		SubMenus.getLbCadastrarAtividade().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new CadastrarAtividadeEvent());
				GWT.log("aqui no botao cadastrar Atividade");
				
			}
		});
		
		SubMenus.getLbCadastrarMonitor().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new CadastrarMonitorEvent());
				GWT.log("aqui no botao cadastrarMonitor");
			}
		});
		
		SubMenus.getLbFrequenciaParticipantes().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				//eventBus.fireEvent(new VisualizarFrequenciaEvent());
				
			}
		});
		
		SubMenus.getLbImprimirAtividadeComQR().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				
			}
		});
		
		SubMenus.getLbPesquisarAtividade().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new PesquisarAtividadeEvent());
				
			}
		});
		
		SubMenus.getLbPesquisarMonitor().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new PesquisarMonitorEvent());
				
			}
		});
		
		SubMenus.getLbPesquisarParticipante().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				//eventBus.fireEvent(new PesquisarParticipanteEvent());
				
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
