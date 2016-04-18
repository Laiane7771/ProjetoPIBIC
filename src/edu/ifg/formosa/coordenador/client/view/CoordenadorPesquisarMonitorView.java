package edu.ifg.formosa.coordenador.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CoordenadorPesquisarMonitorView extends Composite{
	
	private HorizontalPanel hpPainelTituloPesquisarMonitor;
	private HorizontalPanel hpPainelTextBoxButtonMonitor;
	private HorizontalPanel hpPainelTabelaMonitores;
	private VerticalPanel vpPainelPesquisarMonitor;
	private Label lbPesquisarMonitor;
	private TextBox tbPesquisarMonitor;
	private Button btnPesquisarMonitor;
	private FlexTable ftTabelaMonitores;
	
	public CoordenadorPesquisarMonitorView(){
		//------------------------------------------------
		hpPainelTituloPesquisarMonitor = new HorizontalPanel();
		hpPainelTituloPesquisarMonitor.setStyleName("hpPainelTituloPesquisarMonitor");
		
		lbPesquisarMonitor = new Label("Pesquisar Monitor");
		lbPesquisarMonitor.setStyleName("lbPesquisarMonitor");
		
		hpPainelTituloPesquisarMonitor.add(lbPesquisarMonitor);//add item
		hpPainelTituloPesquisarMonitor.setCellWidth(lbPesquisarMonitor, "10%");
		//---------------------------------------------------------
		
		hpPainelTextBoxButtonMonitor = new HorizontalPanel();
		hpPainelTextBoxButtonMonitor.setStyleName("hpPainelTextBoxButtonMonitor");
		
		tbPesquisarMonitor = new TextBox();
		tbPesquisarMonitor.setStyleName("tbPesquisarMonitor");
		
		btnPesquisarMonitor = new Button("Pesquisar");
		btnPesquisarMonitor.setStyleName("btnPesquisarMonitor");
		
		hpPainelTextBoxButtonMonitor.add(tbPesquisarMonitor);//add item
		hpPainelTextBoxButtonMonitor.setCellWidth(tbPesquisarMonitor, "10%");
		hpPainelTextBoxButtonMonitor.add(btnPesquisarMonitor);//add item
		hpPainelTextBoxButtonMonitor.setCellWidth(btnPesquisarMonitor, "10%");
		//------------------------------------------------
		
		hpPainelTabelaMonitores = new HorizontalPanel();
		hpPainelTabelaMonitores.setStyleName("hpPainelTabelaMonitores");
		
		ftTabelaMonitores = new FlexTable();
		ftTabelaMonitores.setStyleName("ftTabelaMonitores");
		ftTabelaMonitores.setText(0, 0, "Nome");
		ftTabelaMonitores.setText(0, 1, "Matricula");
		
		hpPainelTabelaMonitores.add(ftTabelaMonitores);//add item
		//---------------------------------------------------
		vpPainelPesquisarMonitor = new VerticalPanel();
		vpPainelPesquisarMonitor.setStyleName("vpPainelPesquisarMonitor");
		
		vpPainelPesquisarMonitor.add(hpPainelTituloPesquisarMonitor);//add item
		vpPainelPesquisarMonitor.add(hpPainelTextBoxButtonMonitor);//add item
		vpPainelPesquisarMonitor.add(hpPainelTabelaMonitores);//add item
		
		initWidget(vpPainelPesquisarMonitor);//inicializa
		
	}

	public HorizontalPanel getHpPainelTituloPesquisarMonitor() {
		return hpPainelTituloPesquisarMonitor;
	}

	public void setHpPainelTituloPesquisarMonitor(
			HorizontalPanel hpPainelTituloPesquisarMonitor) {
		this.hpPainelTituloPesquisarMonitor = hpPainelTituloPesquisarMonitor;
	}

	public HorizontalPanel getHpPainelTextBoxButtonMonitor() {
		return hpPainelTextBoxButtonMonitor;
	}

	public void setHpPainelTextBoxButtonMonitor(
			HorizontalPanel hpPainelTextBoxButtonMonitor) {
		this.hpPainelTextBoxButtonMonitor = hpPainelTextBoxButtonMonitor;
	}

	public HorizontalPanel getHpPainelTabelaMonitores() {
		return hpPainelTabelaMonitores;
	}

	public void setHpPainelTabelaMonitores(HorizontalPanel hpPainelTabelaMonitores) {
		this.hpPainelTabelaMonitores = hpPainelTabelaMonitores;
	}

	public VerticalPanel getVpPainelPesquisarMonitor() {
		return vpPainelPesquisarMonitor;
	}

	public void setVpPainelPesquisarMonitor(VerticalPanel vpPainelPesquisarMonitor) {
		this.vpPainelPesquisarMonitor = vpPainelPesquisarMonitor;
	}

	public Label getLbPesquisarMonitor() {
		return lbPesquisarMonitor;
	}

	public void setLbPesquisarMonitor(Label lbPesquisarMonitor) {
		this.lbPesquisarMonitor = lbPesquisarMonitor;
	}

	public TextBox getTbPesquisarMonitor() {
		return tbPesquisarMonitor;
	}

	public void setTbPesquisarMonitor(TextBox tbPesquisarMonitor) {
		this.tbPesquisarMonitor = tbPesquisarMonitor;
	}

	public Button getBtnPesquisarMonitor() {
		return btnPesquisarMonitor;
	}

	public void setBtnPesquisarMonitor(Button btnPesquisarMonitor) {
		this.btnPesquisarMonitor = btnPesquisarMonitor;
	}

	public FlexTable getFtTabelaMonitores() {
		return ftTabelaMonitores;
	}

	public void setFtTabelaMonitores(FlexTable ftTabelaMonitores) {
		this.ftTabelaMonitores = ftTabelaMonitores;
	}

}
