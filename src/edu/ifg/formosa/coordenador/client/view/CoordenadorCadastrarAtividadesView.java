package edu.ifg.formosa.coordenador.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CoordenadorCadastrarAtividadesView extends Composite{
	
	private HorizontalPanel hpPainelTituloPaginaCadastrarAtividade;
	private HorizontalPanel hpPainelInformacoesAtividades;
	private HorizontalPanel hpPainelNomeAtividades;
	private HorizontalPanel hpPainelDescricaoAtividades;
	private HorizontalPanel hpPainelTipoAtividade;
	private HorizontalPanel hpPainelMinistranteAtividade;
	private HorizontalPanel hpPainelEmailMinistrante;
	private HorizontalPanel hpPainelDataAtividade;
	private HorizontalPanel hpPainelHoraInicioAtividade;
	private HorizontalPanel hpPainelHoraEncerraAtividade;
	private HorizontalPanel hpPainelNumeroVagasAtividades;
	private HorizontalPanel hpPainelCargaHorariaAtividade;
	private HorizontalPanel hpPainelBotoes;
	private VerticalPanel vpPainelInformacoesAtividades;
	private VerticalPanel vpPainelCadastrarAtividades;
	private Label lbTituloPaginaAtividades;
	private Label lbInformacoesAtividades;
	private Label lbNomeAtividades;
	private Label lbDescricaoAtividades;
	private Label lbTipodeAtividade;
	private Label lbMinistranteAtividade;
	private Label lbEmailMinistrante;
	private Label lbDataAtividade;
	private Label lbHoraInicioAtividade;
	private Label lbHoraEncerraAtividade;
	private Label lbCargaHorariaAtividade;
	private Label lbNumeroVagasAtividade;
	private TextBox tbNomeAtividade;
	private TextBox tbMinistranteAtividade;
	private TextBox tbEmailMinistrante;
	private TextBox tbDataAtividade;
	private TextBox tbHoraInicioAtividade;
	private TextBox tbHoraEncerraAtividade;
	private TextBox tbCargaHorariaAtividade;
	private TextBox tbNumeroVagasAtividades;
	private TextArea taDescricaoAtividades;
	private ListBox listTipodeAtividade;
	private Button btnCadastrarAtividade;
	private Button btnVoltarA;
	
	public CoordenadorCadastrarAtividadesView(){
		//painel titulo pagina-----------------
		hpPainelTituloPaginaCadastrarAtividade = new HorizontalPanel();
		hpPainelTituloPaginaCadastrarAtividade.setStyleName("hpPainelTituloPaginaCadastrarAtividade");
		
		lbTituloPaginaAtividades = new Label("Cadastro de Atividade");
		lbTituloPaginaAtividades.setStyleName("lbTituloPaginaAtividades");
		
		hpPainelTituloPaginaCadastrarAtividade.add(lbTituloPaginaAtividades); //add item
		//-------------------------------------
		//Painel titulo painel---------------------------
		hpPainelInformacoesAtividades = new HorizontalPanel();
		hpPainelInformacoesAtividades.setStyleName("hpPainelInformacoesAtividades");
		
		lbInformacoesAtividades = new Label("Informações");
		lbInformacoesAtividades.setStyleName("lbInformacoesAtividades");
		
		hpPainelInformacoesAtividades.add(lbInformacoesAtividades); //add item
		hpPainelInformacoesAtividades.setCellWidth(lbInformacoesAtividades, "10%");
		//--------------------------------------
		//Painel nome ------------------------------
		hpPainelNomeAtividades = new HorizontalPanel();
		hpPainelNomeAtividades.setStyleName("hpPainelNomeAtividades");
		
		lbNomeAtividades = new Label("Nome:");
		lbNomeAtividades.setStyleName("lbNomeAtividades");
		
		tbNomeAtividade = new TextBox();
		tbNomeAtividade.setStyleName("tbNomeAtividade");
		
		hpPainelNomeAtividades.add(lbNomeAtividades); //add item
		hpPainelNomeAtividades.setCellWidth(lbNomeAtividades, "1%");
		hpPainelNomeAtividades.add(tbNomeAtividade); //add item
		hpPainelNomeAtividades.setCellWidth(tbNomeAtividade, "40%");
		//--------------------------------------
		hpPainelDescricaoAtividades = new HorizontalPanel();
		hpPainelDescricaoAtividades.setStyleName("hpPainelDescricaoAtividades");
		
		lbDescricaoAtividades = new Label("Descrição:");
		lbDescricaoAtividades.setStyleName("lbDescricaoAtividades");
		
		taDescricaoAtividades = new TextArea();
		taDescricaoAtividades.setStyleName("taDescricaoAtividades");
		
		hpPainelDescricaoAtividades.add(lbDescricaoAtividades); //add item
		hpPainelDescricaoAtividades.setCellWidth(lbDescricaoAtividades, "1%");
		hpPainelDescricaoAtividades.add(taDescricaoAtividades); //add item
		hpPainelDescricaoAtividades.setCellWidth(taDescricaoAtividades, "50%");
		//---------------------------------------------
		//-----------------------------------------
		hpPainelTipoAtividade = new HorizontalPanel();
		hpPainelTipoAtividade.setStyleName("hpPainelTipoAtividade");
		
		lbTipodeAtividade = new Label("Tipo de Atividades:");
		lbTipodeAtividade.setStyleName("lbTipodeAtividade");
		
		listTipodeAtividade =  new ListBox();
		listTipodeAtividade.setStyleName("listTipodeAtividade");
		
		hpPainelTipoAtividade.add(lbTipodeAtividade); //add item
		hpPainelTipoAtividade.setCellWidth(lbTipodeAtividade, "1%");
		hpPainelTipoAtividade.add(listTipodeAtividade); //add item
		hpPainelTipoAtividade.setCellWidth(listTipodeAtividade, "25%");
	
		//---------------------------------------------
		hpPainelMinistranteAtividade = new HorizontalPanel();
		hpPainelMinistranteAtividade.setStyleName("hpPainelMinistranteAtividade");
		
		lbMinistranteAtividade = new Label("Ministrante:");
		lbMinistranteAtividade.setStyleName("lbMinistranteAtividade");
		
		tbMinistranteAtividade = new TextBox();
		tbMinistranteAtividade.setStyleName("tbMinistranteAtividade");
		
		hpPainelMinistranteAtividade.add(lbMinistranteAtividade); //add item
		hpPainelMinistranteAtividade.setCellWidth(lbMinistranteAtividade, "1%");
		hpPainelMinistranteAtividade.add(tbMinistranteAtividade); //add item
		hpPainelMinistranteAtividade.setCellWidth(tbMinistranteAtividade, "50%");
		//---------------------------------------------
		//--------------------------------------------
		
		hpPainelEmailMinistrante = new HorizontalPanel();
		hpPainelEmailMinistrante.setStyleName("hpPainelEmailMinistrante");
		
		lbEmailMinistrante = new Label("Email:");
		lbEmailMinistrante.setStyleName("lbEmailMinistrante");
		
		tbEmailMinistrante = new TextBox();
		tbEmailMinistrante.setStyleName("tbEmailMinistrante");
		
		hpPainelEmailMinistrante.add(lbEmailMinistrante);//add item
		hpPainelEmailMinistrante.setCellWidth(lbEmailMinistrante, "1%");
		hpPainelEmailMinistrante.add(tbEmailMinistrante);//add item
		hpPainelEmailMinistrante.setCellWidth(tbEmailMinistrante, "40%;");
		//-------------------------------------------------
		//-----------------------------------------------------
		hpPainelDataAtividade = new HorizontalPanel();
		hpPainelDataAtividade.setStyleName("hpPainelDataAtividade");
		
		lbDataAtividade = new Label("Data:");
		lbDataAtividade.setStyleName("lbDataAtividade");
		
		tbDataAtividade = new TextBox();
		tbDataAtividade.setStyleName("tbDataAtividade");
		
		hpPainelDataAtividade.add(lbDataAtividade);//add item
		hpPainelDataAtividade.setCellWidth(lbDataAtividade, "1%");
		hpPainelDataAtividade.add(tbDataAtividade); //add item
		hpPainelDataAtividade.setCellWidth(tbDataAtividade, "50%");
		//------------------------------------------------------
		
		hpPainelHoraInicioAtividade  = new HorizontalPanel();
		hpPainelHoraInicioAtividade.setStyleName("hpPainelHoraInicioAtividade");
		
		lbHoraInicioAtividade = new Label("Hora de Início:");
		lbHoraInicioAtividade.setStyleName("lbHoraInicioAtividade");
		
		tbHoraInicioAtividade = new TextBox();
		tbHoraInicioAtividade.setStyleName("tbHoraInicioAtividade");
		
		hpPainelHoraInicioAtividade.add(lbHoraInicioAtividade); //add item
		hpPainelHoraInicioAtividade.setCellWidth(lbHoraInicioAtividade, "1%");
		hpPainelHoraInicioAtividade.add(tbHoraInicioAtividade); //add item
		hpPainelHoraInicioAtividade.setCellWidth(tbHoraInicioAtividade, "40%");
		//-----------------------------------------------------
		
		hpPainelHoraEncerraAtividade = new HorizontalPanel();
		hpPainelHoraEncerraAtividade.setStyleName("hpPainelHoraEncerraAtividade");
		
		lbHoraEncerraAtividade = new Label("Hora de Encerramento:");
		lbHoraEncerraAtividade.setStyleName("lbHoraEncerraAtividade"); 
		
		tbHoraEncerraAtividade = new TextBox();
		tbHoraEncerraAtividade.setStyleName("tbHoraEncerraAtividade");
		
		hpPainelHoraEncerraAtividade.add(lbHoraEncerraAtividade); //add item
		hpPainelHoraEncerraAtividade.setCellWidth(lbHoraEncerraAtividade, "7%");
		hpPainelHoraEncerraAtividade.add(tbHoraEncerraAtividade); //add item
		hpPainelHoraEncerraAtividade.setCellWidth(tbHoraEncerraAtividade, "43%");
		//---------------------------------------------------
		//----------------------------------------------------------
		hpPainelCargaHorariaAtividade = new HorizontalPanel();
		hpPainelCargaHorariaAtividade.setStyleName("hpPainelCargaHorariaAtividade");
		
		lbCargaHorariaAtividade = new Label("Carga Horária:");
		lbCargaHorariaAtividade.setStyleName("lbCargaHorariaAtividade");
		
		tbCargaHorariaAtividade = new TextBox();
		tbCargaHorariaAtividade.setStyleName("tbCargaHorariaAtividade");
		
		hpPainelCargaHorariaAtividade.add(lbCargaHorariaAtividade); //add item
		hpPainelCargaHorariaAtividade.setCellWidth(lbCargaHorariaAtividade, "1%");
		hpPainelCargaHorariaAtividade.add(tbCargaHorariaAtividade); //add item
		hpPainelCargaHorariaAtividade.setCellWidth(tbCargaHorariaAtividade, "40%");
		//------------------------------------------------------
		hpPainelNumeroVagasAtividades = new HorizontalPanel();
		hpPainelNumeroVagasAtividades.setStyleName("hpPainelNumeroVagasAtividades");
		
		lbNumeroVagasAtividade = new Label("Número de Vagas:");
		lbNumeroVagasAtividade.setStyleName("lbNumeroVagasAtividade");
		
		tbNumeroVagasAtividades = new TextBox();
		tbNumeroVagasAtividades.setStyleName("tbNumeroVagasAtividades");
		
		hpPainelNumeroVagasAtividades.add(lbNumeroVagasAtividade);//add item
		hpPainelNumeroVagasAtividades.setCellWidth(lbNumeroVagasAtividade, "1%");
		hpPainelNumeroVagasAtividades.add(tbNumeroVagasAtividades); //add item
		hpPainelNumeroVagasAtividades.setCellWidth(tbNumeroVagasAtividades, "40%");
		//--------------------------------------------------------------------
		hpPainelBotoes = new HorizontalPanel();
		hpPainelBotoes.setStyleName("hpPainelBotoes");
		
		btnCadastrarAtividade = new Button("Cadastrar");
		btnCadastrarAtividade.setStyleName("btnCadastrarAtividade");
		
		btnVoltarA = new Button("Voltar");
		btnVoltarA.setStyleName("btnVoltarA");
		
		hpPainelBotoes.add(btnVoltarA);//add item
		hpPainelBotoes.setCellWidth(btnVoltarA, "1%");
		hpPainelBotoes.add(btnCadastrarAtividade);//add item
		hpPainelBotoes.setCellWidth(btnCadastrarAtividade, "50%");
		//----------------------------------------------------------------
		vpPainelInformacoesAtividades = new VerticalPanel();
		vpPainelInformacoesAtividades.setStyleName("vpPainelInformacoesAtividades");
		
		vpPainelInformacoesAtividades.add(hpPainelTituloPaginaCadastrarAtividade);//add 
		vpPainelInformacoesAtividades.add(hpPainelInformacoesAtividades); //add item
		vpPainelInformacoesAtividades.add(hpPainelNomeAtividades);//add item
		vpPainelInformacoesAtividades.add(hpPainelDescricaoAtividades); //add item
		vpPainelInformacoesAtividades.add(hpPainelTipoAtividade);//add item
		vpPainelInformacoesAtividades.add(hpPainelMinistranteAtividade); //add item
		vpPainelInformacoesAtividades.add(hpPainelEmailMinistrante);//add item
		vpPainelInformacoesAtividades.add(hpPainelDataAtividade);//add item
		vpPainelInformacoesAtividades.add(hpPainelHoraInicioAtividade);//add item
		vpPainelInformacoesAtividades.add(hpPainelHoraEncerraAtividade);//add item
		vpPainelInformacoesAtividades.add(hpPainelCargaHorariaAtividade); //add item
		vpPainelInformacoesAtividades.add(hpPainelNumeroVagasAtividades);//add item
		vpPainelInformacoesAtividades.add(hpPainelBotoes);//add item
		
		//-----------------------------------------------------
		//-----------------------------------------------------
		vpPainelCadastrarAtividades = new VerticalPanel();
		vpPainelCadastrarAtividades.setStyleName("vpPainelCadastrarAtividades");
		
	
		vpPainelCadastrarAtividades.add(vpPainelInformacoesAtividades);//add item
		
		initWidget(vpPainelCadastrarAtividades);//inicializa o painel
		GWT.log("chegou aqui na tela cadastro de atividade");
		
	}

	public HorizontalPanel getHpPainelTituloPaginaCadastrarAtividade() {
		return hpPainelTituloPaginaCadastrarAtividade;
	}

	public void setHpPainelTituloPaginaCadastrarAtividade(
			HorizontalPanel hpPainelTituloPaginaCadastrarAtividade) {
		this.hpPainelTituloPaginaCadastrarAtividade = hpPainelTituloPaginaCadastrarAtividade;
	}

	public HorizontalPanel getHpPainelInformacoesAtividades() {
		return hpPainelInformacoesAtividades;
	}

	public void setHpPainelInformacoesAtividades(
			HorizontalPanel hpPainelInformacoesAtividades) {
		this.hpPainelInformacoesAtividades = hpPainelInformacoesAtividades;
	}

	public HorizontalPanel getHpPainelNomeAtividades() {
		return hpPainelNomeAtividades;
	}

	public void setHpPainelNomeAtividades(HorizontalPanel hpPainelNomeAtividades) {
		this.hpPainelNomeAtividades = hpPainelNomeAtividades;
	}

	public HorizontalPanel getHpPainelDescricaoAtividades() {
		return hpPainelDescricaoAtividades;
	}

	public void setHpPainelDescricaoAtividades(
			HorizontalPanel hpPainelDescricaoAtividades) {
		this.hpPainelDescricaoAtividades = hpPainelDescricaoAtividades;
	}

	public HorizontalPanel getHpPainelTipoAtividade() {
		return hpPainelTipoAtividade;
	}

	public void setHpPainelTipoAtividade(HorizontalPanel hpPainelTipoAtividade) {
		this.hpPainelTipoAtividade = hpPainelTipoAtividade;
	}

	public HorizontalPanel getHpPainelMinistranteAtividade() {
		return hpPainelMinistranteAtividade;
	}

	public void setHpPainelMinistranteAtividade(
			HorizontalPanel hpPainelMinistranteAtividade) {
		this.hpPainelMinistranteAtividade = hpPainelMinistranteAtividade;
	}

	public HorizontalPanel getHpPainelDataAtividade() {
		return hpPainelDataAtividade;
	}

	public void setHpPainelDataAtividade(HorizontalPanel hpPainelDataAtividade) {
		this.hpPainelDataAtividade = hpPainelDataAtividade;
	}

	public HorizontalPanel getHpPainelHoraInicioAtividade() {
		return hpPainelHoraInicioAtividade;
	}

	public void setHpPainelHoraInicioAtividade(
			HorizontalPanel hpPainelHoraInicioAtividade) {
		this.hpPainelHoraInicioAtividade = hpPainelHoraInicioAtividade;
	}

	public HorizontalPanel getHpPainelHoraEncerraAtividade() {
		return hpPainelHoraEncerraAtividade;
	}

	public void setHpPainelHoraEncerraAtividade(
			HorizontalPanel hpPainelHoraEncerraAtividade) {
		this.hpPainelHoraEncerraAtividade = hpPainelHoraEncerraAtividade;
	}

	public HorizontalPanel getHpPainelNumeroVagasAtividades() {
		return hpPainelNumeroVagasAtividades;
	}

	public void setHpPainelNumeroVagasAtividades(
			HorizontalPanel hpPainelNumeroVagasAtividades) {
		this.hpPainelNumeroVagasAtividades = hpPainelNumeroVagasAtividades;
	}

	public HorizontalPanel getHpPainelCargaHorariaAtividade() {
		return hpPainelCargaHorariaAtividade;
	}

	public void setHpPainelCargaHorariaAtividade(
			HorizontalPanel hpPainelCargaHorariaAtividade) {
		this.hpPainelCargaHorariaAtividade = hpPainelCargaHorariaAtividade;
	}

	public VerticalPanel getVpPainelInformacoesAtividades() {
		return vpPainelInformacoesAtividades;
	}

	public void setVpPainelInformacoesAtividades(
			VerticalPanel vpPainelInformacoesAtividades) {
		this.vpPainelInformacoesAtividades = vpPainelInformacoesAtividades;
	}

	public VerticalPanel getVpPainelCadastrarAtividades() {
		return vpPainelCadastrarAtividades;
	}

	public void setVpPainelCadastrarAtividades(
			VerticalPanel vpPainelCadastrarAtividades) {
		this.vpPainelCadastrarAtividades = vpPainelCadastrarAtividades;
	}

	public Label getLbTituloPaginaAtividades() {
		return lbTituloPaginaAtividades;
	}

	public void setLbTituloPaginaAtividades(Label lbTituloPaginaAtividades) {
		this.lbTituloPaginaAtividades = lbTituloPaginaAtividades;
	}

	public Label getLbInformacoesAtividades() {
		return lbInformacoesAtividades;
	}

	public void setLbInformacoesAtividades(Label lbInformacoesAtividades) {
		this.lbInformacoesAtividades = lbInformacoesAtividades;
	}

	public Label getLbNomeAtividades() {
		return lbNomeAtividades;
	}

	public void setLbNomeAtividades(Label lbNomeAtividades) {
		this.lbNomeAtividades = lbNomeAtividades;
	}

	public Label getLbDescricaoAtividades() {
		return lbDescricaoAtividades;
	}

	public void setLbDescricaoAtividades(Label lbDescricaoAtividades) {
		this.lbDescricaoAtividades = lbDescricaoAtividades;
	}

	public Label getLbTipodeAtividade() {
		return lbTipodeAtividade;
	}

	public void setLbTipodeAtividade(Label lbTipodeAtividade) {
		this.lbTipodeAtividade = lbTipodeAtividade;
	}

	public Label getLbMinistranteAtividade() {
		return lbMinistranteAtividade;
	}

	public void setLbMinistranteAtividade(Label lbMinistranteAtividade) {
		this.lbMinistranteAtividade = lbMinistranteAtividade;
	}

	public Label getLbDataAtividade() {
		return lbDataAtividade;
	}

	public void setLbDataAtividade(Label lbDataAtividade) {
		this.lbDataAtividade = lbDataAtividade;
	}

	public Label getLbHoraInicioAtividade() {
		return lbHoraInicioAtividade;
	}

	public void setLbHoraInicioAtividade(Label lbHoraInicioAtividade) {
		this.lbHoraInicioAtividade = lbHoraInicioAtividade;
	}

	public Label getLbHoraEncerraAtividade() {
		return lbHoraEncerraAtividade;
	}

	public void setLbHoraEncerraAtividade(Label lbHoraEncerraAtividade) {
		this.lbHoraEncerraAtividade = lbHoraEncerraAtividade;
	}

	public Label getLbCargaHorariaAtividade() {
		return lbCargaHorariaAtividade;
	}

	public void setLbCargaHorariaAtividade(Label lbCargaHorariaAtividade) {
		this.lbCargaHorariaAtividade = lbCargaHorariaAtividade;
	}

	public Label getLbNumeroVagasAtividade() {
		return lbNumeroVagasAtividade;
	}

	public void setLbNumeroVagasAtividade(Label lbNumeroVagasAtividade) {
		this.lbNumeroVagasAtividade = lbNumeroVagasAtividade;
	}

	public TextBox getTbNomeAtividade() {
		return tbNomeAtividade;
	}

	public void setTbNomeAtividade(TextBox tbNomeAtividade) {
		this.tbNomeAtividade = tbNomeAtividade;
	}

	public TextBox getTbMinistranteAtividade() {
		return tbMinistranteAtividade;
	}

	public void setTbMinistranteAtividade(TextBox tbMinistranteAtividade) {
		this.tbMinistranteAtividade = tbMinistranteAtividade;
	}

	public TextBox getTbDataAtividade() {
		return tbDataAtividade;
	}

	public void setTbDataAtividade(TextBox tbDataAtividade) {
		this.tbDataAtividade = tbDataAtividade;
	}

	public TextBox getTbHoraInicioAtividade() {
		return tbHoraInicioAtividade;
	}

	public void setTbHoraInicioAtividade(TextBox tbHoraInicioAtividade) {
		this.tbHoraInicioAtividade = tbHoraInicioAtividade;
	}

	public TextBox getTbHoraEncerraAtividade() {
		return tbHoraEncerraAtividade;
	}

	public void setTbHoraEncerraAtividade(TextBox tbHoraEncerraAtividade) {
		this.tbHoraEncerraAtividade = tbHoraEncerraAtividade;
	}

	public TextBox getTbCargaHorariaAtividade() {
		return tbCargaHorariaAtividade;
	}

	public void setTbCargaHorariaAtividade(TextBox tbCargaHorariaAtividade) {
		this.tbCargaHorariaAtividade = tbCargaHorariaAtividade;
	}

	public TextBox getTbNumeroVagasAtividades() {
		return tbNumeroVagasAtividades;
	}

	public void setTbNumeroVagasAtividades(TextBox tbNumeroVagasAtividades) {
		this.tbNumeroVagasAtividades = tbNumeroVagasAtividades;
	}

	public TextArea getTaDescricaoAtividades() {
		return taDescricaoAtividades;
	}

	public void setTaDescricaoAtividades(TextArea taDescricaoAtividades) {
		this.taDescricaoAtividades = taDescricaoAtividades;
	}

	public ListBox getListTipodeAtividade() {
		return listTipodeAtividade;
	}

	public void setListTipodeAtividade(ListBox listTipodeAtividade) {
		this.listTipodeAtividade = listTipodeAtividade;
	}

	public HorizontalPanel getHpPainelEmailMinistrante() {
		return hpPainelEmailMinistrante;
	}

	public void setHpPainelEmailMinistrante(HorizontalPanel hpPainelEmailMinistrante) {
		this.hpPainelEmailMinistrante = hpPainelEmailMinistrante;
	}

	public HorizontalPanel getHpPainelBotoes() {
		return hpPainelBotoes;
	}

	public void setHpPainelBotoes(HorizontalPanel hpPainelBotoes) {
		this.hpPainelBotoes = hpPainelBotoes;
	}

	public Label getLbEmailMinistrante() {
		return lbEmailMinistrante;
	}

	public void setLbEmailMinistrante(Label lbEmailMinistrante) {
		this.lbEmailMinistrante = lbEmailMinistrante;
	}

	public TextBox getTbEmailMinistrante() {
		return tbEmailMinistrante;
	}

	public void setTbEmailMinistrante(TextBox tbEmailMinistrante) {
		this.tbEmailMinistrante = tbEmailMinistrante;
	}

	public Button getBtnCadastrarAtividade() {
		return btnCadastrarAtividade;
	}

	public void setBtnCadastrarAtividade(Button btnCadastrarAtividade) {
		this.btnCadastrarAtividade = btnCadastrarAtividade;
	}

	public Button getBtnVoltarA() {
		return btnVoltarA;
	}

	public void setBtnVoltarA(Button btnVoltarA) {
		this.btnVoltarA = btnVoltarA;
	}
	
	
}
