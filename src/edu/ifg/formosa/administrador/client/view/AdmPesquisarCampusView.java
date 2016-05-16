package edu.ifg.formosa.administrador.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import edu.ifg.formosa.administrador.client.util.FlexTableEventIF;

public class AdmPesquisarCampusView extends Composite{
	
	private HorizontalPanel hpPainelTituloPaginaPesquisarCampus;
	private HorizontalPanel hpPainelPesquisarAdicionarExcluirCampus;
	private VerticalPanel vpPainelTabelaCampus;
	private VerticalPanel vpPainelPesquisarAdicionarCampus;
	private Label lbTituloPaginaPesquisarCampus;
	private TextBox tbPesquisarCampus;
	private Button btnPesquisarCampus;
	private Button btnAdicionarCampus;
	private Button btnExcluirCampus;
	private FlexTableEventIF ftTabelaCampus;
	
	
	public AdmPesquisarCampusView(){
		hpPainelTituloPaginaPesquisarCampus = new HorizontalPanel();
		hpPainelTituloPaginaPesquisarCampus.setStyleName("hpPainelTituloPaginaPesquisarCampus");
		
		lbTituloPaginaPesquisarCampus = new Label("Gerenciamento de Câmpus");
		lbTituloPaginaPesquisarCampus.setStyleName("lbTituloPaginaPesquisarCampus"); //add item
		
		hpPainelTituloPaginaPesquisarCampus.add(lbTituloPaginaPesquisarCampus);//add item
		
		hpPainelPesquisarAdicionarExcluirCampus = new HorizontalPanel();
		hpPainelPesquisarAdicionarExcluirCampus.setStyleName("hpPainelPesquisarAdicionarExcluirCampus");
		
		tbPesquisarCampus = new TextBox();
		tbPesquisarCampus.setStyleName("tbPesquisarCampus");
		
		btnPesquisarCampus = new Button("Pesquisar");
		btnPesquisarCampus.setStyleName("btnPesquisarCampus");
		
		btnAdicionarCampus = new Button("Adicionar");
		btnAdicionarCampus.setStyleName("btnAdicionarCampus");
		
		btnExcluirCampus = new Button("Excluir");
		btnExcluirCampus.setStyleName("btnExcluirCampus");
		
		hpPainelPesquisarAdicionarExcluirCampus.add(tbPesquisarCampus);//add item
		hpPainelPesquisarAdicionarExcluirCampus.setCellWidth(tbPesquisarCampus, "30%");
		hpPainelPesquisarAdicionarExcluirCampus.add(btnPesquisarCampus);//add item
		hpPainelPesquisarAdicionarExcluirCampus.setCellWidth(btnPesquisarCampus, "5%");
		hpPainelPesquisarAdicionarExcluirCampus.add(btnAdicionarCampus);//add item
		hpPainelPesquisarAdicionarExcluirCampus.setCellWidth(btnAdicionarCampus, "5%");
		hpPainelPesquisarAdicionarExcluirCampus.add(btnExcluirCampus);//add item
		hpPainelPesquisarAdicionarExcluirCampus.setCellWidth(btnExcluirCampus, "30%");
		
		vpPainelTabelaCampus = new VerticalPanel();
		vpPainelTabelaCampus.setStyleName("vpPainelTabelaCampus");
		
		ftTabelaCampus = new FlexTableEventIF();
		ftTabelaCampus.setStyleName("ftTabelaCampus");
		ftTabelaCampus.getFt().getFlexCellFormatter().setVerticalAlignment(0, 0, DockPanel.ALIGN_TOP);
		ftTabelaCampus.getFt().setBorderWidth(1);
		
		vpPainelTabelaCampus.add(ftTabelaCampus);//add item
		
		vpPainelPesquisarAdicionarCampus = new VerticalPanel();
		vpPainelPesquisarAdicionarCampus.setStyleName("vpPainelPesquisarAdicionarCampus");
		
		vpPainelPesquisarAdicionarCampus.add(hpPainelTituloPaginaPesquisarCampus);//add item
		vpPainelPesquisarAdicionarCampus.add(hpPainelPesquisarAdicionarExcluirCampus);//add item
		vpPainelPesquisarAdicionarCampus.add(vpPainelTabelaCampus);//add item
		
		initWidget(vpPainelPesquisarAdicionarCampus);//inicializa
	}


	public HorizontalPanel getHpPainelTituloPaginaPesquisarCampus() {
		return hpPainelTituloPaginaPesquisarCampus;
	}


	public void setHpPainelTituloPaginaPesquisarCampus(HorizontalPanel hpPainelTituloPaginaPesquisarCampus) {
		this.hpPainelTituloPaginaPesquisarCampus = hpPainelTituloPaginaPesquisarCampus;
	}


	public HorizontalPanel getHpPainelPesquisarAdicionarExcluirCampus() {
		return hpPainelPesquisarAdicionarExcluirCampus;
	}


	public void setHpPainelPesquisarAdicionarExcluirCampus(HorizontalPanel hpPainelPesquisarAdicionarExcluirCampus) {
		this.hpPainelPesquisarAdicionarExcluirCampus = hpPainelPesquisarAdicionarExcluirCampus;
	}


	public VerticalPanel getVpPainelTabelaCampus() {
		return vpPainelTabelaCampus;
	}


	public void setVpPainelTabelaCampus(VerticalPanel vpPainelTabelaCampus) {
		this.vpPainelTabelaCampus = vpPainelTabelaCampus;
	}


	public VerticalPanel getVpPainelPesquisarAdicionarCampus() {
		return vpPainelPesquisarAdicionarCampus;
	}


	public void setVpPainelPesquisarAdicionarCampus(VerticalPanel vpPainelPesquisarAdicionarCampus) {
		this.vpPainelPesquisarAdicionarCampus = vpPainelPesquisarAdicionarCampus;
	}


	public Label getLbTituloPaginaPesquisarCampus() {
		return lbTituloPaginaPesquisarCampus;
	}


	public void setLbTituloPaginaPesquisarCampus(Label lbTituloPaginaPesquisarCampus) {
		this.lbTituloPaginaPesquisarCampus = lbTituloPaginaPesquisarCampus;
	}


	public TextBox getTbPesquisarCampus() {
		return tbPesquisarCampus;
	}


	public void setTbPesquisarCampus(TextBox tbPesquisarCampus) {
		this.tbPesquisarCampus = tbPesquisarCampus;
	}


	public Button getBtnPesquisarCampus() {
		return btnPesquisarCampus;
	}


	public void setBtnPesquisarCampus(Button btnPesquisarCampus) {
		this.btnPesquisarCampus = btnPesquisarCampus;
	}


	public Button getBtnAdicionarCampus() {
		return btnAdicionarCampus;
	}


	public void setBtnAdicionarCampus(Button btnAdicionarCampus) {
		this.btnAdicionarCampus = btnAdicionarCampus;
	}


	public Button getBtnExcluirCampus() {
		return btnExcluirCampus;
	}


	public void setBtnExcluirCampus(Button btnExcluirCampus) {
		this.btnExcluirCampus = btnExcluirCampus;
	}


	public FlexTableEventIF getFtTabelaCampus() {
		return ftTabelaCampus;
	}


	public void setFtTabelaCampus(FlexTableEventIF ftTabelaCampus) {
		this.ftTabelaCampus = ftTabelaCampus;
	}


	

}
