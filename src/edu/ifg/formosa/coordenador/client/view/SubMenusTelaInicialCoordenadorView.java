package edu.ifg.formosa.coordenador.client.view;

import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;

public class SubMenusTelaInicialCoordenadorView {

	private HorizontalPanel hpPainelCadastrarAtividade;
	private HorizontalPanel hpPainelPesquisarAtividade;
	private HorizontalPanel hpPainelImprimirAtividadeComQR;
	private HorizontalPanel hpPainelPesquisarMonitor;
	private HorizontalPanel hpPainelPesquisarParticipantes;
	private HorizontalPanel hpPainelCadastrarMonitor;
	private HorizontalPanel hpPainelCrachas;
	private HorizontalPanel hpPainelCertificados;
	private HorizontalPanel hpPainelFrequenciaParticipantes;
	private Label lbCadastrarAtividade;
	private Label lbImprimirAtividadeComQR;
	private Label lbCadastrarMonitor;
	private Label lbCrachas;
	private Label lbCertificados;
	private Label lbFrequenciaParticipantes;
	private Label lbPesquisarMonitor;
	private Label lbPesquisarAtividade;
	private Label lbPesquisarParticipante;
	
	public SubMenusTelaInicialCoordenadorView(){
		
		hpPainelCadastrarAtividade = new HorizontalPanel();
		hpPainelCadastrarAtividade.setStyleName("hpPainelCadastrarAtividade");
		
		lbCadastrarAtividade = new Label("Cadastrar Atividade");
		lbCadastrarAtividade.setStyleName("lbCadastrarAtividade");
		
		hpPainelCadastrarAtividade.add(lbCadastrarAtividade);//add item
		
		//=================================================================
		
		hpPainelPesquisarAtividade = new HorizontalPanel();
		hpPainelPesquisarAtividade.setStyleName("hpPainelPesquisarAtividade");
		
		lbPesquisarAtividade = new Label("Pesquisar Atividades");
		lbPesquisarAtividade.setStyleName("lbPesquisarAtividade");
		
		hpPainelPesquisarAtividade.add(lbPesquisarAtividade);//add item
		
		//=================================================================
		hpPainelImprimirAtividadeComQR = new HorizontalPanel();
		hpPainelImprimirAtividadeComQR.setStyleName("hpPainelImprimirAtividadeComQR");
		
		lbImprimirAtividadeComQR = new Label("Imprimir Atividade com QRCode");
		lbImprimirAtividadeComQR.setStyleName("lbImprimirAtividadeComQR");
		
		hpPainelImprimirAtividadeComQR.add(lbImprimirAtividadeComQR);//add item
		//====================================================================
		
		hpPainelCadastrarMonitor = new HorizontalPanel();
		hpPainelCadastrarMonitor.setStyleName("hpPainelCadastrarMonitor");
		
		lbCadastrarMonitor = new Label("Cadastrar Monitor");
		lbCadastrarMonitor.setStyleName("lbCadastrarMonitor");
		
		hpPainelCadastrarMonitor.add(lbCadastrarMonitor);//add item
		//=====================================================================
		
		hpPainelPesquisarMonitor = new HorizontalPanel();
		hpPainelPesquisarMonitor.setStyleName("hpPainelPesquisarMonitor");
		
		lbPesquisarMonitor = new Label("Pesquisar Monitor");
		lbPesquisarMonitor.setStyleName("lbPesquisarMonitor");
		
		hpPainelPesquisarMonitor.add(lbPesquisarMonitor);//add item
		//=====================================================================
		
		hpPainelCrachas = new HorizontalPanel();
		hpPainelCrachas.setStyleName("hpPainelCrachas");
		
		lbCrachas = new Label("Crachás");
		lbCrachas.setStyleName("lbCrachas");
		
		hpPainelCrachas.add(lbCrachas);//add item
		//=====================================================================
		
		hpPainelPesquisarParticipantes = new HorizontalPanel();
		hpPainelPesquisarParticipantes.setStyleName("hpPainelPesquisarParticipantes");
		
		lbPesquisarParticipante  = new Label("Pesquisar Participante");
		lbPesquisarParticipante.setStyleName("lbPesquisarParticipante");
	
		hpPainelPesquisarParticipantes.add(lbPesquisarParticipante);//add item
		//=====================================================================
		hpPainelCertificados = new HorizontalPanel();
		hpPainelCertificados.setStyleName("hpPainelCertificados");
		
		lbCertificados = new Label("Certificados");
		lbCertificados.setStyleName("lbCertificados");
		
		hpPainelCertificados.add(lbCertificados);//add item
		//====================================================================
		
		hpPainelFrequenciaParticipantes = new HorizontalPanel();
		hpPainelFrequenciaParticipantes.setStyleName("hpPainelFrequenciaParticipantes");
		
		lbFrequenciaParticipantes = new Label("Frequência de Participantes");
		lbFrequenciaParticipantes.setStyleName("lbFrequenciaParticipantes");
		
		hpPainelFrequenciaParticipantes.add(lbFrequenciaParticipantes); //add item
		
	}

	public HorizontalPanel getHpPainelCadastrarAtividade() {
		return hpPainelCadastrarAtividade;
	}

	public void setHpPainelCadastrarAtividade(
			HorizontalPanel hpPainelCadastrarAtividade) {
		this.hpPainelCadastrarAtividade = hpPainelCadastrarAtividade;
	}

	public HorizontalPanel getHpPainelImprimirAtividadeComQR() {
		return hpPainelImprimirAtividadeComQR;
	}

	public void setHpPainelImprimirAtividadeComQR(
			HorizontalPanel hpPainelImprimirAtividadeComQR) {
		this.hpPainelImprimirAtividadeComQR = hpPainelImprimirAtividadeComQR;
	}

	public HorizontalPanel getHpPainelCadastrarMonitor() {
		return hpPainelCadastrarMonitor;
	}

	public void setHpPainelCadastrarMonitor(HorizontalPanel hpPainelCadastrarMonitor) {
		this.hpPainelCadastrarMonitor = hpPainelCadastrarMonitor;
	}

	public HorizontalPanel getHpPainelCrachas() {
		return hpPainelCrachas;
	}

	public void setHpPainelCrachas(HorizontalPanel hpPainelCrachas) {
		this.hpPainelCrachas = hpPainelCrachas;
	}

	public HorizontalPanel getHpPainelCertificados() {
		return hpPainelCertificados;
	}

	public void setHpPainelCertificados(HorizontalPanel hpPainelCertificados) {
		this.hpPainelCertificados = hpPainelCertificados;
	}

	public Label getLbCadastrarAtividade() {
		return lbCadastrarAtividade;
	}

	public void setLbCadastrarAtividade(Label lbCadastrarAtividade) {
		this.lbCadastrarAtividade = lbCadastrarAtividade;
	}

	public Label getLbImprimirAtividadeComQR() {
		return lbImprimirAtividadeComQR;
	}

	public void setLbImprimirAtividadeComQR(Label lbImprimirAtividadeComQR) {
		this.lbImprimirAtividadeComQR = lbImprimirAtividadeComQR;
	}

	public Label getLbCadastrarMonitor() {
		return lbCadastrarMonitor;
	}

	public void setLbCadastrarMonitor(Label lbCadastrarMonitor) {
		this.lbCadastrarMonitor = lbCadastrarMonitor;
	}

	public Label getLbCrachas() {
		return lbCrachas;
	}

	public void setLbCrachas(Label lbCrachas) {
		this.lbCrachas = lbCrachas;
	}

	public Label getLbCertificados() {
		return lbCertificados;
	}

	public void setLbCertificados(Label lbCertificados) {
		this.lbCertificados = lbCertificados;
	}

	public HorizontalPanel getHpPainelFrequenciaParticipantes() {
		return hpPainelFrequenciaParticipantes;
	}

	public void setHpPainelFrequenciaParticipantes(
			HorizontalPanel hpPainelFrequenciaParticipantes) {
		this.hpPainelFrequenciaParticipantes = hpPainelFrequenciaParticipantes;
	}

	public Label getLbFrequenciaParticipantes() {
		return lbFrequenciaParticipantes;
	}

	public void setLbFrequenciaParticipantes(Label lbFrequenciaParticipantes) {
		this.lbFrequenciaParticipantes = lbFrequenciaParticipantes;
	}

	public HorizontalPanel getHpPainelPesquisarAtividade() {
		return hpPainelPesquisarAtividade;
	}

	public void setHpPainelPesquisarAtividade(HorizontalPanel hpPainelPesquisarAtividade) {
		this.hpPainelPesquisarAtividade = hpPainelPesquisarAtividade;
	}

	public HorizontalPanel getHpPainelPesquisarMonitor() {
		return hpPainelPesquisarMonitor;
	}

	public void setHpPainelPesquisarMonitor(HorizontalPanel hpPainelPesquisarMonitor) {
		this.hpPainelPesquisarMonitor = hpPainelPesquisarMonitor;
	}

	public HorizontalPanel getHpPainelPesquisarParticipantes() {
		return hpPainelPesquisarParticipantes;
	}

	public void setHpPainelPesquisarParticipantes(HorizontalPanel hpPainelPesquisarParticipantes) {
		this.hpPainelPesquisarParticipantes = hpPainelPesquisarParticipantes;
	}

	public Label getLbPesquisarMonitor() {
		return lbPesquisarMonitor;
	}

	public void setLbPesquisarMonitor(Label lbPesquisarMonitor) {
		this.lbPesquisarMonitor = lbPesquisarMonitor;
	}

	public Label getLbPesquisarAtividade() {
		return lbPesquisarAtividade;
	}

	public void setLbPesquisarAtividade(Label lbPesquisarAtividade) {
		this.lbPesquisarAtividade = lbPesquisarAtividade;
	}

	public Label getLbPesquisarParticipante() {
		return lbPesquisarParticipante;
	}

	public void setLbPesquisarParticipante(Label lbPesquisarParticipante) {
		this.lbPesquisarParticipante = lbPesquisarParticipante;
	}
	
}
