package edu.ifg.formosa.gerente.client.view;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class SubMenusGerenteView {

	private VerticalPanel vpPainelItemCadastrarEvento;
	private VerticalPanel vpPainelItemCadastrarCoordenador;
	private VerticalPanel vpPainelItemCadastrarParticipante;
	private VerticalPanel vpPainelItemCracha;
	private VerticalPanel vpPainelItemCertificado;
	private VerticalPanel vpPainelItemCrachaCoordenador;
	private VerticalPanel vpPainelItemCertificadoCoordenador;
	private Label lbCadastrarEvento;
	private Label lbCadastrarCoordenador;
	private Label lbCadastrarParticipante;
	private Label lbCrachaParticipante;
	private Label lbCertificadoParticipante;
	private Label lbCertificadoCoordenador;
	private Label lbCrachaCoordenador;



	public SubMenusGerenteView(){

		// ------------------Sub Menus Evento----------------------------------------
		vpPainelItemCadastrarEvento = new VerticalPanel();
		vpPainelItemCadastrarEvento.setStyleName("vpPainelItemCadastrarEvento");

		lbCadastrarEvento = new Label("Cadastrar Evento");
		lbCadastrarEvento.setStyleName("lbCadastrarEvento");

		vpPainelItemCadastrarEvento.add(lbCadastrarEvento); //adiciona label

		//-------------Sub Menus Coordenador--------------------------------------------------------

		lbCadastrarCoordenador = new Label("Cadastrar Coordenador");
		lbCadastrarCoordenador.setStyleName("lbCadastrarCoordenador");

		lbCertificadoCoordenador = new Label("Certificado");
		lbCertificadoCoordenador.setStyleName("lbCertificadoCoordenador");

		lbCrachaCoordenador = new Label("Crachá");
		lbCrachaCoordenador.setStyleName("lbCrachaCoordenador");

		vpPainelItemCadastrarCoordenador = new VerticalPanel();
		vpPainelItemCadastrarCoordenador.setStyleName("vpPainelItemCadastrarCoordenador");

		vpPainelItemCrachaCoordenador = new VerticalPanel();
		vpPainelItemCrachaCoordenador.setStyleName("vpPainelItemCrachaCoordenador");
		
		vpPainelItemCertificadoCoordenador = new VerticalPanel();
		vpPainelItemCertificadoCoordenador.setStyleName("vpPainelItemCertificadoCoordenador");

		vpPainelItemCadastrarCoordenador.add(lbCadastrarCoordenador);//adiciona label Cadastrar Coordenador
		vpPainelItemCrachaCoordenador.add(lbCrachaCoordenador); //add label cracha coordenador
		vpPainelItemCertificadoCoordenador.add(lbCertificadoCoordenador);//add label certificado coordenador

		//-------------------SubMenus Participante--------------------------------------------------

		vpPainelItemCadastrarParticipante = new VerticalPanel();
		vpPainelItemCadastrarParticipante.setStyleName("vpPainelItemCadastrarParticipante");

		lbCadastrarParticipante = new Label("Cadastrar Participante");
		lbCadastrarParticipante.setStyleName("lbCadastrarParticipante");

		vpPainelItemCadastrarParticipante.add(lbCadastrarParticipante); //adiciona label


		vpPainelItemCracha = new VerticalPanel();
		vpPainelItemCracha.setStyleName("vpPainelItemCracha");

		lbCrachaParticipante = new Label("Crachá");
		lbCrachaParticipante.setStyleName("lbCracha");

		vpPainelItemCracha.add(lbCrachaParticipante);

		vpPainelItemCertificado = new VerticalPanel();
		vpPainelItemCertificado.setStyleName("vpPainelItemCertificado");

		lbCertificadoParticipante = new Label("Certificado");
		lbCertificadoParticipante.setStyleName("lbCertificado");

		vpPainelItemCertificado.add(lbCertificadoParticipante);

	}

	public VerticalPanel getVpPainelItemCadastrarEvento() {
		return vpPainelItemCadastrarEvento;
	}
	
	public void setVpPainelItemCadastrarEvento(
			VerticalPanel vpPainelItemCadastrarEvento) {
		this.vpPainelItemCadastrarEvento = vpPainelItemCadastrarEvento;
	}


	public VerticalPanel getVpPainelItemCadastrarCoordenador() {
		return vpPainelItemCadastrarCoordenador;
	}

	public void setVpPainelItemCadastrarCoordenador(
			VerticalPanel vpPainelItemCadastrarCoordenador) {
		this.vpPainelItemCadastrarCoordenador = vpPainelItemCadastrarCoordenador;
	}

	public VerticalPanel getVpPainelItemCadastrarParticipante() {
		return vpPainelItemCadastrarParticipante;
	}

	public void setVpPainelItemCadastrarParticipante(
			VerticalPanel vpPainelItemCadastrarParticipante) {
		this.vpPainelItemCadastrarParticipante = vpPainelItemCadastrarParticipante;
	}

	public Label getLbCadastrarEvento() {
		return lbCadastrarEvento;
	}

	public void setLbCadastrarEvento(Label lbCadastrarEvento) {
		this.lbCadastrarEvento = lbCadastrarEvento;
	}

	public Label getLbCadastrarCoordenador() {
		return lbCadastrarCoordenador;
	}

	public void setLbCadastrarCoordenador(Label lbCadastrarCoordenador) {
		this.lbCadastrarCoordenador = lbCadastrarCoordenador;
	}



	public Label getLbCadastrarParticipante() {
		return lbCadastrarParticipante;
	}

	public void setLbCadastrarParticipante(Label lbCadastrarParticipante) {
		this.lbCadastrarParticipante = lbCadastrarParticipante;
	}

	public VerticalPanel getVpPainelItemCracha() {
		return vpPainelItemCracha;
	}
	public void setVpPainelItemCracha(VerticalPanel vpPainelItemCracha) {
		this.vpPainelItemCracha = vpPainelItemCracha;
	}

	public VerticalPanel getVpPainelItemCertificado() {
		return vpPainelItemCertificado;
	}

	public void setVpPainelItemCertificado(VerticalPanel vpPainelItemCertificado) {
		this.vpPainelItemCertificado = vpPainelItemCertificado;
	}

	public Label getLbCrachaParticipante() {
		return lbCrachaParticipante;
	}
	public void setLbCrachaParticipante(Label lbCrachaParticipante) {
		this.lbCrachaParticipante = lbCrachaParticipante;
	}

	public Label getLbCertificadoParticipante() {
		return lbCertificadoParticipante;
	}
	public void setLbCertificadoParticipante(Label lbCertificadoParticipante) {
		this.lbCertificadoParticipante = lbCertificadoParticipante;
	}




	public Label getLbCertificadoCoordenador() {
		return lbCertificadoCoordenador;
	}




	public void setLbCertificadoCoordenador(Label lbCertificadoCoordenador) {
		this.lbCertificadoCoordenador = lbCertificadoCoordenador;
	}




	public Label getLbCrachaCoordenador() {
		return lbCrachaCoordenador;
	}




	public void setLbCrachaCoordenador(Label lbCrachaCoordenador) {
		this.lbCrachaCoordenador = lbCrachaCoordenador;
	}




	public VerticalPanel getVpPainelItemCrachaCoordenador() {
		return vpPainelItemCrachaCoordenador;
	}




	public void setVpPainelItemCrachaCoordenador(
			VerticalPanel vpPainelItemCrachaCoordenador) {
		this.vpPainelItemCrachaCoordenador = vpPainelItemCrachaCoordenador;
	}




	public VerticalPanel getVpPainelItemCertificadoCoordenador() {
		return vpPainelItemCertificadoCoordenador;
	}




	public void setVpPainelItemCertificadoCoordenador(
			VerticalPanel vpPainelItemCertificadoCoordenador) {
		this.vpPainelItemCertificadoCoordenador = vpPainelItemCertificadoCoordenador;
	}

}
