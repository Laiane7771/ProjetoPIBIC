package edu.ifg.formosa.gerente.client.presenter;


import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.RootPanel;
import edu.ifg.formosa.gerente.client.event.PesquisarCoordenadorEvent;
import edu.ifg.formosa.gerente.client.event.PesquisarEventoEvent;
import edu.ifg.formosa.gerente.client.event.PesquisarParticipanteEvent;
import edu.ifg.formosa.gerente.client.view.MenuTelaInicialGerenteView;
import edu.ifg.formosa.gerente.client.view.SubMenusGerenteView;


public class MenuTelaInicialGerentePresenter implements Presenter{

	private MenuTelaInicialGerenteView mtig;
	private final HandlerManager eventBus;
	private boolean abertoEvento = false;
	private boolean abertoCoordenador = false;
	private boolean abertoParticipante = false;
	private boolean apagamenu = false;
	private SubMenusGerenteView smgv = new SubMenusGerenteView();
	private SubMenusGerentePresenter prese = null;

	public MenuTelaInicialGerentePresenter(MenuTelaInicialGerenteView mtig, HandlerManager eventBus){
		this.mtig =  mtig;
		this.eventBus = eventBus;
		
		prese = new SubMenusGerentePresenter(smgv, eventBus);
		
		bind();
		
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
					RootPanel.get("painelDireito").getElement().getStyle().setWidth(95, Unit.PCT);
				}
				else{
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


	public void adicionaItemMenuEvento(){
		
		eventBus.fireEvent(new PesquisarEventoEvent());
		mtig.getHplbCoordenadores().removeStyleName("novolbCoordenadores");
		mtig.getHplbParticipantes().removeStyleName("novolbParticipantes");
		mtig.getHplbEvento().addStyleName("novolbEvento");
		
		if(abertoEvento == false){
			abertoEvento = true;
			eventBus.fireEvent(new PesquisarEventoEvent());
			
			mtig.getVpAdicionaItensEvento().add(smgv.getVpPainelItemCadastrarEvento());
		}
		else{
			mtig.getVpAdicionaItensEvento().remove(smgv.getVpPainelItemCadastrarEvento());
			abertoEvento = false;

		}

	}

	public void adicionaItemMenuCoordenador(){

		mtig.getHplbEvento().removeStyleName("novolbEvento");
		mtig.getHplbParticipantes().removeStyleName("novolbParticipantes");
		mtig.getHplbCoordenadores().addStyleName("novolbCoordenadores");
		eventBus.fireEvent(new PesquisarCoordenadorEvent());

		if(abertoCoordenador == false){
			abertoCoordenador = true;
			eventBus.fireEvent(new PesquisarCoordenadorEvent());
			mtig.getVpAdicionaItensCoordenador().add(smgv.getVpPainelItemCadastrarCoordenador());
			mtig.getVpAdicionaItensCoordenador().add(smgv.getVpPainelItemCrachaCoordenador());
			mtig.getVpAdicionaItensCoordenador().add(smgv.getVpPainelItemCertificadoCoordenador());
		}
		else{
			mtig.getVpAdicionaItensCoordenador().remove(smgv.getVpPainelItemCadastrarCoordenador());
			mtig.getVpAdicionaItensCoordenador().remove(smgv.getVpPainelItemCrachaCoordenador());
			mtig.getVpAdicionaItensCoordenador().remove(smgv.getVpPainelItemCertificadoCoordenador());
			abertoCoordenador = false;
		}

	}
	public void adicionaItemMenuParticipantes(){

		eventBus.fireEvent(new PesquisarParticipanteEvent());
		mtig.getHplbEvento().removeStyleName("novolbEvento");
		mtig.getHplbCoordenadores().removeStyleName("novolbCoordenadores");
		mtig.getHplbParticipantes().addStyleName("novolbParticipantes");

		if(abertoParticipante == false){
			abertoParticipante = true;
			eventBus.fireEvent(new PesquisarParticipanteEvent());
			mtig.getVpAdicionaItensParticipante().add(smgv.getVpPainelItemCadastrarParticipante());
			mtig.getVpAdicionaItensParticipante().add(smgv.getVpPainelItemCracha());
			mtig.getVpAdicionaItensParticipante().add(smgv.getVpPainelItemCertificado());
		}
		else{
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

		bind();

	}

}
