package edu.ifg.formosa.gerente.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;


public class GerentePesquisarAtividadesPopupView extends DialogBox{

	private HorizontalPanel hpPainelTituloPagina;
	private HorizontalPanel hpPainelPesquisarAtividadeEvento;
	private HorizontalPanel hpPainelTabelaAtividadesEvento;
	private VerticalPanel vpPainelPopupTotal;
	private VerticalPanel vpPainelPopupDesenho;
	private Label lbTituloPagina;
	private TextBox tbPesquisarAtividadeEvento;
	private Button btnPesquisarAtividadeEvento;
	private Button btnFecharPopupAtividades;
	private FlexTable ftTabelaAtividadesEvento;
	private Label lbNomeAtividadeTitulo;
	private Label lbHoraInicioTitulo;
	private Label lbHoraEncerramentoTitulo;
	private Label lbLocalAtividadeTitulo;
	private Label lbDetalhesAtividadeTitulo;
	private Label lbEditarAtividades;


	public GerentePesquisarAtividadesPopupView(){

		this.setStyleName("popupPesquisarAtividade");

		hpPainelTituloPagina = new HorizontalPanel();
		hpPainelTituloPagina.setStyleName("hpPainelTituloPagina");

		lbTituloPagina = new Label("Pesquisar Atividades");
		lbTituloPagina.setStyleName("lbTituloPagina");

		hpPainelTituloPagina.add(lbTituloPagina);// add item

		hpPainelPesquisarAtividadeEvento = new HorizontalPanel();
		hpPainelPesquisarAtividadeEvento.setStyleName("hpPainelPesquisarAtividadeEvento");

		tbPesquisarAtividadeEvento = new TextBox();
		tbPesquisarAtividadeEvento.setStyleName("tbPesquisarAtividadeEvento");

		btnPesquisarAtividadeEvento = new Button("Pesquisar");
		btnPesquisarAtividadeEvento.setStyleName("btnPesquisarAtividadeEvento");

		btnFecharPopupAtividades = new Button("x");
		btnFecharPopupAtividades.setStyleName("btnFecharPopupAtividades");

		hpPainelPesquisarAtividadeEvento.add(tbPesquisarAtividadeEvento); //add item
		hpPainelPesquisarAtividadeEvento.setCellWidth(tbPesquisarAtividadeEvento, "80%");
		hpPainelPesquisarAtividadeEvento.add(btnPesquisarAtividadeEvento); //add item
		hpPainelPesquisarAtividadeEvento.setCellWidth(btnPesquisarAtividadeEvento, "20%");

		hpPainelTabelaAtividadesEvento = new HorizontalPanel();
		hpPainelTabelaAtividadesEvento.setStyleName("hpPainelTabelaAtividadesEvento");

		ftTabelaAtividadesEvento = new FlexTable();
		ftTabelaAtividadesEvento.setStyleName("ftTabelaAtividadesEvento");

		for(int x=0; x<6; x++){
			ftTabelaAtividadesEvento.getFlexCellFormatter().setVerticalAlignment(0, x, DockPanel.ALIGN_TOP);

		}
		for(int y=0; y<6; y++){
			ftTabelaAtividadesEvento.getCellFormatter().setHeight(0, y, "10px");
		}

		ftTabelaAtividadesEvento.getCellFormatter().setWidth(0, 0, "300px");


		hpPainelTabelaAtividadesEvento.add(ftTabelaAtividadesEvento); //add item

		vpPainelPopupDesenho = new VerticalPanel();
		vpPainelPopupDesenho.setStyleName("vpPainelPopupDesenho");

		vpPainelPopupDesenho.add(hpPainelTituloPagina);
		vpPainelPopupDesenho.add(hpPainelPesquisarAtividadeEvento);
		vpPainelPopupDesenho.add(hpPainelTabelaAtividadesEvento);

		vpPainelPopupTotal = new VerticalPanel();
		vpPainelPopupTotal.setStyleName("vpPainelPopupTotal");

		vpPainelPopupTotal.add(btnFecharPopupAtividades);

		vpPainelPopupTotal.add(vpPainelPopupDesenho);
		//--------------------------------------
		this.add(vpPainelPopupTotal);
		this.show();
		this.setGlassEnabled(true);
		//this.setModal(false);
		this.setAnimationEnabled(true);

		//----------------------------------------
		// titulo da tabela
		lbNomeAtividadeTitulo = new Label("Nome");
		lbNomeAtividadeTitulo.setStyleName("lbNomeAtividadeTitulo");

		lbHoraInicioTitulo = new Label("Hora de Início");
		lbHoraInicioTitulo.setStyleName("lbHoraInicioTitulo");

		lbHoraEncerramentoTitulo = new Label("Hora de Encerramento");
		lbHoraEncerramentoTitulo.setStyleName("lbHoraEncerramentoTitulo");

		lbLocalAtividadeTitulo = new Label("Local");
		lbLocalAtividadeTitulo.setStyleName("lbLocalAtividadeTitulo");

		lbDetalhesAtividadeTitulo = new Label("Detalhes");
		lbDetalhesAtividadeTitulo.setStyleName("lbDetalhesAtividadeTitulo");

		lbEditarAtividades = new Label("Editar");
		lbEditarAtividades.setStyleName("lbEditarAtividades");

		criaTituloTabelaAtividades();
	}

	public void criaTituloTabelaAtividades(){
		ftTabelaAtividadesEvento.setWidget(0, 0, lbNomeAtividadeTitulo);
		ftTabelaAtividadesEvento.setWidget(0, 1, lbHoraInicioTitulo);
		ftTabelaAtividadesEvento.setWidget(0, 2, lbHoraEncerramentoTitulo);
		ftTabelaAtividadesEvento.setWidget(0, 3, lbDetalhesAtividadeTitulo);
		ftTabelaAtividadesEvento.setWidget(0, 4, lbLocalAtividadeTitulo);
		ftTabelaAtividadesEvento.setWidget(0, 5, lbEditarAtividades);

	}

	public HorizontalPanel getHpPainelTituloPagina() {
		return hpPainelTituloPagina;
	}


	public void setHpPainelTituloPagina(HorizontalPanel hpPainelTituloPagina) {
		this.hpPainelTituloPagina = hpPainelTituloPagina;
	}


	public HorizontalPanel getHpPainelPesquisarAtividadeEvento() {
		return hpPainelPesquisarAtividadeEvento;
	}


	public void setHpPainelPesquisarAtividadeEvento(
			HorizontalPanel hpPainelPesquisarAtividadeEvento) {
		this.hpPainelPesquisarAtividadeEvento = hpPainelPesquisarAtividadeEvento;
	}


	public HorizontalPanel getHpPainelTabelaAtividadesEvento() {
		return hpPainelTabelaAtividadesEvento;
	}


	public void setHpPainelTabelaAtividadesEvento(
			HorizontalPanel hpPainelTabelaAtividadesEvento) {
		this.hpPainelTabelaAtividadesEvento = hpPainelTabelaAtividadesEvento;
	}


	public VerticalPanel getVpPainelPopupTotal() {
		return vpPainelPopupTotal;
	}


	public void setVpPainelPopupTotal(VerticalPanel vpPainelPopupTotal) {
		this.vpPainelPopupTotal = vpPainelPopupTotal;
	}


	public VerticalPanel getVpPainelPopupDesenho() {
		return vpPainelPopupDesenho;
	}


	public void setVpPainelPopupDesenho(VerticalPanel vpPainelPopupDesenho) {
		this.vpPainelPopupDesenho = vpPainelPopupDesenho;
	}


	public Label getLbTituloPagina() {
		return lbTituloPagina;
	}


	public void setLbTituloPagina(Label lbTituloPagina) {
		this.lbTituloPagina = lbTituloPagina;
	}


	public TextBox getTbPesquisarAtividadeEvento() {
		return tbPesquisarAtividadeEvento;
	}


	public void setTbPesquisarAtividadeEvento(TextBox tbPesquisarAtividadeEvento) {
		this.tbPesquisarAtividadeEvento = tbPesquisarAtividadeEvento;
	}


	public Button getBtnPesquisarAtividadeEvento() {
		return btnPesquisarAtividadeEvento;
	}


	public void setBtnPesquisarAtividadeEvento(Button btnPesquisarAtividadeEvento) {
		this.btnPesquisarAtividadeEvento = btnPesquisarAtividadeEvento;
	}


	public FlexTable getFtTabelaAtividadesEvento() {
		return ftTabelaAtividadesEvento;
	}


	public void setFtTabelaAtividadesEvento(FlexTable ftTabelaAtividadesEvento) {
		this.ftTabelaAtividadesEvento = ftTabelaAtividadesEvento;
	}


	public Button getBtnFecharPopupAtividades() {
		return btnFecharPopupAtividades;
	}


	public void setBtnFecharPopupAtividades(Button btnFecharPopupAtividades) {
		this.btnFecharPopupAtividades = btnFecharPopupAtividades;
	}

}
