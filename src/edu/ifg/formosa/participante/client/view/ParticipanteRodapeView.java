package edu.ifg.formosa.participante.client.view;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ParticipanteRodapeView extends Composite {

	private VerticalPanel vpPainelRodapeParticipante;
	private Image iLogoParticipanteRodape;
	public ParticipanteRodapeView(){
		
		vpPainelRodapeParticipante = new VerticalPanel();
		vpPainelRodapeParticipante.setStyleName("vpPainelRodapeParticipante");
		
		iLogoParticipanteRodape = new Image();
		iLogoParticipanteRodape.setUrl("../Image/logo2.png");
		iLogoParticipanteRodape.setStyleName("iLogoParticipanteRodape");
		
		vpPainelRodapeParticipante.add(iLogoParticipanteRodape);//add item
		
		initWidget(vpPainelRodapeParticipante);
	}
	public VerticalPanel getVpPainelRodapeParticipante() {
		return vpPainelRodapeParticipante;
	}
	public void setVpPainelRodapeParticipante(VerticalPanel vpPainelRodapeParticipante) {
		this.vpPainelRodapeParticipante = vpPainelRodapeParticipante;
	}
	public Image getiLogoParticipanteRodape() {
		return iLogoParticipanteRodape;
	}
	public void setiLogoParticipanteRodape(Image iLogoParticipanteRodape) {
		this.iLogoParticipanteRodape = iLogoParticipanteRodape;
	}
	
}
