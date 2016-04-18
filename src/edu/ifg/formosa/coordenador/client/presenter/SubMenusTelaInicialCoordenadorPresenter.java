package edu.ifg.formosa.coordenador.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;

import edu.ifg.formosa.coordenador.client.event.CadastrarAtividadeEvent;
import edu.ifg.formosa.coordenador.client.event.CadastrarMonitorEvent;
import edu.ifg.formosa.coordenador.client.view.SubMenusTelaInicialCoordenadorView;
import edu.ifg.formosa.gerente.client.event.CadastraEventoEvent;

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
				
			}
		});
		
		SubMenus.getLbCadastrarMonitor().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new CadastrarMonitorEvent());
				
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
	}
}
