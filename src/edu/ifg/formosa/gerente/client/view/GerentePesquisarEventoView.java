package edu.ifg.formosa.gerente.client.view;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class GerentePesquisarEventoView extends Composite{
	
	private VerticalPanel vpPainelGerentePesquisaEvento;
	private HorizontalPanel hpPainelCabecalho;
	private VerticalPanel vpPainelTabela;
	private Label lbGerenciando;
	private TextBox tbPesquisarEvento;
	private Image iPesquisar;
	private Label lbAdicionar;
	private FlexTable ftTabelaEvento;
	
	public GerentePesquisarEventoView(){
		
		vpPainelGerentePesquisaEvento = new VerticalPanel();
		vpPainelGerentePesquisaEvento.setStyleName("vpPainelGerentePesquisaEvento");
		
		hpPainelCabecalho = new HorizontalPanel();
		hpPainelCabecalho.setStyleName("hpPainelCabecalho");
		
		lbGerenciando = new Label("Gerenciando os Eventos");
		lbGerenciando.setStyleName("lbGerenciando");
		
		tbPesquisarEvento = new TextBox();
		tbPesquisarEvento.setStyleName("tbPesquisarEvento");
		
		lbAdicionar = new Label("Adicionar");
		lbAdicionar.setStyleName("lbAdicionar");
		
		hpPainelCabecalho.add(lbGerenciando);
		hpPainelCabecalho.add(tbPesquisarEvento);
		hpPainelCabecalho.add(lbAdicionar);
		
		vpPainelTabela = new VerticalPanel();
		vpPainelTabela.setStyleName("vpPainelTabela");
		
		ftTabelaEvento = new FlexTable();
		ftTabelaEvento.setStyleName("ftTabelaEvento");
		ftTabelaEvento.setWidth("70%");
		ftTabelaEvento.setHeight("18em");
		ftTabelaEvento.getFlexCellFormatter().setVerticalAlignment(0, 0, DockPanel.ALIGN_TOP);
		ftTabelaEvento.setBorderWidth(1);
	
		vpPainelTabela.add(ftTabelaEvento);
		vpPainelGerentePesquisaEvento.add(hpPainelCabecalho);
		vpPainelGerentePesquisaEvento.add(vpPainelTabela);
		
		initWidget(vpPainelGerentePesquisaEvento);
	}

	public VerticalPanel getVpPainelGerentePesquisaEvento() {
		return vpPainelGerentePesquisaEvento;
	}

	public void setVpPainelGerentePesquisaEvento(
			VerticalPanel vpPainelGerentePesquisaEvento) {
		this.vpPainelGerentePesquisaEvento = vpPainelGerentePesquisaEvento;
	}

	public HorizontalPanel getHpPainelCabecalho() {
		return hpPainelCabecalho;
	}

	public void setHpPainelCabecalho(HorizontalPanel hpPainelCabecalho) {
		this.hpPainelCabecalho = hpPainelCabecalho;
	}

	public VerticalPanel getVpPainelTabela() {
		return vpPainelTabela;
	}

	public void setVpPainelTabela(VerticalPanel vpPainelTabela) {
		this.vpPainelTabela = vpPainelTabela;
	}

	public Label getLbGerenciando() {
		return lbGerenciando;
	}

	public void setLbGerenciando(Label lbGerenciando) {
		this.lbGerenciando = lbGerenciando;
	}

	public TextBox getTbPesquisarEvento() {
		return tbPesquisarEvento;
	}

	public void setTbPesquisarEvento(TextBox tbPesquisarEvento) {
		this.tbPesquisarEvento = tbPesquisarEvento;
	}

	public Image getiPesquisar() {
		return iPesquisar;
	}

	public void setiPesquisar(Image iPesquisar) {
		this.iPesquisar = iPesquisar;
	}

	public Label getLbAdicionar() {
		return lbAdicionar;
	}

	public void setLbAdicionar(Label lbAdicionar) {
		this.lbAdicionar = lbAdicionar;
	}

	public FlexTable getFtTabelaEvento() {
		return ftTabelaEvento;
	}

	public void setFtTabelaEvento(FlexTable ftTabelaEvento) {
		this.ftTabelaEvento = ftTabelaEvento;
	}
	
}
