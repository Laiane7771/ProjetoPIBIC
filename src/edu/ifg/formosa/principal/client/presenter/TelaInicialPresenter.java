package edu.ifg.formosa.principal.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;
import edu.ifg.formosa.principal.client.event.EntrarEvent;
import edu.ifg.formosa.principal.client.view.PainelEscolhaModuloView;
import edu.ifg.formosa.principal.client.view.TelaInicialView;

public class TelaInicialPresenter implements Presenter{

	private TelaInicialView tiv;
	private PainelEscolhaModuloView pev;
	private PainelEscolhaModuloPresenter pep;
	private final HandlerManager eventBus;
	
	
	public TelaInicialPresenter(TelaInicialView tiv, HandlerManager eventBus){
		this.tiv = tiv;
		this.eventBus = eventBus;
	}
	
	
	public void bind(){
		tiv.getLbCertificados().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new EntrarEvent());
				AdicionaPainelModulos();
			}
		});
		tiv.getLbEntrarSite().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				
				
			}
		});
		
	}
	
	public void AdicionaPainelModulos(){
		pev = new PainelEscolhaModuloView();
		pep = new PainelEscolhaModuloPresenter(pev, eventBus);
		tiv.getVpPainelCabecalho().add(pev.getHpPainelModulos());
		
	}
	public void go(HasWidgets container, HasWidgets containerDois) {
		container.add(tiv.asWidget());
		
	}
}
