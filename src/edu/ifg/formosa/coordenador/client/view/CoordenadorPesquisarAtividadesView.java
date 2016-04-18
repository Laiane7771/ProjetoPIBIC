package edu.ifg.formosa.coordenador.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CoordenadorPesquisarAtividadesView extends Composite {
	
	private HorizontalPanel hpPainelTituloPopupAtividadeCoord;
	private HorizontalPanel hpPainelTextboxButtonPesquisar;
	private HorizontalPanel hpPainelTabelaAtividadesCoord;
	private VerticalPanel vpPainelInscreverAtividades;
	private Label lbTituloPagina;
	private TextBox tbPesquisarAtividadesCoord;
	private Button btnPesquisarAtividadeCoord;
	private FlexTable ftTabelaAtividadesCoord;

	public CoordenadorPesquisarAtividadesView(){
		
		
		hpPainelTituloPopupAtividadeCoord = new HorizontalPanel();
		hpPainelTituloPopupAtividadeCoord.setStyleName("hpPainelTituloPopupAtividadeCoord");
		
		lbTituloPagina = new Label("Inscrever Atividades");
		lbTituloPagina.setStyleName("lbTituloPagina");
		
		hpPainelTituloPopupAtividadeCoord.add(lbTituloPagina); //add item
		
		//------------------------------------------------------
		hpPainelTextboxButtonPesquisar = new HorizontalPanel();
		hpPainelTextboxButtonPesquisar.setStyleName("hpPainelTextboxButtonPesquisar");
		
		tbPesquisarAtividadesCoord = new TextBox();
		tbPesquisarAtividadesCoord.setStyleName("tbPesquisarAtividadesCoord");
		
		btnPesquisarAtividadeCoord = new Button("Pesquisar");
		btnPesquisarAtividadeCoord.setStyleName("btnPesquisarAtividadeCoord");
		
		hpPainelTextboxButtonPesquisar.add(tbPesquisarAtividadesCoord); //add item
		hpPainelTextboxButtonPesquisar.add(btnPesquisarAtividadeCoord);// add item
		//--------------------------------------------------------
		hpPainelTabelaAtividadesCoord = new HorizontalPanel();
		hpPainelTabelaAtividadesCoord.setStyleName("hpPainelTabelaAtividadesCoord");
		
		ftTabelaAtividadesCoord = new FlexTable();
		ftTabelaAtividadesCoord.setStyleName("ftTabelaAtividadesCoord");
		for(int x=0; x<20; x++){
			for (int y=0; y<20; y++){
				ftTabelaAtividadesCoord.setText(x, y, "nome");
			}
		}
		
		
		hpPainelTabelaAtividadesCoord.add(ftTabelaAtividadesCoord); //add item
		//----------------------------------------------------------
		vpPainelInscreverAtividades = new VerticalPanel();
		vpPainelInscreverAtividades.setStyleName("vpPainelInscreverAtividades");
		
		vpPainelInscreverAtividades.add(hpPainelTituloPopupAtividadeCoord);//add item
		vpPainelInscreverAtividades.add(hpPainelTextboxButtonPesquisar); //add item
		vpPainelInscreverAtividades.add(hpPainelTabelaAtividadesCoord); //add item
		
		initWidget(vpPainelInscreverAtividades);
		
		
	}

	public HorizontalPanel getHpPainelTituloPopupAtividadeCoord() {
		return hpPainelTituloPopupAtividadeCoord;
	}

	public void setHpPainelTituloPopupAtividadeCoord(
			HorizontalPanel hpPainelTituloPopupAtividadeCoord) {
		this.hpPainelTituloPopupAtividadeCoord = hpPainelTituloPopupAtividadeCoord;
	}

	public HorizontalPanel getHpPainelTextboxButtonPesquisar() {
		return hpPainelTextboxButtonPesquisar;
	}

	public void setHpPainelTextboxButtonPesquisar(
			HorizontalPanel hpPainelTextboxButtonPesquisar) {
		this.hpPainelTextboxButtonPesquisar = hpPainelTextboxButtonPesquisar;
	}

	public HorizontalPanel getHpPainelTabelaAtividadesCoord() {
		return hpPainelTabelaAtividadesCoord;
	}

	public void setHpPainelTabelaAtividadesCoord(
			HorizontalPanel hpPainelTabelaAtividadesCoord) {
		this.hpPainelTabelaAtividadesCoord = hpPainelTabelaAtividadesCoord;
	}

	

	public VerticalPanel getVpPainelInscreverAtividades() {
		return vpPainelInscreverAtividades;
	}

	public void setVpPainelInscreverAtividades(
			VerticalPanel vpPainelInscreverAtividades) {
		this.vpPainelInscreverAtividades = vpPainelInscreverAtividades;
	}

	public Label getLbTituloPagina() {
		return lbTituloPagina;
	}

	public void setLbTituloPagina(Label lbTituloPagina) {
		this.lbTituloPagina = lbTituloPagina;
	}

	public TextBox getTbPesquisarAtividadesCoord() {
		return tbPesquisarAtividadesCoord;
	}

	public void setTbPesquisarAtividadesCoord(TextBox tbPesquisarAtividadesCoord) {
		this.tbPesquisarAtividadesCoord = tbPesquisarAtividadesCoord;
	}

	public Button getBtnPesquisarAtividadeCoord() {
		return btnPesquisarAtividadeCoord;
	}

	public void setBtnPesquisarAtividadeCoord(Button btnPesquisarAtividadeCoord) {
		this.btnPesquisarAtividadeCoord = btnPesquisarAtividadeCoord;
	}

	public FlexTable getFtTabelaAtividadesCoord() {
		return ftTabelaAtividadesCoord;
	}

	public void setFtTabelaAtividadesCoord(FlexTable ftTabelaAtividadesCoord) {
		this.ftTabelaAtividadesCoord = ftTabelaAtividadesCoord;
	}
	
}
