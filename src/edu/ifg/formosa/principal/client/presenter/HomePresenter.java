package edu.ifg.formosa.principal.client.presenter;

import java.util.ArrayList;
import java.util.List;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;

import edu.ifg.formosa.principal.client.event.EntrarEvent;

import edu.ifg.formosa.principal.client.view.HomeView;

public class HomePresenter implements Presenter{

	private HomeView homeView;
	private final HandlerManager eventBus;
	private int index = 0;


	public HomePresenter(HomeView homeView, HandlerManager eventBus){
		this.homeView = homeView;
		this.eventBus = eventBus;
		bind();
		
	}

	public void bind(){
		
		homeView.getLbEntrar().addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new EntrarEvent());

			}
		});
		homeView.getLbCertificado().addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new EntrarEvent());
			}
		});

	}

	public void criaCabecalhoTabela(){
		homeView.getFtTabelaEvento().setText(0, 0, "Nome");
		homeView.getFtTabelaEvento().setText(0, 1, "Data");
		homeView.getFtTabelaEvento().setText(0, 2, "Acessar");
	}
	public void preencheTabela(){
		for(int i = 1; i<10; i++){
			homeView.getFtTabelaEvento().setText(i, 0, "asdasd");
			homeView.getFtTabelaEvento().setText(i, 1, "10/01/2015");
			Label l = new Label("Inscrever");
			final int y = i;
			l.addClickHandler(new ClickHandler() {

				public void onClick(ClickEvent event) {
					Window.alert(""+ y);
				}
			});
			homeView.getFtTabelaEvento().setWidget(i, 2, l);
		}
	}

	public void go(HasWidgets container, HasWidgets containerDois) {
		container.add(homeView.asWidget());
		bind();
		
	}

	public ArrayList<Image> listaImagens(){
		List<Image> fotos = new ArrayList<Image>();
		for(int x = 1; x<5; x++){
			Image i = new Image();
			i.setUrl("../Image/"+x+".jpg");
			i.setSize("100%", "50%");
			fotos.add(i);
		}
		return (ArrayList<Image>) fotos;
	}

	public void trocaImage(){
		List<Image> v = null;
		v = listaImagens();
		if(index==3){
			index = 0;
			
		}
		else{
			index++;
			homeView.getHpPainelFoto().add(v.get(index));	
		}	
	}
	public void temporizador(){
		Timer t = new Timer() { 
			public void run() { 
				while(true){
					trocaImage();
				}
			} 
		};
		t.schedule(4000); 
	}
}
