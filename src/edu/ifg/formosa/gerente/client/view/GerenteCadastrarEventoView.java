package edu.ifg.formosa.gerente.client.view;


import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;


public class GerenteCadastrarEventoView extends Composite{
	
	private VerticalPanel vpPainelFormularioCadastrarEvento;
	private VerticalPanel vpPainelInformacoes;
	private VerticalPanel vpPainelDataCertificado;
	private VerticalPanel vpPainelContatos;
	private VerticalPanel vpPainelEndereco;
	private VerticalPanel vpPainelBotoes;
	private VerticalPanel vpPainelSalvar;
	private HorizontalPanel hpPainelLabelInformacoes;
	private HorizontalPanel hpPainelLabelETextboxNome;
	private HorizontalPanel hpPainelLabelETextboxDescricao;
	private HorizontalPanel hpPainelLabelETextboxOrganizador;
	private HorizontalPanel hpPainelLabelETextboxDataInicioEncerramento;
	private HorizontalPanel hpPainelLabelDataCertificados;
	private HorizontalPanel hpPainelLabelETextboxDataCertificados;
	private HorizontalPanel hpPainelLabelContatos;
	private HorizontalPanel hpPainelLabelETexboxTelefone;
	private HorizontalPanel hpPainelLabelETexboxEmail;
	private HorizontalPanel hpPainelLabelETextboxLocaldoevento;
	private HorizontalPanel hpPainelLabelEndereco;
	private HorizontalPanel hpPainelLabelETextboxEndereco;
	private HorizontalPanel hpPainelLabelETextboxCidadeEstado;
	private HorizontalPanel hpPainelLabelETextboxNumeroBairro;
	private HorizontalPanel hpPainelLabelETextboxComplemento;
	private HorizontalPanel hpPainelButtonFecharVoltar;
	private HorizontalPanel hpPainelNomeCoordenador;
	private Label lbTituloFormulario;
	private Label lbInformacoesEvento;
	private Label lbNomeEvento;
	private Label lbDescricaoEvento;
	private Label lbOrganizador;
	private Label lbDataInicio;
	private Label lbDataEncerra;
	private Label lbDataDispoCertificado;
	private Label lbDataCertificado;
	private Label lbContatosEvento;
	private Label lbTelefoneEvento;
	private Label lbEmailEvento;
	private Label lbLocaldoEvento;
	private Label lbEnderecoEventotitulo;
	private Label lbEnderecoEvento;
	private Label lbNumeroEnderecoEvento;
	private Label lbBairroEnderecoEvento;
	private Label lbComplementoEnderecoEvento;
	private Label lbCidadeEnderecoEvento;
	private Label lbEstadoEnderecoEvento;
	private Label lbsalvar;
	private Label lbNomeCoordenador;
	private Label lbCepEvento;
	private TextBox tbNomeEvento;
	private TextBox tbOrganizador;
	private TextBox tbDataInicio;
	private TextBox tbDataEncerra;
	private TextBox tbDataCertificado;
	private TextBox tbTelefoneEvento;
	private TextBox tbEmailEvento;
	private TextBox tbEnderecoEvento;
	private TextBox tbNumeroEnderecoEvento;
	private TextBox tbBairroEnderecoEvento;
	private TextBox tbCidadeEnderecoEvento;
	private TextBox tbComplementoEnderecoEvento;
	private TextBox tbLocaldoEvento;
	private TextBox tbCepEvento;
	private TextArea taDescricaoEvento;
	private Button btnCadastrar;
	private Button btnVoltar;
	private Button btnCadastrarCoordenador;
	private ListBox listboxNomeCoordenador;
	private ListBox listUfEvento;
	

	public GerenteCadastrarEventoView(){
		
		lbTituloFormulario = new Label("Criando Evento...");
		lbTituloFormulario.setStyleName("lbTituloFormulario");
		
		vpPainelInformacoes = new VerticalPanel(); //painel pai
		vpPainelInformacoes.setStyleName("vpPainelInformacoes");
		
		hpPainelLabelInformacoes = new HorizontalPanel(); //painel para o titulo
		hpPainelLabelInformacoes.setStyleName("hpPainelLabelInformacoes");
		
		lbInformacoesEvento = new Label("Informações"); //titulo do painel
		lbInformacoesEvento.setStyleName("lbInformacoesEvento");
		
		hpPainelLabelInformacoes.add(lbInformacoesEvento); //adiciona a label no painel
		
		lbNomeCoordenador = new Label("Coordenador(a):");
		lbNomeCoordenador.setStyleName("lbNomeCoordenador");
		
		listboxNomeCoordenador = new ListBox();
		listboxNomeCoordenador.setStyleName("listboxNomeCoordenador");
		
		btnCadastrarCoordenador = new Button("Cadastrar Coordenador");
		btnCadastrarCoordenador.setStyleName("btnCadastrarCoordenador");
		
		hpPainelNomeCoordenador = new HorizontalPanel();
		hpPainelNomeCoordenador.setStyleName("hpPainelNomeCoordenador");
		
		hpPainelNomeCoordenador.add(lbNomeCoordenador); //adiciona item
		hpPainelNomeCoordenador.setCellWidth(lbNomeCoordenador, "1%");
		hpPainelNomeCoordenador.add(listboxNomeCoordenador); //adiciona item
		hpPainelNomeCoordenador.setCellWidth(listboxNomeCoordenador, "70%");
		hpPainelNomeCoordenador.add(btnCadastrarCoordenador);
		hpPainelNomeCoordenador.setCellWidth(btnCadastrarCoordenador, "29%");
		
		hpPainelLabelETextboxNome = new HorizontalPanel(); //painel para o nome do evento
		hpPainelLabelETextboxNome.setStyleName("hpPainelLabelETexboxNome;");
		
		lbNomeEvento = new Label("Nome do Evento:"); //label nome
		lbNomeEvento.setStyleName("lbNomeEvento");
		
		tbNomeEvento = new TextBox();  //textbox para nome
		tbNomeEvento.setStyleName("tbNomeEvento");
		
		hpPainelLabelETextboxNome.add(lbNomeEvento); //adiciona label
		hpPainelLabelETextboxNome.setCellWidth(lbNomeEvento, "10%");
		hpPainelLabelETextboxNome.add(tbNomeEvento); //adiciona texbox;
		hpPainelLabelETextboxNome.setCellWidth(tbNomeEvento, "80%");
	
		hpPainelLabelETextboxOrganizador = new HorizontalPanel();  //painel para organizador
		hpPainelLabelETextboxOrganizador.setStyleName("hpPainelLabelETexboxOrganizador");
		
		lbOrganizador = new Label("Organizador(a):"); //label organizadr
		lbOrganizador.setStyleName("lbOrganizador");
		
		tbOrganizador = new TextBox();
		tbOrganizador.setStyleName("tbOrganizador"); //texbox organizador
		
		hpPainelLabelETextboxOrganizador.add(lbOrganizador); //adiciona label
		hpPainelLabelETextboxOrganizador.setCellWidth(lbOrganizador, "10%");
		hpPainelLabelETextboxOrganizador.add(tbOrganizador); //adiciona texbox
		hpPainelLabelETextboxOrganizador.setCellWidth(tbOrganizador, "80%");
		
		hpPainelLabelETextboxDescricao = new HorizontalPanel();
		hpPainelLabelETextboxDescricao.setStyleName("hpPainelLabelETextboxDescricao");
		
		lbDescricaoEvento = new Label("Descrição:");
		lbDescricaoEvento.setStyleName("lbDescricaoEvento");
		
		taDescricaoEvento = new TextArea();
		taDescricaoEvento.setStyleName("taDescricaoEvento");
		
		hpPainelLabelETextboxDescricao.add(lbDescricaoEvento); //adiciona
		hpPainelLabelETextboxDescricao.setCellWidth(lbDescricaoEvento, "1%");
		hpPainelLabelETextboxDescricao.add(taDescricaoEvento); //adiciona
		hpPainelLabelETextboxDescricao.setCellWidth(taDescricaoEvento, "10%");
		
		hpPainelLabelETextboxDataInicioEncerramento = new HorizontalPanel();
		hpPainelLabelETextboxDataInicioEncerramento.setStyleName("hpPainelLabelETexboxDataInicioEncerramento"); //painel para data 
		
		lbDataInicio = new Label("Data de Início:"); //label data inicio
		lbDataInicio.setStyleName("lbDataInicio");
		
		tbDataInicio = new TextBox(); //texbox inicio
		tbDataInicio.setStyleName("tbDataInicio");
		
		lbDataEncerra = new Label("Data de Encerramento:"); //label Data encerra
		lbDataEncerra.setStyleName("lbDataEncerra");
		
		tbDataEncerra = new TextBox();
		tbDataEncerra.setStyleName("tbDataEncerra"); // texbox encerra
		
		hpPainelLabelETextboxDataInicioEncerramento.add(lbDataInicio); //adiciona label
		hpPainelLabelETextboxDataInicioEncerramento.setCellWidth(lbDataInicio, "1%");
		hpPainelLabelETextboxDataInicioEncerramento.add(tbDataInicio); //adiciona  texbox
		hpPainelLabelETextboxDataInicioEncerramento.setCellWidth(tbDataInicio, "6%");
		hpPainelLabelETextboxDataInicioEncerramento.add(lbDataEncerra); //adiciona label
		hpPainelLabelETextboxDataInicioEncerramento.setCellWidth(lbDataEncerra, "1%");
		hpPainelLabelETextboxDataInicioEncerramento.add(tbDataEncerra); //adiciona texbox
		hpPainelLabelETextboxDataInicioEncerramento.setCellWidth(tbDataEncerra, "40%");
		
		vpPainelInformacoes.add(hpPainelLabelInformacoes);
		vpPainelInformacoes.add(hpPainelNomeCoordenador);
		vpPainelInformacoes.add(hpPainelLabelETextboxNome); 
		vpPainelInformacoes.add(hpPainelLabelETextboxDescricao);
		vpPainelInformacoes.add(hpPainelLabelETextboxOrganizador);
		vpPainelInformacoes.add(hpPainelLabelETextboxDataInicioEncerramento); //adiciona itens
		
		//-------------------------------------------------------------------------------------
		
		vpPainelDataCertificado = new VerticalPanel();
		vpPainelDataCertificado.setStyleName("vpPainelDataCertificado"); //painel data certificados
		
		hpPainelLabelDataCertificados = new HorizontalPanel(); //painel para titulo
		hpPainelLabelDataCertificados.setStyleName("hpPainelLabelDataCertificados");
		
		lbDataDispoCertificado = new Label("Data para disponibilização dos certificados"); //label titulo
		lbDataDispoCertificado.setStyleName("lbDataDispoCertificado");
		
		hpPainelLabelDataCertificados.add(lbDataDispoCertificado); //adiciona label de titulo
		
		hpPainelLabelETextboxDataCertificados = new HorizontalPanel();
		hpPainelLabelETextboxDataCertificados.setStyleName("hpPainelLabelETexboxDataCertificados");
		
		lbDataCertificado = new Label("Data:");
		lbDataCertificado.setStyleName("lbDataCertificado");
		
		tbDataCertificado = new TextBox();
		tbDataCertificado.setStyleName("tbDataCertificado"); //
		
		hpPainelLabelETextboxDataCertificados.add(lbDataCertificado); //adiciona label e texbox
		hpPainelLabelETextboxDataCertificados.setCellWidth(lbDataCertificado, "2%");
		hpPainelLabelETextboxDataCertificados.add(tbDataCertificado);
		hpPainelLabelETextboxDataCertificados.setCellWidth(tbDataCertificado, "45%");
		
		vpPainelDataCertificado.add(hpPainelLabelDataCertificados);
		vpPainelDataCertificado.add(hpPainelLabelETextboxDataCertificados); //adiciona paineis
		
		//-------------------------------------------------------------------------------------
		
		vpPainelContatos = new VerticalPanel();
		vpPainelContatos.setStyleName("vpPainelContatos"); //painel contatos
		
		hpPainelLabelContatos = new HorizontalPanel();
		hpPainelLabelContatos.setStyleName("hpPainelLabelContatos"); //painel para titulo
		
		lbContatosEvento = new Label("Contatos"); //label para titulo
		lbContatosEvento.setStyleName("lbContatosEvento");
		
		hpPainelLabelContatos.add(lbContatosEvento); //adiciona titulo do painel
		
		hpPainelLabelETexboxTelefone = new HorizontalPanel();
		hpPainelLabelETexboxTelefone.setStyleName("hpPainelLabelETexboxTelefone"); //painel para label e texbox telefone
		
		lbTelefoneEvento = new Label("Telefone:"); //label telefone
		lbTelefoneEvento.setStyleName("lbTelefoneEvento");
		
		tbTelefoneEvento = new TextBox(); //texbox telefone
		tbTelefoneEvento.setStyleName("tbTelefoneEvento");
	
		hpPainelLabelETexboxTelefone.add(lbTelefoneEvento); //adiciona label
		hpPainelLabelETexboxTelefone.setCellWidth(lbTelefoneEvento, "2%");
		hpPainelLabelETexboxTelefone.add(tbTelefoneEvento); //adiciona texbox
		hpPainelLabelETexboxTelefone.setCellWidth(lbTelefoneEvento, "13%");
		
		hpPainelLabelETexboxEmail = new HorizontalPanel();
		hpPainelLabelETexboxEmail.setStyleName("hpPainelLabelETexboxEmail"); //painel para email
		
		lbEmailEvento = new Label("Email:"); //label email
		lbEmailEvento.setStyleName("lbEmailEvento");
		
		tbEmailEvento = new TextBox();
		tbEmailEvento.setStyleName("tbEmailEvento"); //texbox email
		
		hpPainelLabelETexboxEmail.add(lbEmailEvento); //adiciona label
		hpPainelLabelETexboxEmail.setCellWidth(hpPainelLabelETexboxEmail, "2%");
		hpPainelLabelETexboxEmail.add(tbEmailEvento); //adicioan texbox
		hpPainelLabelETexboxEmail.setCellWidth(tbEmailEvento, "98%");
		
		vpPainelContatos.add(hpPainelLabelContatos); 
		vpPainelContatos.add(hpPainelLabelETexboxTelefone); //adiciona itens no painel
		vpPainelContatos.add(hpPainelLabelETexboxEmail);
		//-------------------------------------------------------------------------------------
		
		vpPainelEndereco = new VerticalPanel();
		vpPainelEndereco.setStyleName("vpPainelEndereco"); //painel para endereco
		
		hpPainelLabelEndereco = new HorizontalPanel();
		hpPainelLabelEndereco.setStyleName("hpPainelLabelEndereco"); //painel para titulo
		
		lbEnderecoEventotitulo = new Label("Endereço");
		lbEnderecoEventotitulo.setStyleName("lbEnderecoEventotitulo"); //label para titulo do painel
		
		hpPainelLabelEndereco.add(lbEnderecoEventotitulo); //adiciona titulo no painel
		
		hpPainelLabelETextboxEndereco = new HorizontalPanel();
		hpPainelLabelETextboxEndereco.setStyleName("hpPainelLabelETexboxEndereco"); //painel para label endereco e texbox
		
		lbEnderecoEvento = new Label("Endereço:"); 
		lbEnderecoEvento.setStyleName("lbEnderecoEvento"); //label endereco
		
		tbEnderecoEvento = new TextBox();
		tbEnderecoEvento.setStyleName("tbEnderecoEvento"); //label texbox
		
		hpPainelLabelETextboxEndereco.add(lbEnderecoEvento); //adiciona label 
		hpPainelLabelETextboxEndereco.setCellWidth(lbEnderecoEvento, "2%");
		hpPainelLabelETextboxEndereco.add(tbEnderecoEvento); //adiciona texbox
		hpPainelLabelETextboxEndereco.setCellWidth(tbEnderecoEvento, "40%");
		
		hpPainelLabelETextboxCidadeEstado = new HorizontalPanel();
		hpPainelLabelETextboxCidadeEstado.setStyleName("hpPainelLabelETexboxCidadeEstado"); //painel estado e cidade
		
		lbCidadeEnderecoEvento = new Label("Cidade:");
		lbCidadeEnderecoEvento.setStyleName("lbCidadeEnderecoEvento"); //label cidade
		
		tbCidadeEnderecoEvento = new TextBox();
		tbCidadeEnderecoEvento.setStyleName("tbCidadeEnderecoEvento"); //texbox cidade
		
		lbEstadoEnderecoEvento = new Label("Estado:"); //label estado
		lbEstadoEnderecoEvento.setStyleName("lbEstadoEnderecoEvento");
		
		lbCepEvento = new Label("CEP:");
		lbCepEvento.setStyleName("lbCepEvento");
		
		tbCepEvento = new TextBox();
		tbCepEvento.setStyleName("tbCepEvento");
		
		listUfEvento = new ListBox();
		listUfEvento.setStyleName("listUfEvento");
		
		hpPainelLabelETextboxCidadeEstado.add(lbCidadeEnderecoEvento); //adiciona label
		hpPainelLabelETextboxCidadeEstado.setCellWidth(lbCidadeEnderecoEvento, "5%");
		hpPainelLabelETextboxCidadeEstado.add(tbCidadeEnderecoEvento); //adiciona texbox
		hpPainelLabelETextboxCidadeEstado.setCellWidth(tbCidadeEnderecoEvento, "10%");
		hpPainelLabelETextboxCidadeEstado.add(lbEstadoEnderecoEvento); //adiciona label
		hpPainelLabelETextboxCidadeEstado.setCellWidth(lbEstadoEnderecoEvento, "1%");
		hpPainelLabelETextboxCidadeEstado.add(listUfEvento);
		hpPainelLabelETextboxCidadeEstado.setCellWidth(listUfEvento, "20%");
		hpPainelLabelETextboxCidadeEstado.add(lbCepEvento);
		hpPainelLabelETextboxCidadeEstado.setCellWidth(lbCepEvento, "10%");
		hpPainelLabelETextboxCidadeEstado.add(tbCepEvento);
		hpPainelLabelETextboxCidadeEstado.setCellWidth(tbCepEvento, "30%");
		
		
		hpPainelLabelETextboxLocaldoevento = new HorizontalPanel();
		hpPainelLabelETextboxLocaldoevento.setStyleName("hpPainelLabelETexboxLocaldoevento"); //painel local do evento
		
		lbLocaldoEvento = new Label("Local do Evento:"); //label local do evento
		lbLocaldoEvento.setStyleName("lbLocaldoEvento");
		
		tbLocaldoEvento = new TextBox();
		tbLocaldoEvento.setStyleName("tbLocaldoEvento"); //textbox local do evento
		
		hpPainelLabelETextboxLocaldoevento.add(lbLocaldoEvento); //adiciona label
		hpPainelLabelETextboxLocaldoevento.setCellWidth(lbLocaldoEvento, "2%");
		hpPainelLabelETextboxLocaldoevento.add(tbLocaldoEvento); //adiciona texbox
		hpPainelLabelETextboxLocaldoevento.setCellWidth(tbLocaldoEvento, "40%");
		
		hpPainelLabelETextboxNumeroBairro = new HorizontalPanel();
		hpPainelLabelETextboxNumeroBairro.setStyleName("hpPainelLabelETexboxNumeroBairro"); //painel numero e bairro
		
		lbNumeroEnderecoEvento = new Label("Numero:");
		lbNumeroEnderecoEvento.setStyleName("lbNumeroEnderecoEvento"); //label numero
		
		tbNumeroEnderecoEvento = new TextBox();
		tbNumeroEnderecoEvento.setStyleName("tbNumeroEnderecoEvento"); //texbox numero
		
		lbBairroEnderecoEvento = new Label("Bairro:");
		lbBairroEnderecoEvento.setStyleName("lbBairroEnderecoEvento"); //label bairro
		
		tbBairroEnderecoEvento = new TextBox();
		tbBairroEnderecoEvento.setStyleName("tbBairroEnderecoEvento"); //texbox bairro
		
		hpPainelLabelETextboxNumeroBairro.add(lbNumeroEnderecoEvento); //adiciona label numero
		hpPainelLabelETextboxNumeroBairro.setCellWidth(lbNumeroEnderecoEvento, "5%");
		hpPainelLabelETextboxNumeroBairro.add(tbNumeroEnderecoEvento); //adiciona texbox numero
		hpPainelLabelETextboxNumeroBairro.setCellWidth(tbNumeroEnderecoEvento, "12%");
		hpPainelLabelETextboxNumeroBairro.add(lbBairroEnderecoEvento); //adiciona label bairro
		hpPainelLabelETextboxNumeroBairro.setCellWidth(lbBairroEnderecoEvento, "14%");
		hpPainelLabelETextboxNumeroBairro.add(tbBairroEnderecoEvento); //adiciona texbox bairro
		hpPainelLabelETextboxNumeroBairro.setCellWidth(tbBairroEnderecoEvento, "50%");
		
		hpPainelLabelETextboxComplemento = new HorizontalPanel();
		hpPainelLabelETextboxComplemento.setStyleName("hpPainelLabelETexboxComplemento"); //painel complemento
		
		lbComplementoEnderecoEvento = new Label("Complemento:"); //label complemento
		lbComplementoEnderecoEvento.setStyleName("lbComplementoEnderecoEvento");
		
		tbComplementoEnderecoEvento = new TextBox();
		tbComplementoEnderecoEvento.setStyleName("tbComplementoEnderecoEvento"); // texbox complemento
		
		hpPainelLabelETextboxComplemento.add(lbComplementoEnderecoEvento); //adiciona label
		hpPainelLabelETextboxComplemento.setCellWidth(lbComplementoEnderecoEvento, "2%");
		hpPainelLabelETextboxComplemento.add(tbComplementoEnderecoEvento); //adiciona texbox
		hpPainelLabelETextboxComplemento.setCellWidth(tbComplementoEnderecoEvento, "40%");
		
		
		vpPainelEndereco.add(hpPainelLabelEndereco); //adiciona label titulo
		vpPainelEndereco.add(hpPainelLabelETextboxLocaldoevento); // adiciona painel local evento
		vpPainelEndereco.add(hpPainelLabelETextboxEndereco); //adiciona painel endereco
		vpPainelEndereco.add(hpPainelLabelETextboxCidadeEstado); //adiciona painel cidade e estado
		vpPainelEndereco.add(hpPainelLabelETextboxNumeroBairro); // adiciona painel numero e bairro
		vpPainelEndereco.add(hpPainelLabelETextboxComplemento); //adiciona painel complemento
		//---------------------------------------------------------------------
		
		vpPainelBotoes = new VerticalPanel();
		vpPainelBotoes.setStyleName("vpPainelBotoes");
		
		hpPainelButtonFecharVoltar = new HorizontalPanel();
		hpPainelButtonFecharVoltar.setStyleName("hpPainelButtonFecharVoltar");
		
		vpPainelBotoes.add(hpPainelButtonFecharVoltar);
		
		vpPainelSalvar = new VerticalPanel();
		vpPainelSalvar.setStyleName("vpPainelSalvar");
		
		lbsalvar = new Label("Salvar");
		lbsalvar.setStyleName(" lbsalvar");
		
		vpPainelSalvar.add(lbsalvar);
		
		btnCadastrar = new Button("Cadastrar");
		btnCadastrar.setStyleName("btnCadastrar");
		
		btnVoltar = new Button("Voltar");
		btnVoltar.setStyleName("btnVoltar");
		
		hpPainelButtonFecharVoltar.add(btnVoltar);
		hpPainelButtonFecharVoltar.setCellWidth(btnVoltar, "20%");
		hpPainelButtonFecharVoltar.add(btnCadastrar);
		hpPainelButtonFecharVoltar.setCellWidth(btnCadastrar, "3%");
		
		vpPainelBotoes.add(vpPainelSalvar);
		vpPainelBotoes.add(hpPainelButtonFecharVoltar);
		
		//---------------------------------------------------------------------
		
		vpPainelFormularioCadastrarEvento = new VerticalPanel();
		vpPainelFormularioCadastrarEvento.setStyleName("vpPainelFormularioCadastrarEvento");
		
		vpPainelFormularioCadastrarEvento.add(lbTituloFormulario);
		vpPainelFormularioCadastrarEvento.add(vpPainelInformacoes);
		vpPainelFormularioCadastrarEvento.add(vpPainelDataCertificado);
		vpPainelFormularioCadastrarEvento.add(vpPainelContatos);
		vpPainelFormularioCadastrarEvento.add(vpPainelEndereco);
		vpPainelFormularioCadastrarEvento.add(vpPainelBotoes);
	
		
		initWidget(vpPainelFormularioCadastrarEvento);
	}


	public VerticalPanel getVpPainelFormularioCadastrarEvento() {
		return vpPainelFormularioCadastrarEvento;
	}


	public void setVpPainelFormularioCadastrarEvento(
			VerticalPanel vpPainelFormularioCadastrarEvento) {
		this.vpPainelFormularioCadastrarEvento = vpPainelFormularioCadastrarEvento;
	}


	public VerticalPanel getVpPainelInformacoes() {
		return vpPainelInformacoes;
	}


	public void setVpPainelInformacoes(VerticalPanel vpPainelInformacoes) {
		this.vpPainelInformacoes = vpPainelInformacoes;
	}


	public VerticalPanel getVpPainelDataCertificado() {
		return vpPainelDataCertificado;
	}


	public void setVpPainelDataCertificado(VerticalPanel vpPainelDataCertificado) {
		this.vpPainelDataCertificado = vpPainelDataCertificado;
	}


	public VerticalPanel getVpPainelContatos() {
		return vpPainelContatos;
	}


	public void setVpPainelContatos(VerticalPanel vpPainelContatos) {
		this.vpPainelContatos = vpPainelContatos;
	}


	public VerticalPanel getVpPainelEndereco() {
		return vpPainelEndereco;
	}


	public void setVpPainelEndereco(VerticalPanel vpPainelEndereco) {
		this.vpPainelEndereco = vpPainelEndereco;
	}


	public VerticalPanel getVpPainelBotoes() {
		return vpPainelBotoes;
	}


	public void setVpPainelBotoes(VerticalPanel vpPainelBotoes) {
		this.vpPainelBotoes = vpPainelBotoes;
	}


	public VerticalPanel getVpPainelSalvar() {
		return vpPainelSalvar;
	}


	public void setVpPainelSalvar(VerticalPanel vpPainelSalvar) {
		this.vpPainelSalvar = vpPainelSalvar;
	}


	public HorizontalPanel getHpPainelLabelInformacoes() {
		return hpPainelLabelInformacoes;
	}


	public void setHpPainelLabelInformacoes(HorizontalPanel hpPainelLabelInformacoes) {
		this.hpPainelLabelInformacoes = hpPainelLabelInformacoes;
	}


	public HorizontalPanel getHpPainelLabelETexboxNome() {
		return hpPainelLabelETextboxNome;
	}


	public void setHpPainelLabelETexboxNome(HorizontalPanel hpPainelLabelETexboxNome) {
		this.hpPainelLabelETextboxNome = hpPainelLabelETexboxNome;
	}




	public HorizontalPanel getHpPainelLabelETextboxNome() {
		return hpPainelLabelETextboxNome;
	}


	public void setHpPainelLabelETextboxNome(
			HorizontalPanel hpPainelLabelETextboxNome) {
		this.hpPainelLabelETextboxNome = hpPainelLabelETextboxNome;
	}


	public HorizontalPanel getHpPainelLabelETextboxDescricao() {
		return hpPainelLabelETextboxDescricao;
	}


	public void setHpPainelLabelETextboxDescricao(
			HorizontalPanel hpPainelLabelETextboxDescricao) {
		this.hpPainelLabelETextboxDescricao = hpPainelLabelETextboxDescricao;
	}


	public HorizontalPanel getHpPainelLabelETextboxOrganizador() {
		return hpPainelLabelETextboxOrganizador;
	}


	public void setHpPainelLabelETextboxOrganizador(
			HorizontalPanel hpPainelLabelETextboxOrganizador) {
		this.hpPainelLabelETextboxOrganizador = hpPainelLabelETextboxOrganizador;
	}


	public HorizontalPanel getHpPainelLabelETextboxDataInicioEncerramento() {
		return hpPainelLabelETextboxDataInicioEncerramento;
	}


	public void setHpPainelLabelETextboxDataInicioEncerramento(
			HorizontalPanel hpPainelLabelETextboxDataInicioEncerramento) {
		this.hpPainelLabelETextboxDataInicioEncerramento = hpPainelLabelETextboxDataInicioEncerramento;
	}


	public HorizontalPanel getHpPainelLabelETextboxDataCertificados() {
		return hpPainelLabelETextboxDataCertificados;
	}


	public void setHpPainelLabelETextboxDataCertificados(
			HorizontalPanel hpPainelLabelETextboxDataCertificados) {
		this.hpPainelLabelETextboxDataCertificados = hpPainelLabelETextboxDataCertificados;
	}


	public HorizontalPanel getHpPainelLabelETextboxLocaldoevento() {
		return hpPainelLabelETextboxLocaldoevento;
	}


	public void setHpPainelLabelETextboxLocaldoevento(
			HorizontalPanel hpPainelLabelETextboxLocaldoevento) {
		this.hpPainelLabelETextboxLocaldoevento = hpPainelLabelETextboxLocaldoevento;
	}


	public HorizontalPanel getHpPainelLabelETextboxEndereco() {
		return hpPainelLabelETextboxEndereco;
	}


	public void setHpPainelLabelETextboxEndereco(
			HorizontalPanel hpPainelLabelETextboxEndereco) {
		this.hpPainelLabelETextboxEndereco = hpPainelLabelETextboxEndereco;
	}


	public HorizontalPanel getHpPainelLabelETextboxCidadeEstado() {
		return hpPainelLabelETextboxCidadeEstado;
	}


	public void setHpPainelLabelETextboxCidadeEstado(
			HorizontalPanel hpPainelLabelETextboxCidadeEstado) {
		this.hpPainelLabelETextboxCidadeEstado = hpPainelLabelETextboxCidadeEstado;
	}


	public HorizontalPanel getHpPainelLabelETextboxNumeroBairro() {
		return hpPainelLabelETextboxNumeroBairro;
	}


	public void setHpPainelLabelETextboxNumeroBairro(
			HorizontalPanel hpPainelLabelETextboxNumeroBairro) {
		this.hpPainelLabelETextboxNumeroBairro = hpPainelLabelETextboxNumeroBairro;
	}


	public HorizontalPanel getHpPainelLabelETextboxComplemento() {
		return hpPainelLabelETextboxComplemento;
	}


	public void setHpPainelLabelETextboxComplemento(
			HorizontalPanel hpPainelLabelETextboxComplemento) {
		this.hpPainelLabelETextboxComplemento = hpPainelLabelETextboxComplemento;
	}


	

	public Label getLbCepEvento() {
		return lbCepEvento;
	}


	public void setLbCepEvento(Label lbCepEvento) {
		this.lbCepEvento = lbCepEvento;
	}


	public TextBox getTbCepEvento() {
		return tbCepEvento;
	}


	public void setTbCepEvento(TextBox tbCepEvento) {
		this.tbCepEvento = tbCepEvento;
	}


	public TextBox getTbCepCoordenador() {
		return tbCepEvento;
	}


	public void setTbCepCoordenador(TextBox tbCepCoordenador) {
		this.tbCepEvento = tbCepCoordenador;
	}


	public ListBox getListUfEvento() {
		return listUfEvento;
	}


	public void setListUfEvento(ListBox listUfEvento) {
		this.listUfEvento = listUfEvento;
	}


	public HorizontalPanel getHpPainelLabelETexboxOrganizador() {
		return hpPainelLabelETextboxOrganizador;
	}


	public void setHpPainelLabelETexboxOrganizador(
			HorizontalPanel hpPainelLabelETexboxOrganizador) {
		this.hpPainelLabelETextboxOrganizador = hpPainelLabelETexboxOrganizador;
	}


	public HorizontalPanel getHpPainelLabelETexboxDataInicioEncerramento() {
		return hpPainelLabelETextboxDataInicioEncerramento;
	}


	public void setHpPainelLabelETexboxDataInicioEncerramento(
			HorizontalPanel hpPainelLabelETexboxDataInicioEncerramento) {
		this.hpPainelLabelETextboxDataInicioEncerramento = hpPainelLabelETexboxDataInicioEncerramento;
	}


	public HorizontalPanel getHpPainelLabelDataCertificados() {
		return hpPainelLabelDataCertificados;
	}


	public void setHpPainelLabelDataCertificados(
			HorizontalPanel hpPainelLabelDataCertificados) {
		this.hpPainelLabelDataCertificados = hpPainelLabelDataCertificados;
	}


	public HorizontalPanel getHpPainelLabelETexboxDataCertificados() {
		return hpPainelLabelETextboxDataCertificados;
	}


	public void setHpPainelLabelETexboxDataCertificados(
			HorizontalPanel hpPainelLabelETexboxDataCertificados) {
		this.hpPainelLabelETextboxDataCertificados = hpPainelLabelETexboxDataCertificados;
	}


	public HorizontalPanel getHpPainelLabelContatos() {
		return hpPainelLabelContatos;
	}


	public void setHpPainelLabelContatos(HorizontalPanel hpPainelLabelContatos) {
		this.hpPainelLabelContatos = hpPainelLabelContatos;
	}


	public HorizontalPanel getHpPainelLabelETexboxTelefone() {
		return hpPainelLabelETexboxTelefone;
	}


	public void setHpPainelLabelETexboxTelefone(
			HorizontalPanel hpPainelLabelETexboxTelefone) {
		this.hpPainelLabelETexboxTelefone = hpPainelLabelETexboxTelefone;
	}


	public HorizontalPanel getHpPainelLabelETexboxEmail() {
		return hpPainelLabelETexboxEmail;
	}


	public void setHpPainelLabelETexboxEmail(
			HorizontalPanel hpPainelLabelETexboxEmail) {
		this.hpPainelLabelETexboxEmail = hpPainelLabelETexboxEmail;
	}


	public HorizontalPanel getHpPainelLabelETexboxLocaldoevento() {
		return hpPainelLabelETextboxLocaldoevento;
	}


	public void setHpPainelLabelETexboxLocaldoevento(
			HorizontalPanel hpPainelLabelETexboxLocaldoevento) {
		this.hpPainelLabelETextboxLocaldoevento = hpPainelLabelETexboxLocaldoevento;
	}


	public HorizontalPanel getHpPainelLabelEndereco() {
		return hpPainelLabelEndereco;
	}


	public void setHpPainelLabelEndereco(HorizontalPanel hpPainelLabelEndereco) {
		this.hpPainelLabelEndereco = hpPainelLabelEndereco;
	}





	public HorizontalPanel getHpPainelLabelETexboxCidadeEstado() {
		return hpPainelLabelETextboxCidadeEstado;
	}


	public void setHpPainelLabelETexboxCidadeEstado(
			HorizontalPanel hpPainelLabelETexboxCidadeEstado) {
		this.hpPainelLabelETextboxCidadeEstado = hpPainelLabelETexboxCidadeEstado;
	}


	public HorizontalPanel getHpPainelLabelETexboxNumeroBairro() {
		return hpPainelLabelETextboxNumeroBairro;
	}


	public void setHpPainelLabelETexboxNumeroBairro(
			HorizontalPanel hpPainelLabelETexboxNumeroBairro) {
		this.hpPainelLabelETextboxNumeroBairro = hpPainelLabelETexboxNumeroBairro;
	}


	public HorizontalPanel getHpPainelLabelETexboxComplemento() {
		return hpPainelLabelETextboxComplemento;
	}


	public void setHpPainelLabelETexboxComplemento(
			HorizontalPanel hpPainelLabelETexboxComplemento) {
		this.hpPainelLabelETextboxComplemento = hpPainelLabelETexboxComplemento;
	}


	public HorizontalPanel getHpPainelButtonFecharVoltar() {
		return hpPainelButtonFecharVoltar;
	}


	public void setHpPainelButtonFecharVoltar(
			HorizontalPanel hpPainelButtonFecharVoltar) {
		this.hpPainelButtonFecharVoltar = hpPainelButtonFecharVoltar;
	}


	public HorizontalPanel getHpPainelNomeCoordenador() {
		return hpPainelNomeCoordenador;
	}


	public void setHpPainelNomeCoordenador(HorizontalPanel hpPainelNomeCoordenador) {
		this.hpPainelNomeCoordenador = hpPainelNomeCoordenador;
	}


	public Label getLbTituloFormulario() {
		return lbTituloFormulario;
	}


	public void setLbTituloFormulario(Label lbTituloFormulario) {
		this.lbTituloFormulario = lbTituloFormulario;
	}


	public Label getLbInformacoesEvento() {
		return lbInformacoesEvento;
	}


	public void setLbInformacoesEvento(Label lbInformacoesEvento) {
		this.lbInformacoesEvento = lbInformacoesEvento;
	}


	public Label getLbNomeEvento() {
		return lbNomeEvento;
	}


	public void setLbNomeEvento(Label lbNomeEvento) {
		this.lbNomeEvento = lbNomeEvento;
	}


	public Label getLbDescricaoEvento() {
		return lbDescricaoEvento;
	}


	public void setLbDescricaoEvento(Label lbDescricaoEvento) {
		this.lbDescricaoEvento = lbDescricaoEvento;
	}


	public Label getLbOrganizador() {
		return lbOrganizador;
	}


	public void setLbOrganizador(Label lbOrganizador) {
		this.lbOrganizador = lbOrganizador;
	}


	public Label getLbDataInicio() {
		return lbDataInicio;
	}


	public void setLbDataInicio(Label lbDataInicio) {
		this.lbDataInicio = lbDataInicio;
	}


	public Label getLbDataEncerra() {
		return lbDataEncerra;
	}


	public void setLbDataEncerra(Label lbDataEncerra) {
		this.lbDataEncerra = lbDataEncerra;
	}


	public Label getLbDataDispoCertificado() {
		return lbDataDispoCertificado;
	}


	public void setLbDataDispoCertificado(Label lbDataDispoCertificado) {
		this.lbDataDispoCertificado = lbDataDispoCertificado;
	}


	public Label getLbDataCertificado() {
		return lbDataCertificado;
	}


	public void setLbDataCertificado(Label lbDataCertificado) {
		this.lbDataCertificado = lbDataCertificado;
	}


	public Label getLbContatosEvento() {
		return lbContatosEvento;
	}


	public void setLbContatosEvento(Label lbContatosEvento) {
		this.lbContatosEvento = lbContatosEvento;
	}


	public Label getLbTelefoneEvento() {
		return lbTelefoneEvento;
	}


	public void setLbTelefoneEvento(Label lbTelefoneEvento) {
		this.lbTelefoneEvento = lbTelefoneEvento;
	}


	public Label getLbEmailEvento() {
		return lbEmailEvento;
	}


	public void setLbEmailEvento(Label lbEmailEvento) {
		this.lbEmailEvento = lbEmailEvento;
	}


	public Label getLbLocaldoEvento() {
		return lbLocaldoEvento;
	}


	public void setLbLocaldoEvento(Label lbLocaldoEvento) {
		this.lbLocaldoEvento = lbLocaldoEvento;
	}


	public Label getLbEnderecoEventotitulo() {
		return lbEnderecoEventotitulo;
	}


	public void setLbEnderecoEventotitulo(Label lbEnderecoEventotitulo) {
		this.lbEnderecoEventotitulo = lbEnderecoEventotitulo;
	}


	public Label getLbEnderecoEvento() {
		return lbEnderecoEvento;
	}


	public void setLbEnderecoEvento(Label lbEnderecoEvento) {
		this.lbEnderecoEvento = lbEnderecoEvento;
	}


	public Label getLbNumeroEnderecoEvento() {
		return lbNumeroEnderecoEvento;
	}


	public void setLbNumeroEnderecoEvento(Label lbNumeroEnderecoEvento) {
		this.lbNumeroEnderecoEvento = lbNumeroEnderecoEvento;
	}


	public Label getLbBairroEnderecoEvento() {
		return lbBairroEnderecoEvento;
	}


	public void setLbBairroEnderecoEvento(Label lbBairroEnderecoEvento) {
		this.lbBairroEnderecoEvento = lbBairroEnderecoEvento;
	}


	public Label getLbComplementoEnderecoEvento() {
		return lbComplementoEnderecoEvento;
	}


	public void setLbComplementoEnderecoEvento(Label lbComplementoEnderecoEvento) {
		this.lbComplementoEnderecoEvento = lbComplementoEnderecoEvento;
	}


	public Label getLbCidadeEnderecoEvento() {
		return lbCidadeEnderecoEvento;
	}


	public void setLbCidadeEnderecoEvento(Label lbCidadeEnderecoEvento) {
		this.lbCidadeEnderecoEvento = lbCidadeEnderecoEvento;
	}


	public Label getLbEstadoEnderecoEvento() {
		return lbEstadoEnderecoEvento;
	}


	public void setLbEstadoEnderecoEvento(Label lbEstadoEnderecoEvento) {
		this.lbEstadoEnderecoEvento = lbEstadoEnderecoEvento;
	}


	public Label getLbsalvar() {
		return lbsalvar;
	}


	public void setLbsalvar(Label lbsalvar) {
		this.lbsalvar = lbsalvar;
	}


	public Label getLbNomeCoordenador() {
		return lbNomeCoordenador;
	}


	public void setLbNomeCoordenador(Label lbNomeCoordenador) {
		this.lbNomeCoordenador = lbNomeCoordenador;
	}


	public TextBox getTbNomeEvento() {
		return tbNomeEvento;
	}


	public void setTbNomeEvento(TextBox tbNomeEvento) {
		this.tbNomeEvento = tbNomeEvento;
	}


	public TextBox getTbOrganizador() {
		return tbOrganizador;
	}


	public void setTbOrganizador(TextBox tbOrganizador) {
		this.tbOrganizador = tbOrganizador;
	}


	public TextBox getTbDataInicio() {
		return tbDataInicio;
	}


	public void setTbDataInicio(TextBox tbDataInicio) {
		this.tbDataInicio = tbDataInicio;
	}


	public TextBox getTbDataEncerra() {
		return tbDataEncerra;
	}


	public void setTbDataEncerra(TextBox tbDataEncerra) {
		this.tbDataEncerra = tbDataEncerra;
	}


	public TextBox getTbDataCertificado() {
		return tbDataCertificado;
	}


	public void setTbDataCertificado(TextBox tbDataCertificado) {
		this.tbDataCertificado = tbDataCertificado;
	}


	public TextBox getTbTelefoneEvento() {
		return tbTelefoneEvento;
	}


	public void setTbTelefoneEvento(TextBox tbTelefoneEvento) {
		this.tbTelefoneEvento = tbTelefoneEvento;
	}


	public TextBox getTbEmailEvento() {
		return tbEmailEvento;
	}


	public void setTbEmailEvento(TextBox tbEmailEvento) {
		this.tbEmailEvento = tbEmailEvento;
	}


	public TextBox getTbEnderecoEvento() {
		return tbEnderecoEvento;
	}


	public void setTbEnderecoEvento(TextBox tbEnderecoEvento) {
		this.tbEnderecoEvento = tbEnderecoEvento;
	}


	public TextBox getTbNumeroEnderecoEvento() {
		return tbNumeroEnderecoEvento;
	}


	public void setTbNumeroEnderecoEvento(TextBox tbNumeroEnderecoEvento) {
		this.tbNumeroEnderecoEvento = tbNumeroEnderecoEvento;
	}


	public TextBox getTbBairroEnderecoEvento() {
		return tbBairroEnderecoEvento;
	}


	public void setTbBairroEnderecoEvento(TextBox tbBairroEnderecoEvento) {
		this.tbBairroEnderecoEvento = tbBairroEnderecoEvento;
	}


	public TextBox getTbCidadeEnderecoEvento() {
		return tbCidadeEnderecoEvento;
	}


	public void setTbCidadeEnderecoEvento(TextBox tbCidadeEnderecoEvento) {
		this.tbCidadeEnderecoEvento = tbCidadeEnderecoEvento;
	}


	


	public TextBox getTbComplementoEnderecoEvento() {
		return tbComplementoEnderecoEvento;
	}


	public void setTbComplementoEnderecoEvento(TextBox tbComplementoEnderecoEvento) {
		this.tbComplementoEnderecoEvento = tbComplementoEnderecoEvento;
	}


	public TextBox getTbLocaldoEvento() {
		return tbLocaldoEvento;
	}


	public void setTbLocaldoEvento(TextBox tbLocaldoEvento) {
		this.tbLocaldoEvento = tbLocaldoEvento;
	}


	public Button getBtnCadastrar() {
		return btnCadastrar;
	}


	public void setBtnCadastrar(Button btnCadastrar) {
		this.btnCadastrar = btnCadastrar;
	}


	public Button getBtnVoltar() {
		return btnVoltar;
	}


	public void setBtnVoltar(Button btnVoltar) {
		this.btnVoltar = btnVoltar;
	}


	public Button getBtnCadastrarCoordenador() {
		return btnCadastrarCoordenador;
	}


	public void setBtnCadastrarCoordenador(Button btnCadastrarCoordenador) {
		this.btnCadastrarCoordenador = btnCadastrarCoordenador;
	}


	public ListBox getListboxNomeCoordenador() {
		return listboxNomeCoordenador;
	}


	public void setListboxNomeCoordenador(ListBox listboxNomeCoordenador) {
		this.listboxNomeCoordenador = listboxNomeCoordenador;
	}


	
}
	