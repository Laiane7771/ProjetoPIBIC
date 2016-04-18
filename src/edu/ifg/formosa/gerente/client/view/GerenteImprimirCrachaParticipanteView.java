package edu.ifg.formosa.gerente.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class GerenteImprimirCrachaParticipanteView extends Composite {
	
	private HorizontalPanel hpPainelTituloCrachaParticipante;
	private HorizontalPanel hpPainelPesquisarImprimirCrachaParticipante;
	private HorizontalPanel hpPainelTabelaCrachasParticipantes;
	private VerticalPanel vpPainelImprimirCracha;
	private VerticalPanel vpPainelAreaTotalCrachaParticipante;
	private Label lbCrachasParticipantes;
	private TextBox tbPesquisarParticipanteCracha;
	private Button btnPesquisarParticipantesCracha;
	private Button btnGerarTodosCrachasParticipantes;
	private FlexTable ftTabelaCrachasParticipantes;
	
	public GerenteImprimirCrachaParticipanteView(){
		//area titulo-------------------------------------
		hpPainelTituloCrachaParticipante = new HorizontalPanel();
		hpPainelTituloCrachaParticipante.setStyleName("hpPainelTituloCrachaParticipante");
		
		lbCrachasParticipantes = new Label("Crachás");
		lbCrachasParticipantes.setStyleName("lbCrachasParticipantes");
		
		hpPainelTituloCrachaParticipante.add(lbCrachasParticipantes); //add item
		
		//area Pesquisar Participantes--------------------------
		
		hpPainelPesquisarImprimirCrachaParticipante = new HorizontalPanel();
		hpPainelPesquisarImprimirCrachaParticipante.setStyleName("hpPainelPesquisarImprimirCrachaParticipante");
		
		tbPesquisarParticipanteCracha = new TextBox();
		tbPesquisarParticipanteCracha.setStyleName("tbPesquisarParticipanteCracha");
		
		btnPesquisarParticipantesCracha = new Button("Pesquisar");
		btnPesquisarParticipantesCracha.setStyleName("btnPesquisarParticipantesCracha");
		
		btnGerarTodosCrachasParticipantes = new Button("Gerar Todos");
		btnGerarTodosCrachasParticipantes.setStyleName("btnGerarTodosCrachasParticipantes");
		
		hpPainelPesquisarImprimirCrachaParticipante.add(tbPesquisarParticipanteCracha); //add item
		hpPainelPesquisarImprimirCrachaParticipante.add(btnPesquisarParticipantesCracha); //add item
		hpPainelPesquisarImprimirCrachaParticipante.add(btnGerarTodosCrachasParticipantes); //add item
		
		//area tabela de Participantes--------------------------
		hpPainelTabelaCrachasParticipantes = new HorizontalPanel();
		hpPainelTabelaCrachasParticipantes.setStyleName("hpPainelTabelaCrachasParticipantes");
		
		ftTabelaCrachasParticipantes = new FlexTable();
		ftTabelaCrachasParticipantes.setStyleName("ftTabelaCrachasParticipantes");
		
		hpPainelTabelaCrachasParticipantes.add(ftTabelaCrachasParticipantes);//add item
		//---------------Painel subMae-----------------------------
		vpPainelImprimirCracha = new VerticalPanel();
		vpPainelImprimirCracha.setStyleName("vpPainelImprimirCracha");
		
		vpPainelImprimirCracha.add(hpPainelTituloCrachaParticipante); //add item
		vpPainelImprimirCracha.add(hpPainelPesquisarImprimirCrachaParticipante); //add item
		vpPainelImprimirCracha.add(hpPainelTabelaCrachasParticipantes); //add item
		
		//---------------Painel Mae--------------------------------
		vpPainelAreaTotalCrachaParticipante = new VerticalPanel();
		vpPainelAreaTotalCrachaParticipante.setStyleName("vpPainelAreaTotalCrachaParticipante");
		
		vpPainelAreaTotalCrachaParticipante.add(vpPainelImprimirCracha); //add item
		
		initWidget(vpPainelAreaTotalCrachaParticipante);
		
	}

	public HorizontalPanel getHpPainelTituloCrachaParticipante() {
		return hpPainelTituloCrachaParticipante;
	}

	public void setHpPainelTituloCrachaParticipante(
			HorizontalPanel hpPainelTituloCrachaParticipante) {
		this.hpPainelTituloCrachaParticipante = hpPainelTituloCrachaParticipante;
	}

	public HorizontalPanel getHpPainelPesquisarImprimirCrachaParticipante() {
		return hpPainelPesquisarImprimirCrachaParticipante;
	}

	public void setHpPainelPesquisarImprimirCrachaParticipante(
			HorizontalPanel hpPainelPesquisarImprimirCrachaParticipante) {
		this.hpPainelPesquisarImprimirCrachaParticipante = hpPainelPesquisarImprimirCrachaParticipante;
	}

	public HorizontalPanel getHpPainelTabelaCrachasParticipantes() {
		return hpPainelTabelaCrachasParticipantes;
	}

	public void setHpPainelTabelaCrachasParticipantes(
			HorizontalPanel hpPainelTabelaCrachasParticipantes) {
		this.hpPainelTabelaCrachasParticipantes = hpPainelTabelaCrachasParticipantes;
	}

	public VerticalPanel getVpPainelImprimirCracha() {
		return vpPainelImprimirCracha;
	}

	public void setVpPainelImprimirCracha(VerticalPanel vpPainelImprimirCracha) {
		this.vpPainelImprimirCracha = vpPainelImprimirCracha;
	}

	public VerticalPanel getVpPainelAreaTotalCrachaParticipante() {
		return vpPainelAreaTotalCrachaParticipante;
	}

	public void setVpPainelAreaTotalCrachaParticipante(
			VerticalPanel vpPainelAreaTotalCrachaParticipante) {
		this.vpPainelAreaTotalCrachaParticipante = vpPainelAreaTotalCrachaParticipante;
	}

	public Label getLbCrachasParticipantes() {
		return lbCrachasParticipantes;
	}

	public void setLbCrachasParticipantes(Label lbCrachasParticipantes) {
		this.lbCrachasParticipantes = lbCrachasParticipantes;
	}

	public TextBox getTbPesquisarParticipanteCracha() {
		return tbPesquisarParticipanteCracha;
	}

	public void setTbPesquisarParticipanteCracha(
			TextBox tbPesquisarParticipanteCracha) {
		this.tbPesquisarParticipanteCracha = tbPesquisarParticipanteCracha;
	}

	public Button getBtnPesquisarParticipantesCracha() {
		return btnPesquisarParticipantesCracha;
	}

	public void setBtnPesquisarParticipantesCracha(
			Button btnPesquisarParticipantesCracha) {
		this.btnPesquisarParticipantesCracha = btnPesquisarParticipantesCracha;
	}

	public Button getBtnGerarTodosCrachasParticipantes() {
		return btnGerarTodosCrachasParticipantes;
	}

	public void setBtnGerarTodosCrachasParticipantes(
			Button btnGerarTodosCrachasParticipantes) {
		this.btnGerarTodosCrachasParticipantes = btnGerarTodosCrachasParticipantes;
	}

	public FlexTable getFtTabelaCrachasParticipantes() {
		return ftTabelaCrachasParticipantes;
	}

	public void setFtTabelaCrachasParticipantes(
			FlexTable ftTabelaCrachasParticipantes) {
		this.ftTabelaCrachasParticipantes = ftTabelaCrachasParticipantes;
	}

}
