package edu.ifg.formosa.gerente.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class GerentePesquisarParticipanteView extends Composite {
	
	private VerticalPanel vpPainelTrocaMenus;
	private VerticalPanel vpAreaPrincipal;
	private HorizontalPanel hpGuardaPainel;
	private HorizontalPanel hpFooter;
	private VerticalPanel vpTrocaFuncoes;
	private HorizontalPanel hpPainelTitulo;
	private VerticalPanel vpPainelTabela;
	private HorizontalPanel hpPainelPesquisarCriar;
	private VerticalPanel vpGuardaTitulo;
	private VerticalPanel vpPai;
	private FlexTable ftTabelaParticipante;
	private Label lbGerenciarParticipante;
	private TextBox tbPesquisarParticipante;
	private Button btnPesquisar;
	private Button btnExcluirSelecionados;
	
	public GerentePesquisarParticipanteView(){
		
		vpTrocaFuncoes = new VerticalPanel();
		vpTrocaFuncoes.setStyleName("vpTrocaFuncoes");
		
		hpPainelTitulo = new HorizontalPanel();
		hpPainelTitulo.setStyleName("hpPainelTitulo");
		
		hpPainelPesquisarCriar = new HorizontalPanel();
		hpPainelPesquisarCriar.setStyleName("hpPainelPesquisarCriar");
		
		vpGuardaTitulo = new VerticalPanel();
		vpGuardaTitulo.setStyleName("vpGuardaTitulo");
		
		vpGuardaTitulo.add(hpPainelTitulo);
		vpGuardaTitulo.add(hpPainelPesquisarCriar);
		
		lbGerenciarParticipante = new Label("Gerenciamento de Participantes"); 
		lbGerenciarParticipante.setStyleName("lbGerenciarParticipante");
		
		tbPesquisarParticipante = new TextBox();
		tbPesquisarParticipante.setStyleName("tbPesquisarParticipante");
		
		btnPesquisar = new Button("Pesquisar");
		btnPesquisar.setStyleName("btnPesquisar");
		
		btnExcluirSelecionados = new Button("Excluir Selecionados");
		btnExcluirSelecionados.setStyleName("btnExcluirSelecionados");
		
		hpPainelTitulo.add(lbGerenciarParticipante);
		hpPainelPesquisarCriar.add(tbPesquisarParticipante);
		hpPainelPesquisarCriar.setCellWidth(tbPesquisarParticipante, "10%");
		hpPainelPesquisarCriar.add(btnPesquisar);
		hpPainelPesquisarCriar.setCellWidth(btnPesquisar, "15%");
		hpPainelPesquisarCriar.add(btnExcluirSelecionados);
	
		vpPainelTabela = new VerticalPanel();
		vpPainelTabela.setStyleName("vpPainelTabela");
		vpPainelTabela.setHorizontalAlignment(HorizontalPanel.ALIGN_CENTER);
		
		ftTabelaParticipante = new FlexTable();
		ftTabelaParticipante.setStyleName("ftTabelaEvento");
		ftTabelaParticipante.getFlexCellFormatter().setVerticalAlignment(0, 0, DockPanel.ALIGN_TOP);
		ftTabelaParticipante.setBorderWidth(1); 
	    
		vpPainelTabela.add(ftTabelaParticipante);
		vpTrocaFuncoes.add(vpGuardaTitulo);
		vpTrocaFuncoes.add(vpPainelTabela);
	
		hpGuardaPainel = new HorizontalPanel();
		hpGuardaPainel.setStyleName("hpGuardaPainel");
		hpGuardaPainel.add(vpTrocaFuncoes);
		hpGuardaPainel.setCellWidth(vpTrocaFuncoes, "100%");

	
		//------------------------------------------------------------
		vpPai = new VerticalPanel();
		vpPai.setStyleName("vpPai");
		vpPai.add(vpTrocaFuncoes);
		initWidget(vpPai);
		
	}

	public VerticalPanel getVpPainelTrocaMenus() {
		return vpPainelTrocaMenus;
	}

	public void setVpPainelTrocaMenus(VerticalPanel vpPainelTrocaMenus) {
		this.vpPainelTrocaMenus = vpPainelTrocaMenus;
	}

	public VerticalPanel getVpAreaPrincipal() {
		return vpAreaPrincipal;
	}

	public void setVpAreaPrincipal(VerticalPanel vpAreaPrincipal) {
		this.vpAreaPrincipal = vpAreaPrincipal;
	}

	public HorizontalPanel getHpGuardaPainel() {
		return hpGuardaPainel;
	}

	public void setHpGuardaPainel(HorizontalPanel hpGuardaPainel) {
		this.hpGuardaPainel = hpGuardaPainel;
	}

	public HorizontalPanel getHpFooter() {
		return hpFooter;
	}

	public void setHpFooter(HorizontalPanel hpFooter) {
		this.hpFooter = hpFooter;
	}

	public VerticalPanel getVpTrocaFuncoes() {
		return vpTrocaFuncoes;
	}

	public void setVpTrocaFuncoes(VerticalPanel vpTrocaFuncoes) {
		this.vpTrocaFuncoes = vpTrocaFuncoes;
	}

	public HorizontalPanel getHpPainelTitulo() {
		return hpPainelTitulo;
	}

	public void setHpPainelTitulo(HorizontalPanel hpPainelTitulo) {
		this.hpPainelTitulo = hpPainelTitulo;
	}

	public VerticalPanel getVpPainelTabela() {
		return vpPainelTabela;
	}

	public void setVpPainelTabela(VerticalPanel vpPainelTabela) {
		this.vpPainelTabela = vpPainelTabela;
	}

	public HorizontalPanel getHpPainelPesquisarCriar() {
		return hpPainelPesquisarCriar;
	}

	public void setHpPainelPesquisarCriar(HorizontalPanel hpPainelPesquisarCriar) {
		this.hpPainelPesquisarCriar = hpPainelPesquisarCriar;
	}

	public VerticalPanel getVpGuardaTitulo() {
		return vpGuardaTitulo;
	}

	public void setVpGuardaTitulo(VerticalPanel vpGuardaTitulo) {
		this.vpGuardaTitulo = vpGuardaTitulo;
	}

	public VerticalPanel getVpPai() {
		return vpPai;
	}

	public void setVpPai(VerticalPanel vpPai) {
		this.vpPai = vpPai;
	}

	


	public FlexTable getFtTabelaParticipante() {
		return ftTabelaParticipante;
	}

	public void setFtTabelaParticipante(FlexTable ftTabelaParticipante) {
		this.ftTabelaParticipante = ftTabelaParticipante;
	}

	public Label getLbGerenciarParticipante() {
		return lbGerenciarParticipante;
	}

	public void setLbGerenciarParticipante(Label lbGerenciarParticipante) {
		this.lbGerenciarParticipante = lbGerenciarParticipante;
	}

	public TextBox getTbPesquisarParticipante() {
		return tbPesquisarParticipante;
	}

	public void setTbPesquisarParticipante(TextBox tbPesquisarParticipante) {
		this.tbPesquisarParticipante = tbPesquisarParticipante;
	}

	public Button getBtnPesquisar() {
		return btnPesquisar;
	}

	public void setBtnPesquisar(Button btnPesquisar) {
		this.btnPesquisar = btnPesquisar;
	}

	public Button getBtnExcluirSelecionados() {
		return btnExcluirSelecionados;
	}

	public void setBtnExcluirSelecionados(Button btnExcluirSelecionados) {
		this.btnExcluirSelecionados = btnExcluirSelecionados;
	}

}