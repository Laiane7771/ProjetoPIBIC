package edu.ifg.formosa.principal.client.view;

import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HomeTesteView extends Composite{

	private HorizontalPanel hpPainelCabecalhoLogoeLabels;
	private HorizontalPanel hpPainelTituloEscolhaModulo;
	private HorizontalPanel hpPainelLabelGerente;
	private HorizontalPanel hpPainelLabelCoordenador;
	private HorizontalPanel hpPainelLabelParticipante;
	private VerticalPanel vpPainelCabecalho;
	private VerticalPanel vpPainelEscolhaModulo;
	private VerticalPanel vpPainelMae;
	private Label lbCertificado;
	private Label lbEntrar;
	private Anchor AComoFunciona;
	private Image iLogoPagina;
	
	
	public HomeTesteView(){
		
		//Painel Cabecalho----------------------------------
		//--------------------------------------------------
		hpPainelCabecalhoLogoeLabels = new HorizontalPanel();
		hpPainelCabecalhoLogoeLabels.setStyleName("hpPainelCabecalhoLogoeLabels");
		
		iLogoPagina = new Image();
		iLogoPagina.setUrl("../Image/logo.png");
		iLogoPagina.setStyleName("iLogoPagina");
		
		lbCertificado = new Label("Certificado");
		lbCertificado.setStyleName("lbCertificado");
		
		AComoFunciona = new Anchor("Como Funciona", "#comoFunciona");
		AComoFunciona.setStyleName("AComoFunciona");
		
		lbEntrar = new Label("Entrar");
		lbEntrar.setStyleName("lbEntrar");
		
		hpPainelCabecalhoLogoeLabels.add(iLogoPagina);
		hpPainelCabecalhoLogoeLabels.setCellWidth(iLogoPagina, "10%");
		hpPainelCabecalhoLogoeLabels.add(lbCertificado);
		hpPainelCabecalhoLogoeLabels.setCellWidth(lbCertificado, "10%");
		hpPainelCabecalhoLogoeLabels.add(AComoFunciona);
		hpPainelCabecalhoLogoeLabels.setCellWidth(AComoFunciona, "10%");
		hpPainelCabecalhoLogoeLabels.add(lbEntrar);
		hpPainelCabecalhoLogoeLabels.setCellWidth(lbEntrar, "10%");
		
		//-----------------------------------------------
		//-----------------------------------------------
		//Painel Escolha Modulo--------------------------
		
		hpPainelTituloEscolhaModulo = new HorizontalPanel();
		hpPainelTituloEscolhaModulo.setStyleName("hpPainelTituloEscolhaModulo");
		
		hpPainelLabelGerente = new HorizontalPanel();
		hpPainelLabelGerente.setStyleName("hpPainelLabelGerente");
		
		hpPainelLabelCoordenador = new HorizontalPanel();
		hpPainelLabelCoordenador.setStyleName("hpPainelLabelCoordenador");
		
		hpPainelLabelParticipante = new HorizontalPanel();
		hpPainelLabelParticipante.setStyleName("hpPainelLabelParticipante");
		
		vpPainelEscolhaModulo = new VerticalPanel();
		vpPainelEscolhaModulo.setStyleName("vpPainelEscolhaModulo");
		
		vpPainelEscolhaModulo.add(hpPainelTituloEscolhaModulo);
		vpPainelEscolhaModulo.add(hpPainelLabelGerente);
		vpPainelEscolhaModulo.add(hpPainelLabelCoordenador);
		vpPainelEscolhaModulo.add(hpPainelLabelParticipante);
		
		//----------------------------------------------
		//----------------------------------------------
		//-Painel Cabecalho-----------------------------
		
		vpPainelCabecalho = new VerticalPanel();
		vpPainelCabecalho.setStyleName("vpPainelCabecalho");
		
		vpPainelCabecalho.add(hpPainelCabecalhoLogoeLabels);
		
		//----------------------------------------------
		//Painel Mae------------------------------------
		//----------------------------------------------
		vpPainelMae = new VerticalPanel();
		vpPainelMae.setStyleName("vpPainelMae");
		
		vpPainelMae.add(vpPainelCabecalho);
		
		initWidget(vpPainelMae);
		
	}


	public HorizontalPanel getHpPainelCabecalhoLogoeLabels() {
		return hpPainelCabecalhoLogoeLabels;
	}


	public void setHpPainelCabecalhoLogoeLabels(
			HorizontalPanel hpPainelCabecalhoLogoeLabels) {
		this.hpPainelCabecalhoLogoeLabels = hpPainelCabecalhoLogoeLabels;
	}


	public HorizontalPanel getHpPainelTituloEscolhaModulo() {
		return hpPainelTituloEscolhaModulo;
	}


	public void setHpPainelTituloEscolhaModulo(
			HorizontalPanel hpPainelTituloEscolhaModulo) {
		this.hpPainelTituloEscolhaModulo = hpPainelTituloEscolhaModulo;
	}


	public HorizontalPanel getHpPainelLabelGerente() {
		return hpPainelLabelGerente;
	}


	public void setHpPainelLabelGerente(HorizontalPanel hpPainelLabelGerente) {
		this.hpPainelLabelGerente = hpPainelLabelGerente;
	}


	public HorizontalPanel getHpPainelLabelCoordenador() {
		return hpPainelLabelCoordenador;
	}


	public void setHpPainelLabelCoordenador(HorizontalPanel hpPainelLabelCoordenador) {
		this.hpPainelLabelCoordenador = hpPainelLabelCoordenador;
	}


	public HorizontalPanel getHpPainelLabelParticipante() {
		return hpPainelLabelParticipante;
	}


	public void setHpPainelLabelParticipante(
			HorizontalPanel hpPainelLabelParticipante) {
		this.hpPainelLabelParticipante = hpPainelLabelParticipante;
	}


	public VerticalPanel getVpPainelCabecalho() {
		return vpPainelCabecalho;
	}


	public void setVpPainelCabecalho(VerticalPanel vpPainelCabecalho) {
		this.vpPainelCabecalho = vpPainelCabecalho;
	}


	public VerticalPanel getVpPainelEscolhaModulo() {
		return vpPainelEscolhaModulo;
	}


	public void setVpPainelEscolhaModulo(VerticalPanel vpPainelEscolhaModulo) {
		this.vpPainelEscolhaModulo = vpPainelEscolhaModulo;
	}


	public VerticalPanel getVpPainelMae() {
		return vpPainelMae;
	}


	public void setVpPainelMae(VerticalPanel vpPainelMae) {
		this.vpPainelMae = vpPainelMae;
	}


	public Label getLbCertificado() {
		return lbCertificado;
	}


	public void setLbCertificado(Label lbCertificado) {
		this.lbCertificado = lbCertificado;
	}


	public Anchor getAComoFunciona() {
		return AComoFunciona;
	}


	public void setAComoFunciona(Anchor aComoFunciona) {
		AComoFunciona = aComoFunciona;
	}


	public Label getLbEntrar() {
		return lbEntrar;
	}


	public void setLbEntrar(Label lbEntrar) {
		this.lbEntrar = lbEntrar;
	}


	public Image getiLogoPagina() {
		return iLogoPagina;
	}


	public void setiLogoPagina(Image iLogoPagina) {
		this.iLogoPagina = iLogoPagina;
	}
	
	
}
