package edu.ifg.formosa.gerente.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import edu.ifg.formosa.gerente.client.util.FlexTableEventIF;

public class GerentePesquisarCoordenadorView extends Composite {
	
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
	private FlexTableEventIF ftTabelaCoordenador;
	private Label lbGerenciarCoordenador;
	private Label lbNomeTituloTabelaCoor;
	private Label lbEventoCoordenado;
	private Label lbQtdHoras;
	private TextBox tbPesquisarCoordenador;
	private Button btnPesquisar;
	private Button btnExcluirSelecionados;
	
	
	public GerentePesquisarCoordenadorView(){
		
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
		
		lbGerenciarCoordenador = new Label("Gerenciamento de Coordenadores"); 
		lbGerenciarCoordenador.setStyleName("lbGerenciarParticipante");
		
		tbPesquisarCoordenador = new TextBox();
		tbPesquisarCoordenador.setStyleName("tbPesquisarParticipante");
		
		btnPesquisar = new Button("Pesquisar");
		btnPesquisar.setStyleName("btnPesquisar");
		
		btnExcluirSelecionados = new Button("Excluir Selecionados");
		btnExcluirSelecionados.setStyleName("btnExcluirSelecionados");
		
		hpPainelTitulo.add(lbGerenciarCoordenador);
		hpPainelPesquisarCriar.add(tbPesquisarCoordenador);
		hpPainelPesquisarCriar.setCellWidth(tbPesquisarCoordenador, "10%");
		hpPainelPesquisarCriar.add(btnPesquisar);
		hpPainelPesquisarCriar.setCellWidth(btnPesquisar, "15%");
		hpPainelPesquisarCriar.add(btnExcluirSelecionados);
	
		vpPainelTabela = new VerticalPanel();
		vpPainelTabela.setStyleName("vpPainelTabela");
		vpPainelTabela.setHorizontalAlignment(HorizontalPanel.ALIGN_CENTER);
		
		ftTabelaCoordenador = new FlexTableEventIF();
		ftTabelaCoordenador.setStyleName("ftTabelaEvento");
		ftTabelaCoordenador.getFt().getFlexCellFormatter().setVerticalAlignment(0, 0, DockPanel.ALIGN_TOP);
		ftTabelaCoordenador.getFt().setBorderWidth(1);
		
		lbNomeTituloTabelaCoor = new Label("Nome");
		lbNomeTituloTabelaCoor.setStyleName("lbNomeTituloTabelaCoor");
		
		lbEventoCoordenado = new Label("Evento Coordenado");
		lbEventoCoordenado.setStyleName("lbEventoCoordenado");
		
		lbQtdHoras = new Label("Horas Total");
		lbQtdHoras.setStyleName("lbQtdHoras");
	    
		vpPainelTabela.add(ftTabelaCoordenador);
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
		//criarTituloTabela();
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

	public Label getLbGerenciarParticipante() {
		return lbGerenciarCoordenador;
	}

	public void setLbGerenciarParticipante(Label lbGerenciarParticipante) {
		this.lbGerenciarCoordenador = lbGerenciarParticipante;
	}

	public TextBox getTbPesquisarParticipante() {
		return tbPesquisarCoordenador;
	}

	public void setTbPesquisarParticipante(TextBox tbPesquisarParticipante) {
		this.tbPesquisarCoordenador = tbPesquisarParticipante;
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



	public FlexTableEventIF getFtTabelaCoordenador() {
		return ftTabelaCoordenador;
	}



	public void setFtTabelaCoordenador(FlexTableEventIF ftTabelaCoordenador) {
		this.ftTabelaCoordenador = ftTabelaCoordenador;
	}



	public Label getLbGerenciarCoordenador() {
		return lbGerenciarCoordenador;
	}



	public void setLbGerenciarCoordenador(Label lbGerenciarCoordenador) {
		this.lbGerenciarCoordenador = lbGerenciarCoordenador;
	}



	public Label getLbNomeTituloTabelaCoor() {
		return lbNomeTituloTabelaCoor;
	}



	public void setLbNomeTituloTabelaCoor(Label lbNomeTituloTabelaCoor) {
		this.lbNomeTituloTabelaCoor = lbNomeTituloTabelaCoor;
	}



	public Label getLbEventoCoordenado() {
		return lbEventoCoordenado;
	}



	public void setLbEventoCoordenado(Label lbEventoCoordenado) {
		this.lbEventoCoordenado = lbEventoCoordenado;
	}



	public Label getLbQtdHoras() {
		return lbQtdHoras;
	}



	public void setLbQtdHoras(Label lbQtdHoras) {
		this.lbQtdHoras = lbQtdHoras;
	}



	public TextBox getTbPesquisarCoordenador() {
		return tbPesquisarCoordenador;
	}



	public void setTbPesquisarCoordenador(TextBox tbPesquisarCoordenador) {
		this.tbPesquisarCoordenador = tbPesquisarCoordenador;
	}

}