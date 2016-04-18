package edu.ifg.formosa.gerente.client.view;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MenuTelaInicialDoisView extends Composite{
	
	private VerticalPanel vpPainelNovoMenu;
	private Image iMenu2;
	private Image iEvento2;
	private Image iCoordenador2;
	private Image iParticipante2;
	private Image iSair2;
	
	
	public MenuTelaInicialDoisView(){
		
		vpPainelNovoMenu = new VerticalPanel();
		vpPainelNovoMenu.setStyleName("vpPainelNovoMenu");
		
		iMenu2 = new Image();
		iMenu2.setUrl("../Image/trocaMenu.jpg");
		iMenu2.setStyleName("iMenu2");
		
		iEvento2 = new Image();
		iEvento2.setUrl("../Image/evento.jpg");
		iEvento2.setStyleName("iEvento2");
		
		iCoordenador2 = new Image();
		iCoordenador2.setUrl("../Image/coordendor.jpg");
		iCoordenador2.setStyleName("iCoordenador2");
		
		iParticipante2 = new Image();
		iParticipante2.setUrl("../Image/participante.jpg");
		iParticipante2.setStyleName("iParticipante2");
		
		iSair2 = new Image();
		iSair2.setUrl("../Image/sair.png");
		iSair2.setStyleName("sair2");
		
		vpPainelNovoMenu.add(iMenu2);
		vpPainelNovoMenu.add(iEvento2);
		vpPainelNovoMenu.add(iCoordenador2);
		vpPainelNovoMenu.add(iParticipante2);
		vpPainelNovoMenu.add(iSair2);
		
		initWidget(vpPainelNovoMenu);
		
	}


	public VerticalPanel getVpPainelNovoMenu() {
		return vpPainelNovoMenu;
	}


	public void setVpPainelNovoMenu(VerticalPanel vpPainelNovoMenu) {
		this.vpPainelNovoMenu = vpPainelNovoMenu;
	}


	public Image getiMenu2() {
		return iMenu2;
	}


	public void setiMenu2(Image iMenu2) {
		this.iMenu2 = iMenu2;
	}


	public Image getiEvento2() {
		return iEvento2;
	}


	public void setiEvento2(Image iEvento2) {
		this.iEvento2 = iEvento2;
	}


	public Image getiCoordenador2() {
		return iCoordenador2;
	}


	public void setiCoordenador2(Image iCoordenador2) {
		this.iCoordenador2 = iCoordenador2;
	}


	public Image getiParticipante2() {
		return iParticipante2;
	}


	public void setiParticipante2(Image iParticipante2) {
		this.iParticipante2 = iParticipante2;
	}


	public Image getiSair2() {
		return iSair2;
	}


	public void setiSair2(Image iSair2) {
		this.iSair2 = iSair2;
	}

}
