package edu.ifg.formosa.coordenador.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CoordenadorVisualizarPercentualParticipanteView extends Composite{

	
	private HorizontalPanel hpPainelTituloPaginaFrequencia;
	private HorizontalPanel hpPainelNomeParticipante;
	private HorizontalPanel hpPainelAtividadeParticipante;
	private HorizontalPanel hpPainelTabelaFrequenciaParticipante;
	private HorizontalPanel hpPainelTextBoxeButton;
	private VerticalPanel vpPainelGuardaInformacoesFrequencia;
	private VerticalPanel vpPainelVizualizarPercentualParticipante;
	private Label lbTituloPaginaFrequencia;
	private Label lbNomeParticipante;
	private Label lbAtividadeParticipante;
	private TextBox tbPesquisarParticipanteFrequencia;
	private Button btnPesquisarParticipanteFrequencia;
	private FlexTable ftTabelaFrequenciaParticipantes;
	
	
	public CoordenadorVisualizarPercentualParticipanteView(){
		//-----------------Titulo Pagina-------------------------------------
		hpPainelTituloPaginaFrequencia = new HorizontalPanel();
		hpPainelTituloPaginaFrequencia.setStyleName("hpPainelTituloPaginaFrequencia");
		
		lbTituloPaginaFrequencia = new Label("Frequência");
		lbTituloPaginaFrequencia.setStyleName("lbTituloPaginaFrequencia");
		
		hpPainelTituloPaginaFrequencia.add(lbTituloPaginaFrequencia);//add item
		//-----------------------Painel de Pesquisar-----------------------------
		//----------------------------------------------------------------------
		hpPainelTextBoxeButton = new HorizontalPanel();
		hpPainelTextBoxeButton.setStyleName("hpPainelTextBoxeButton");
		
		tbPesquisarParticipanteFrequencia = new TextBox();
		tbPesquisarParticipanteFrequencia.setStyleName("tbPesquisarParticipanteFrequencia");
		
		btnPesquisarParticipanteFrequencia = new Button("Pesquisar");
		btnPesquisarParticipanteFrequencia.setStyleName("btnPesquisarParticipanteFrequencia");
		
		hpPainelTextBoxeButton.add(tbPesquisarParticipanteFrequencia);//addItem
		hpPainelTextBoxeButton.setCellWidth(tbPesquisarParticipanteFrequencia, "50%");
		hpPainelTextBoxeButton.add(btnPesquisarParticipanteFrequencia);//add item
		hpPainelTextBoxeButton.setCellWidth(btnPesquisarParticipanteFrequencia, "50%");
		
		
		//-----------------------------------------------------------------------
		//-------------------------Nome Participante------------------------------
		hpPainelNomeParticipante = new HorizontalPanel();
		hpPainelNomeParticipante.setStyleName("hpPainelNomeParticipante");
		
		lbNomeParticipante = new Label("Nome:");
		lbNomeParticipante.setStyleName("lbNomeParticipante");
		
		hpPainelNomeParticipante.add(lbNomeParticipante);//add item
		
		//------------------------------------------------------------------
		//-----------------------Menu Atividade--------------------------------
		hpPainelAtividadeParticipante = new HorizontalPanel();
		hpPainelAtividadeParticipante.setStyleName("hpPainelAtividadeParticipante");
		
		lbAtividadeParticipante = new Label("Atividades:");
		lbAtividadeParticipante.setStyleName("lbAtividadeParticipante");
		
		hpPainelAtividadeParticipante.add(lbAtividadeParticipante);//add item
		//---------------------------------------------------------------------
		//------------------------Tabela de Frequencia-------------------------
		hpPainelTabelaFrequenciaParticipante = new HorizontalPanel();
		hpPainelTabelaFrequenciaParticipante.setStyleName("hpPainelTabelaFrequenciaParticipante");
		
		ftTabelaFrequenciaParticipantes = new FlexTable();
		ftTabelaFrequenciaParticipantes.setStyleName("ftTabelaFrequenciaParticipantes");
		
		hpPainelTabelaFrequenciaParticipante.add(ftTabelaFrequenciaParticipantes);//add item
		//--------------------------Painel Mae-----------------------------------
		//-------------------------------------------------------------------------
		vpPainelGuardaInformacoesFrequencia = new VerticalPanel();
		vpPainelGuardaInformacoesFrequencia.setStyleName("vpPainelGuardaInformacoesFrequencia");
		
		vpPainelGuardaInformacoesFrequencia.add(hpPainelNomeParticipante);
		vpPainelGuardaInformacoesFrequencia.add(hpPainelAtividadeParticipante);
		
		vpPainelVizualizarPercentualParticipante = new VerticalPanel();
		vpPainelVizualizarPercentualParticipante.setStyleName("vpPainelVizualizarPercentualParticipante");
		
		vpPainelVizualizarPercentualParticipante.add(hpPainelTituloPaginaFrequencia);//add item
		vpPainelVizualizarPercentualParticipante.add(hpPainelTextBoxeButton);//add item
		vpPainelVizualizarPercentualParticipante.add(vpPainelGuardaInformacoesFrequencia);//add item
		vpPainelVizualizarPercentualParticipante.add(hpPainelTabelaFrequenciaParticipante);//add item
		
		initWidget(vpPainelVizualizarPercentualParticipante);///inicializa
	}


	public HorizontalPanel getHpPainelTituloPaginaFrequencia() {
		return hpPainelTituloPaginaFrequencia;
	}


	public void setHpPainelTituloPaginaFrequencia(
			HorizontalPanel hpPainelTituloPaginaFrequencia) {
		this.hpPainelTituloPaginaFrequencia = hpPainelTituloPaginaFrequencia;
	}


	public HorizontalPanel getHpPainelNomeParticipante() {
		return hpPainelNomeParticipante;
	}


	public void setHpPainelNomeParticipante(HorizontalPanel hpPainelNomeParticipante) {
		this.hpPainelNomeParticipante = hpPainelNomeParticipante;
	}


	public HorizontalPanel getHpPainelAtividadeParticipante() {
		return hpPainelAtividadeParticipante;
	}


	public void setHpPainelAtividadeParticipante(
			HorizontalPanel hpPainelAtividadeParticipante) {
		this.hpPainelAtividadeParticipante = hpPainelAtividadeParticipante;
	}


	public HorizontalPanel getHpPainelTabelaFrequenciaParticipante() {
		return hpPainelTabelaFrequenciaParticipante;
	}


	public void setHpPainelTabelaFrequenciaParticipante(
			HorizontalPanel hpPainelTabelaFrequenciaParticipante) {
		this.hpPainelTabelaFrequenciaParticipante = hpPainelTabelaFrequenciaParticipante;
	}


	public VerticalPanel getVpPainelGuardaInformacoesFrequencia() {
		return vpPainelGuardaInformacoesFrequencia;
	}


	public void setVpPainelGuardaInformacoesFrequencia(
			VerticalPanel vpPainelGuardaInformacoesFrequencia) {
		this.vpPainelGuardaInformacoesFrequencia = vpPainelGuardaInformacoesFrequencia;
	}


	public VerticalPanel getVpPainelVizualizarPercentualParticipante() {
		return vpPainelVizualizarPercentualParticipante;
	}


	public void setVpPainelVizualizarPercentualParticipante(
			VerticalPanel vpPainelVizualizarPercentualParticipante) {
		this.vpPainelVizualizarPercentualParticipante = vpPainelVizualizarPercentualParticipante;
	}


	public Label getLbTituloPaginaFrequencia() {
		return lbTituloPaginaFrequencia;
	}


	public void setLbTituloPaginaFrequencia(Label lbTituloPaginaFrequencia) {
		this.lbTituloPaginaFrequencia = lbTituloPaginaFrequencia;
	}


	public Label getLbNomeParticipante() {
		return lbNomeParticipante;
	}


	public void setLbNomeParticipante(Label lbNomeParticipante) {
		this.lbNomeParticipante = lbNomeParticipante;
	}


	public Label getLbAtividadeParticipante() {
		return lbAtividadeParticipante;
	}


	public void setLbAtividadeParticipante(Label lbAtividadeParticipante) {
		this.lbAtividadeParticipante = lbAtividadeParticipante;
	}


	public FlexTable getFtTabelaFrequenciaParticipantes() {
		return ftTabelaFrequenciaParticipantes;
	}


	public void setFtTabelaFrequenciaParticipantes(
			FlexTable ftTabelaFrequenciaParticipantes) {
		this.ftTabelaFrequenciaParticipantes = ftTabelaFrequenciaParticipantes;
	}
	
}
