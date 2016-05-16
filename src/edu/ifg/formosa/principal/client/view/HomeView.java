package edu.ifg.formosa.principal.client.view;


import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
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
	private HorizontalPanel hpPainelModuloGerente;
	private HorizontalPanel hpPainelModuloParticipante;
	private HorizontalPanel hpPainelModuloCoordenador;
	private VerticalPanel vpPainelAdicionaCabecalhoeEscolheModulo;
	private VerticalPanel vpPainelAdicionaBotoesModulos;
	private VerticalPanel vpComoFunciona;
	private VerticalPanel vpPesquisarEvento;
	private VerticalPanel vpPai;
	private Label lbCertificado;
	private Label lbEntrar;
	private Label lbEvento;
	private Label btnSetaEsq;
	private Label btnSetaDir;
	private Image iLogo;
	private Image iLogoCentro;
	private Image iFotoPainel;
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
	
	public HomeView(){
		
		//cabeçalho-----------------------------
		hpCabecalho = new HorizontalPanel();
		hpCabecalho.setStyleName("hpCabecalho");
		
		lbCertificado = new Label("Certificado");
		lbCertificado.setStyleName("lbCertificado");
		
		linkComoFunciona = new Anchor("Como funciona", "#comofunciona");
		linkComoFunciona.setStyleName("linkComoFunciona");
	
		lbEntrar = new Label("Login");
		lbEntrar.setStyleName("lbEntrar");
		
		iLogo = new Image();
		iLogo.setUrl("../Image/logo.png");
		iLogo.setStyleName("iLogo");
		
		hpCabecalho.add(iLogo);
		hpCabecalho.add(lbCertificado);
		hpCabecalho.setCellWidth(lbCertificado, "10%");
		hpCabecalho.add(linkComoFunciona);
		hpCabecalho.setCellWidth(linkComoFunciona, "5%");
		hpCabecalho.add(lbEntrar);
		hpCabecalho.setCellWidth(lbEntrar, "10%");
		//-------------------------fim do cabecalho-------------------------
		//painel escolhe modulo---------------------------------------------
		
		hpPainelModuloGerente = new HorizontalPanel();
		hpPainelModuloGerente.setStyleName("hpPainelModuloGerente");
		
		btnModuloGerente = new Button("Gerente");
		btnModuloGerente.setStyleName("btnModuloGerente");
	
		hpPainelModuloGerente.add(btnModuloGerente); //add itens
 
		hpPainelModuloCoordenador = new HorizontalPanel();
		hpPainelModuloCoordenador.setStyleName("hpPainelModuloCoordenador");
		
		btnModuloCoordenador = new Button("Coordenador");
		btnModuloCoordenador.setStyleName("btnModuloCoordenador");
		
		hpPainelModuloCoordenador.add(btnModuloCoordenador); //add itens
		
		hpPainelModuloParticipante = new HorizontalPanel();
		hpPainelModuloParticipante.setStyleName("hpPainelModuloParticipante");
		
		btnModuloParticipante = new Button("Participante");
		btnModuloParticipante.setStyleName("btnModuloParticipante");
		
		hpPainelModuloParticipante.add(btnModuloParticipante); //add itens
		
		vpPainelAdicionaBotoesModulos  = new VerticalPanel();
		vpPainelAdicionaBotoesModulos.setStyleName("vpPainelAdicionaBotoesModulos");
	
		vpPainelAdicionaCabecalhoeEscolheModulo = new VerticalPanel();
		vpPainelAdicionaCabecalhoeEscolheModulo.setStyleName("vpPainelAdicionaCabecalhoeEscolheModulo");
		
		vpPainelAdicionaCabecalhoeEscolheModulo.add(hpCabecalho);
		vpPainelAdicionaCabecalhoeEscolheModulo.add(vpPainelAdicionaBotoesModulos);
		
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
		
		//Como Funciona------------------------
		vpComoFunciona = new VerticalPanel();
		vpComoFunciona.setStyleName("vpComoFunciona");
		vpComoFunciona.setHorizontalAlignment(HorizontalPanel.ALIGN_CENTER);
		
		linkComoFunciona2 = new Anchor("Como funciona");
		linkComoFunciona2.setName("comofunciona");
		linkComoFunciona2.setStyleName("linkComoFunciona2");
		
		texto = new HTML(texto());
		texto.setStyleName("texto");
		
		vpComoFunciona.add(linkComoFunciona2);
		vpComoFunciona.setCellHeight(linkComoFunciona2, "20%");
		vpComoFunciona.setSpacing(10);
		vpComoFunciona.add(texto);
		
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
		//btnPesquisar.setStyleName("btn-success");
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
		vpPai.add(vpPainelAdicionaCabecalhoeEscolheModulo);
		vpPai.add(hpPainelRotativo);
		vpPai.add(vpComoFunciona);
		vpPai.add(vpPesquisarEvento);
		vpPai.add(hpRodape);
		initWidget(vpPai);

	}

	private String texto(){
		return "<p>"
				+ "O EventIF será uma plataforma que permitirá ao organizador criar de forma automatizada um evento, </br>"
				+ "o site do evento e suas atividades como minicursos, oficinas e palestras. Os alunos interessados </br>"
				+ "poderão se inscrever nas atividades através do próprio site do evento previamente criado pela plataforma,</br>"
				+ "o que trará para o organizador estatísticas de inscritos entre outras informações importantes.</br>"
				+ "Através do sistema, os organizadores poderão imprimir os crachás dos participantes do evento que </br>"
				+ "contará com um QRCode de identificação, que pode ser visto como uma espécie código de barras bidimensional.</br>"
				+ " O aplicativo mobile permitirá ler o QRCode dos crachás para registrar a frequência dos participantes, desta forma, </br>"
				+ "ao término do evento, o EventIF estará com os certificados prontos e disponíveis online para emissão. </p>";
		
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

	public VerticalPanel getVpComoFunciona() {
		return vpComoFunciona;
	}

	public void setVpComoFunciona(VerticalPanel vpComoFunciona) {
		this.vpComoFunciona = vpComoFunciona;
	}

	public VerticalPanel getVpPesquisarEvento() {
		return vpPesquisarEvento;
	}

	public void setVpPesquisarEvento(VerticalPanel vpPesquisarEvento) {
		this.vpPesquisarEvento = vpPesquisarEvento;
	}


	public HorizontalPanel getHpRodape() {
		return hpRodape;
	}

	public void setHpRodape(HorizontalPanel hpRodape) {
		this.hpRodape = hpRodape;
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


	public Image getiLogo() {
		return iLogo;
	}

	public void setiLogo(Image iLogo) {
		this.iLogo = iLogo;
	}

	
	public Image getiFotoPainel() {
		return iFotoPainel;
	}

	public void setiFotoPainel(Image iFotoPainel) {
		this.iFotoPainel = iFotoPainel;
	}

	public Image getiLogoCentro() {
		return iLogoCentro;
	}

	public void setiLogoCentro(Image iLogoCentro) {
		this.iLogoCentro = iLogoCentro;
	}


	public FlexTableEventIF getFtTabelaEvento() {
		return ftTabelaEvento;
	}

	public void setFtTabelaEvento(FlexTableEventIF ftTabelaEvento) {
		this.ftTabelaEvento = ftTabelaEvento;
	}

	public HorizontalPanel getVpPainelLabelPesquisarEvento() {
		return hpPainelLabelPesquisarEvento;
	}

	public void setVpPainelLabelPesquisarEvento(
			HorizontalPanel vpPainelLabelPesquisarEvento) {
		this.hpPainelLabelPesquisarEvento = vpPainelLabelPesquisarEvento;
	}

	

	public TextBox getFieldEvento() {
		return fieldEvento;
	}

	public void setFieldEvento(TextBox fieldEvento) {
		this.fieldEvento = fieldEvento;
	}

	
	public HorizontalPanel getHpPainelLabelPesquisarEvento() {
		return hpPainelLabelPesquisarEvento;
	}

	public void setHpPainelLabelPesquisarEvento(HorizontalPanel hpPainelLabelPesquisarEvento) {
		this.hpPainelLabelPesquisarEvento = hpPainelLabelPesquisarEvento;
	}

	public HorizontalPanel getHpPainelModuloGerente() {
		return hpPainelModuloGerente;
	}

	public void setHpPainelModuloGerente(HorizontalPanel hpPainelModuloGerente) {
		this.hpPainelModuloGerente = hpPainelModuloGerente;
	}

	public HorizontalPanel getHpPainelModuloParticipante() {
		return hpPainelModuloParticipante;
	}

	public void setHpPainelModuloParticipante(HorizontalPanel hpPainelModuloParticipante) {
		this.hpPainelModuloParticipante = hpPainelModuloParticipante;
	}

	public HorizontalPanel getHpPainelModuloCoordenador() {
		return hpPainelModuloCoordenador;
	}

	public void setHpPainelModuloCoordenador(HorizontalPanel hpPainelModuloCoordenador) {
		this.hpPainelModuloCoordenador = hpPainelModuloCoordenador;
	}

	public VerticalPanel getVpPainelAdicionaCabecalhoeEscolheModulo() {
		return vpPainelAdicionaCabecalhoeEscolheModulo;
	}

	public void setVpPainelAdicionaCabecalhoeEscolheModulo(VerticalPanel vpPainelAdicionaCabecalhoeEscolheModulo) {
		this.vpPainelAdicionaCabecalhoeEscolheModulo = vpPainelAdicionaCabecalhoeEscolheModulo;
	}

	public VerticalPanel getVpPainelAdicionaBotoesModulos() {
		return vpPainelAdicionaBotoesModulos;
	}

	public void setVpPainelAdicionaBotoesModulos(VerticalPanel vpPainelAdicionaBotoesModulos) {
		this.vpPainelAdicionaBotoesModulos = vpPainelAdicionaBotoesModulos;
	}

	public Button getBtnPesquisar() {
		return btnPesquisar;
	}

	public void setBtnPesquisar(Button btnPesquisar) {
		this.btnPesquisar = btnPesquisar;
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

	public Button getBtnPause() {
		return btnPause;
	}

	public void setBtnPause(Button btnPause) {
		this.btnPause = btnPause;
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

	public Label getLbEvento() {
		return lbEvento;
	}

	public void setLbEvento(Label lbEvento) {
		this.lbEvento = lbEvento;
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

	public HorizontalPanel getHpPainelFoto() {
		return hpPainelFoto;
	}

	public void setHpPainelFoto(HorizontalPanel hpPainelFoto) {
		this.hpPainelFoto = hpPainelFoto;
	}
	
	
	
}
