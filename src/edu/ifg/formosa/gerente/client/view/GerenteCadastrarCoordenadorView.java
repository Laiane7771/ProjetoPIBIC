package edu.ifg.formosa.gerente.client.view;


import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class GerenteCadastrarCoordenadorView extends Composite{
	
	private HorizontalPanel hpPainelLabelCadastrarCoordenador;
	private HorizontalPanel hpPainelLabelTipoCoordenador;
	private HorizontalPanel hpPainelLabelInformacoesPessoais;
	private HorizontalPanel hpPainelLabeleTextboxNome;
	private HorizontalPanel hpPainelLabeleTextboxRgCpf;
	private HorizontalPanel hpPainelLabelContatosCoordenador;
	private HorizontalPanel hpPainelLabeleTextboxTelefone;
	private HorizontalPanel hpPainelLabeleTextboxEmail;
	private HorizontalPanel hpPainelLabelEnderecoCoordenador;
	private HorizontalPanel hpPainelLabeleTexboxEndereco;
	private HorizontalPanel hpPainelLabeleTexboxNumeroBairro;
	private HorizontalPanel hpPainelLabeleTexboxCidadeUf;
	private HorizontalPanel hpPainelLabeleTexboxMatricula;
	private HorizontalPanel hpPainelBotoesVoltarSalvar;
	private HorizontalPanel hpPainelLabelSalvar;
	private VerticalPanel vpPainelFormularioCadastrarCoordenador;
	private VerticalPanel vpPainelInformacoesPessoais;
	private VerticalPanel vpPainelContatosCoordenador;
	private VerticalPanel vpPainelEnderecoCoordenador;
	private VerticalPanel vpPainelSalvarCoordenador;
	private Label lbAdicionandoCoordenador;
	private Label lbTipoCoordenador;
	private Label lbInformacoesPessoais;
	private Label lbNomeCompletoCoordenador;
	private Label lbRgCoordenador;
	private Label lbCpfCoordenador;
	private Label lbContatosCoordenador;
	private Label lbTelefoneCoordenador;
	private Label lbEmailCoordenador;
	private Label lbEnderecodoCoordenador;
	private Label lbEnderecoCoordenador;
	private Label lbNumeroCoordenador;
	private Label lbBairroCoordenador;
	private Label lbCidadeCoordenador;
	private Label lbUfCoordenador;
	private Label lbMatriculaSiapeCoordenador;
	private Label lbPainelSalvar;
	private Label lbTipoServidor;
	private Label lbTipoOutro;
	private Label lbCepCoor;
	private RadioButton rbServidorCoordenador;
	private RadioButton rbOutroCoordenador;
	private TextBox tbNomeCompletoCoordenador;
	private TextBox tbRgCoordenador;
	private TextBox tbCpfCoordenador;
	private TextBox tbTelefoneCoordenador;
	private TextBox tbEmailCoordenador;
	private TextBox tbEnderecoCoordenador;
	private TextBox tbNumeroCoordenador;
	private TextBox tbBairroCoordenador;
	private TextBox tbCidadeCoordenador;
	private TextBox tbSiapeMatriculaCoordenador;
	private TextBox tbCepCoor;
	private Button btnVoltarCoordenador;
	private Button btnSalvarCoordenador;
	private ListBox listUf;

	
	public GerenteCadastrarCoordenadorView(){
	
		
		//-------------Titulo Pagina-------------------------------------
		hpPainelLabelCadastrarCoordenador = new HorizontalPanel();
		hpPainelLabelCadastrarCoordenador.setStyleName("hpPainelLabelCadastrarCoordenador");
		
		lbAdicionandoCoordenador = new Label("Cadastro de Coordenadores");
		lbAdicionandoCoordenador.setStyleName("lbAdicionandoCoordenador");
		
		hpPainelLabelCadastrarCoordenador.add(lbAdicionandoCoordenador); //adicionaItens
		
		
		//-------------------Tipo de Coordenador-----------------------------
		hpPainelLabelTipoCoordenador = new HorizontalPanel();
		hpPainelLabelTipoCoordenador.setStyleName("hpPainelLabelTipoCoordenador");
		
		lbTipoCoordenador = new Label("Tipo de Coordenador");
		lbTipoCoordenador.setStyleName("lbTipoCoordenador");
		
		rbServidorCoordenador = new RadioButton("RadioGroup", "");
		rbServidorCoordenador.setStyleName("rbServidorCoordenador");
		
		rbServidorCoordenador.setValue(false);
		
		lbTipoServidor = new Label("Servidor");
		lbTipoServidor.setStyleName("lbTipoServidor");
		
		rbOutroCoordenador = new RadioButton("RadioGroup", "");
		rbOutroCoordenador.setStyleName("rbOutroCoordenador");
		
		rbOutroCoordenador.setValue(false);
		
		lbTipoOutro = new Label("Outro");
		lbTipoOutro.setStyleName("lbTipoServidor");
		
		hpPainelLabelTipoCoordenador.add(lbTipoCoordenador); //adiciona Itens
		hpPainelLabelTipoCoordenador.setCellWidth(lbTipoCoordenador, "10%");
		hpPainelLabelTipoCoordenador.add(rbServidorCoordenador); //adiciona Itens
		hpPainelLabelTipoCoordenador.setCellWidth(rbServidorCoordenador, "10%");
		hpPainelLabelTipoCoordenador.add(lbTipoServidor); 
		hpPainelLabelTipoCoordenador.setCellWidth(lbTipoServidor, "10%");
		hpPainelLabelTipoCoordenador.add(rbOutroCoordenador); //adiciona itens
		hpPainelLabelTipoCoordenador.setCellWidth(rbOutroCoordenador, "10%");
		hpPainelLabelTipoCoordenador.add(lbTipoOutro); 
		
		//---------------------Painel informacoes Pessoais------------------------------
		
		hpPainelLabelInformacoesPessoais = new HorizontalPanel();
		hpPainelLabelInformacoesPessoais.setStyleName("hpPainelLabelInformacoesPessoais");
		
		lbInformacoesPessoais = new Label("Informações Pessoais");
		lbInformacoesPessoais.setStyleName("lbInformacoesPessoais");
		
		hpPainelLabelInformacoesPessoais.add(lbInformacoesPessoais); //adiciona Itens
		
		hpPainelLabeleTextboxNome = new HorizontalPanel();
		hpPainelLabeleTextboxNome.setStyleName("hpPainelLabeleTextboxNome");
		
		lbNomeCompletoCoordenador = new Label("Nome Completo:");
		lbNomeCompletoCoordenador.setStyleName("lbNomeCompletoCoordenador");
		
		tbNomeCompletoCoordenador = new TextBox();
		tbNomeCompletoCoordenador.setStyleName("tbNomeCompletoCoordenador");
		
		hpPainelLabeleTextboxNome.add(lbNomeCompletoCoordenador); //adiciona Itens
		hpPainelLabeleTextboxNome.setCellWidth(lbNomeCompletoCoordenador, "1%");
		hpPainelLabeleTextboxNome.add(tbNomeCompletoCoordenador); //adiciona Itens
		hpPainelLabeleTextboxNome.setCellWidth(tbNomeCompletoCoordenador, "60%");
		
		hpPainelLabeleTextboxRgCpf = new HorizontalPanel();
		hpPainelLabeleTextboxRgCpf.setStyleName("hpPainelLabeleTextboxRgCpf");
		
		lbRgCoordenador = new Label("RG:");
		lbRgCoordenador.setStyleName("lbRgCoordenador");
		
		tbRgCoordenador = new TextBox();
		tbRgCoordenador.setStyleName("tbRgCoordenador");
		
		lbCpfCoordenador = new Label("CPF:");
		lbCpfCoordenador.setStyleName("lbCpfCoordenador");
		
		tbCpfCoordenador = new TextBox();
		tbCpfCoordenador.setStyleName("tbCpfCoordenador");
		
		hpPainelLabeleTextboxRgCpf.add(lbRgCoordenador); //adiciona itens
		hpPainelLabeleTextboxRgCpf.setCellWidth(lbRgCoordenador, "1%");
		hpPainelLabeleTextboxRgCpf.add(tbRgCoordenador); //adiciona itens
		hpPainelLabeleTextboxRgCpf.setCellWidth(tbRgCoordenador, "20%");
		hpPainelLabeleTextboxRgCpf.add(lbCpfCoordenador); //adiciona itens
		hpPainelLabeleTextboxRgCpf.setCellWidth(lbCpfCoordenador, "1%");
		hpPainelLabeleTextboxRgCpf.add(tbCpfCoordenador); //adiciona itens
		hpPainelLabeleTextboxRgCpf.setCellWidth(tbCpfCoordenador, "60%");
		
		vpPainelInformacoesPessoais = new VerticalPanel();
		vpPainelInformacoesPessoais.setStyleName("vpPainelInformacoesPessoais");
		
		hpPainelLabeleTexboxMatricula = new HorizontalPanel();
		hpPainelLabeleTexboxMatricula.setStyleName("hpPainelLabeleTexboxMatricula");
		
		lbMatriculaSiapeCoordenador = new Label("Matricula/SIAPE:");
		lbMatriculaSiapeCoordenador.setStyleName("lbMatriculaSiapeCoordenador1");
		
		tbSiapeMatriculaCoordenador = new TextBox();
		tbSiapeMatriculaCoordenador.setStyleName("tbSiapeMatriculaCoordenador");
		
		hpPainelLabeleTexboxMatricula.add(lbMatriculaSiapeCoordenador); //adiciona itens
		hpPainelLabeleTexboxMatricula.setCellWidth(lbMatriculaSiapeCoordenador, "1%");
		hpPainelLabeleTexboxMatricula.add(tbSiapeMatriculaCoordenador); //adiciona itens
		hpPainelLabeleTexboxMatricula.setCellWidth(tbSiapeMatriculaCoordenador, "54%");
		
		vpPainelInformacoesPessoais.add(hpPainelLabelInformacoesPessoais); //adiciona paineis
		vpPainelInformacoesPessoais.add(hpPainelLabeleTextboxNome);        //adiciona paineis
		vpPainelInformacoesPessoais.add(hpPainelLabeleTexboxMatricula);     //adiciona paineis
		vpPainelInformacoesPessoais.add(hpPainelLabeleTextboxRgCpf);       //adiciona paineis
	
		//---------------------Painel Contatos---------------------------------------------
		hpPainelLabelContatosCoordenador = new HorizontalPanel();
		hpPainelLabelContatosCoordenador.setStyleName("hpPainelLabelContatosCoordenador");
		
		lbContatosCoordenador = new Label("Contatos");
		lbContatosCoordenador.setStyleName("lbContatosCoordenador");
		
		hpPainelLabelContatosCoordenador.add(lbContatosCoordenador); //adiciona itens
		
		hpPainelLabeleTextboxTelefone = new HorizontalPanel();
		hpPainelLabeleTextboxTelefone.setStyleName("hpPainelLabeleTextboxTelefone");
		
		lbTelefoneCoordenador = new Label("Telefone:");
		lbTelefoneCoordenador.setStyleName("lbTelefoneCoordenador");
		
		tbTelefoneCoordenador = new TextBox();
		tbTelefoneCoordenador.setStyleName("tbTelefoneCoordenador");
		
		hpPainelLabeleTextboxTelefone.add(lbTelefoneCoordenador); //adiciona itens
		hpPainelLabeleTextboxTelefone.setCellWidth(lbTelefoneCoordenador, "4%");
		hpPainelLabeleTextboxTelefone.add(tbTelefoneCoordenador); //adiciona itens
		hpPainelLabeleTextboxTelefone.setCellWidth(tbTelefoneCoordenador, "90%");
		
		hpPainelLabeleTextboxEmail = new HorizontalPanel();
		hpPainelLabeleTextboxEmail.setStyleName("hpPainelLabeleTextboxEmail");
		
		lbEmailCoordenador = new Label("Email:");
		lbEmailCoordenador.setStyleName("lbEmailCoordenador");
		
		tbEmailCoordenador = new TextBox();
		tbEmailCoordenador.setStyleName("tbEmailCoordenador");
		
		hpPainelLabeleTextboxEmail.add(lbEmailCoordenador); //adiciona itens
		hpPainelLabeleTextboxEmail.setCellWidth(lbEmailCoordenador, "4%");
		hpPainelLabeleTextboxEmail.add(tbEmailCoordenador); //adiciona itens
		hpPainelLabeleTextboxEmail.setCellWidth(tbEmailCoordenador, "90%");
		
		vpPainelContatosCoordenador = new VerticalPanel();
		vpPainelContatosCoordenador.setStyleName("vpPainelContatosCoordenador");
		
		vpPainelContatosCoordenador.add(hpPainelLabelContatosCoordenador); //adiciona no painel
		vpPainelContatosCoordenador.add(hpPainelLabeleTextboxTelefone);
		vpPainelContatosCoordenador.add(hpPainelLabeleTextboxEmail);
		
		//----------------------------Painel Endereço------------------------------------
		
		hpPainelLabelEnderecoCoordenador = new HorizontalPanel();
		hpPainelLabelEnderecoCoordenador.setStyleName("hpPainelLabelEnderecoCoordenador");
		
		lbEnderecoCoordenador = new Label("Endereço");
		lbEnderecoCoordenador.setStyleName("lbEnderecoCadastroCoordenador");
		
		hpPainelLabelEnderecoCoordenador.add(lbEnderecoCoordenador); //adiciona itens 
		
		GWT.log("adicionou titulo do painel");
		
		hpPainelLabeleTexboxEndereco = new HorizontalPanel();
		hpPainelLabeleTexboxEndereco.setStyleName("hpPainelLabeleTexboxEndereco");
		
		lbEnderecodoCoordenador = new Label("Endereço:");
		lbEnderecodoCoordenador.setStyleName("lbEnderecodoCoordenador");
		
		tbEnderecoCoordenador = new TextBox();
		tbEnderecoCoordenador.setStyleName("tbEnderecodoCoordenador");
		
		hpPainelLabeleTexboxEndereco.add(lbEnderecodoCoordenador); //adiciona itens
		hpPainelLabeleTexboxEndereco.setCellWidth(lbEnderecoCoordenador, "1%");
		hpPainelLabeleTexboxEndereco.add(tbEnderecoCoordenador); //adiciona itens
		hpPainelLabeleTexboxEndereco.setCellWidth(tbEnderecoCoordenador, "90%");
		
		GWT.log("adicionou painel para endereco e textbox");
		
		lbNumeroCoordenador = new Label("Nº:");
		lbNumeroCoordenador.setStyleName("lbNumerodoCoordenador");
		
		tbNumeroCoordenador = new TextBox();
		tbNumeroCoordenador.setStyleName("tbNumerodoCoordenador");
		
		lbBairroCoordenador = new Label("Bairro:");
		lbBairroCoordenador.setStyleName("lbBairrodoCoordenador");
		
		tbBairroCoordenador = new TextBox();
		tbBairroCoordenador.setStyleName("tbBairrodoCoordenador");
		
		lbCepCoor = new Label("CEP:");
		lbCepCoor.setStyleName("lbCepCoor");
		
		tbCepCoor = new TextBox();
		tbCepCoor.setStyleName("tbCepCoor");
		
		hpPainelLabeleTexboxNumeroBairro = new HorizontalPanel();
		hpPainelLabeleTexboxNumeroBairro.setStyleName("hpPainelLabeleTexboxNumeroBairro");
		
		hpPainelLabeleTexboxNumeroBairro.add(lbNumeroCoordenador); //adiciona itens
		hpPainelLabeleTexboxNumeroBairro.setCellWidth(lbNumeroCoordenador, "1%");
		hpPainelLabeleTexboxNumeroBairro.add(tbNumeroCoordenador); //adiciona itens
		hpPainelLabeleTexboxNumeroBairro.setCellWidth(tbNumeroCoordenador, "5%");
		hpPainelLabeleTexboxNumeroBairro.add(lbBairroCoordenador); //adiciona itens
		hpPainelLabeleTexboxNumeroBairro.setCellWidth(lbBairroCoordenador, "1%");
		hpPainelLabeleTexboxNumeroBairro.add(tbBairroCoordenador);//adiciona itens
		hpPainelLabeleTexboxNumeroBairro.setCellWidth(tbBairroCoordenador, "30%");
		hpPainelLabeleTexboxNumeroBairro.add(lbCepCoor);//adiciona itens
		hpPainelLabeleTexboxNumeroBairro.setCellWidth(lbCepCoor,"2%");
		hpPainelLabeleTexboxNumeroBairro.add(tbCepCoor);//adiciona itens
		hpPainelLabeleTexboxNumeroBairro.setCellWidth(tbCepCoor, "30%");
		
		GWT.log("adicionou textbox para numero e bairro");
		
		lbCidadeCoordenador = new Label("Cidade:");
		lbCidadeCoordenador.setStyleName("lbCidadedoCoordenador");
		
		tbCidadeCoordenador = new TextBox();
		tbCidadeCoordenador.setStyleName("tbCidadedoCoordenador");
	
		lbUfCoordenador = new Label("Estado:");
		lbUfCoordenador.setStyleName("lbUfdoCoordenador");
		
		listUf = new ListBox();
		listUf.setStyleName("listUf");
		listUf.setTitle("UF");
		
		hpPainelLabeleTexboxCidadeUf = new HorizontalPanel();
		hpPainelLabeleTexboxCidadeUf.setStyleName("hpPainelLabeleTexboxCidadeUf");
		
		hpPainelLabeleTexboxCidadeUf.add(lbCidadeCoordenador);
		hpPainelLabeleTexboxCidadeUf.setCellWidth(lbCidadeCoordenador, "1%");
		hpPainelLabeleTexboxCidadeUf.add(tbCidadeCoordenador);
		hpPainelLabeleTexboxCidadeUf.setCellWidth(tbCidadeCoordenador, "20%");
		hpPainelLabeleTexboxCidadeUf.add(lbUfCoordenador);
		hpPainelLabeleTexboxCidadeUf.setCellWidth(lbUfCoordenador, "1%");
		hpPainelLabeleTexboxCidadeUf.add(listUf);
		hpPainelLabeleTexboxCidadeUf.setCellWidth(listUf, "20%");
		
		GWT.log("ADICIONOU");
		
		vpPainelEnderecoCoordenador = new VerticalPanel();
		vpPainelEnderecoCoordenador.setStyleName("vpPainelEnderecoCoordenador");
		
		vpPainelEnderecoCoordenador.add(hpPainelLabelEnderecoCoordenador);
		vpPainelEnderecoCoordenador.add(hpPainelLabeleTexboxEndereco);
		vpPainelEnderecoCoordenador.add(hpPainelLabeleTexboxNumeroBairro);
		vpPainelEnderecoCoordenador.add(hpPainelLabeleTexboxCidadeUf);
		
		
		//----------------------------Painel Botoes--------------------------------------
		
		hpPainelBotoesVoltarSalvar = new HorizontalPanel();
		hpPainelBotoesVoltarSalvar.setStyleName("hpPainelBotoesVoltarSalvar");
		
		hpPainelLabelSalvar = new HorizontalPanel();
		hpPainelLabelSalvar.setStyleName("hpPainelLabelSalvar");
	
		lbPainelSalvar = new Label("Salvar");
		lbPainelSalvar.setStyleName("lbPainelSalvar");
		
		hpPainelLabelSalvar.add(lbPainelSalvar);
		
		btnVoltarCoordenador = new Button("Voltar");
		btnVoltarCoordenador.setStyleName("btnVoltarCoordenador2");
		
		btnSalvarCoordenador = new Button("Salvar");
		btnSalvarCoordenador.setStyleName("btnSalvarCoordenador2");
	
		hpPainelBotoesVoltarSalvar.add(btnVoltarCoordenador);
		hpPainelBotoesVoltarSalvar.setCellWidth(btnVoltarCoordenador, "10%");
		hpPainelBotoesVoltarSalvar.add(btnSalvarCoordenador);
		hpPainelBotoesVoltarSalvar.setCellWidth(btnSalvarCoordenador, "10%");
		
		vpPainelSalvarCoordenador = new VerticalPanel();
		vpPainelSalvarCoordenador.setStyleName("vpPainelSalvarCoordenador");
		
		vpPainelSalvarCoordenador.add(hpPainelLabelSalvar);
		vpPainelSalvarCoordenador.add(hpPainelBotoesVoltarSalvar);
		
		//---------------------------------------------------------
		
		
		vpPainelFormularioCadastrarCoordenador = new VerticalPanel();
		vpPainelFormularioCadastrarCoordenador.setStyleName("vpPainelFormularioCadastrarCoordenador");
		
		vpPainelFormularioCadastrarCoordenador.add(hpPainelLabelCadastrarCoordenador); //adiciona itens
		vpPainelFormularioCadastrarCoordenador.add(hpPainelLabelTipoCoordenador);
		vpPainelFormularioCadastrarCoordenador.add(vpPainelInformacoesPessoais);
		vpPainelFormularioCadastrarCoordenador.add(vpPainelContatosCoordenador);
		vpPainelFormularioCadastrarCoordenador.add(vpPainelEnderecoCoordenador);
		vpPainelFormularioCadastrarCoordenador.add(vpPainelSalvarCoordenador);
		
		initWidget(vpPainelFormularioCadastrarCoordenador); //inicializa o painel
	
	}


	public HorizontalPanel getHpPainelLabelCadastrarCoordenador() {
		return hpPainelLabelCadastrarCoordenador;
	}


	public void setHpPainelLabelCadastrarCoordenador(
			HorizontalPanel hpPainelLabelCadastrarCoordenador) {
		this.hpPainelLabelCadastrarCoordenador = hpPainelLabelCadastrarCoordenador;
	}


	public HorizontalPanel getHpPainelLabelTipoCoordenador() {
		return hpPainelLabelTipoCoordenador;
	}


	public void setHpPainelLabelTipoCoordenador(
			HorizontalPanel hpPainelLabelTipoCoordenador) {
		this.hpPainelLabelTipoCoordenador = hpPainelLabelTipoCoordenador;
	}


	public HorizontalPanel getHpPainelLabelInformacoesPessoais() {
		return hpPainelLabelInformacoesPessoais;
	}


	public void setHpPainelLabelInformacoesPessoais(
			HorizontalPanel hpPainelLabelInformacoesPessoais) {
		this.hpPainelLabelInformacoesPessoais = hpPainelLabelInformacoesPessoais;
	}


	public HorizontalPanel getHpPainelLabeleTextboxNome() {
		return hpPainelLabeleTextboxNome;
	}


	public void setHpPainelLabeleTextboxNome(
			HorizontalPanel hpPainelLabeleTextboxNome) {
		this.hpPainelLabeleTextboxNome = hpPainelLabeleTextboxNome;
	}


	public HorizontalPanel getHpPainelLabeleTextboxRgCpf() {
		return hpPainelLabeleTextboxRgCpf;
	}


	public void setHpPainelLabeleTextboxRgCpf(
			HorizontalPanel hpPainelLabeleTextboxRgCpf) {
		this.hpPainelLabeleTextboxRgCpf = hpPainelLabeleTextboxRgCpf;
	}


	public HorizontalPanel getHpPainelLabelContatosCoordenador() {
		return hpPainelLabelContatosCoordenador;
	}


	public void setHpPainelLabelContatosCoordenador(
			HorizontalPanel hpPainelLabelContatosCoordenador) {
		this.hpPainelLabelContatosCoordenador = hpPainelLabelContatosCoordenador;
	}


	public HorizontalPanel getHpPainelLabeleTextboxTelefone() {
		return hpPainelLabeleTextboxTelefone;
	}


	public void setHpPainelLabeleTextboxTelefone(
			HorizontalPanel hpPainelLabeleTextboxTelefone) {
		this.hpPainelLabeleTextboxTelefone = hpPainelLabeleTextboxTelefone;
	}


	public HorizontalPanel getHpPainelLabeleTextboxEmail() {
		return hpPainelLabeleTextboxEmail;
	}


	public void setHpPainelLabeleTextboxEmail(
			HorizontalPanel hpPainelLabeleTextboxEmail) {
		this.hpPainelLabeleTextboxEmail = hpPainelLabeleTextboxEmail;
	}


	public HorizontalPanel getHpPainelLabelEnderecoCoordenador() {
		return hpPainelLabelEnderecoCoordenador;
	}


	public void setHpPainelLabelEnderecoCoordenador(
			HorizontalPanel hpPainelLabelEnderecoCoordenador) {
		this.hpPainelLabelEnderecoCoordenador = hpPainelLabelEnderecoCoordenador;
	}


	public HorizontalPanel getHpPainelLabeleTexboxEndereco() {
		return hpPainelLabeleTexboxEndereco;
	}


	public void setHpPainelLabeleTexboxEndereco(
			HorizontalPanel hpPainelLabeleTexboxEndereco) {
		this.hpPainelLabeleTexboxEndereco = hpPainelLabeleTexboxEndereco;
	}


	public HorizontalPanel getHpPainelLabeleTexboxNumeroBairro() {
		return hpPainelLabeleTexboxNumeroBairro;
	}


	public void setHpPainelLabeleTexboxNumeroBairro(
			HorizontalPanel hpPainelLabeleTexboxNumeroBairro) {
		this.hpPainelLabeleTexboxNumeroBairro = hpPainelLabeleTexboxNumeroBairro;
	}


	public HorizontalPanel getHpPainelLabeleTexboxCidadeUf() {
		return hpPainelLabeleTexboxCidadeUf;
	}


	public void setHpPainelLabeleTexboxCidadeUf(
			HorizontalPanel hpPainelLabeleTexboxCidadeUf) {
		this.hpPainelLabeleTexboxCidadeUf = hpPainelLabeleTexboxCidadeUf;
	}


	public HorizontalPanel getHpPainelLabeleTexboxMatricula() {
		return hpPainelLabeleTexboxMatricula;
	}


	public void setHpPainelLabeleTexboxMatricula(
			HorizontalPanel hpPainelLabeleTexboxMatricula) {
		this.hpPainelLabeleTexboxMatricula = hpPainelLabeleTexboxMatricula;
	}


	public HorizontalPanel getHpPainelBotoesVoltarSalvar() {
		return hpPainelBotoesVoltarSalvar;
	}


	public void setHpPainelBotoesVoltarSalvar(
			HorizontalPanel hpPainelBotoesVoltarSalvar) {
		this.hpPainelBotoesVoltarSalvar = hpPainelBotoesVoltarSalvar;
	}


	public HorizontalPanel getHpPainelLabelSalvar() {
		return hpPainelLabelSalvar;
	}


	public void setHpPainelLabelSalvar(HorizontalPanel hpPainelLabelSalvar) {
		this.hpPainelLabelSalvar = hpPainelLabelSalvar;
	}


	public VerticalPanel getVpPainelFormularioCadastrarCoordenador() {
		return vpPainelFormularioCadastrarCoordenador;
	}


	public void setVpPainelFormularioCadastrarCoordenador(
			VerticalPanel vpPainelFormularioCadastrarCoordenador) {
		this.vpPainelFormularioCadastrarCoordenador = vpPainelFormularioCadastrarCoordenador;
	}


	public VerticalPanel getVpPainelInformacoesPessoais() {
		return vpPainelInformacoesPessoais;
	}


	public void setVpPainelInformacoesPessoais(
			VerticalPanel vpPainelInformacoesPessoais) {
		this.vpPainelInformacoesPessoais = vpPainelInformacoesPessoais;
	}


	public VerticalPanel getVpPainelContatosCoordenador() {
		return vpPainelContatosCoordenador;
	}


	public void setVpPainelContatosCoordenador(
			VerticalPanel vpPainelContatosCoordenador) {
		this.vpPainelContatosCoordenador = vpPainelContatosCoordenador;
	}


	public VerticalPanel getVpPainelEnderecoCoordenador() {
		return vpPainelEnderecoCoordenador;
	}


	public void setVpPainelEnderecoCoordenador(
			VerticalPanel vpPainelEnderecoCoordenador) {
		this.vpPainelEnderecoCoordenador = vpPainelEnderecoCoordenador;
	}


	public VerticalPanel getVpPainelSalvarCoordenador() {
		return vpPainelSalvarCoordenador;
	}


	public void setVpPainelSalvarCoordenador(VerticalPanel vpPainelSalvarCoordenador) {
		this.vpPainelSalvarCoordenador = vpPainelSalvarCoordenador;
	}


	public Label getLbAdicionandoCoordenador() {
		return lbAdicionandoCoordenador;
	}


	public void setLbAdicionandoCoordenador(Label lbAdicionandoCoordenador) {
		this.lbAdicionandoCoordenador = lbAdicionandoCoordenador;
	}


	public Label getLbTipoCoordenador() {
		return lbTipoCoordenador;
	}


	public void setLbTipoCoordenador(Label lbTipoCoordenador) {
		this.lbTipoCoordenador = lbTipoCoordenador;
	}


	public Label getLbInformacoesPessoais() {
		return lbInformacoesPessoais;
	}


	public void setLbInformacoesPessoais(Label lbInformacoesPessoais) {
		this.lbInformacoesPessoais = lbInformacoesPessoais;
	}


	public Label getLbNomeCompletoCoordenador() {
		return lbNomeCompletoCoordenador;
	}


	public void setLbNomeCompletoCoordenador(Label lbNomeCompletoCoordenador) {
		this.lbNomeCompletoCoordenador = lbNomeCompletoCoordenador;
	}


	public Label getLbRgCoordenador() {
		return lbRgCoordenador;
	}


	public void setLbRgCoordenador(Label lbRgCoordenador) {
		this.lbRgCoordenador = lbRgCoordenador;
	}


	public Label getLbCpfCoordenador() {
		return lbCpfCoordenador;
	}


	public void setLbCpfCoordenador(Label lbCpfCoordenador) {
		this.lbCpfCoordenador = lbCpfCoordenador;
	}


	public Label getLbContatosCoordenador() {
		return lbContatosCoordenador;
	}


	public void setLbContatosCoordenador(Label lbContatosCoordenador) {
		this.lbContatosCoordenador = lbContatosCoordenador;
	}


	public Label getLbTelefoneCoordenador() {
		return lbTelefoneCoordenador;
	}


	public void setLbTelefoneCoordenador(Label lbTelefoneCoordenador) {
		this.lbTelefoneCoordenador = lbTelefoneCoordenador;
	}


	public Label getLbEmailCoordenador() {
		return lbEmailCoordenador;
	}


	public void setLbEmailCoordenador(Label lbEmailCoordenador) {
		this.lbEmailCoordenador = lbEmailCoordenador;
	}


	public Label getLbEnderecodoCoordenador() {
		return lbEnderecodoCoordenador;
	}


	public void setLbEnderecodoCoordenador(Label lbEnderecodoCoordenador) {
		this.lbEnderecodoCoordenador = lbEnderecodoCoordenador;
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


	public Label getLbMatriculaSiapeCoordenador() {
		return lbMatriculaSiapeCoordenador;
	}


	public void setLbMatriculaSiapeCoordenador(Label lbMatriculaSiapeCoordenador) {
		this.lbMatriculaSiapeCoordenador = lbMatriculaSiapeCoordenador;
	}


	public Label getLbPainelSalvar() {
		return lbPainelSalvar;
	}


	public void setLbPainelSalvar(Label lbPainelSalvar) {
		this.lbPainelSalvar = lbPainelSalvar;
	}


	public Label getLbTipoServidor() {
		return lbTipoServidor;
	}


	public void setLbTipoServidor(Label lbTipoServidor) {
		this.lbTipoServidor = lbTipoServidor;
	}


	public Label getLbTipoOutro() {
		return lbTipoOutro;
	}


	public void setLbTipoOutro(Label lbTipoOutro) {
		this.lbTipoOutro = lbTipoOutro;
	}


	public Label getLbCepCoor() {
		return lbCepCoor;
	}


	public void setLbCepCoor(Label lbCepCoor) {
		this.lbCepCoor = lbCepCoor;
	}


	public RadioButton getRbServidorCoordenador() {
		return rbServidorCoordenador;
	}


	public void setRbServidorCoordenador(RadioButton rbServidorCoordenador) {
		this.rbServidorCoordenador = rbServidorCoordenador;
	}


	public RadioButton getRbOutroCoordenador() {
		return rbOutroCoordenador;
	}


	public void setRbOutroCoordenador(RadioButton rbOutroCoordenador) {
		this.rbOutroCoordenador = rbOutroCoordenador;
	}


	public TextBox getTbNomeCompletoCoordenador() {
		return tbNomeCompletoCoordenador;
	}


	public void setTbNomeCompletoCoordenador(TextBox tbNomeCompletoCoordenador) {
		this.tbNomeCompletoCoordenador = tbNomeCompletoCoordenador;
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


	public TextBox getTbTelefoneCoordenador() {
		return tbTelefoneCoordenador;
	}


	public void setTbTelefoneCoordenador(TextBox tbTelefoneCoordenador) {
		this.tbTelefoneCoordenador = tbTelefoneCoordenador;
	}


	public TextBox getTbEmailCoordenador() {
		return tbEmailCoordenador;
	}


	public void setTbEmailCoordenador(TextBox tbEmailCoordenador) {
		this.tbEmailCoordenador = tbEmailCoordenador;
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


	public TextBox getTbSiapeMatriculaCoordenador() {
		return tbSiapeMatriculaCoordenador;
	}


	public void setTbSiapeMatriculaCoordenador(TextBox tbSiapeMatriculaCoordenador) {
		this.tbSiapeMatriculaCoordenador = tbSiapeMatriculaCoordenador;
	}


	public TextBox getTbCepCoor() {
		return tbCepCoor;
	}


	public void setTbCepCoor(TextBox tbCepCoor) {
		this.tbCepCoor = tbCepCoor;
	}


	public Button getBtnVoltarCoordenador() {
		return btnVoltarCoordenador;
	}


	public void setBtnVoltarCoordenador(Button btnVoltarCoordenador) {
		this.btnVoltarCoordenador = btnVoltarCoordenador;
	}


	public Button getBtnSalvarCoordenador() {
		return btnSalvarCoordenador;
	}


	public void setBtnSalvarCoordenador(Button btnSalvarCoordenador) {
		this.btnSalvarCoordenador = btnSalvarCoordenador;
	}


	public ListBox getListUf() {
		return listUf;
	}


	public void setListUf(ListBox listUf) {
		this.listUf = listUf;
	}

	
}
