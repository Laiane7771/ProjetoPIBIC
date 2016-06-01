package edu.ifg.formosa.principal.client.view;


import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import edu.ifg.formosa.principal.client.util.FlexTableEventIF;

public class HomeView extends Composite  {
	
	private HorizontalPanel hpCabecalho;
	private HorizontalPanel hpPainelRotativo;
	private HorizontalPanel hpPainelFoto;
	private HorizontalPanel hpPainelLabelPesquisarEvento;
	private HorizontalPanel hpRodape;
	private HorizontalPanel hpComoFunciona;
	private HorizontalPanel hpTituloComoFunciona;
	private VerticalPanel vpPesquisarEvento;
	private VerticalPanel vpPainelCriaEvento;
	private VerticalPanel vpPainelInscreverEvento;
	private VerticalPanel vpPainelImprimirCertificado;
	private VerticalPanel vpPai;
	private Label lbCertificado;
	private Label lbEntrar;
	private Label lbEvento;
	private Label btnSetaEsq;
	private Label btnSetaDir;
	private Label lbImprimeCertificado;
	private Label lbVisualizaEvento;
	private Label lbInscreveEmEvento;
	private Image iLogo;
	private Image iLogoCentro;
	private Image iFotoPainel;
	private Image icriaEvento;
	private Image iImprimeCertificado;
	private Image iInscreverEvento;
	private FlexTableEventIF ftTabelaEvento;
	private TextBox fieldEvento;
	private Button btnPesquisar;
	private Button btnPause;
	private Button btnModuloGerente;
	private Button btnModuloParticipante;
	private Button btnModuloCoordenador;
	private Label lbPesquisaEvento;
	private HTML texto;
	private Anchor linkComoFunciona;
	private Anchor linkComoFunciona2;
	private Anchor linkPesquisarEvento;
	private Anchor linkPesquisarEvento2;
	
	public HomeView(){
		
		//cabeçalho-----------------------------
		hpCabecalho = new HorizontalPanel();
		hpCabecalho.setStyleName("hpCabecalho");
		
		iLogo = new Image();
		iLogo.setUrl("../Image/logo.png");
		iLogo.setStyleName("iLogo");
		
		lbCertificado = new Label("Certificado");
		lbCertificado.setStyleName("lbCertificado");
		
		linkComoFunciona = new Anchor("Como funciona", "#comofunciona");
		linkComoFunciona.setStyleName("linkComoFunciona");
	
		lbEntrar = new Label("Login");
		lbEntrar.setStyleName("lbEntrar");
		
		linkPesquisarEvento = new Anchor("Eventos em Andamento", "#pesquisar");
		linkPesquisarEvento.setStyleName("linkPesquisarEvento");
		
		hpCabecalho.add(iLogo);
		hpCabecalho.setCellWidth(iLogo, "5%");
		hpCabecalho.add(lbCertificado);
		hpCabecalho.setCellWidth(lbCertificado, "5%");
		hpCabecalho.add(linkComoFunciona);
		hpCabecalho.setCellWidth(linkComoFunciona, "5%");
		hpCabecalho.add(linkPesquisarEvento);
		hpCabecalho.setCellWidth(linkPesquisarEvento, "10%");
		hpCabecalho.add(lbEntrar);
		hpCabecalho.setCellWidth(lbEntrar, "20%");
		//-------------------------fim do cabecalho-------------------------
		
		//painel--------------------------------
		hpPainelRotativo = new HorizontalPanel();
		hpPainelRotativo.setStyleName("hpPainelRotativo");
		hpPainelRotativo.setHorizontalAlignment(HorizontalPanel.ALIGN_CENTER);
		hpPainelRotativo.setVerticalAlignment(VerticalPanel.ALIGN_MIDDLE);
		iFotoPainel = new Image();
		iFotoPainel.setUrl("../Image/logo.png");
		iFotoPainel.setStyleName("iFotoPainel");
		
		hpPainelFoto = new HorizontalPanel();
		hpPainelFoto.setStyleName("hpPainelFoto");
		
		btnPause = new Button("||");
		btnPause.setStyleName("btnPause");
		
		btnSetaDir = new Label(">");
		btnSetaDir.setStyleName("btnSetaDir");
		
		btnSetaEsq = new Label("<");
		btnSetaEsq.setStyleName("btnSetaEsq");
		
		hpPainelRotativo.add(hpPainelFoto);
		hpPainelRotativo.add(btnSetaEsq);
		hpPainelRotativo.setCellWidth(btnSetaEsq, "10%");
		hpPainelRotativo.add(iFotoPainel);
		hpPainelRotativo.setCellWidth(iFotoPainel, "80%");
		hpPainelRotativo.add(btnSetaDir);
		hpPainelRotativo.setCellWidth(btnSetaDir, "10%");
		//Titulo Como Funciona-------------------------------------
		
		hpTituloComoFunciona = new HorizontalPanel();
		hpTituloComoFunciona.setStyleName("hpTituloComoFunciona");
		
		linkComoFunciona2 = new Anchor("Com o Eventif você pode...");
		linkComoFunciona2.setName("comofunciona");
		linkComoFunciona2.setStyleName("linkComoFunciona2");
		
		hpTituloComoFunciona.add(linkComoFunciona2);//add item
		//Como Funciona------------------------
		hpComoFunciona = new HorizontalPanel();
		hpComoFunciona.setStyleName("hpComoFunciona");
		hpComoFunciona.setHorizontalAlignment(HorizontalPanel.ALIGN_CENTER);
		
		vpPainelCriaEvento = new VerticalPanel();
		vpPainelCriaEvento.setStyleName("vpPainelCriaEvento");
		
		icriaEvento = new Image();
		icriaEvento.setStyleName("icriaEvento");
		icriaEvento.setUrl("../Image/VisualizarEventoM.png");
		
		lbVisualizaEvento = new Label("Visualizar Eventos que estão em andamento.");
		lbVisualizaEvento.setStyleName("lbVisualizaEvento");
		
		vpPainelCriaEvento.add(icriaEvento);//add item
		vpPainelCriaEvento.add(lbVisualizaEvento);//add item
	
		vpPainelInscreverEvento = new VerticalPanel();
		vpPainelInscreverEvento.setStyleName("vpPainelInscreverEvento");
		
		iInscreverEvento = new Image();
		iInscreverEvento.setStyleName("iInscreverEvento");
		iInscreverEvento.setUrl("../Image/InscreverEventoM.png");
		
		lbInscreveEmEvento = new Label("Inscrever em Eventos."
				+ " Todos os participantes poderão criar uma conta"
				+ " e ter acesso as inscrições de todos os eventos.");
		
		lbInscreveEmEvento.setStyleName("lbInscreveEmEvento");
		
		vpPainelInscreverEvento.add(iInscreverEvento);//add item
		vpPainelInscreverEvento.setCellHeight(iInscreverEvento, "50%");
		vpPainelInscreverEvento.add(lbInscreveEmEvento);//add item
		vpPainelInscreverEvento.setCellHeight(lbInscreveEmEvento, "50%");
		
		vpPainelImprimirCertificado = new VerticalPanel();
		vpPainelImprimirCertificado.setStyleName("vpPainelImprimirCertificado");
		
		iImprimeCertificado = new Image();
		iImprimeCertificado.setUrl("../Image/ImprimirCertificadoM.png");
		iImprimeCertificado.setStyleName("iImprimeCertificado");
		
		lbImprimeCertificado = new Label("Imprimir Certificado. Todos os certificados agora"
				+ " são online. Cada um contará com um código de verificação que comprovará sua autenticidade.");
		lbImprimeCertificado.setStyleName("lbImprimeCertificado");
		
		vpPainelImprimirCertificado.add(iImprimeCertificado);//add item
		vpPainelImprimirCertificado.setCellHeight(iImprimeCertificado, "50%");
		vpPainelImprimirCertificado.add(lbImprimeCertificado);//add item
		vpPainelImprimirCertificado.setCellHeight(lbImprimeCertificado, "50%");
	
		hpComoFunciona.add(vpPainelCriaEvento);
		hpComoFunciona.setCellWidth(vpPainelCriaEvento, "30%");
		hpComoFunciona.add(vpPainelInscreverEvento);
		hpComoFunciona.setCellWidth(vpPainelInscreverEvento, "30%");
		hpComoFunciona.add(vpPainelImprimirCertificado);
		hpComoFunciona.setCellWidth(vpPainelImprimirCertificado, "30%");
		
		
		//pesquisar Evento---------------------
		vpPesquisarEvento = new VerticalPanel();
		vpPesquisarEvento.setStyleName("vpPesquisarEvento");
		
		hpPainelLabelPesquisarEvento = new HorizontalPanel();
		hpPainelLabelPesquisarEvento.setStyleName("vpPainelLabelPesquisarEvento");
		
		fieldEvento = new TextBox();
		fieldEvento.setStyleName("fieldEvento");
		
		lbEvento = new Label("Evento:");
		lbEvento.setStyleName("lbEvento");
		
		btnPesquisar = new Button("Pesquisar");
		btnPesquisar.setStyleName("btnPesquisar");
		
		hpPainelLabelPesquisarEvento.add(lbEvento);
		hpPainelLabelPesquisarEvento.setCellWidth(lbEvento, "10%");
		hpPainelLabelPesquisarEvento.add(fieldEvento);
		hpPainelLabelPesquisarEvento.setCellWidth(fieldEvento, "10%");
		hpPainelLabelPesquisarEvento.add(btnPesquisar);
		vpPesquisarEvento.setHorizontalAlignment(HorizontalPanel.ALIGN_CENTER);
		
		lbPesquisaEvento = new Label("Pesquisar Evento");
		lbPesquisaEvento.setStyleName("lbPesquisaEvento");
		vpPesquisarEvento.add(lbPesquisaEvento);
		
		ftTabelaEvento = new FlexTableEventIF();
		ftTabelaEvento.setStyleName("ftTabelaEvento");
		ftTabelaEvento.getFt().getFlexCellFormatter().setVerticalAlignment(0, 0, DockPanel.ALIGN_TOP);
		ftTabelaEvento.getFt().setBorderWidth(1);
		
		vpPesquisarEvento.add(hpPainelLabelPesquisarEvento);
		vpPesquisarEvento.add(ftTabelaEvento);
		
		//rodape-------------------------------
		hpRodape = new HorizontalPanel();
		hpRodape.setStyleName("hpRodape");
		
		iLogoCentro = new Image();
		iLogoCentro.setUrl("../Image/logo2.png");
		iLogoCentro.setStyleName("iLogoCentro");
		hpRodape.add(iLogoCentro);
		
		//pai----------------------------------
		vpPai = new VerticalPanel();
		vpPai.setStyleName("vpPai");
		vpPai.add(hpCabecalho);
		vpPai.add(hpPainelRotativo);
		vpPai.add(hpTituloComoFunciona);
		vpPai.add(hpComoFunciona);
		vpPai.add(vpPesquisarEvento);
		vpPai.add(hpRodape);
		initWidget(vpPai);

	}

	public HorizontalPanel getHpCabecalho() {
		return hpCabecalho;
	}

	public void setHpCabecalho(HorizontalPanel hpCabecalho) {
		this.hpCabecalho = hpCabecalho;
	}

	public HorizontalPanel getHpPainelRotativo() {
		return hpPainelRotativo;
	}

	public void setHpPainelRotativo(HorizontalPanel hpPainelRotativo) {
		this.hpPainelRotativo = hpPainelRotativo;
	}

	public HorizontalPanel getHpPainelFoto() {
		return hpPainelFoto;
	}

	public void setHpPainelFoto(HorizontalPanel hpPainelFoto) {
		this.hpPainelFoto = hpPainelFoto;
	}

	public HorizontalPanel getHpPainelLabelPesquisarEvento() {
		return hpPainelLabelPesquisarEvento;
	}

	public void setHpPainelLabelPesquisarEvento(HorizontalPanel hpPainelLabelPesquisarEvento) {
		this.hpPainelLabelPesquisarEvento = hpPainelLabelPesquisarEvento;
	}

	public HorizontalPanel getHpRodape() {
		return hpRodape;
	}

	public void setHpRodape(HorizontalPanel hpRodape) {
		this.hpRodape = hpRodape;
	}


	public VerticalPanel getVpPesquisarEvento() {
		return vpPesquisarEvento;
	}

	public void setVpPesquisarEvento(VerticalPanel vpPesquisarEvento) {
		this.vpPesquisarEvento = vpPesquisarEvento;
	}

	public VerticalPanel getVpPai() {
		return vpPai;
	}

	public void setVpPai(VerticalPanel vpPai) {
		this.vpPai = vpPai;
	}

	public Label getLbCertificado() {
		return lbCertificado;
	}

	public void setLbCertificado(Label lbCertificado) {
		this.lbCertificado = lbCertificado;
	}

	public Label getLbEntrar() {
		return lbEntrar;
	}

	public void setLbEntrar(Label lbEntrar) {
		this.lbEntrar = lbEntrar;
	}

	public Label getLbEvento() {
		return lbEvento;
	}

	public void setLbEvento(Label lbEvento) {
		this.lbEvento = lbEvento;
	}

	public Label getBtnSetaEsq() {
		return btnSetaEsq;
	}

	public void setBtnSetaEsq(Label btnSetaEsq) {
		this.btnSetaEsq = btnSetaEsq;
	}

	public Label getBtnSetaDir() {
		return btnSetaDir;
	}

	public void setBtnSetaDir(Label btnSetaDir) {
		this.btnSetaDir = btnSetaDir;
	}

	public Image getiLogo() {
		return iLogo;
	}

	public void setiLogo(Image iLogo) {
		this.iLogo = iLogo;
	}

	public Image getiLogoCentro() {
		return iLogoCentro;
	}

	public void setiLogoCentro(Image iLogoCentro) {
		this.iLogoCentro = iLogoCentro;
	}

	public Image getiFotoPainel() {
		return iFotoPainel;
	}

	public void setiFotoPainel(Image iFotoPainel) {
		this.iFotoPainel = iFotoPainel;
	}

	public FlexTableEventIF getFtTabelaEvento() {
		return ftTabelaEvento;
	}

	public void setFtTabelaEvento(FlexTableEventIF ftTabelaEvento) {
		this.ftTabelaEvento = ftTabelaEvento;
	}

	public TextBox getFieldEvento() {
		return fieldEvento;
	}

	public void setFieldEvento(TextBox fieldEvento) {
		this.fieldEvento = fieldEvento;
	}

	public Button getBtnPesquisar() {
		return btnPesquisar;
	}

	public void setBtnPesquisar(Button btnPesquisar) {
		this.btnPesquisar = btnPesquisar;
	}

	public Button getBtnPause() {
		return btnPause;
	}

	public void setBtnPause(Button btnPause) {
		this.btnPause = btnPause;
	}

	public Button getBtnModuloGerente() {
		return btnModuloGerente;
	}

	public void setBtnModuloGerente(Button btnModuloGerente) {
		this.btnModuloGerente = btnModuloGerente;
	}

	public Button getBtnModuloParticipante() {
		return btnModuloParticipante;
	}

	public void setBtnModuloParticipante(Button btnModuloParticipante) {
		this.btnModuloParticipante = btnModuloParticipante;
	}

	public Button getBtnModuloCoordenador() {
		return btnModuloCoordenador;
	}

	public void setBtnModuloCoordenador(Button btnModuloCoordenador) {
		this.btnModuloCoordenador = btnModuloCoordenador;
	}

	public Label getLbPesquisaEvento() {
		return lbPesquisaEvento;
	}

	public void setLbPesquisaEvento(Label lbPesquisaEvento) {
		this.lbPesquisaEvento = lbPesquisaEvento;
	}

	public HTML getTexto() {
		return texto;
	}

	public void setTexto(HTML texto) {
		this.texto = texto;
	}

	public Anchor getLinkComoFunciona() {
		return linkComoFunciona;
	}

	public void setLinkComoFunciona(Anchor linkComoFunciona) {
		this.linkComoFunciona = linkComoFunciona;
	}

	public Anchor getLinkComoFunciona2() {
		return linkComoFunciona2;
	}

	public void setLinkComoFunciona2(Anchor linkComoFunciona2) {
		this.linkComoFunciona2 = linkComoFunciona2;
	}

	
	

	
	
}
