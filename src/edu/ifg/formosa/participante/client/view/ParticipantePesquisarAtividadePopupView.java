package edu.ifg.formosa.participante.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ParticipantePesquisarAtividadePopupView extends DialogBox{
	
	private HorizontalPanel hpPainelTituloPopupAtividades;
	private HorizontalPanel hpPainelPesquisarAtividadesemParticipante;
	private HorizontalPanel hpPainelPainelTabelaAtividadesemParticipante;
	private VerticalPanel vpPainelPopupPesquisareInscreveremAtividade;
	private Label lbTituloPopupAtividades;
	private TextBox tbPesquisarAtividades;
	private Button btnPesquisarAtividades;
	private FlexTable ftTabelaAtividades;

	
	public ParticipantePesquisarAtividadePopupView (){
		
		//Painel titulo pagina----------------------------
		hpPainelTituloPopupAtividades = new HorizontalPanel();
		hpPainelTituloPopupAtividades.setStyleName("hpPainelTituloPopupAtividades");
		
		lbTituloPopupAtividades = new Label("Inscrever-se");
		lbTituloPopupAtividades.setStyleName("lbTituloPopupAtividades");
		
		hpPainelTituloPopupAtividades.add(lbTituloPopupAtividades); //add item
		
		//----------------------------------------------------
		//PainelPesquisarAtividade
		hpPainelPesquisarAtividadesemParticipante = new HorizontalPanel();
		hpPainelPesquisarAtividadesemParticipante.setStyleName("hpPainelPesquisarAtividadesemParticipante");
		
		tbPesquisarAtividades = new TextBox();
		tbPesquisarAtividades.setStyleName("tbPesquisarAtividades");
		
		btnPesquisarAtividades = new Button("Pesquisar");
		btnPesquisarAtividades.setStyleName("btnPesquisarAtividades");
		
		hpPainelPesquisarAtividadesemParticipante.add(tbPesquisarAtividades);//add item
		hpPainelPesquisarAtividadesemParticipante.add(btnPesquisarAtividades); //add item
		
		//-------------------------------------------------------------
		hpPainelPainelTabelaAtividadesemParticipante = new HorizontalPanel();
		hpPainelPainelTabelaAtividadesemParticipante.setStyleName("hpPainelPainelTabelaAtividadesemParticipante");
		
		ftTabelaAtividades = new FlexTable();
		ftTabelaAtividades.setStyleName("ftTabelaAtividades");
		
		hpPainelPainelTabelaAtividadesemParticipante.add(ftTabelaAtividades); //add item
		
		//----------------------Painel add tudo-----------------------------
		
		 vpPainelPopupPesquisareInscreveremAtividade = new VerticalPanel();
		 vpPainelPopupPesquisareInscreveremAtividade.setStyleName(" vpPainelPopupPesquisareInscreveremAtividade");
		 
		 
		 vpPainelPopupPesquisareInscreveremAtividade.add(hpPainelTituloPopupAtividades); //add item
		 vpPainelPopupPesquisareInscreveremAtividade.add(hpPainelPesquisarAtividadesemParticipante); //add item
		 vpPainelPopupPesquisareInscreveremAtividade.add(hpPainelPainelTabelaAtividadesemParticipante); //add item
		 
		 this.add(vpPainelPopupPesquisareInscreveremAtividade);// add item
		 this.show();
		 this.setGlassEnabled(true);
		 this.center();
		 this.setModal(true);
	}



	public HorizontalPanel getHpPainelTituloPopupAtividades() {
		return hpPainelTituloPopupAtividades;
	}



	public void setHpPainelTituloPopupAtividades(
			HorizontalPanel hpPainelTituloPopupAtividades) {
		this.hpPainelTituloPopupAtividades = hpPainelTituloPopupAtividades;
	}



	public HorizontalPanel getHpPainelPesquisarAtividadesemParticipante() {
		return hpPainelPesquisarAtividadesemParticipante;
	}



	public void setHpPainelPesquisarAtividadesemParticipante(
			HorizontalPanel hpPainelPesquisarAtividadesemParticipante) {
		this.hpPainelPesquisarAtividadesemParticipante = hpPainelPesquisarAtividadesemParticipante;
	}



	public HorizontalPanel getHpPainelPainelTabelaAtividadesemParticipante() {
		return hpPainelPainelTabelaAtividadesemParticipante;
	}



	public void setHpPainelPainelTabelaAtividadesemParticipante(
			HorizontalPanel hpPainelPainelTabelaAtividadesemParticipante) {
		this.hpPainelPainelTabelaAtividadesemParticipante = hpPainelPainelTabelaAtividadesemParticipante;
	}



	public VerticalPanel getVpPainelPopupPesquisareInscreveremAtividade() {
		return vpPainelPopupPesquisareInscreveremAtividade;
	}



	public void setVpPainelPopupPesquisareInscreveremAtividade(
			VerticalPanel vpPainelPopupPesquisareInscreveremAtividade) {
		this.vpPainelPopupPesquisareInscreveremAtividade = vpPainelPopupPesquisareInscreveremAtividade;
	}



	public Label getLbTituloPopupAtividades() {
		return lbTituloPopupAtividades;
	}



	public void setLbTituloPopupAtividades(Label lbTituloPopupAtividades) {
		this.lbTituloPopupAtividades = lbTituloPopupAtividades;
	}



	public TextBox getTbPesquisarAtividades() {
		return tbPesquisarAtividades;
	}



	public void setTbPesquisarAtividades(TextBox tbPesquisarAtividades) {
		this.tbPesquisarAtividades = tbPesquisarAtividades;
	}



	public Button getBtnPesquisarAtividades() {
		return btnPesquisarAtividades;
	}



	public void setBtnPesquisarAtividades(Button btnPesquisarAtividades) {
		this.btnPesquisarAtividades = btnPesquisarAtividades;
	}



	public FlexTable getFtTabelaAtividades() {
		return ftTabelaAtividades;
	}



	public void setFtTabelaAtividades(FlexTable ftTabelaAtividades) {
		this.ftTabelaAtividades = ftTabelaAtividades;
	}

}
