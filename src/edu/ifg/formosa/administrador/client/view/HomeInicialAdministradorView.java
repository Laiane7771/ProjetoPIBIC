package edu.ifg.formosa.administrador.client.view;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HomeInicialAdministradorView extends Composite{
	
	private HorizontalPanel hpPainelCabecalhoHomeAdm;
	private VerticalPanel vpPainelRodapeAdm;
	private VerticalPanel vpPainelHomeAdm;
	private Image iLogoAdm;
	private Image iLogorodapeAdm;
	private Label lbTituloPagina;
	private Label lbNomeAdm;
	
	
	public HomeInicialAdministradorView(){
		
		hpPainelCabecalhoHomeAdm = new HorizontalPanel();
		hpPainelCabecalhoHomeAdm.setStyleName("hpPainelCabecalhoHomeAdm");
		
		iLogoAdm = new Image();
		iLogoAdm.setUrl("../Image/logo.png");
		iLogoAdm.setStyleName("iLogoAdm");
		
		lbTituloPagina = new Label("Módulo Administrador");
		lbTituloPagina.setStyleName("lbTituloPagina");
		
		lbNomeAdm = new Label("Bem Vindo! Fulano");
		lbNomeAdm.setStyleName("lbNomeAdm");
		
		hpPainelCabecalhoHomeAdm.add(iLogoAdm);//add item
		hpPainelCabecalhoHomeAdm.add(lbTituloPagina);//add item
		hpPainelCabecalhoHomeAdm.add(lbNomeAdm);//add item
		
		vpPainelRodapeAdm = new VerticalPanel();
		vpPainelRodapeAdm.setStyleName("vpPainelRodapeAdm");
		
		iLogorodapeAdm = new Image();
		iLogorodapeAdm.setStyleName("iLogorodapeAdm");
		iLogorodapeAdm.setUrl("../Image/logo.png");
		
		vpPainelRodapeAdm.add(iLogorodapeAdm);//add item
		
		vpPainelHomeAdm = new VerticalPanel();
		vpPainelHomeAdm.setStyleName("vpPainelHomeAdm");
		
		vpPainelHomeAdm.add(hpPainelCabecalhoHomeAdm);//add item
		vpPainelHomeAdm.add(vpPainelRodapeAdm);//add item
		
		initWidget(vpPainelHomeAdm);//inicializa
	}

	public HorizontalPanel getHpPainelCabecalhoHomeAdm() {
		return hpPainelCabecalhoHomeAdm;
	}

	public void setHpPainelCabecalhoHomeAdm(HorizontalPanel hpPainelCabecalhoHomeAdm) {
		this.hpPainelCabecalhoHomeAdm = hpPainelCabecalhoHomeAdm;
	}

	public VerticalPanel getVpPainelRodapeAdm() {
		return vpPainelRodapeAdm;
	}

	public void setVpPainelRodapeAdm(VerticalPanel vpPainelRodapeAdm) {
		this.vpPainelRodapeAdm = vpPainelRodapeAdm;
	}

	public VerticalPanel getVpPainelHomeAdm() {
		return vpPainelHomeAdm;
	}

	public void setVpPainelHomeAdm(VerticalPanel vpPainelHomeAdm) {
		this.vpPainelHomeAdm = vpPainelHomeAdm;
	}

}
