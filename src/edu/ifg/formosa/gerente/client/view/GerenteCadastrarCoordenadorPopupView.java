package edu.ifg.formosa.gerente.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;


public class GerenteCadastrarCoordenadorPopupView extends DialogBox {

	private HorizontalPanel hpPainelTituloFormulario;
	private HorizontalPanel hpPainelTipodeServidor;
	private HorizontalPanel hpPainelInformacoesPessoaisCoordenador;
	private HorizontalPanel hpPainelNomeCoordenador;
	private HorizontalPanel hpPainelRGeCpfCoordenador;
	private HorizontalPanel hpPainelMatriculaSiape;
	private HorizontalPanel hpPainelContatoseEnderecoCoordenador;
	private HorizontalPanel hpPainelEnderecoCoordenador;
	private HorizontalPanel hpPainelNumeroBairro;
	private HorizontalPanel hpPainelCidadeUf;
	private HorizontalPanel hpPainelBotoesVoltarCadastrar;
	private HorizontalPanel hpPainelTelefoneEmailPopup;
	private VerticalPanel vpPainelInformacoesCoordenador;
	private VerticalPanel vpPainelContatoseEnderecoCoordenador;
	private VerticalPanel vpPainelFormularioCadastroCoordenador;
	private Label lbTituloPagina;
	private Label lbTipoCoordenadores;
	private Label lbInformacoesPessoaisCoordenadores;
	private Label lbTelefoneCoordenadorPopup;
	private Label lbEmailCoordenadorPopup;
	private Label lbNomeCoordenadores;
	private Label lbRgCoordenadores;
	private Label lbCpfCoordenadores;
	private Label lbMatriculaSiapeCoordenador;
	private Label lbContatosEenderecoCoordenador;
	private Label lbEnderecoCoordenador;
	private Label lbNumeroCoordenador;
	private Label lbBairroCoordenador;
	private Label lbCidadeCoordenador;
	private Label lbUfCoordenador;
	private Label lbServidor;
	private Label lbOutro;
	private RadioButton radioServidor;
	private RadioButton radioOutro;
	private ListBox listUfCoordenador;
	private Button btnVoltarCoordenador;
	private Button btnCadastrarCoordenador;
	private Button btnFecharPopup;
	private TextBox tbTelefoneCoordenadorPopup;
	private TextBox tbEmailCoordenadorPopup;
	private TextBox tbNomeCoordenador;
	private TextBox tbRgCoordenador;
	private TextBox tbCpfCoordenador;
	private TextBox tbMatriculaSiape;
	private TextBox tbEnderecoCoordenador;
	private TextBox tbNumeroCoordenador;
	private TextBox tbBairroCoordenador;
	private TextBox tbCidadeCoordenador;



	public GerenteCadastrarCoordenadorPopupView(){
		
		this.setStyleName("popupCadastroCoordenador");

		//------------------Titulo Página-----------------------------------
		hpPainelTituloFormulario = new HorizontalPanel();
		hpPainelTituloFormulario.setStyleName("hpPainelTituloFormulario");

		lbTituloPagina = new Label("Cadastro de Coordenadores");
		lbTituloPagina.setStyleName("lbTituloPagina");

		hpPainelTituloFormulario.add(lbTituloPagina); //adiciona Título
		//-------------------------------------------------------------------
		//-----------------Tipo de Servidor----------------------------------
		hpPainelTipodeServidor = new HorizontalPanel();
		hpPainelTipodeServidor.setStyleName("hpPainelTipodeServidor");

		lbTipoCoordenadores = new Label("Tipos de Coordenador:");
		lbTipoCoordenadores.setStyleName("lbTipoCoordenadores");

		lbServidor = new Label("Servidor");
		lbServidor.setStyleName("lbServidor");

		lbOutro = new Label("Outro");
		lbOutro.setStyleName("lbOutro");

		radioServidor = new RadioButton("RadioGroup", "");
		radioServidor.setStyleName("radioServidor");

		radioOutro = new RadioButton("RadioGroup", "");
		radioOutro.setStyleName("radioOutro");

		hpPainelTipodeServidor.add(lbTipoCoordenadores); //adiciona tipo Coordenador
		//hpPainelTipodeServidor.setCellWidth(lbTipoCoordenadores, "5%");
		hpPainelTipodeServidor.add(radioServidor); //adiciona radio 
		//hpPainelTipodeServidor.setCellWidth(radioServidor, "1%");
		hpPainelTipodeServidor.add(lbServidor); //adiciona servidor
		//hpPainelTipodeServidor.setCellWidth(lbServidor,"1%");
		hpPainelTipodeServidor.add(radioOutro); //adiciona radio
		//hpPainelTipodeServidor.setCellWidth(radioOutro, "1%");
		hpPainelTipodeServidor.add(lbOutro); //adiciona outro
		//hpPainelTipodeServidor.setCellWidth(lbOutro, "1%");

		//-------------------------------------------------------------------
		//---------------------Informações Pessoais--------------------------
		hpPainelInformacoesPessoaisCoordenador = new HorizontalPanel();
		hpPainelInformacoesPessoaisCoordenador.setStyleName("hpPainelInformacoesPessoaisCoordenador");

		lbInformacoesPessoaisCoordenadores = new Label("Informações Pessoais");
		lbInformacoesPessoaisCoordenadores.setStyleName("lbInformacoesPessoaisCoordenadores");

		hpPainelInformacoesPessoaisCoordenador.add(lbInformacoesPessoaisCoordenadores); //adiciona Informacoes Coordenador

		hpPainelNomeCoordenador = new HorizontalPanel();
		hpPainelNomeCoordenador.setStyleName("hpPainelNomeCoordenadorPopup");

		lbNomeCoordenadores = new Label("Nome:");
		lbNomeCoordenadores.setStyleName("lbNomeCoordenadores");

		tbNomeCoordenador = new TextBox();
		tbNomeCoordenador.setStyleName("tbNomeCoordenador");

		hpPainelNomeCoordenador.add(lbNomeCoordenadores); //adiciona nome;
		hpPainelNomeCoordenador.setCellWidth(lbNomeCoordenadores, "5%");
		hpPainelNomeCoordenador.add(tbNomeCoordenador); //adiciona texbox;
		hpPainelNomeCoordenador.setCellWidth(tbNomeCoordenador, "90%");

		hpPainelRGeCpfCoordenador = new HorizontalPanel();
		hpPainelRGeCpfCoordenador.setStyleName("hpPainelRGeCpfCoordenador");

		lbRgCoordenadores = new Label("RG:");
		lbRgCoordenadores.setStyleName("lbRgCoordenadores");

		tbRgCoordenador = new TextBox();
		tbRgCoordenador.setStyleName("tbRgCoordenadorPopup");

		lbCpfCoordenadores = new Label("CPF:");
		lbCpfCoordenadores.setStyleName("lbCpfCoordenadores");

		tbCpfCoordenador = new TextBox();
		tbCpfCoordenador.setStyleName("tbCpfCoordenadorPopup");

		hpPainelRGeCpfCoordenador.add(lbRgCoordenadores); //adiciona RG
		hpPainelRGeCpfCoordenador.setCellWidth(lbRgCoordenadores, "5%");
		hpPainelRGeCpfCoordenador.add(tbRgCoordenador); //adiciona Texbox
		hpPainelRGeCpfCoordenador.setCellWidth(tbRgCoordenador, "30%");
		hpPainelRGeCpfCoordenador.add(lbCpfCoordenadores);//adiciona CPF
		hpPainelRGeCpfCoordenador.setCellWidth(lbCpfCoordenadores, "5%");
		hpPainelRGeCpfCoordenador.add(tbCpfCoordenador); //adiciona texbox
		hpPainelRGeCpfCoordenador.setCellWidth(tbCpfCoordenador, "60%");

		hpPainelMatriculaSiape = new HorizontalPanel();
		hpPainelMatriculaSiape.setStyleName("hpPainelMatriculaSiape");

		lbMatriculaSiapeCoordenador = new Label("Matricula/SIAPE:");
		lbMatriculaSiapeCoordenador.setStyleName("lbMatriculaSiapeCoordenador");

		tbMatriculaSiape = new TextBox();
		tbMatriculaSiape.setStyleName("tbMatriculaSiape");

		hpPainelMatriculaSiape.add(lbMatriculaSiapeCoordenador); //adiciona Matricula Siape
		hpPainelMatriculaSiape.setCellWidth(lbMatriculaSiapeCoordenador, "5%");
		hpPainelMatriculaSiape.add(tbMatriculaSiape); //adiciona Texbox
		hpPainelMatriculaSiape.setCellWidth(tbMatriculaSiape, "80%");

		vpPainelInformacoesCoordenador = new VerticalPanel();
		vpPainelInformacoesCoordenador.setStyleName("vpPainelInformacoesCoordenador");

		vpPainelInformacoesCoordenador.add(hpPainelInformacoesPessoaisCoordenador); //adiciona painel Informações
		vpPainelInformacoesCoordenador.add(hpPainelNomeCoordenador); //adiciona painel Informações
		vpPainelInformacoesCoordenador.add(hpPainelRGeCpfCoordenador); //adiciona painel Informações
		vpPainelInformacoesCoordenador.add(hpPainelMatriculaSiape); //adiciona painel Informações
		//---------------------------------------------------------------------
		//-------------------Contatos e Endereço-------------------------------
		hpPainelTelefoneEmailPopup = new HorizontalPanel();
		hpPainelTelefoneEmailPopup.setStyleName("hpPainelTelefoneEmailPopup");
		
		lbTelefoneCoordenadorPopup = new Label("Telefone:");
		lbTelefoneCoordenadorPopup.setStyleName("lbTelefoneCoordenadorPopup");
		
		tbTelefoneCoordenadorPopup = new TextBox();
		tbTelefoneCoordenadorPopup.setStyleName("tbTelefoneCoordenadorPopup");
		
		lbEmailCoordenadorPopup = new Label("E-mail:");
		lbEmailCoordenadorPopup.setStyleName("lbEmailCoordenadorPopup");
		
		tbEmailCoordenadorPopup = new TextBox();
		tbEmailCoordenadorPopup.setStyleName("tbEmailCoordenadorPopup");
		
		hpPainelTelefoneEmailPopup.add(lbTelefoneCoordenadorPopup);
		hpPainelTelefoneEmailPopup.setCellWidth(lbTelefoneCoordenadorPopup, "5%");
		hpPainelTelefoneEmailPopup.add(tbTelefoneCoordenadorPopup);
		hpPainelTelefoneEmailPopup.setCellWidth(tbTelefoneCoordenadorPopup, "10%");
		hpPainelTelefoneEmailPopup.add(lbEmailCoordenadorPopup);
		hpPainelTelefoneEmailPopup.setCellWidth(lbEmailCoordenadorPopup, "3%");
		hpPainelTelefoneEmailPopup.add(tbEmailCoordenadorPopup);
		hpPainelTelefoneEmailPopup.setCellWidth(tbEmailCoordenadorPopup, "45%");
		
		hpPainelContatoseEnderecoCoordenador = new HorizontalPanel();
		hpPainelContatoseEnderecoCoordenador.setStyleName("hpPainelContatoseEnderecoCoordenador");

		
		lbContatosEenderecoCoordenador = new Label("Contato e Endereço");
		lbContatosEenderecoCoordenador.setStyleName("lbContatosEenderecoCoordenador");

		hpPainelContatoseEnderecoCoordenador.add(lbContatosEenderecoCoordenador); //adiciona titulo painel endereço

		hpPainelEnderecoCoordenador = new HorizontalPanel();
		hpPainelEnderecoCoordenador.setStyleName("hpPainelEnderecoCoordenador");

		lbEnderecoCoordenador = new Label("Endereço:");
		lbEnderecoCoordenador.setStyleName("lbEnderecoCoordenador");

		tbEnderecoCoordenador = new TextBox();
		tbEnderecoCoordenador.setStyleName("tbEnderecoCoordenadorPopup");

		hpPainelEnderecoCoordenador.add(lbEnderecoCoordenador); //adiciona endereço
		hpPainelEnderecoCoordenador.setCellWidth(lbEnderecoCoordenador, "9%");
		hpPainelEnderecoCoordenador.add(tbEnderecoCoordenador); //adiciona texbox
		hpPainelEnderecoCoordenador.setCellWidth(tbEnderecoCoordenador, "80%");

		hpPainelNumeroBairro = new HorizontalPanel();
		hpPainelNumeroBairro.setStyleName("hpPainelNumeroBairro");

		lbNumeroCoordenador = new Label("Nº:");
		lbNumeroCoordenador.setStyleName("lbNumeroCoordenador");

		tbNumeroCoordenador = new TextBox();
		tbNumeroCoordenador.setStyleName("tbNumeroCoordenadorPopup");

		lbBairroCoordenador = new Label("Bairro:");
		lbBairroCoordenador.setStyleName("lbBairroCoordenador");

		tbBairroCoordenador = new TextBox();
		tbBairroCoordenador.setStyleName("tbBairroCoordenadorPopup");

		hpPainelNumeroBairro.add(lbNumeroCoordenador); //adiciona numero
		hpPainelNumeroBairro.setCellWidth(lbNumeroCoordenador, "5%");
		hpPainelNumeroBairro.add(tbNumeroCoordenador); //adiciona Textbox
		hpPainelNumeroBairro.setCellWidth(tbNumeroCoordenador, "15%");
		hpPainelNumeroBairro.add(lbBairroCoordenador); //adiciona bairro
		hpPainelNumeroBairro.setCellWidth(lbBairroCoordenador, "5%");
		hpPainelNumeroBairro.add(tbBairroCoordenador); //adiciona Textbox
		hpPainelNumeroBairro.setCellWidth(tbBairroCoordenador, "50%");

		hpPainelCidadeUf = new HorizontalPanel();
		hpPainelCidadeUf.setStyleName("hpPainelCidadeUf");

		lbCidadeCoordenador = new Label("Cidade:");
		lbCidadeCoordenador.setStyleName("lbCidadeCoordenador");

		tbCidadeCoordenador = new TextBox();
		tbCidadeCoordenador.setStyleName("tbCidadeCoordenadorPopup");

		lbUfCoordenador = new Label("UF:");
		lbUfCoordenador.setStyleName("lbUfCoordenador");

		listUfCoordenador = new ListBox();
		listUfCoordenador.setStyleName("listUfCoordenador");

		hpPainelCidadeUf.add(lbCidadeCoordenador); //adiciona cidade
		hpPainelCidadeUf.setCellWidth(lbCidadeCoordenador, "5%");
		hpPainelCidadeUf.add(tbCidadeCoordenador); //adiciona textbox
		hpPainelCidadeUf.setCellWidth(tbCidadeCoordenador, "31%");
		hpPainelCidadeUf.add(lbUfCoordenador); //adiciona uf
		hpPainelCidadeUf.setCellWidth(lbUfCoordenador, "5%");
		hpPainelCidadeUf.add(listUfCoordenador); //adiciona lista
		hpPainelCidadeUf.setCellWidth(listUfCoordenador, "30%");

		vpPainelContatoseEnderecoCoordenador = new VerticalPanel();
		vpPainelContatoseEnderecoCoordenador.setStyleName("vpPainelContatoseEnderecoCoordenador");

		
		vpPainelContatoseEnderecoCoordenador.add(hpPainelContatoseEnderecoCoordenador);
		vpPainelContatoseEnderecoCoordenador.add(hpPainelTelefoneEmailPopup);
		vpPainelContatoseEnderecoCoordenador.add(hpPainelEnderecoCoordenador); //adiciona painel contatos
		vpPainelContatoseEnderecoCoordenador.add(hpPainelNumeroBairro); //adiciona painel contatos
		vpPainelContatoseEnderecoCoordenador.add(hpPainelCidadeUf); //adiciona painel contatos

		//---------------------Painel Botoes voltar e Cadastrar--------
		//------------------------------------------------------------
		hpPainelBotoesVoltarCadastrar = new HorizontalPanel();
		hpPainelBotoesVoltarCadastrar.setStyleName("hpPainelBotoesVoltarCadastrar");

		btnVoltarCoordenador = new Button("Voltar");
		btnVoltarCoordenador.setStyleName("btnVoltarCoordenador");

		btnCadastrarCoordenador = new Button("Cadastrar");
		btnCadastrarCoordenador.setStyleName("btnCadastrarCoorde");

		//hpPainelBotoesVoltarCadastrar.add(btnVoltarCoordenador); //adiciona botão
		//hpPainelBotoesVoltarCadastrar.setCellWidth(btnVoltarCoordenador, "2%");
		hpPainelBotoesVoltarCadastrar.add(btnCadastrarCoordenador); //adiciona botao
		//------------------botao fechar-------------------------------
		btnFecharPopup = new Button("x");
		btnFecharPopup.setStyleName("btnFecharPopup");
		//--------------------------------------------------------------
		//---------------Painel Pai-------------------------------------

		vpPainelFormularioCadastroCoordenador = new VerticalPanel();
		vpPainelFormularioCadastroCoordenador.setStyleName("vpPainelFormularioCadastroCoordenador");

		vpPainelFormularioCadastroCoordenador.add(btnFecharPopup);
		vpPainelFormularioCadastroCoordenador.add(hpPainelTituloFormulario);
		vpPainelFormularioCadastroCoordenador.add(hpPainelTipodeServidor);
		vpPainelFormularioCadastroCoordenador.add(vpPainelInformacoesCoordenador);
		vpPainelFormularioCadastroCoordenador.add(vpPainelContatoseEnderecoCoordenador);
		vpPainelFormularioCadastroCoordenador.add(hpPainelBotoesVoltarCadastrar);
		
		this.add(vpPainelFormularioCadastroCoordenador);
		this.show();
		this.setGlassEnabled(true);
		this.center();
		this.setModal(false);
		this.setAnimationEnabled(true);

	}



	public HorizontalPanel getHpPainelTituloFormulario() {
		return hpPainelTituloFormulario;
	}



	public void setHpPainelTituloFormulario(HorizontalPanel hpPainelTituloFormulario) {
		this.hpPainelTituloFormulario = hpPainelTituloFormulario;
	}



	public HorizontalPanel getHpPainelTipodeServidor() {
		return hpPainelTipodeServidor;
	}



	public void setHpPainelTipodeServidor(HorizontalPanel hpPainelTipodeServidor) {
		this.hpPainelTipodeServidor = hpPainelTipodeServidor;
	}



	public HorizontalPanel getHpPainelInformacoesPessoaisCoordenador() {
		return hpPainelInformacoesPessoaisCoordenador;
	}



	public void setHpPainelInformacoesPessoaisCoordenador(
			HorizontalPanel hpPainelInformacoesPessoaisCoordenador) {
		this.hpPainelInformacoesPessoaisCoordenador = hpPainelInformacoesPessoaisCoordenador;
	}



	public HorizontalPanel getHpPainelNomeCoordenador() {
		return hpPainelNomeCoordenador;
	}



	public void setHpPainelNomeCoordenador(HorizontalPanel hpPainelNomeCoordenador) {
		this.hpPainelNomeCoordenador = hpPainelNomeCoordenador;
	}



	public HorizontalPanel getHpPainelRGeCpfCoordenador() {
		return hpPainelRGeCpfCoordenador;
	}



	public void setHpPainelRGeCpfCoordenador(
			HorizontalPanel hpPainelRGeCpfCoordenador) {
		this.hpPainelRGeCpfCoordenador = hpPainelRGeCpfCoordenador;
	}



	public HorizontalPanel getHpPainelMatriculaSiape() {
		return hpPainelMatriculaSiape;
	}



	public void setHpPainelMatriculaSiape(HorizontalPanel hpPainelMatriculaSiape) {
		this.hpPainelMatriculaSiape = hpPainelMatriculaSiape;
	}



	public HorizontalPanel getHpPainelContatoseEnderecoCoordenador() {
		return hpPainelContatoseEnderecoCoordenador;
	}



	public void setHpPainelContatoseEnderecoCoordenador(
			HorizontalPanel hpPainelContatoseEnderecoCoordenador) {
		this.hpPainelContatoseEnderecoCoordenador = hpPainelContatoseEnderecoCoordenador;
	}



	public HorizontalPanel getHpPainelEnderecoCoordenador() {
		return hpPainelEnderecoCoordenador;
	}



	public void setHpPainelEnderecoCoordenador(
			HorizontalPanel hpPainelEnderecoCoordenador) {
		this.hpPainelEnderecoCoordenador = hpPainelEnderecoCoordenador;
	}



	public HorizontalPanel getHpPainelNumeroBairro() {
		return hpPainelNumeroBairro;
	}



	public void setHpPainelNumeroBairro(HorizontalPanel hpPainelNumeroBairro) {
		this.hpPainelNumeroBairro = hpPainelNumeroBairro;
	}



	public HorizontalPanel getHpPainelCidadeUf() {
		return hpPainelCidadeUf;
	}



	public void setHpPainelCidadeUf(HorizontalPanel hpPainelCidadeUf) {
		this.hpPainelCidadeUf = hpPainelCidadeUf;
	}



	public HorizontalPanel getHpPainelBotoesVoltarCadastrar() {
		return hpPainelBotoesVoltarCadastrar;
	}



	public void setHpPainelBotoesVoltarCadastrar(
			HorizontalPanel hpPainelBotoesVoltarCadastrar) {
		this.hpPainelBotoesVoltarCadastrar = hpPainelBotoesVoltarCadastrar;
	}



	public VerticalPanel getVpPainelInformacoesCoordenador() {
		return vpPainelInformacoesCoordenador;
	}



	public void setVpPainelInformacoesCoordenador(
			VerticalPanel vpPainelInformacoesCoordenador) {
		this.vpPainelInformacoesCoordenador = vpPainelInformacoesCoordenador;
	}



	public VerticalPanel getVpPainelContatoseEnderecoCoordenador() {
		return vpPainelContatoseEnderecoCoordenador;
	}



	public void setVpPainelContatoseEnderecoCoordenador(
			VerticalPanel vpPainelContatoseEnderecoCoordenador) {
		this.vpPainelContatoseEnderecoCoordenador = vpPainelContatoseEnderecoCoordenador;
	}



	public VerticalPanel getVpPainelFormularioCadastroCoordenador() {
		return vpPainelFormularioCadastroCoordenador;
	}



	public void setVpPainelFormularioCadastroCoordenador(
			VerticalPanel vpPainelFormularioCadastroCoordenador) {
		this.vpPainelFormularioCadastroCoordenador = vpPainelFormularioCadastroCoordenador;
	}



	public Label getLbTituloPagina() {
		return lbTituloPagina;
	}



	public void setLbTituloPagina(Label lbTituloPagina) {
		this.lbTituloPagina = lbTituloPagina;
	}



	public Label getLbTipoCoordenadores() {
		return lbTipoCoordenadores;
	}



	public void setLbTipoCoordenadores(Label lbTipoCoordenadores) {
		this.lbTipoCoordenadores = lbTipoCoordenadores;
	}



	public Label getLbInformacoesPessoaisCoordenadores() {
		return lbInformacoesPessoaisCoordenadores;
	}



	public void setLbInformacoesPessoaisCoordenadores(
			Label lbInformacoesPessoaisCoordenadores) {
		this.lbInformacoesPessoaisCoordenadores = lbInformacoesPessoaisCoordenadores;
	}



	public Label getLbNomeCoordenadores() {
		return lbNomeCoordenadores;
	}



	public void setLbNomeCoordenadores(Label lbNomeCoordenadores) {
		this.lbNomeCoordenadores = lbNomeCoordenadores;
	}



	public Label getLbRgCoordenadores() {
		return lbRgCoordenadores;
	}



	public void setLbRgCoordenadores(Label lbRgCoordenadores) {
		this.lbRgCoordenadores = lbRgCoordenadores;
	}



	public Label getLbCpfCoordenadores() {
		return lbCpfCoordenadores;
	}



	public void setLbCpfCoordenadores(Label lbCpfCoordenadores) {
		this.lbCpfCoordenadores = lbCpfCoordenadores;
	}



	public Label getLbMatriculaSiapeCoordenador() {
		return lbMatriculaSiapeCoordenador;
	}



	public void setLbMatriculaSiapeCoordenador(Label lbMatriculaSiapeCoordenador) {
		this.lbMatriculaSiapeCoordenador = lbMatriculaSiapeCoordenador;
	}



	public Label getLbContatosEenderecoCoordenador() {
		return lbContatosEenderecoCoordenador;
	}



	public void setLbContatosEenderecoCoordenador(
			Label lbContatosEenderecoCoordenador) {
		this.lbContatosEenderecoCoordenador = lbContatosEenderecoCoordenador;
	}



	public Label getLbEnderecoCoordenador() {
		return lbEnderecoCoordenador;
	}



	public void setLbEnderecoCoordenador(Label lbEnderecoCoordenador) {
		this.lbEnderecoCoordenador = lbEnderecoCoordenador;
	}



	public Label getLbNumeroCoordenador() {
		return lbNumeroCoordenador;
	}



	public void setLbNumeroCoordenador(Label lbNumeroCoordenador) {
		this.lbNumeroCoordenador = lbNumeroCoordenador;
	}



	public Label getLbBairroCoordenador() {
		return lbBairroCoordenador;
	}



	public void setLbBairroCoordenador(Label lbBairroCoordenador) {
		this.lbBairroCoordenador = lbBairroCoordenador;
	}



	public Label getLbCidadeCoordenador() {
		return lbCidadeCoordenador;
	}



	public void setLbCidadeCoordenador(Label lbCidadeCoordenador) {
		this.lbCidadeCoordenador = lbCidadeCoordenador;
	}



	public Label getLbUfCoordenador() {
		return lbUfCoordenador;
	}



	public void setLbUfCoordenador(Label lbUfCoordenador) {
		this.lbUfCoordenador = lbUfCoordenador;
	}



	public Label getLbServidor() {
		return lbServidor;
	}



	public void setLbServidor(Label lbServidor) {
		this.lbServidor = lbServidor;
	}



	public Label getLbOutro() {
		return lbOutro;
	}



	public void setLbOutro(Label lbOutro) {
		this.lbOutro = lbOutro;
	}



	public RadioButton getRadioServidor() {
		return radioServidor;
	}



	public void setRadioServidor(RadioButton radioServidor) {
		this.radioServidor = radioServidor;
	}



	public RadioButton getRadioOutro() {
		return radioOutro;
	}



	public void setRadioOutro(RadioButton radioOutro) {
		this.radioOutro = radioOutro;
	}



	public ListBox getListUfCoordenador() {
		return listUfCoordenador;
	}



	public void setListUfCoordenador(ListBox listUfCoordenador) {
		this.listUfCoordenador = listUfCoordenador;
	}



	public Button getBtnVoltarCoordenador() {
		return btnVoltarCoordenador;
	}



	public void setBtnVoltarCoordenador(Button btnVoltarCoordenador) {
		this.btnVoltarCoordenador = btnVoltarCoordenador;
	}



	public Button getBtnCadastrarCoordenador() {
		return btnCadastrarCoordenador;
	}



	public void setBtnCadastrarCoordenador(Button btnCadastrarCoordenador) {
		this.btnCadastrarCoordenador = btnCadastrarCoordenador;
	}



	public TextBox getTbNomeCoordenador() {
		return tbNomeCoordenador;
	}



	public void setTbNomeCoordenador(TextBox tbNomeCoordenador) {
		this.tbNomeCoordenador = tbNomeCoordenador;
	}



	public TextBox getTbRgCoordenador() {
		return tbRgCoordenador;
	}



	public void setTbRgCoordenador(TextBox tbRgCoordenador) {
		this.tbRgCoordenador = tbRgCoordenador;
	}



	public TextBox getTbCpfCoordenador() {
		return tbCpfCoordenador;
	}



	public void setTbCpfCoordenador(TextBox tbCpfCoordenador) {
		this.tbCpfCoordenador = tbCpfCoordenador;
	}



	public TextBox getTbMatriculaSiape() {
		return tbMatriculaSiape;
	}



	public void setTbMatriculaSiape(TextBox tbMatriculaSiape) {
		this.tbMatriculaSiape = tbMatriculaSiape;
	}



	public TextBox getTbEnderecoCoordenador() {
		return tbEnderecoCoordenador;
	}



	public void setTbEnderecoCoordenador(TextBox tbEnderecoCoordenador) {
		this.tbEnderecoCoordenador = tbEnderecoCoordenador;
	}



	public TextBox getTbNumeroCoordenador() {
		return tbNumeroCoordenador;
	}



	public void setTbNumeroCoordenador(TextBox tbNumeroCoordenador) {
		this.tbNumeroCoordenador = tbNumeroCoordenador;
	}



	public TextBox getTbBairroCoordenador() {
		return tbBairroCoordenador;
	}



	public void setTbBairroCoordenador(TextBox tbBairroCoordenador) {
		this.tbBairroCoordenador = tbBairroCoordenador;
	}



	public TextBox getTbCidadeCoordenador() {
		return tbCidadeCoordenador;
	}



	public void setTbCidadeCoordenador(TextBox tbCidadeCoordenador) {
		this.tbCidadeCoordenador = tbCidadeCoordenador;
	}



	public Button getBtnFecharPopup() {
		return btnFecharPopup;
	}



	public void setBtnFecharPopup(Button btnFecharPopup) {
		this.btnFecharPopup = btnFecharPopup;
	}
	
	
}
