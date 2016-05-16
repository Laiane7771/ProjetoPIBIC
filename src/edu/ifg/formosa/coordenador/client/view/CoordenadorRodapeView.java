package edu.ifg.formosa.coordenador.client.view;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CoordenadorRodapeView extends Composite{

	private VerticalPanel vpPainelRodapeCoordenador;
	private Image iLogoRodapeCoordenador;
	
	public CoordenadorRodapeView(){
		
		vpPainelRodapeCoordenador = new VerticalPanel();
		vpPainelRodapeCoordenador.setStyleName("vpPainelRodapeCoordenador");
		
		iLogoRodapeCoordenador = new Image();
		iLogoRodapeCoordenador.setStyleName("iLogoRodapeCoordenador");
		iLogoRodapeCoordenador.setUrl("../Image/logo2.png");
		
		vpPainelRodapeCoordenador.add(iLogoRodapeCoordenador);
		
		initWidget(vpPainelRodapeCoordenador);
	}

	public VerticalPanel getVpPainelRodapeCoordenador() {
		return vpPainelRodapeCoordenador;
	}

	public void setVpPainelRodapeCoordenador(VerticalPanel vpPainelRodapeCoordenador) {
		this.vpPainelRodapeCoordenador = vpPainelRodapeCoordenador;
	}

	public Image getiLogoRodapeCoordenador() {
		return iLogoRodapeCoordenador;
	}

	public void setiLogoRodapeCoordenador(Image iLogoRodapeCoordenador) {
		this.iLogoRodapeCoordenador = iLogoRodapeCoordenador;
	}
	
}
