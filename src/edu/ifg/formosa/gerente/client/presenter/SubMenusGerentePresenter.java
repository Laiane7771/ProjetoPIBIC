package edu.ifg.formosa.gerente.client.presenter;


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.gerente.client.event.CadastraEventoEvent;
import edu.ifg.formosa.gerente.client.event.CadastraParticipanteEvent;
import edu.ifg.formosa.gerente.client.event.CadastrarCoordenadorEvent;
import edu.ifg.formosa.gerente.client.event.ImprimirCertificadoCoordenadorEvent;
import edu.ifg.formosa.gerente.client.event.ImprimirCertificadoParticipanteEvent;
import edu.ifg.formosa.gerente.client.event.ImprimirCrachaCoordenadorEvent;
import edu.ifg.formosa.gerente.client.event.ImprimirCrachaParticipanteEvent;
import edu.ifg.formosa.gerente.client.view.SubMenusGerenteView;

public class SubMenusGerentePresenter implements Presenter{
	
	private SubMenusGerenteView subMenu;
	private final HandlerManager eventBus;
	
	public SubMenusGerentePresenter(SubMenusGerenteView subMenu, HandlerManager eventBus){
		this.subMenu = subMenu;
		this.eventBus = eventBus;
		bind();
	}

	public void bind(){
		subMenu.getLbCadastrarEvento().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new CadastraEventoEvent());
				
			}
		});
		
		subMenu.getLbCadastrarCoordenador().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new CadastrarCoordenadorEvent());
				
			}
		});
		
		subMenu.getLbCadastrarParticipante().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new CadastraParticipanteEvent());
				
			}
		});
		
		subMenu.getLbCrachaParticipante().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new ImprimirCrachaParticipanteEvent());
			}
		});
		
		subMenu.getLbCertificadoParticipante().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new ImprimirCertificadoParticipanteEvent());
			}
		});
		
		subMenu.getLbCrachaCoordenador().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new ImprimirCrachaCoordenadorEvent());
			}
		});
		
		subMenu.getLbCertificadoCoordenador().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new ImprimirCertificadoCoordenadorEvent());
				
			}
		});
		
	}

	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		bind();
		
	}
}
