package edu.ifg.formosa.gerente.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class GerenteImprimirCertificadoParticipanteView extends Composite{

	private HorizontalPanel hpPainelTituloCertificadosParticipantes;
	private HorizontalPanel hpPainelPesquisarParticipanteCertificado;
	private HorizontalPanel hpPainelTabelaCertificadosParticipantes;
	private VerticalPanel vpPainelImprimirCertificados;
	private VerticalPanel vpPainelAreaTotalImprimirCertificados;
	private Label lbTituloPaginaCertificadosParticipantes;
	private Button btnPesquisarParticipantesCertificados;
	private Button btnGerarTodosCertificadosParticipante;
	private TextBox tbPesquisarParticipantesCertificados;
	private FlexTable ftTabelaCertificadosParticipantes;
	

	public GerenteImprimirCertificadoParticipanteView(){
		//area titulo pagina---------------------------
		hpPainelTituloCertificadosParticipantes = new HorizontalPanel();
		hpPainelTituloCertificadosParticipantes.setStyleName("hpPainelTituloCertificadosParticipantes");
		
		lbTituloPaginaCertificadosParticipantes = new Label("Certificados");
		lbTituloPaginaCertificadosParticipantes.setStyleName("lbTituloPaginaCertificadosParticipantes");
		
		hpPainelTituloCertificadosParticipantes.add(lbTituloPaginaCertificadosParticipantes); //add item
		
		//area pesquisar participante-----------------------
		hpPainelPesquisarParticipanteCertificado = new HorizontalPanel();
		hpPainelPesquisarParticipanteCertificado.setStyleName("hpPainelPesquisarParticipanteCertificado");
		
		tbPesquisarParticipantesCertificados = new TextBox();
		tbPesquisarParticipantesCertificados.setStyleName("tbPesquisarParticipantesCertificados");
		
		btnPesquisarParticipantesCertificados = new Button("Pesquisar");
		btnPesquisarParticipantesCertificados.setStyleName("btnPesquisarParticipantesCertificados"); //add item
		
		btnGerarTodosCertificadosParticipante = new Button("Gerar Todos");
		btnGerarTodosCertificadosParticipante.setStyleName("btnGerarTodosCertificadosParticipante"); //add item
		
		hpPainelPesquisarParticipanteCertificado.add(tbPesquisarParticipantesCertificados);//add item
		hpPainelPesquisarParticipanteCertificado.add(btnPesquisarParticipantesCertificados); //add item
		hpPainelPesquisarParticipanteCertificado.add(btnGerarTodosCertificadosParticipante); //add item
		
		//area tabela de participantes---------------------------
		hpPainelTabelaCertificadosParticipantes = new HorizontalPanel();
		hpPainelTabelaCertificadosParticipantes.setStyleName("hpPainelTabelaCertificadosParticipantes");
		
		ftTabelaCertificadosParticipantes = new FlexTable();
		ftTabelaCertificadosParticipantes.setStyleName("ftTabelaCertificadosParticipantes");
		
		hpPainelTabelaCertificadosParticipantes.add(ftTabelaCertificadosParticipantes); //add item
		
		// painel  subMae--------------------------------
		vpPainelImprimirCertificados = new VerticalPanel();
		vpPainelImprimirCertificados.setStyleName("vpPainelImprimirCertificados");
		
		vpPainelImprimirCertificados.add(hpPainelTituloCertificadosParticipantes); //add item
		vpPainelImprimirCertificados.add(hpPainelPesquisarParticipanteCertificado); //add item
		vpPainelImprimirCertificados.add(hpPainelTabelaCertificadosParticipantes); //add item
		
		//Painel Mae--------------------------------------
		vpPainelAreaTotalImprimirCertificados = new VerticalPanel();
		vpPainelAreaTotalImprimirCertificados.setStyleName("vpPainelAreaTotalImprimirCertificados");
		
		vpPainelAreaTotalImprimirCertificados.add(vpPainelImprimirCertificados); //add item
		
		initWidget(vpPainelAreaTotalImprimirCertificados);// inicializa
		
	}


	public HorizontalPanel getHpPainelTituloCertificadosParticipantes() {
		return hpPainelTituloCertificadosParticipantes;
	}


	public void setHpPainelTituloCertificadosParticipantes(
			HorizontalPanel hpPainelTituloCertificadosParticipantes) {
		this.hpPainelTituloCertificadosParticipantes = hpPainelTituloCertificadosParticipantes;
	}


	public HorizontalPanel getHpPainelPesquisarParticipanteCertificado() {
		return hpPainelPesquisarParticipanteCertificado;
	}


	public void setHpPainelPesquisarParticipanteCertificado(
			HorizontalPanel hpPainelPesquisarParticipanteCertificado) {
		this.hpPainelPesquisarParticipanteCertificado = hpPainelPesquisarParticipanteCertificado;
	}


	public HorizontalPanel getHpPainelTabelaCertificadosParticipantes() {
		return hpPainelTabelaCertificadosParticipantes;
	}


	public void setHpPainelTabelaCertificadosParticipantes(
			HorizontalPanel hpPainelTabelaCertificadosParticipantes) {
		this.hpPainelTabelaCertificadosParticipantes = hpPainelTabelaCertificadosParticipantes;
	}


	public VerticalPanel getVpPainelImprimirCertificados() {
		return vpPainelImprimirCertificados;
	}


	public void setVpPainelImprimirCertificados(
			VerticalPanel vpPainelImprimirCertificados) {
		this.vpPainelImprimirCertificados = vpPainelImprimirCertificados;
	}


	public VerticalPanel getVpPainelAreaTotalImprimirCertificados() {
		return vpPainelAreaTotalImprimirCertificados;
	}


	public void setVpPainelAreaTotalImprimirCertificados(
			VerticalPanel vpPainelAreaTotalImprimirCertificados) {
		this.vpPainelAreaTotalImprimirCertificados = vpPainelAreaTotalImprimirCertificados;
	}


	public Label getLbTituloPaginaCertificadosParticipantes() {
		return lbTituloPaginaCertificadosParticipantes;
	}


	public void setLbTituloPaginaCertificadosParticipantes(
			Label lbTituloPaginaCertificadosParticipantes) {
		this.lbTituloPaginaCertificadosParticipantes = lbTituloPaginaCertificadosParticipantes;
	}


	public Button getBtnPesquisarParticipantesCertificados() {
		return btnPesquisarParticipantesCertificados;
	}


	public void setBtnPesquisarParticipantesCertificados(
			Button btnPesquisarParticipantesCertificados) {
		this.btnPesquisarParticipantesCertificados = btnPesquisarParticipantesCertificados;
	}


	public Button getBtnGerarTodosCertificadosParticipante() {
		return btnGerarTodosCertificadosParticipante;
	}


	public void setBtnGerarTodosCertificadosParticipante(
			Button btnGerarTodosCertificadosParticipante) {
		this.btnGerarTodosCertificadosParticipante = btnGerarTodosCertificadosParticipante;
	}


	public TextBox getTbPesquisarParticipantesCertificados() {
		return tbPesquisarParticipantesCertificados;
	}


	public void setTbPesquisarParticipantesCertificados(
			TextBox tbPesquisarParticipantesCertificados) {
		this.tbPesquisarParticipantesCertificados = tbPesquisarParticipantesCertificados;
	}


	public FlexTable getFtTabelaCertificadosParticipantes() {
		return ftTabelaCertificadosParticipantes;
	}


	public void setFtTabelaCertificadosParticipantes(
			FlexTable ftTabelaCertificadosParticipantes) {
		this.ftTabelaCertificadosParticipantes = ftTabelaCertificadosParticipantes;
	}
	
	
}
