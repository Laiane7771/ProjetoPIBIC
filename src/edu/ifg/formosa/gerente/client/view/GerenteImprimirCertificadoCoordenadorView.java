package edu.ifg.formosa.gerente.client.view;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.dev.jjs.impl.GwtAstBuilder;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class GerenteImprimirCertificadoCoordenadorView extends Composite {

	private HorizontalPanel hpPainelTituloCertificadosCoordenador;
	private HorizontalPanel hpPainelPesquisarCertificadoCoordenador;
	private HorizontalPanel hpPainelTabelaCertificadoCoordenador;
	private VerticalPanel vpPainelImprimirCertificadoCoordenador;
	private VerticalPanel vpPainelAreaTotalImprimirCertificadoCoordenador;
	private Label lbTituloCertificadosCoordenador;
	private TextBox tbPesquisarParticipanteCertificado;
	private Button btnPesquisarCoordenadoresCertificado;
	private Button btnGerarTodosCertificadosCoordenador;
	private FlexTable ftTabelaParticipantesCertificado;
	
	
	public GerenteImprimirCertificadoCoordenadorView(){
		
		//--------Painel titulo da Pagina------------
		hpPainelTituloCertificadosCoordenador  = new HorizontalPanel();
		hpPainelTituloCertificadosCoordenador.setStyleName("hpPainelTituloCertificadosCoordenador");
		
		lbTituloCertificadosCoordenador = new Label("Certificados");
		lbTituloCertificadosCoordenador.setStyleName("lbTituloCertificadosCoordenador");
		
		hpPainelTituloCertificadosCoordenador.add(lbTituloCertificadosCoordenador);//add item
		
		GWT.log("INSERE TITULO");
		//---Painel pesquisar Certificado-------------------
		hpPainelPesquisarCertificadoCoordenador = new HorizontalPanel();
		hpPainelPesquisarCertificadoCoordenador.setStyleName("hpPainelPesquisarCertificadoCoordenador");

		tbPesquisarParticipanteCertificado = new TextBox();
		tbPesquisarParticipanteCertificado.setStyleName("tbPesquisarParticipanteCertificado");
		
		btnPesquisarCoordenadoresCertificado = new Button("Pesquisar");
		btnPesquisarCoordenadoresCertificado.setStyleName("btnPesquisarCoordenadoresCertificado");
		
		btnGerarTodosCertificadosCoordenador = new Button("Gerar Todos");
		btnGerarTodosCertificadosCoordenador.setStyleName("btnGerarTodosCertificadosCoordenador");
		
		hpPainelPesquisarCertificadoCoordenador.add(tbPesquisarParticipanteCertificado); //add item
		hpPainelPesquisarCertificadoCoordenador.setCellWidth(tbPesquisarParticipanteCertificado, "60%");
		hpPainelPesquisarCertificadoCoordenador.add(btnPesquisarCoordenadoresCertificado);// add item
		hpPainelPesquisarCertificadoCoordenador.setCellWidth(btnPesquisarCoordenadoresCertificado, "10%");
		hpPainelPesquisarCertificadoCoordenador.add(btnGerarTodosCertificadosCoordenador); //add item
		hpPainelPesquisarCertificadoCoordenador.setCellWidth(btnGerarTodosCertificadosCoordenador, "25%");
		
		GWT.log("Insere painel pesquisar");
		//----Painel Tabela de certificados---------------------
		hpPainelTabelaCertificadoCoordenador = new HorizontalPanel();
		hpPainelTabelaCertificadoCoordenador.setStyleName("hpPainelTabelaCertificadoCoordenador");
		
		ftTabelaParticipantesCertificado = new FlexTable();
		ftTabelaParticipantesCertificado.setStyleName("ftTabelaParticipantesCertificado");
		
		hpPainelTabelaCertificadoCoordenador.add(ftTabelaParticipantesCertificado);//add item
		
		GWT.log("Insere tabela Certificados");
		//----------Painel SubMae-------------------------------
		vpPainelImprimirCertificadoCoordenador = new VerticalPanel();
		vpPainelImprimirCertificadoCoordenador.setStyleName("vpPainelImprimirCertificadoCoordenador");
		
		vpPainelImprimirCertificadoCoordenador.add(hpPainelTituloCertificadosCoordenador);// add item
		vpPainelImprimirCertificadoCoordenador.add(hpPainelPesquisarCertificadoCoordenador); //add item
		vpPainelImprimirCertificadoCoordenador.add(hpPainelTabelaCertificadoCoordenador); //add item
		
		GWT.log("add os horizontalpanel");
		//-----------Painel Mae-----------------------------------
		vpPainelAreaTotalImprimirCertificadoCoordenador = new VerticalPanel();
		vpPainelAreaTotalImprimirCertificadoCoordenador.setStyleName("vpPainelAreaTotalImprimirCertificadoCoordenador");
		
		vpPainelAreaTotalImprimirCertificadoCoordenador.add(vpPainelImprimirCertificadoCoordenador); //add item
		
		initWidget(vpPainelAreaTotalImprimirCertificadoCoordenador);
		
		GWT.log("inicializa o painel mae");
		
	
	}


	public HorizontalPanel getHpPainelTituloCertificadosCoordenador() {
		return hpPainelTituloCertificadosCoordenador;
	}


	public void setHpPainelTituloCertificadosCoordenador(
			HorizontalPanel hpPainelTituloCertificadosCoordenador) {
		this.hpPainelTituloCertificadosCoordenador = hpPainelTituloCertificadosCoordenador;
	}


	public HorizontalPanel getHpPainelPesquisarCertificadoCoordenador() {
		return hpPainelPesquisarCertificadoCoordenador;
	}


	public void setHpPainelPesquisarCertificadoCoordenador(
			HorizontalPanel hpPainelPesquisarCertificadoCoordenador) {
		this.hpPainelPesquisarCertificadoCoordenador = hpPainelPesquisarCertificadoCoordenador;
	}


	public HorizontalPanel getHpPainelTabelaCertificadoCoordenador() {
		return hpPainelTabelaCertificadoCoordenador;
	}


	public void setHpPainelTabelaCertificadoCoordenador(
			HorizontalPanel hpPainelTabelaCertificadoCoordenador) {
		this.hpPainelTabelaCertificadoCoordenador = hpPainelTabelaCertificadoCoordenador;
	}


	public VerticalPanel getVpPainelImprimirCertificadoCoordenador() {
		return vpPainelImprimirCertificadoCoordenador;
	}


	public void setVpPainelImprimirCertificadoCoordenador(
			VerticalPanel vpPainelImprimirCertificadoCoordenador) {
		this.vpPainelImprimirCertificadoCoordenador = vpPainelImprimirCertificadoCoordenador;
	}


	public VerticalPanel getVpPainelAreaTotalImprimirCertificadoCoordenador() {
		return vpPainelAreaTotalImprimirCertificadoCoordenador;
	}


	public void setVpPainelAreaTotalImprimirCertificadoCoordenador(
			VerticalPanel vpPainelAreaTotalImprimirCertificadoCoordenador) {
		this.vpPainelAreaTotalImprimirCertificadoCoordenador = vpPainelAreaTotalImprimirCertificadoCoordenador;
	}


	public Label getLbTituloCertificadosCoordenador() {
		return lbTituloCertificadosCoordenador;
	}


	public void setLbTituloCertificadosCoordenador(
			Label lbTituloCertificadosCoordenador) {
		this.lbTituloCertificadosCoordenador = lbTituloCertificadosCoordenador;
	}


	public TextBox getTbPesquisarParticipanteCertificado() {
		return tbPesquisarParticipanteCertificado;
	}


	public void setTbPesquisarParticipanteCertificado(
			TextBox tbPesquisarParticipanteCertificado) {
		this.tbPesquisarParticipanteCertificado = tbPesquisarParticipanteCertificado;
	}


	public Button getBtnPesquisarCoordenadoresCertificado() {
		return btnPesquisarCoordenadoresCertificado;
	}


	public void setBtnPesquisarCoordenadoresCertificado(
			Button btnPesquisarCoordenadoresCertificado) {
		this.btnPesquisarCoordenadoresCertificado = btnPesquisarCoordenadoresCertificado;
	}


	public Button getBtnGerarTodosCertificadosCoordenador() {
		return btnGerarTodosCertificadosCoordenador;
	}


	public void setBtnGerarTodosCertificadosCoordenador(
			Button btnGerarTodosCertificadosCoordenador) {
		this.btnGerarTodosCertificadosCoordenador = btnGerarTodosCertificadosCoordenador;
	}


	public FlexTable getFtTabelaParticipantesCertificado() {
		return ftTabelaParticipantesCertificado;
	}


	public void setFtTabelaParticipantesCertificado(
			FlexTable ftTabelaParticipantesCertificado) {
		this.ftTabelaParticipantesCertificado = ftTabelaParticipantesCertificado;
	}
	
}
