package edu.ifg.formosa.gerente.client.view;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HomeGerenteView extends Composite {
	
	private VerticalPanel vpPainelTrocaMenus;
	private VerticalPanel vpAreaPrincipal;
	private VerticalPanel vpTrocaFuncoes;
	private VerticalPanel vpPainelTabela;
	private VerticalPanel vpGuardaTitulo;
	private VerticalPanel vpPai;
	private HorizontalPanel hpPainelTitulo;
	private HorizontalPanel hpGuardaPainel;
	private HorizontalPanel hpPainelPesquisarCriar;
	private FlexTable ftTabelaEvento;
	private Label lbGerenciarEvento;
	private TextBox tbPesquisarEvento;
	private Button btnPesquisar;
	private Button btnExcluirSelecionados;
	private Button btnListarAtividadesEvento;
	private Label lbNomeTitulo;
	private Label lbDataInicioTitulo;
	private Label lbDataEncerraTitulo;
	private Label lbCoordenadorTitulo;
	private Label lbDataCertificadoTitulo;
	private Label lbAtividadeTitulo;
	private Label lbLocalEventoTitulo;
	private CheckBox checkTabelaEvento;
	
	public HomeGerenteView(){
		
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
		
		lbGerenciarEvento = new Label("Gerenciamento de Eventos"); 
		lbGerenciarEvento.setStyleName("lbGerenciarEvento");
		
		tbPesquisarEvento = new TextBox();
		tbPesquisarEvento.setStyleName("tbPesquisaEvento");
		
		btnPesquisar = new Button("Pesquisar");
		btnPesquisar.setStyleName("btnPesquisar");
		
		btnExcluirSelecionados = new Button("Excluir Selecionados");
		btnExcluirSelecionados.setStyleName("btnExcluirSelecionados");
		
		hpPainelTitulo.add(lbGerenciarEvento);
		hpPainelPesquisarCriar.add(tbPesquisarEvento);
		hpPainelPesquisarCriar.setCellWidth(tbPesquisarEvento, "10%");
		hpPainelPesquisarCriar.add(btnPesquisar);
		hpPainelPesquisarCriar.setCellWidth(btnPesquisar, "15%");
		hpPainelPesquisarCriar.add(btnExcluirSelecionados);
	
		vpPainelTabela = new VerticalPanel();
		vpPainelTabela.setStyleName("vpPainelTabela");
		vpPainelTabela.setHorizontalAlignment(HorizontalPanel.ALIGN_CENTER);
		
		ftTabelaEvento = new FlexTable();
		ftTabelaEvento.setStyleName("ftTabelaEvento");
		
		for(int x=0; x<8; x++){
		ftTabelaEvento.getFlexCellFormatter().setVerticalAlignment(0, x, DockPanel.ALIGN_TOP);
		
		}
		for(int y=0; y<8; y++){
		ftTabelaEvento.getCellFormatter().setHeight(0, y, "10px");
		}
		
		ftTabelaEvento.getCellFormatter().setWidth(0, 1, "200px");
		
	
		//--------------------------------------------------------
		checkTabelaEvento = new CheckBox();
		checkTabelaEvento.setStyleName("checkTabelaEvento");
		
		//label para titulo da tabela------------------------------
		//---------------------------------------------------------
		
		lbNomeTitulo = new Label("Nome");
		lbNomeTitulo.setStyleName("lbNomeTitulo");
		
		lbDataInicioTitulo = new Label("Data de Início");
		lbDataInicioTitulo.setStyleName("lbDataInicioTitulo");
		
		lbDataEncerraTitulo = new Label("Data de Encerramento");
		lbDataEncerraTitulo.setStyleName("lbDataEncerraTitulo");
		
		lbCoordenadorTitulo = new Label("Coordenador");
		lbCoordenadorTitulo.setStyleName("lbCoordenadorTitulo");
		
		lbDataCertificadoTitulo = new Label("Data Para Certificados");
		lbDataCertificadoTitulo.setStyleName("lbDataCertificadoTitulo");
		
		lbAtividadeTitulo = new Label("Atividades");
		lbAtividadeTitulo.setStyleName("lbAtividadeTitulo");
		
		lbLocalEventoTitulo = new Label("Local do Evento");
		lbLocalEventoTitulo.setStyleName("lbLocalEventoTitulo");
		//-----------------------------------------------------
		btnListarAtividadesEvento = new Button("Lis. Ativi.");
		btnListarAtividadesEvento.setStyleName("btnListarAtividadesEvento");
		//---------------------------------------------------
		
		vpPainelTabela.add(ftTabelaEvento);
		vpTrocaFuncoes.add(vpGuardaTitulo);
		vpGuardaTitulo.add(vpPainelTabela);
		//vpTrocaFuncoes.add(vpPainelTabela);
	
		hpGuardaPainel = new HorizontalPanel();
		hpGuardaPainel.setStyleName("hpGuardaPainel");
		hpGuardaPainel.add(vpTrocaFuncoes);
		hpGuardaPainel.setCellWidth(vpTrocaFuncoes, "100%");
	
	
		//------------------------------------------------------------
		vpPai = new VerticalPanel();
		vpPai.setStyleName("vpPai");
		vpPai.add(vpTrocaFuncoes);
		initWidget(vpPai);
		
		criaCabecalhoTabela();
		teste();
	}
	
	public void criaCabecalhoTabela(){
		
		ftTabelaEvento.setWidget(0, 0, checkTabelaEvento);
		ftTabelaEvento.setWidget(0, 1, lbNomeTitulo);
		ftTabelaEvento.setWidget(0, 2, lbDataInicioTitulo);
		ftTabelaEvento.setWidget(0, 3, lbDataEncerraTitulo);
		ftTabelaEvento.setWidget(0, 4, lbCoordenadorTitulo);
		ftTabelaEvento.setWidget(0, 5, lbDataCertificadoTitulo);
		ftTabelaEvento.setWidget(0, 6, lbAtividadeTitulo);
		ftTabelaEvento.setWidget(0, 7, lbLocalEventoTitulo);
		
		ftTabelaEvento.setWidget(1, 6, btnListarAtividadesEvento);
	}
	
	public void teste(){
		ftTabelaEvento.setText(1, 0, "aaaaaaa");
		ftTabelaEvento.setText(1, 1, "aaaaaaa");
		ftTabelaEvento.setText(1, 2, "aaaaaaa");
		ftTabelaEvento.setText(1, 3, "aaaaaaa");
		ftTabelaEvento.setText(1, 4, "aaaaaaa");
		ftTabelaEvento.setText(1, 5, "aaaaaaa");
		ftTabelaEvento.setText(1, 7, "aaaaaaa");
		
		for(int y=0; y<8; y++){
			ftTabelaEvento.getCellFormatter().setHeight(1, y, "10px");
			}
	}

	public void addNovoEstilo(){
		vpPai.removeStyleName("vpPai");
		vpPai.setStyleName("vpPaiAumentado");
		GWT.log("EXECUTA FUNCAO");
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

	public FlexTable getFtTabelaEvento() {
		return ftTabelaEvento;
	}

	public void setFtTabelaEvento(FlexTable ftTabelaEvento) {
		this.ftTabelaEvento = ftTabelaEvento;
	}

	public Label getLbGerenciarEvento() {
		return lbGerenciarEvento;
	}

	public void setLbGerenciarEvento(Label lbGerenciarEvento) {
		this.lbGerenciarEvento = lbGerenciarEvento;
	}

	public TextBox getTbPesquisarEvento() {
		return tbPesquisarEvento;
	}

	public void setTbPesquisarEvento(TextBox tbPesquisarEvento) {
		this.tbPesquisarEvento = tbPesquisarEvento;
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

	public Button getBtnListarAtividadesEvento() {
		return btnListarAtividadesEvento;
	}

	public void setBtnListarAtividadesEvento(Button btnListarAtividadesEvento) {
		this.btnListarAtividadesEvento = btnListarAtividadesEvento;
	}

	public Label getLbNomeTitulo() {
		return lbNomeTitulo;
	}

	public void setLbNomeTitulo(Label lbNomeTitulo) {
		this.lbNomeTitulo = lbNomeTitulo;
	}

	public Label getLbDataInicioTitulo() {
		return lbDataInicioTitulo;
	}

	public void setLbDataInicioTitulo(Label lbDataInicioTitulo) {
		this.lbDataInicioTitulo = lbDataInicioTitulo;
	}

	public Label getLbDataEncerraTitulo() {
		return lbDataEncerraTitulo;
	}

	public void setLbDataEncerraTitulo(Label lbDataEncerraTitulo) {
		this.lbDataEncerraTitulo = lbDataEncerraTitulo;
	}

	public Label getLbCoordenadorTitulo() {
		return lbCoordenadorTitulo;
	}

	public void setLbCoordenadorTitulo(Label lbCoordenadorTitulo) {
		this.lbCoordenadorTitulo = lbCoordenadorTitulo;
	}

	public Label getLbDataCertificadoTitulo() {
		return lbDataCertificadoTitulo;
	}

	public void setLbDataCertificadoTitulo(Label lbDataCertificadoTitulo) {
		this.lbDataCertificadoTitulo = lbDataCertificadoTitulo;
	}

	public Label getLbAtividadeTitulo() {
		return lbAtividadeTitulo;
	}

	public void setLbAtividadeTitulo(Label lbAtividadeTitulo) {
		this.lbAtividadeTitulo = lbAtividadeTitulo;
	}

	public Label getLbLocalEventoTitulo() {
		return lbLocalEventoTitulo;
	}

	public void setLbLocalEventoTitulo(Label lbLocalEventoTitulo) {
		this.lbLocalEventoTitulo = lbLocalEventoTitulo;
	}

	public CheckBox getCheckTabelaEvento() {
		return checkTabelaEvento;
	}

	public void setCheckTabelaEvento(CheckBox checkTabelaEvento) {
		this.checkTabelaEvento = checkTabelaEvento;
	}

}