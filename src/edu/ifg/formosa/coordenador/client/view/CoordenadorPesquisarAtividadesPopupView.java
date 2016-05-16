package edu.ifg.formosa.coordenador.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CoordenadorPesquisarAtividadesPopupView extends DialogBox {
	
	private HorizontalPanel hpPainelTituloPopupAtividadeCoord;
	private HorizontalPanel hpPainelTextboxButtonPesquisar;
	private HorizontalPanel hpPainelTabelaAtividadesCoord;
	private VerticalPanel vpPainelInscreverAtividadesPopup;
	private Label lbTituloPagina;
	private TextBox tbPesquisarAtividadesCoord;
	private Button btnPesquisarAtividadeCoord;
	private FlexTable ftTabelaAtividadesCoord;

	public CoordenadorPesquisarAtividadesPopupView(){
		
		this.setStyleName("CoordenadorInscreverAtividades");
		
		hpPainelTituloPopupAtividadeCoord = new HorizontalPanel();
		hpPainelTituloPopupAtividadeCoord.setStyleName("hpPainelTituloPopupAtividadeCoord");
		
		lbTituloPagina = new Label("Cadastrar Atividades");
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
		
		hpPainelTabelaAtividadesCoord.add(ftTabelaAtividadesCoord); //add item
		//----------------------------------------------------------
		vpPainelInscreverAtividadesPopup = new VerticalPanel();
		vpPainelInscreverAtividadesPopup.setStyleName("vpPainelInscreverAtividadesPopup");
		
		vpPainelInscreverAtividadesPopup.add(hpPainelTituloPopupAtividadeCoord);//add item
		vpPainelInscreverAtividadesPopup.add(hpPainelTextboxButtonPesquisar); //add item
		vpPainelInscreverAtividadesPopup.add(hpPainelTabelaAtividadesCoord); //add item
		
		this.add(vpPainelInscreverAtividadesPopup);
		this.show();
		this.setGlassEnabled(true);
		this.setModal(false);
		this.setAnimationEnabled(true);
		
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

	public VerticalPanel getVpPainelInscreverAtividadesPopup() {
		return vpPainelInscreverAtividadesPopup;
	}

	public void setVpPainelInscreverAtividadesPopup(
			VerticalPanel vpPainelInscreverAtividadesPopup) {
		this.vpPainelInscreverAtividadesPopup = vpPainelInscreverAtividadesPopup;
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
