package edu.ifg.formosa.participante.client.view;


import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;


public class PainelDeMenusCantoEsquerdoView{
	
	private HorizontalPanel hpPainelNomeParticipante;
	private HorizontalPanel hpPainelLabelCertificados;
	private HorizontalPanel hpPainelLogoutParticipante;
	private Label lbNomeParticipante;
	private Label lbCertificadoParticipante;
	private Label lbLogoutParticipante;
	
	public PainelDeMenusCantoEsquerdoView(){
		//--------------------------PAINEL NOME------------------
		hpPainelNomeParticipante = new HorizontalPanel();
		hpPainelNomeParticipante.setStyleName("hpPainelNomeParticipante");
		
		lbNomeParticipante = new Label("Olá Fulano");
		lbNomeParticipante.setStyleName("lbNomeParticipante");
		
		hpPainelNomeParticipante.add(lbNomeParticipante); //add item
		//---------------------------------------------------------------
		//----------------------botos para Evento----------------------------
		
		hpPainelLabelCertificados = new HorizontalPanel();
		hpPainelLabelCertificados.setStyleName("hpPainelLabelCertificados");
		
		lbCertificadoParticipante = new Label("Certificado");
		lbCertificadoParticipante.setStyleName("lbCertificadoParticipante");
		
		hpPainelLabelCertificados.add(lbCertificadoParticipante); //add item
		//-----------------------------------------------------------------------
		hpPainelLogoutParticipante = new HorizontalPanel();
		hpPainelLogoutParticipante.setStyleName("hpPainelLogoutParticipante");
		
		lbLogoutParticipante = new Label("Logout");
		lbLogoutParticipante.setStyleName("lbLogoutParticipante");
		
		hpPainelLogoutParticipante.add(lbLogoutParticipante); //add item
		//---------------------------------------------------------------------
	}

	public HorizontalPanel getHpPainelNomeParticipante() {
		return hpPainelNomeParticipante;
	}

	public void setHpPainelNomeParticipante(HorizontalPanel hpPainelNomeParticipante) {
		this.hpPainelNomeParticipante = hpPainelNomeParticipante;
	}

	
	public HorizontalPanel getHpPainelLabelCertificados() {
		return hpPainelLabelCertificados;
	}

	public void setHpPainelLabelCertificados(
			HorizontalPanel hpPainelLabelCertificados) {
		this.hpPainelLabelCertificados = hpPainelLabelCertificados;
	}

	public HorizontalPanel getHpPainelLogoutParticipante() {
		return hpPainelLogoutParticipante;
	}

	public void setHpPainelLogoutParticipante(
			HorizontalPanel hpPainelLogoutParticipante) {
		this.hpPainelLogoutParticipante = hpPainelLogoutParticipante;
	}

	public Label getLbNomeParticipante() {
		return lbNomeParticipante;
	}

	public void setLbNomeParticipante(Label lbNomeParticipante) {
		this.lbNomeParticipante = lbNomeParticipante;
	}

	public Label getLbCertificadoParticipante() {
		return lbCertificadoParticipante;
	}

	public void setLbCertificadoParticipante(Label lbCertificadoParticipante) {
		this.lbCertificadoParticipante = lbCertificadoParticipante;
	}

	public Label getLbLogoutParticipante() {
		return lbLogoutParticipante;
	}

	public void setLbLogoutParticipante(Label lbLogoutParticipante) {
		this.lbLogoutParticipante = lbLogoutParticipante;
	}

}
