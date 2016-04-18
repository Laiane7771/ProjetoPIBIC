package edu.ifg.formosa.principal.client.view;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class PainelEscolhaModuloView extends Composite{
	
	private HorizontalPanel hpPainelModulos;
	private VerticalPanel vpPainelNomesModulos;
	private VerticalPanel vpPainelLabelModulo;
	private Label lbGerente;
	private Label lbParticipante;
	private Label lbCoordenador;
	private Label lbTituloPainelModulos;

	public PainelEscolhaModuloView(){
		
		//---------------------------------------------
		//----------Painel Escolha Modulo--------------
		//---------------------------------------------

		hpPainelModulos = new HorizontalPanel();
		hpPainelModulos.setStyleName("hpPainelModulos");

		vpPainelLabelModulo = new VerticalPanel();
		vpPainelLabelModulo.setStyleName("vpPainelLabelModulo");

		lbTituloPainelModulos = new Label("Você é?");
		lbTituloPainelModulos.setStyleName("lbTituloPainelModulos");

		vpPainelLabelModulo.add(lbTituloPainelModulos);

		vpPainelNomesModulos = new VerticalPanel();
		vpPainelNomesModulos.setStyleName("vpPainelNomesModulos");

		lbGerente = new Label("Gerente");
		lbGerente.setStyleName("lbGerente");

		lbParticipante = new Label("Participante");
		lbParticipante.setStyleName("lbParticipante");

		lbCoordenador = new Label("Coordenador");
		lbCoordenador.setStyleName("lbCoordenador");

		vpPainelNomesModulos.add(lbGerente);
		vpPainelNomesModulos.add(lbParticipante);
		vpPainelNomesModulos.add(lbCoordenador);
		
		hpPainelModulos.add(vpPainelLabelModulo);
		hpPainelModulos.add(vpPainelNomesModulos);
		
		initWidget(hpPainelModulos);
	}

	public HorizontalPanel getHpPainelModulos() {
		return hpPainelModulos;
	}

	public void setHpPainelModulos(HorizontalPanel hpPainelModulos) {
		this.hpPainelModulos = hpPainelModulos;
	}

	public VerticalPanel getVpPainelNomesModulos() {
		return vpPainelNomesModulos;
	}

	public void setVpPainelNomesModulos(VerticalPanel vpPainelNomesModulos) {
		this.vpPainelNomesModulos = vpPainelNomesModulos;
	}

	public VerticalPanel getVpPainelLabelModulo() {
		return vpPainelLabelModulo;
	}

	public void setVpPainelLabelModulo(VerticalPanel vpPainelLabelModulo) {
		this.vpPainelLabelModulo = vpPainelLabelModulo;
	}

	public Label getLbGerente() {
		return lbGerente;
	}

	public void setLbGerente(Label lbGerente) {
		this.lbGerente = lbGerente;
	}

	public Label getLbParticipante() {
		return lbParticipante;
	}

	public void setLbParticipante(Label lbParticipante) {
		this.lbParticipante = lbParticipante;
	}

	public Label getLbCoordenador() {
		return lbCoordenador;
	}

	public void setLbCoordenador(Label lbCoordenador) {
		this.lbCoordenador = lbCoordenador;
	}

	public Label getLbTituloPainelModulos() {
		return lbTituloPainelModulos;
	}

	public void setLbTituloPainelModulos(Label lbTituloPainelModulos) {
		this.lbTituloPainelModulos = lbTituloPainelModulos;
	}

}
