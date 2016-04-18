package edu.ifg.formosa.gerente.client.view;


import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class GerenteCadastrarParticipanteView extends Composite {
	
	private HorizontalPanel hpPainelLabelCadastrarParticipante;
	private HorizontalPanel hpPainelLabelInformacoesPessoaisParticipante;
	private HorizontalPanel hpPainelLabeleTextboxNomeParticipante;
	private HorizontalPanel hpPainelLabeleTextboxRGCpf;
	private HorizontalPanel hpPainelLabelContatosParticipante;
	private HorizontalPanel hpPainelLabeleTextboxEmailTelefone;
	private HorizontalPanel hpPainelLabelEnderecoParticipante;
	private HorizontalPanel hpPainelLabeleTextboxEnderecoParticipante;
	private HorizontalPanel hpPainelLabeleTextboxNumeroBairroParticipante;
	private HorizontalPanel hpPainelLabeleTextboxCepCidadeuf;
	private HorizontalPanel hpPainelLabelSalvarParticipante;
	private HorizontalPanel hpPainelBotaoSalvarVoltarParticipante;
	private VerticalPanel vpPainelInformacoesParticipantes;
	private VerticalPanel vpPainelContatosParticipantes;
	private VerticalPanel vpPainelEnderecoParticipantes;
	private VerticalPanel vpPainelSalvarParticipantes;
	private VerticalPanel vpPainelFormularioCadastroParticipante;
	private Label lbCadastrarParticipante;
	private Label lbInformacoesPessoaisParticipante;
	private Label lbNomeParticipante;
	private Label lbRgParticipante;
	private Label lbCpfParticipante;
	private Label lbContatosParticipante;
	private Label lbEmailParticipante;
	private Label lbTelefoneParticipante;
	private Label lbEnderecoParticipante;
	private Label lbEndereco2Participante;
	private Label lbNumeroParticipante;
	private Label lbBairroParticipante;
	private Label lbCepParticipante;
	private Label lbCidadeParticipante;
	private Label lbUfParticipante;
	private Label lbSalvarParticipante;
	private TextBox tbNomeParticipante;
	private TextBox tbRgParticipante;
	private TextBox tbCpfParticipante;
	private TextBox tbEmailParticipante;
	private TextBox tbTelefoneParticipante;
	private TextBox tbEnderecoParticipante;
	private TextBox tbNumeroParticipante;
	private TextBox tbBairroParticipante;
	private TextBox tbCepParticipante;
	private TextBox tbCidadeParticipante;
	private ListBox listUfParticipante;
	private Button btnBotaoSalvarParticipante;
	private Button btnBotaoVoltarParticipante;
	
	
	
	public GerenteCadastrarParticipanteView(){
		
		//Painel Titulo Pagina---------------------------
		
		hpPainelLabelCadastrarParticipante = new HorizontalPanel();
		hpPainelLabelCadastrarParticipante.setStyleName("hpPainelLabelCadastrarParticipante");
		
		lbCadastrarParticipante = new Label("Cadastro de Participantes");
		lbCadastrarParticipante.setStyleName("lbCadastrarParticipantes");
		
		hpPainelLabelCadastrarParticipante.add(lbCadastrarParticipante); //add itens
		
		//Painel Informações Pessoais--------------------
		hpPainelLabelInformacoesPessoaisParticipante = new HorizontalPanel();
		hpPainelLabelInformacoesPessoaisParticipante.setStyleName("hpPainelLabelInformacoesPessoaisParticipante");
		
		lbInformacoesPessoaisParticipante = new Label("Informações Pessoais");
		lbInformacoesPessoaisParticipante.setStyleName("lbInformacoesPessoaisParticipante");
		
		hpPainelLabelInformacoesPessoaisParticipante.add(lbInformacoesPessoaisParticipante); //add itens
		
		hpPainelLabeleTextboxNomeParticipante = new HorizontalPanel();
		hpPainelLabeleTextboxNomeParticipante.setStyleName("hpPainelLabeleTextboxNomeParticipante");
		
		lbNomeParticipante = new Label("Nome:");
		lbNomeParticipante.setStyleName("lbNomeParticipante");
		
		tbNomeParticipante = new TextBox();
		tbNomeParticipante.setStyleName("tbNomeParticipante");
		
		hpPainelLabeleTextboxNomeParticipante.add(lbNomeParticipante); //adiciona itens
		hpPainelLabeleTextboxNomeParticipante.setCellWidth(lbNomeParticipante, "2%");
		hpPainelLabeleTextboxNomeParticipante.add(tbNomeParticipante); //adiciona itens
		hpPainelLabeleTextboxNomeParticipante.setCellWidth(tbNomeParticipante, "80%");
		
		hpPainelLabeleTextboxRGCpf = new HorizontalPanel();
		hpPainelLabeleTextboxRGCpf.setStyleName("hpPainelLabeleTextboxRGCpf");
		
		lbRgParticipante = new Label("RG:");
		lbRgParticipante.setStyleName("lbRgParticipante");
		
		tbRgParticipante = new TextBox();
		tbRgParticipante.setStyleName("tbRgParticipante");
		
		lbCpfParticipante = new Label("CPF:");
		lbCpfParticipante.setStyleName("lbCpfParticipante");
		
		tbCpfParticipante = new TextBox();
		tbCpfParticipante.setStyleName("tbCpfParticipante");
		
		hpPainelLabeleTextboxRGCpf.add(lbRgParticipante); //add itens
		hpPainelLabeleTextboxRGCpf.setCellWidth(lbRgParticipante, "2%");
		hpPainelLabeleTextboxRGCpf.add(tbRgParticipante); //add itens
		hpPainelLabeleTextboxRGCpf.setCellWidth(tbRgParticipante, "30%");
		hpPainelLabeleTextboxRGCpf.add(lbCpfParticipante); //add itens
		hpPainelLabeleTextboxRGCpf.setCellWidth(lbCpfParticipante, "1%");
		hpPainelLabeleTextboxRGCpf.add(tbCpfParticipante); //add itens
		hpPainelLabeleTextboxRGCpf.setCellWidth(tbCpfParticipante, "60%");
		
		vpPainelInformacoesParticipantes = new VerticalPanel();
		vpPainelInformacoesParticipantes.setStyleName("vpPainelInformacoesParticipantes");
		
		vpPainelInformacoesParticipantes.add(hpPainelLabelInformacoesPessoaisParticipante); //add itens
		vpPainelInformacoesParticipantes.add(hpPainelLabeleTextboxNomeParticipante); //add itens
		vpPainelInformacoesParticipantes.add(hpPainelLabeleTextboxRGCpf); //add itens
		
		//Painel Contatos------------------------------
		hpPainelLabelContatosParticipante = new HorizontalPanel();
		hpPainelLabelContatosParticipante.setStyleName("hpPainelLabelContatosParticipante");
		
		lbContatosParticipante  = new Label("Contatos");
		lbContatosParticipante.setStyleName("lbContatosParticipante");
		
		hpPainelLabelContatosParticipante.add(lbContatosParticipante); //add itens
		
		hpPainelLabeleTextboxEmailTelefone = new HorizontalPanel();
		hpPainelLabeleTextboxEmailTelefone.setStyleName("hpPainelLabeleTextboxEmailTelefone");
		
		lbEmailParticipante = new Label("Email:");
		lbEmailParticipante.setStyleName("lbEmailParticipante");
		
		tbEmailParticipante = new TextBox();
		tbEmailParticipante.setStyleName("tbEmailParticipante");
		
		lbTelefoneParticipante = new Label("Telefone:");
		lbTelefoneParticipante.setStyleName("lbTelefoneParticipante");
		
		tbTelefoneParticipante = new TextBox();
		tbTelefoneParticipante.setStyleName("tbTelefoneParticipante");
		
		hpPainelLabeleTextboxEmailTelefone.add(lbEmailParticipante); //add itens
		hpPainelLabeleTextboxEmailTelefone.setCellWidth(lbEmailParticipante, "1%");
		hpPainelLabeleTextboxEmailTelefone.add(tbEmailParticipante); //add itens
		hpPainelLabeleTextboxEmailTelefone.setCellWidth(tbEmailParticipante, "30%");
		hpPainelLabeleTextboxEmailTelefone.add(lbTelefoneParticipante); //add itens
		hpPainelLabeleTextboxEmailTelefone.setCellWidth(lbTelefoneParticipante, "1%");
		hpPainelLabeleTextboxEmailTelefone.add(tbTelefoneParticipante); //add itens
		hpPainelLabeleTextboxEmailTelefone.setCellWidth(tbTelefoneParticipante, "60%");
		
		vpPainelContatosParticipantes = new VerticalPanel();
		vpPainelContatosParticipantes.setStyleName("vpPainelContatosParticipantes");
		
		vpPainelContatosParticipantes.add(hpPainelLabelContatosParticipante); //add itens
		vpPainelContatosParticipantes.add(hpPainelLabeleTextboxEmailTelefone); //add itens
		
		//Painel Endereço-------------------------------
		
		hpPainelLabelEnderecoParticipante = new HorizontalPanel();
		hpPainelLabelEnderecoParticipante.setStyleName("hpPainelLabelEnderecoParticipante");
		
		lbEnderecoParticipante = new Label("Endereço");
		lbEnderecoParticipante.setStyleName("lbEnderecoParticipante");
		
		hpPainelLabelEnderecoParticipante.add(lbEnderecoParticipante); //add itens
		
		hpPainelLabeleTextboxEnderecoParticipante = new HorizontalPanel();
		hpPainelLabeleTextboxEnderecoParticipante.setStyleName("hpPainelLabeleTextboxEnderecoParticipante");
		
		lbEndereco2Participante = new Label("Endereço:");
		lbEndereco2Participante.setStyleName("lbEndereco2Participante");
		
		tbEnderecoParticipante = new TextBox();
		tbEnderecoParticipante.setStyleName("tbEnderecoParticipante");
		
		hpPainelLabeleTextboxEnderecoParticipante.add(lbEndereco2Participante); //add itens
		hpPainelLabeleTextboxEnderecoParticipante.setCellWidth(lbEndereco2Participante, "1%");
		hpPainelLabeleTextboxEnderecoParticipante.add(tbEnderecoParticipante); //add itens
		hpPainelLabeleTextboxEnderecoParticipante.setCellWidth(tbEnderecoParticipante, "85%");
		
		hpPainelLabeleTextboxNumeroBairroParticipante = new HorizontalPanel();
		hpPainelLabeleTextboxNumeroBairroParticipante.setStyleName("hpPainelLabeleTextboxNumeroBairroParticipante");
		
		lbNumeroParticipante = new Label("Nº:");
		lbNumeroParticipante.setStyleName("lbNumeroParticipante");
		
		tbNumeroParticipante = new TextBox();
		tbNumeroParticipante.setStyleName("tbNumeroParticipante");
		
		lbBairroParticipante = new Label("Bairro:");
		lbBairroParticipante.setStyleName("lbBairroParticipante");
		
		tbBairroParticipante = new TextBox();
		tbBairroParticipante.setStyleName("tbBairroParticipante");
		
		hpPainelLabeleTextboxNumeroBairroParticipante.add(lbNumeroParticipante); //add itens
		hpPainelLabeleTextboxNumeroBairroParticipante.setCellWidth(lbNumeroParticipante, "1%");
		hpPainelLabeleTextboxNumeroBairroParticipante.add(tbNumeroParticipante); //add itens
		hpPainelLabeleTextboxNumeroBairroParticipante.setCellWidth(tbNumeroParticipante, "20%");
		hpPainelLabeleTextboxNumeroBairroParticipante.add(lbBairroParticipante); //add itens
		hpPainelLabeleTextboxNumeroBairroParticipante.setCellWidth(lbBairroParticipante, "1%");
		hpPainelLabeleTextboxNumeroBairroParticipante.add(tbBairroParticipante); //add itens
		hpPainelLabeleTextboxNumeroBairroParticipante.setCellWidth(tbBairroParticipante, "60%");
		
		hpPainelLabeleTextboxCepCidadeuf = new HorizontalPanel();
		hpPainelLabeleTextboxCepCidadeuf.setStyleName("hpPainelLabeleTextboxCepCidadeuf");
		
		lbCepParticipante = new Label("CEP:");
		lbCepParticipante.setStyleName("lbCepParticipante");
		
		tbCepParticipante = new TextBox();
		tbCepParticipante.setStyleName("tbCepParticipante");
		
		lbCidadeParticipante = new Label("Cidade:");
		lbCidadeParticipante.setStyleName("lbCidadeParticipante");
		
		tbCidadeParticipante = new TextBox();
		tbCidadeParticipante.setStyleName("tbCidadeParticipante");
		
		lbUfParticipante = new Label("UF:");
		lbUfParticipante.setStyleName("lbUfParticipante");
		
		listUfParticipante = new ListBox();
		listUfParticipante.setStyleName("listUfParticipante");
		
		hpPainelLabeleTextboxCepCidadeuf.add(lbCepParticipante); //add itens
		hpPainelLabeleTextboxCepCidadeuf.setCellWidth(lbCepParticipante, "1%");
		hpPainelLabeleTextboxCepCidadeuf.add(tbCepParticipante); //add itens
		hpPainelLabeleTextboxCepCidadeuf.setCellWidth(tbCepParticipante, "10%");
		hpPainelLabeleTextboxCepCidadeuf.add(lbCidadeParticipante); //add itens
		hpPainelLabeleTextboxCepCidadeuf.setCellWidth(lbCidadeParticipante, "1%");
		hpPainelLabeleTextboxCepCidadeuf.add(tbCidadeParticipante); //add itens
		hpPainelLabeleTextboxCepCidadeuf.setCellWidth(tbCidadeParticipante, "20%");
		hpPainelLabeleTextboxCepCidadeuf.add(lbUfParticipante); //add itens
		hpPainelLabeleTextboxCepCidadeuf.setCellWidth(lbUfParticipante, "1%");
		hpPainelLabeleTextboxCepCidadeuf.add(listUfParticipante); //add itens
		hpPainelLabeleTextboxCepCidadeuf.setCellWidth(listUfParticipante, "20%");
		
		vpPainelEnderecoParticipantes = new VerticalPanel();
		vpPainelEnderecoParticipantes.setStyleName("vpPainelEnderecoParticipantes");
		
		vpPainelEnderecoParticipantes.add(hpPainelLabelEnderecoParticipante); //add itens
		vpPainelEnderecoParticipantes.add(hpPainelLabeleTextboxEnderecoParticipante); //add itens
		vpPainelEnderecoParticipantes.add(hpPainelLabeleTextboxNumeroBairroParticipante); //add itens
		vpPainelEnderecoParticipantes.add(hpPainelLabeleTextboxCepCidadeuf); //add itens
		
		
		//Painel Salvar---------------------------------
		hpPainelLabelSalvarParticipante = new HorizontalPanel();
		hpPainelLabelSalvarParticipante.setStyleName("hpPainelLabelSalvarParticipante");
		
		lbSalvarParticipante = new Label("Salvar");
		lbSalvarParticipante.setStyleName("lbSalvarParticipante");
		
		hpPainelLabelSalvarParticipante.add(lbSalvarParticipante); //add itens
		
		hpPainelBotaoSalvarVoltarParticipante = new HorizontalPanel();
		hpPainelBotaoSalvarVoltarParticipante.setStyleName("hpPainelBotaoSalvarVoltarParticpante");
		
		btnBotaoVoltarParticipante = new Button("Voltar");
		btnBotaoVoltarParticipante.setStyleName("btnBotaoVoltarParticipante");
		
		btnBotaoSalvarParticipante = new Button("Salvar");
		btnBotaoSalvarParticipante.setStyleName("btnBotaoSalvarParticipante");
		
		hpPainelBotaoSalvarVoltarParticipante.add(btnBotaoVoltarParticipante); //add itens
		hpPainelBotaoSalvarVoltarParticipante.add(btnBotaoSalvarParticipante); //add itens
		
		vpPainelSalvarParticipantes = new VerticalPanel();
		vpPainelSalvarParticipantes.setStyleName("vpPainelSalvarParticipantes");
		
		vpPainelSalvarParticipantes.add(hpPainelLabelSalvarParticipante); //add itens
		vpPainelSalvarParticipantes.add(hpPainelBotaoSalvarVoltarParticipante); //add itens
		
		//Painel Pai----------------------------------------
		vpPainelFormularioCadastroParticipante = new VerticalPanel();
		vpPainelFormularioCadastroParticipante.setStyleName("vpPainelFormularioCadastroParticipante");
		
		vpPainelFormularioCadastroParticipante.add(hpPainelLabelCadastrarParticipante);
		vpPainelFormularioCadastroParticipante.add(vpPainelInformacoesParticipantes);
		vpPainelFormularioCadastroParticipante.add(vpPainelContatosParticipantes);
		vpPainelFormularioCadastroParticipante.add(vpPainelEnderecoParticipantes);
		vpPainelFormularioCadastroParticipante.add(vpPainelSalvarParticipantes);
		
		initWidget(vpPainelFormularioCadastroParticipante);
	}



	public HorizontalPanel getHpPainelLabelCadastrarParticipante() {
		return hpPainelLabelCadastrarParticipante;
	}



	public void setHpPainelLabelCadastrarParticipante(
			HorizontalPanel hpPainelLabelCadastrarParticipante) {
		this.hpPainelLabelCadastrarParticipante = hpPainelLabelCadastrarParticipante;
	}



	public HorizontalPanel getHpPainelLabelInformacoesPessoaisParticipante() {
		return hpPainelLabelInformacoesPessoaisParticipante;
	}



	public void setHpPainelLabelInformacoesPessoaisParticipante(
			HorizontalPanel hpPainelLabelInformacoesPessoaisParticipante) {
		this.hpPainelLabelInformacoesPessoaisParticipante = hpPainelLabelInformacoesPessoaisParticipante;
	}



	public HorizontalPanel getHpPainelLabeleTextboxNomeParticipante() {
		return hpPainelLabeleTextboxNomeParticipante;
	}



	public void setHpPainelLabeleTextboxNomeParticipante(
			HorizontalPanel hpPainelLabeleTextboxNomeParticipante) {
		this.hpPainelLabeleTextboxNomeParticipante = hpPainelLabeleTextboxNomeParticipante;
	}



	public HorizontalPanel getHpPainelLabeleTextboxRGCpf() {
		return hpPainelLabeleTextboxRGCpf;
	}



	public void setHpPainelLabeleTextboxRGCpf(
			HorizontalPanel hpPainelLabeleTextboxRGCpf) {
		this.hpPainelLabeleTextboxRGCpf = hpPainelLabeleTextboxRGCpf;
	}



	public HorizontalPanel getHpPainelLabelContatosParticipante() {
		return hpPainelLabelContatosParticipante;
	}



	public void setHpPainelLabelContatosParticipante(
			HorizontalPanel hpPainelLabelContatosParticipante) {
		this.hpPainelLabelContatosParticipante = hpPainelLabelContatosParticipante;
	}



	public HorizontalPanel getHpPainelLabeleTextboxEmailTelefone() {
		return hpPainelLabeleTextboxEmailTelefone;
	}



	public void setHpPainelLabeleTextboxEmailTelefone(
			HorizontalPanel hpPainelLabeleTextboxEmailTelefone) {
		this.hpPainelLabeleTextboxEmailTelefone = hpPainelLabeleTextboxEmailTelefone;
	}



	public HorizontalPanel getHpPainelLabelEnderecoParticipante() {
		return hpPainelLabelEnderecoParticipante;
	}



	public void setHpPainelLabelEnderecoParticipante(
			HorizontalPanel hpPainelLabelEnderecoParticipante) {
		this.hpPainelLabelEnderecoParticipante = hpPainelLabelEnderecoParticipante;
	}



	public HorizontalPanel getHpPainelLabeleTextboxEnderecoParticipante() {
		return hpPainelLabeleTextboxEnderecoParticipante;
	}



	public void setHpPainelLabeleTextboxEnderecoParticipante(
			HorizontalPanel hpPainelLabeleTextboxEnderecoParticipante) {
		this.hpPainelLabeleTextboxEnderecoParticipante = hpPainelLabeleTextboxEnderecoParticipante;
	}



	public HorizontalPanel getHpPainelLabeleTextboxNumeroBairroParticipante() {
		return hpPainelLabeleTextboxNumeroBairroParticipante;
	}



	public void setHpPainelLabeleTextboxNumeroBairroParticipante(
			HorizontalPanel hpPainelLabeleTextboxNumeroBairroParticipante) {
		this.hpPainelLabeleTextboxNumeroBairroParticipante = hpPainelLabeleTextboxNumeroBairroParticipante;
	}



	public HorizontalPanel getHpPainelLabeleTextboxCepCidadeuf() {
		return hpPainelLabeleTextboxCepCidadeuf;
	}



	public void setHpPainelLabeleTextboxCepCidadeuf(
			HorizontalPanel hpPainelLabeleTextboxCepCidadeuf) {
		this.hpPainelLabeleTextboxCepCidadeuf = hpPainelLabeleTextboxCepCidadeuf;
	}



	public HorizontalPanel getHpPainelLabelSalvarParticipante() {
		return hpPainelLabelSalvarParticipante;
	}



	public void setHpPainelLabelSalvarParticipante(
			HorizontalPanel hpPainelLabelSalvarParticipante) {
		this.hpPainelLabelSalvarParticipante = hpPainelLabelSalvarParticipante;
	}



	public HorizontalPanel getHpPainelBotaoSalvarVoltarParticipante() {
		return hpPainelBotaoSalvarVoltarParticipante;
	}



	public void setHpPainelBotaoSalvarVoltarParticipante(
			HorizontalPanel hpPainelBotaoSalvarVoltarParticipante) {
		this.hpPainelBotaoSalvarVoltarParticipante = hpPainelBotaoSalvarVoltarParticipante;
	}



	public VerticalPanel getVpPainelInformacoesParticipantes() {
		return vpPainelInformacoesParticipantes;
	}



	public void setVpPainelInformacoesParticipantes(
			VerticalPanel vpPainelInformacoesParticipantes) {
		this.vpPainelInformacoesParticipantes = vpPainelInformacoesParticipantes;
	}



	public VerticalPanel getVpPainelContatosParticipantes() {
		return vpPainelContatosParticipantes;
	}



	public void setVpPainelContatosParticipantes(
			VerticalPanel vpPainelContatosParticipantes) {
		this.vpPainelContatosParticipantes = vpPainelContatosParticipantes;
	}



	public VerticalPanel getVpPainelEnderecoParticipantes() {
		return vpPainelEnderecoParticipantes;
	}



	public void setVpPainelEnderecoParticipantes(
			VerticalPanel vpPainelEnderecoParticipantes) {
		this.vpPainelEnderecoParticipantes = vpPainelEnderecoParticipantes;
	}



	public VerticalPanel getVpPainelSalvarParticipantes() {
		return vpPainelSalvarParticipantes;
	}



	public void setVpPainelSalvarParticipantes(
			VerticalPanel vpPainelSalvarParticipantes) {
		this.vpPainelSalvarParticipantes = vpPainelSalvarParticipantes;
	}



	public VerticalPanel getVpPainelFormularioCadastroParticipante() {
		return vpPainelFormularioCadastroParticipante;
	}



	public void setVpPainelFormularioCadastroParticipante(
			VerticalPanel vpPainelFormularioCadastroParticipante) {
		this.vpPainelFormularioCadastroParticipante = vpPainelFormularioCadastroParticipante;
	}



	public Label getLbCadastrarParticipante() {
		return lbCadastrarParticipante;
	}



	public void setLbCadastrarParticipante(Label lbCadastrarParticipante) {
		this.lbCadastrarParticipante = lbCadastrarParticipante;
	}



	public Label getLbInformacoesPessoaisParticipante() {
		return lbInformacoesPessoaisParticipante;
	}



	public void setLbInformacoesPessoaisParticipante(
			Label lbInformacoesPessoaisParticipante) {
		this.lbInformacoesPessoaisParticipante = lbInformacoesPessoaisParticipante;
	}



	public Label getLbNomeParticipante() {
		return lbNomeParticipante;
	}



	public void setLbNomeParticipante(Label lbNomeParticipante) {
		this.lbNomeParticipante = lbNomeParticipante;
	}



	public Label getLbRgParticipante() {
		return lbRgParticipante;
	}



	public void setLbRgParticipante(Label lbRgParticipante) {
		this.lbRgParticipante = lbRgParticipante;
	}



	public Label getLbCpfParticipante() {
		return lbCpfParticipante;
	}



	public void setLbCpfParticipante(Label lbCpfParticipante) {
		this.lbCpfParticipante = lbCpfParticipante;
	}



	public Label getLbContatosParticipante() {
		return lbContatosParticipante;
	}



	public void setLbContatosParticipante(Label lbContatosParticipante) {
		this.lbContatosParticipante = lbContatosParticipante;
	}



	public Label getLbEmailParticipante() {
		return lbEmailParticipante;
	}



	public void setLbEmailParticipante(Label lbEmailParticipante) {
		this.lbEmailParticipante = lbEmailParticipante;
	}



	

	public Label getLbTelefoneParticipante() {
		return lbTelefoneParticipante;
	}



	public void setLbTelefoneParticipante(Label lbTelefoneParticipante) {
		this.lbTelefoneParticipante = lbTelefoneParticipante;
	}



	public Label getLbEnderecoParticipante() {
		return lbEnderecoParticipante;
	}



	public void setLbEnderecoParticipante(Label lbEnderecoParticipante) {
		this.lbEnderecoParticipante = lbEnderecoParticipante;
	}



	public Label getLbEndereco2Participante() {
		return lbEndereco2Participante;
	}



	public void setLbEndereco2Participante(Label lbEndereco2Participante) {
		this.lbEndereco2Participante = lbEndereco2Participante;
	}



	public Label getLbNumeroParticipante() {
		return lbNumeroParticipante;
	}



	public void setLbNumeroParticipante(Label lbNumeroParticipante) {
		this.lbNumeroParticipante = lbNumeroParticipante;
	}



	public Label getLbBairroParticipante() {
		return lbBairroParticipante;
	}



	public void setLbBairroParticipante(Label lbBairroParticipante) {
		this.lbBairroParticipante = lbBairroParticipante;
	}



	public Label getLbCepParticipante() {
		return lbCepParticipante;
	}



	public void setLbCepParticipante(Label lbCepParticipante) {
		this.lbCepParticipante = lbCepParticipante;
	}



	public Label getLbCidadeParticipante() {
		return lbCidadeParticipante;
	}



	public void setLbCidadeParticipante(Label lbCidadeParticipante) {
		this.lbCidadeParticipante = lbCidadeParticipante;
	}



	public Label getLbUfParticipante() {
		return lbUfParticipante;
	}



	public void setLbUfParticipante(Label lbUfParticipante) {
		this.lbUfParticipante = lbUfParticipante;
	}



	public Label getLbSalvarParticipante() {
		return lbSalvarParticipante;
	}



	public void setLbSalvarParticipante(Label lbSalvarParticipante) {
		this.lbSalvarParticipante = lbSalvarParticipante;
	}



	public TextBox getTbNomeParticipante() {
		return tbNomeParticipante;
	}



	public void setTbNomeParticipante(TextBox tbNomeParticipante) {
		this.tbNomeParticipante = tbNomeParticipante;
	}



	public TextBox getTbRgParticipante() {
		return tbRgParticipante;
	}



	public void setTbRgParticipante(TextBox tbRgParticipante) {
		this.tbRgParticipante = tbRgParticipante;
	}



	public TextBox getTbCpfParticipante() {
		return tbCpfParticipante;
	}



	public void setTbCpfParticipante(TextBox tbCpfParticipante) {
		this.tbCpfParticipante = tbCpfParticipante;
	}



	public TextBox getTbEmailParticipante() {
		return tbEmailParticipante;
	}



	public void setTbEmailParticipante(TextBox tbEmailParticipante) {
		this.tbEmailParticipante = tbEmailParticipante;
	}



	public TextBox getTbTelefoneParticipante() {
		return tbTelefoneParticipante;
	}



	public void setTbTelefoneParticipante(TextBox tbTelefoneParticipante) {
		this.tbTelefoneParticipante = tbTelefoneParticipante;
	}



	public TextBox getTbEnderecoParticipante() {
		return tbEnderecoParticipante;
	}



	public void setTbEnderecoParticipante(TextBox tbEnderecoParticipante) {
		this.tbEnderecoParticipante = tbEnderecoParticipante;
	}



	public TextBox getTbNumeroParticipante() {
		return tbNumeroParticipante;
	}



	public void setTbNumeroParticipante(TextBox tbNumeroParticipante) {
		this.tbNumeroParticipante = tbNumeroParticipante;
	}



	public TextBox getTbBairroParticipante() {
		return tbBairroParticipante;
	}



	public void setTbBairroParticipante(TextBox tbBairroParticipante) {
		this.tbBairroParticipante = tbBairroParticipante;
	}



	public TextBox getTbCepParticipante() {
		return tbCepParticipante;
	}



	public void setTbCepParticipante(TextBox tbCepParticipante) {
		this.tbCepParticipante = tbCepParticipante;
	}



	public TextBox getTbCidadeParticipante() {
		return tbCidadeParticipante;
	}



	public void setTbCidadeParticipante(TextBox tbCidadeParticipante) {
		this.tbCidadeParticipante = tbCidadeParticipante;
	}



	public ListBox getListUfParticipante() {
		return listUfParticipante;
	}



	public void setListUfParticipante(ListBox listUfParticipante) {
		this.listUfParticipante = listUfParticipante;
	}



	public Button getBtnBotaoSalvarParticipante() {
		return btnBotaoSalvarParticipante;
	}



	public void setBtnBotaoSalvarParticipante(Button btnBotaoSalvarParticipante) {
		this.btnBotaoSalvarParticipante = btnBotaoSalvarParticipante;
	}



	public Button getBtnBotaoVoltarParticipante() {
		return btnBotaoVoltarParticipante;
	}



	public void setBtnBotaoVoltarParticipante(Button btnBotaoVoltarParticipante) {
		this.btnBotaoVoltarParticipante = btnBotaoVoltarParticipante;
	}
	
	

}
