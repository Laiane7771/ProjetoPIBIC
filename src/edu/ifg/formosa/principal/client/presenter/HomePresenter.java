package edu.ifg.formosa.principal.client.presenter;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.FlexTable;
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


	
	public void preencheTabela(Vector<Vector<String>> listaEventos){
		homeView.getFtTabelaEvento().clear();
	
		
		Vector<String> colunas = new Vector<String>();
		colunas.add("id");
		colunas.add("Nome");
		colunas.add("Organizador(a)");
		colunas.add("Descrição");

		for(int a = 0; a<40; a++){
			for(int b =0; b<40; b++){
				homeView.getFtTabelaEvento().setText(a, b, ""+colunas);
			}
		}
	}

	public void go(HasWidgets container, HasWidgets containerDois) {
		container.add(homeView.asWidget());
		bind();
		
	}

	
}
