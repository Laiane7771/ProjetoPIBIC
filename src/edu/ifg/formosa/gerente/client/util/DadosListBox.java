package edu.ifg.formosa.gerente.client.util;

import com.google.gwt.user.client.ui.ListBox;

public class DadosListBox {
	
	private ListBox listaUfs;
	public DadosListBox(ListBox listaUfs){
		this.listaUfs = listaUfs;
	}
	public DadosListBox(){
		
	}
	public void preecheListBox(){
		
		listaUfs.addItem("AM");
		listaUfs.addItem("PA");
		listaUfs.addItem("RR");
		listaUfs.addItem("AC");
		listaUfs.addItem("RO");
		listaUfs.addItem("AP");
		listaUfs.addItem("MT");
		listaUfs.addItem("MS");
		listaUfs.addItem("TO");
		listaUfs.addItem("GO");
		listaUfs.addItem("MG");
		listaUfs.addItem("MA");
		listaUfs.addItem("PI");
		listaUfs.addItem("CE");
		listaUfs.addItem("RN");
		listaUfs.addItem("PB");
		listaUfs.addItem("PE");
		listaUfs.addItem("AL");
		listaUfs.addItem("SE");
		listaUfs.addItem("BA");
		listaUfs.addItem("ES");
		listaUfs.addItem("RJ");
		listaUfs.addItem("SP");
		listaUfs.addItem("PR");
		listaUfs.addItem("SC");
		listaUfs.addItem("RS");
		listaUfs.addItem("DF");
		
		
	}

	public ListBox getListaUfs() {
		return listaUfs;
	}

	public void setListaUfs(ListBox listaUfs) {
		this.listaUfs = listaUfs;
	}
	
}
