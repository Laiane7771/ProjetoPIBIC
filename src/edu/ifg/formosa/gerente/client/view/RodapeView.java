package edu.ifg.formosa.gerente.client.view;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;

public class RodapeView extends Composite{
	
	private HorizontalPanel hpPainelRodape;
	private Image iLogomarcaSite;
	
	public RodapeView(){
		
		 hpPainelRodape = new HorizontalPanel();
		 hpPainelRodape.setStyleName("hpPainelRodape");
		
		 iLogomarcaSite = new Image();
		 iLogomarcaSite.setUrl("../Image/logo2.png");
		 iLogomarcaSite.setStyleName("iLogomarcaSite");
		 
		 hpPainelRodape.add(iLogomarcaSite);
		 
		 initWidget(hpPainelRodape);
		 
	}

	public HorizontalPanel getHpPainelRodape() {
		return hpPainelRodape;
	}

	public void setHpPainelRodape(HorizontalPanel hpPainelRodape) {
		this.hpPainelRodape = hpPainelRodape;
	}

	public Image getiLogomarcaSite() {
		return iLogomarcaSite;
	}

	public void setiLogomarcaSite(Image iLogomarcaSite) {
		this.iLogomarcaSite = iLogomarcaSite;
	}

}
