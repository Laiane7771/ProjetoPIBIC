package edu.ifg.formosa.participante.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HomeTelaInicialParticipanteView extends Composite{
	
	private HorizontalPanel hpPainelTituloHome;
	private HorizontalPanel hpPainelTextboxButtonPesquisar;
	private HorizontalPanel hpPainelTabelaEventos;
	private VerticalPanel vpPainelPesquisarEventoTotal;
	private VerticalPanel vpPainelGuardaPaginaPesquisarEvento;
	private Label lbTituloPaginaPesquisar;
	private Button btnPesquisarEventoParticipante;
	private TextBox tbPesquisarEvento;
	private FlexTable ftTabelaEventoTelaParticipante;
	
	public HomeTelaInicialParticipanteView(){
		//Painel Titulo---------------
		hpPainelTituloHome = new HorizontalPanel();
		hpPainelTituloHome.setStyleName("hpPainelTituloHome");
		
		lbTituloPaginaPesquisar = new Label("Pesquisar Evento");
		lbTituloPaginaPesquisar.setStyleName("lbTituloPaginaPesquisar");
		
		hpPainelTituloHome.add(lbTituloPaginaPesquisar);
		
		//------------------------------------------------------
		//Painel Pesquisar-------------------------------------
		hpPainelTextboxButtonPesquisar = new HorizontalPanel();
		hpPainelTextboxButtonPesquisar.setStyleName("hpPainelTextboxButtonPesquisar");
		
		tbPesquisarEvento = new TextBox();
		tbPesquisarEvento.setStyleName("tbPesquisarEvento");
		
		btnPesquisarEventoParticipante = new Button("Pesquisar");
		btnPesquisarEventoParticipante.setStyleName("btnPesquisarEventoParticipante");
		
		hpPainelTextboxButtonPesquisar.add(tbPesquisarEvento); //add item
		hpPainelTextboxButtonPesquisar.setCellWidth(tbPesquisarEvento, "40%");
		hpPainelTextboxButtonPesquisar.add(btnPesquisarEventoParticipante); //add item
		hpPainelTextboxButtonPesquisar.setCellWidth(btnPesquisarEventoParticipante, "40%");
		
		//-------------------------------------------------
		//Painel Tabela Evento-----------------------------
		hpPainelTabelaEventos = new HorizontalPanel();
		hpPainelTabelaEventos.setStyleName("hpPainelTabelaEventos");
		
		ftTabelaEventoTelaParticipante = new FlexTable();
		ftTabelaEventoTelaParticipante.setStyleName("ftTabelaEventoTelaParticipante");
		
		hpPainelTabelaEventos.add(ftTabelaEventoTelaParticipante); //add item
		
		//------------------------------------------------------------
		//Painel add todos os itens---------------------------------
		vpPainelGuardaPaginaPesquisarEvento = new VerticalPanel();
		vpPainelGuardaPaginaPesquisarEvento.setStyleName("vpPainelGuardaPaginaPesquisarEvento");
		
		vpPainelGuardaPaginaPesquisarEvento.add(hpPainelTituloHome); //add item
		vpPainelGuardaPaginaPesquisarEvento.add(hpPainelTextboxButtonPesquisar); //add item
		vpPainelGuardaPaginaPesquisarEvento.add(hpPainelTabelaEventos);//add item
		
		//-------------------------------------------------------
		
		vpPainelPesquisarEventoTotal = new VerticalPanel();
		vpPainelPesquisarEventoTotal.setStyleName("vpPainelPesquisarEventoTotal");
		
		vpPainelPesquisarEventoTotal.add(vpPainelGuardaPaginaPesquisarEvento);//add item
		
		initWidget(vpPainelPesquisarEventoTotal);
		
	}

	public HorizontalPanel getHpPainelTituloHome() {
		return hpPainelTituloHome;
	}

	public void setHpPainelTituloHome(HorizontalPanel hpPainelTituloHome) {
		this.hpPainelTituloHome = hpPainelTituloHome;
	}

	public HorizontalPanel getHpPainelTextboxButtonPesquisar() {
		return hpPainelTextboxButtonPesquisar;
	}

	public void setHpPainelTextboxButtonPesquisar(
			HorizontalPanel hpPainelTextboxButtonPesquisar) {
		this.hpPainelTextboxButtonPesquisar = hpPainelTextboxButtonPesquisar;
	}

	public HorizontalPanel getHpPainelTabelaEventos() {
		return hpPainelTabelaEventos;
	}

	public void setHpPainelTabelaEventos(HorizontalPanel hpPainelTabelaEventos) {
		this.hpPainelTabelaEventos = hpPainelTabelaEventos;
	}

	public VerticalPanel getVpPainelPesquisarEventoTotal() {
		return vpPainelPesquisarEventoTotal;
	}

	public void setVpPainelPesquisarEventoTotal(
			VerticalPanel vpPainelPesquisarEventoTotal) {
		this.vpPainelPesquisarEventoTotal = vpPainelPesquisarEventoTotal;
	}

	public VerticalPanel getVpPainelGuardaPaginaPesquisarEvento() {
		return vpPainelGuardaPaginaPesquisarEvento;
	}

	public void setVpPainelGuardaPaginaPesquisarEvento(
			VerticalPanel vpPainelGuardaPaginaPesquisarEvento) {
		this.vpPainelGuardaPaginaPesquisarEvento = vpPainelGuardaPaginaPesquisarEvento;
	}

	public Label getLbTituloPaginaPesquisar() {
		return lbTituloPaginaPesquisar;
	}

	public void setLbTituloPaginaPesquisar(Label lbTituloPaginaPesquisar) {
		this.lbTituloPaginaPesquisar = lbTituloPaginaPesquisar;
	}

	public Button getBtnPesquisarEventoParticipante() {
		return btnPesquisarEventoParticipante;
	}

	public void setBtnPesquisarEventoParticipante(
			Button btnPesquisarEventoParticipante) {
		this.btnPesquisarEventoParticipante = btnPesquisarEventoParticipante;
	}

	public TextBox getTbPesquisarEvento() {
		return tbPesquisarEvento;
	}

	public void setTbPesquisarEvento(TextBox tbPesquisarEvento) {
		this.tbPesquisarEvento = tbPesquisarEvento;
	}

	public FlexTable getFtTabelaEventoTelaParticipante() {
		return ftTabelaEventoTelaParticipante;
	}

	public void setFtTabelaEventoTelaParticipante(
			FlexTable ftTabelaEventoTelaParticipante) {
		this.ftTabelaEventoTelaParticipante = ftTabelaEventoTelaParticipante;
	}

}
