package edu.ifg.formosa.gerente.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class GerenteImprimirCrachaCoordenadorView extends Composite{

	
	private HorizontalPanel hpPainelTituloCrachaCoordenador;
	private HorizontalPanel hpPainelPesquisarCoordenadorCracha;
	private HorizontalPanel hpPainelTabelaCoordenadorCracha;
	private VerticalPanel vpPainelImprimeCrachaCoordenadores;
	private VerticalPanel vpPainelAreaTotalCrachaCoordenadores;
	private Label lbTituloCrachasCoordenadores;
	private TextBox tbPesquisarCoordenadorCracha;
	private Button btnPesquisarCrachaCoordenador;
	private Button btnGerarTodosCrachasCoordenador;
	private FlexTable ftTabelaCrachasCoordenador;
	
	public GerenteImprimirCrachaCoordenadorView(){
		//Painel titulo pagina cracha coordenador-------------------
		hpPainelTituloCrachaCoordenador = new HorizontalPanel();
		hpPainelTituloCrachaCoordenador.setStyleName("hpPainelTituloCrachaCoordenador");
		
		lbTituloCrachasCoordenadores = new Label("Crachás");
		lbTituloCrachasCoordenadores.setStyleName("lbTituloCrachasCoordenadores");
		
		hpPainelTituloCrachaCoordenador.add(lbTituloCrachasCoordenadores);//add item
		
		//-------Painel Pesquisar coordenador--------------------------
		hpPainelPesquisarCoordenadorCracha = new HorizontalPanel();
		hpPainelPesquisarCoordenadorCracha.setStyleName("hpPainelPesquisarCoordenadorCracha");
		
		tbPesquisarCoordenadorCracha = new TextBox();
		tbPesquisarCoordenadorCracha.setStyleName("tbPesquisarCoordenadorCracha");
		
		btnPesquisarCrachaCoordenador = new Button("Pesquisar");
		btnPesquisarCrachaCoordenador.setStyleName("btnPesquisarCrachaCoordenador");
		
		btnGerarTodosCrachasCoordenador = new Button("Gerar Todos");
		btnGerarTodosCrachasCoordenador.setStyleName("btnGerarTodosCrachasCoordenador");
		
		hpPainelPesquisarCoordenadorCracha.add(tbPesquisarCoordenadorCracha); //add item
		hpPainelPesquisarCoordenadorCracha.setCellWidth(tbPesquisarCoordenadorCracha, "60%");
		hpPainelPesquisarCoordenadorCracha.add(btnPesquisarCrachaCoordenador); //add item
		hpPainelPesquisarCoordenadorCracha.setCellWidth(btnPesquisarCrachaCoordenador, "10%");
		hpPainelPesquisarCoordenadorCracha.add(btnGerarTodosCrachasCoordenador);//add item
		hpPainelPesquisarCoordenadorCracha.setCellWidth(btnGerarTodosCrachasCoordenador,"20%");
		
		//-------Painel tabela coordenador-------------------------------
		hpPainelTabelaCoordenadorCracha = new HorizontalPanel();
		hpPainelTabelaCoordenadorCracha.setStyleName("hpPainelTabelaCoordenadorCracha");
		
		ftTabelaCrachasCoordenador = new FlexTable();
		ftTabelaCrachasCoordenador.setStyleName("ftTabelaCrachasCoordenador");
		ftTabelaCrachasCoordenador.getFlexCellFormatter().setVerticalAlignment(0, 0, DockPanel.ALIGN_TOP);
		ftTabelaCrachasCoordenador.setBorderWidth(1);
		
		hpPainelTabelaCoordenadorCracha.add(ftTabelaCrachasCoordenador); //add item
		
		//----------------Painel mae dos outros paineis-------------------
		vpPainelImprimeCrachaCoordenadores = new VerticalPanel();
		vpPainelImprimeCrachaCoordenadores.setStyleName("vpPainelImprimeCrachaCoordenadores");
		
		vpPainelImprimeCrachaCoordenadores.add(hpPainelTituloCrachaCoordenador); //add item
		vpPainelImprimeCrachaCoordenadores.add(hpPainelPesquisarCoordenadorCracha); //add item
		vpPainelImprimeCrachaCoordenadores.add(hpPainelTabelaCoordenadorCracha); //add item
		 
		//-----------------Painel mae de todos----------------------------
		vpPainelAreaTotalCrachaCoordenadores = new VerticalPanel();
		vpPainelAreaTotalCrachaCoordenadores.setStyleName("vpPainelAreaTotalCrachaCoordenadores");
		
		vpPainelAreaTotalCrachaCoordenadores.add(vpPainelImprimeCrachaCoordenadores); //add item
		
		initWidget(vpPainelAreaTotalCrachaCoordenadores);
	}

	public HorizontalPanel getHpPainelTituloCrachaCoordenador() {
		return hpPainelTituloCrachaCoordenador;
	}

	public void setHpPainelTituloCrachaCoordenador(
			HorizontalPanel hpPainelTituloCrachaCoordenador) {
		this.hpPainelTituloCrachaCoordenador = hpPainelTituloCrachaCoordenador;
	}

	public HorizontalPanel getHpPainelPesquisarCoordenadorCracha() {
		return hpPainelPesquisarCoordenadorCracha;
	}

	public void setHpPainelPesquisarCoordenadorCracha(
			HorizontalPanel hpPainelPesquisarCoordenadorCracha) {
		this.hpPainelPesquisarCoordenadorCracha = hpPainelPesquisarCoordenadorCracha;
	}

	public HorizontalPanel getHpPainelTabelaCoordenadorCracha() {
		return hpPainelTabelaCoordenadorCracha;
	}

	public void setHpPainelTabelaCoordenadorCracha(
			HorizontalPanel hpPainelTabelaCoordenadorCracha) {
		this.hpPainelTabelaCoordenadorCracha = hpPainelTabelaCoordenadorCracha;
	}

	public VerticalPanel getVpPainelImprimeCrachaCoordenadores() {
		return vpPainelImprimeCrachaCoordenadores;
	}

	public void setVpPainelImprimeCrachaCoordenadores(
			VerticalPanel vpPainelImprimeCrachaCoordenadores) {
		this.vpPainelImprimeCrachaCoordenadores = vpPainelImprimeCrachaCoordenadores;
	}

	public VerticalPanel getVpPainelAreaTotalCrachaCoordenadores() {
		return vpPainelAreaTotalCrachaCoordenadores;
	}

	public void setVpPainelAreaTotalCrachaCoordenadores(
			VerticalPanel vpPainelAreaTotalCrachaCoordenadores) {
		this.vpPainelAreaTotalCrachaCoordenadores = vpPainelAreaTotalCrachaCoordenadores;
	}

	public Label getLbTituloCrachasCoordenadores() {
		return lbTituloCrachasCoordenadores;
	}

	public void setLbTituloCrachasCoordenadores(Label lbTituloCrachasCoordenadores) {
		this.lbTituloCrachasCoordenadores = lbTituloCrachasCoordenadores;
	}

	public TextBox getTbPesquisarCoordenadorCracha() {
		return tbPesquisarCoordenadorCracha;
	}

	public void setTbPesquisarCoordenadorCracha(TextBox tbPesquisarCoordenadorCracha) {
		this.tbPesquisarCoordenadorCracha = tbPesquisarCoordenadorCracha;
	}

	public Button getBtnPesquisarCrachaCoordenador() {
		return btnPesquisarCrachaCoordenador;
	}

	public void setBtnPesquisarCrachaCoordenador(
			Button btnPesquisarCrachaCoordenador) {
		this.btnPesquisarCrachaCoordenador = btnPesquisarCrachaCoordenador;
	}

	public Button getBtnGerarTodosCrachasCoordenador() {
		return btnGerarTodosCrachasCoordenador;
	}

	public void setBtnGerarTodosCrachasCoordenador(
			Button btnGerarTodosCrachasCoordenador) {
		this.btnGerarTodosCrachasCoordenador = btnGerarTodosCrachasCoordenador;
	}

	public FlexTable getFtTabelaCrachasCoordenador() {
		return ftTabelaCrachasCoordenador;
	}

	public void setFtTabelaCrachasCoordenador(FlexTable ftTabelaCrachasCoordenador) {
		this.ftTabelaCrachasCoordenador = ftTabelaCrachasCoordenador;
	}
	
	
}
