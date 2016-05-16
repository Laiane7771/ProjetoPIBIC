package edu.ifg.formosa.participante.client.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Widget;

public class FlexTableEventIF extends Composite{
	
	private FlexTable ft = new FlexTable();
	private int contLinha = 1;
	
	public FlexTableEventIF(){
		this.initWidget(ft);
		
	}
	
	public void prencheCabecalho(ArrayList<Widget> t){
		int contColuna = 0;
		Iterator<Widget> itColuna = t.iterator();
		while(itColuna.hasNext()){
			Widget w = itColuna.next();
			ft.setWidget(0, contColuna, w);			
			ft.getCellFormatter().addStyleName(0, contColuna, "ftTabelaEventoTelaParticipante");
			contColuna++;
		}
		
	}
	
	public void preencheTabela(ArrayList<ArrayList<Widget>> t){
		
		int contColuna = 0;
		
		Iterator<ArrayList<Widget>> itLinha = t.iterator();
		while(itLinha.hasNext()){
			ArrayList<Widget> linha = itLinha.next();
			Iterator<Widget> itColuna = linha.iterator();
			while(itColuna.hasNext()){
				Widget w = itColuna.next();
				ft.setWidget(contLinha, contColuna, w);
				ft.getCellFormatter().addStyleName(contLinha, contColuna, "ftTabelaEventoTelaParticipante");
				contColuna++;
			}
			contLinha++;
			contColuna=0;
		}
		
		
		
	}

	public FlexTable getFt() {
		return ft;
	}

	public void setFt(FlexTable ft) {
		this.ft = ft;
	}
	
	


}
