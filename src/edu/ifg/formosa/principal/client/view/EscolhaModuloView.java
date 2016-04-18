package edu.ifg.formosa.principal.client.view;


import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class EscolhaModuloView extends DialogBox{
	
	private Label lbGerente;
	private Label lbCoordenador;
	private Label lbParticipante;
	private Button btnFechar;
	private VerticalPanel vpe;
	
	public EscolhaModuloView(){
		
		this.setStyleName("EscolhaModuloView");
		HTML hEscolhaModulo = new HTML("<h1>Eu sou...</h1>");
		hEscolhaModulo.addStyleName("hEscolhaModulo");
		
		vpe = new VerticalPanel();
		vpe.setHorizontalAlignment(HorizontalPanel.ALIGN_CENTER);
		vpe.setStyleName("vpe");
		lbGerente = new Label("Gerente");
		lbGerente.addStyleName("lbGerente");
		
		lbCoordenador = new Label("Coordenador");
		lbCoordenador.addStyleName("lbCoordenador");
		
		lbParticipante = new Label("Participante");
		lbParticipante.addStyleName("lbParticipante");
		
		btnFechar = new Button("x");  
		btnFechar.setStyleName("btnFechar");
		
		vpe.add(btnFechar);
		vpe.setCellHeight(btnFechar, "20%");
		vpe.add(hEscolhaModulo);
		vpe.setCellHeight(hEscolhaModulo, "10%");
		vpe.add(lbGerente);
		vpe.setCellHeight(lbGerente, "20%");
		vpe.add(lbCoordenador);
		vpe.setCellHeight(lbCoordenador, "20%");
		vpe.add(lbParticipante);
		
		this.add(vpe);
		this.show();
		this.center();
		this.setModal(true);
		this.setAnimationEnabled(true);

	}

	public Label getLbGerente() {
		return lbGerente;
	}

	public void setLbGerente(Label lbGerente) {
		this.lbGerente = lbGerente;
	}

	public Label getLbCoordenador() {
		return lbCoordenador;
	}

	public void setLbCoordenador(Label lbCoordenador) {
		this.lbCoordenador = lbCoordenador;
	}

	public Label getLbParticipante() {
		return lbParticipante;
	}

	public void setLbParticipante(Label lbParticipante) {
		this.lbParticipante = lbParticipante;
	}

	public Button getBtnFechar() {
		return btnFechar;
	}

	public void setBtnFechar(Button btnFechar) {
		this.btnFechar = btnFechar;
	}
	
	

}
