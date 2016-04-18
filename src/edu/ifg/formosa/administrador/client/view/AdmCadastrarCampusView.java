package edu.ifg.formosa.administrador.client.view;


import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class AdmCadastrarCampusView extends DialogBox{

	private HorizontalPanel hpPainelTituloPopupCadastro;
	private HorizontalPanel hpPainelTituloPainelInformacoes;
	private HorizontalPanel hpPainelNomeTextBoxCampus;
	private HorizontalPanel hpPainelEmailTextBoxCampus;
	private HorizontalPanel hpPainelTelefoneTextBoxCampus;
	private HorizontalPanel hpPainelNomeDiretorTextBoxCampus;
	private HorizontalPanel hpPainelCnpjCampus;
	private HorizontalPanel hpPainelTituloPainelEndereco;
	private HorizontalPanel hpPainelEnderecoTextBoxCampus;
	private HorizontalPanel hpPainelNumeroBairroTextBoxCampus;
	private HorizontalPanel hpPainelCidadeUfTextBoxListBoxCampus;
	private HorizontalPanel hpPainelBotoesCampus;
	private VerticalPanel vpPainelInformacoesEContatosCampus;
	private VerticalPanel vpPainelEnderecoCampus;
	private VerticalPanel vpPainelCadastrodeCampus;
	private Label lbTituloPaginaCadastro;
	private Label lbTituloPainelInformacoes;
	private Label lbNomeCampus;
	private Label lbEmailCampus;
	private Label lbTelefonecampus;
	private Label lbNomeDiretorCampus;
	private Label lbCnpjCampus;
	private Label lbTituloPainelEndereco;
	private Label lbEnderecoCampus;
	private Label lbNumeroCampus;
	private Label lbBairroCampus;
	private Label lbCidadeCampus;
	private Label lbUfCampus;
	private TextBox tbNomeCampus;
	private TextBox tbEmailCampus;
	private TextBox tbTelefoneCampus;
	private TextBox tbNomeDoDiretorCampus;
	private TextBox tbEnderecoCampus;
	private TextBox tbNumeroCampus;
	private TextBox tbBairroCampus;
	private TextBox tbCidadeCampus;
	private TextBox tbUfCampus;
	private Button btnCadastrarCampus;
	private Button btnCancelarCadastro;
	
	
	public AdmCadastrarCampusView(){
		

		hpPainelTituloPopupCadastro = new HorizontalPanel();
		hpPainelTituloPopupCadastro.setStyleName("hpPainelTituloPopupCadastro");
		
		lbTituloPaginaCadastro = new Label("Cadastro de Câmpus");
		lbTituloPaginaCadastro.setStyleName("lbTituloPaginaCadastro");
		
		hpPainelTituloPopupCadastro.add(lbTituloPaginaCadastro);//add item
		
		hpPainelTituloPainelInformacoes = new HorizontalPanel();
		hpPainelTituloPainelInformacoes.setStyleName("hpPainelTituloFormulario");
		
		lbTituloPainelInformacoes = new Label("Informações e Contato");
		lbTituloPainelInformacoes.setStyleName("lbTituloPainelInformacoes");
		
		hpPainelTituloPainelInformacoes.add(lbTituloPainelInformacoes);//add item
		
		hpPainelNomeTextBoxCampus = new HorizontalPanel();
		hpPainelNomeTextBoxCampus.setStyleName("hpPainelNomeTextBoxCampus");
		
		lbNomeCampus = new Label("Nome:");
		lbNomeCampus.setStyleName("lbNomeCampus");
		
		tbNomeCampus  = new TextBox();
		tbNomeCampus.setStyleName("tbNomeCampus");
		
		hpPainelNomeTextBoxCampus.add(lbNomeCampus);//add item
		hpPainelNomeTextBoxCampus.add(tbNomeCampus);//add item
		
		hpPainelEmailTextBoxCampus = new HorizontalPanel();
		hpPainelEmailTextBoxCampus.setStyleName("hpPainelEmailTextBoxCampus");
		
		lbEmailCampus = new Label("Email:");
		lbEmailCampus.setStyleName("lbEmailCampus");
		
		tbEmailCampus = new TextBox();
		tbEmailCampus.setStyleName("tbEmailCampus");
		
		hpPainelEmailTextBoxCampus.add(lbEmailCampus);//add item
		hpPainelEmailTextBoxCampus.add(tbEmailCampus);//add item
		
		hpPainelTelefoneTextBoxCampus = new HorizontalPanel();
		hpPainelTelefoneTextBoxCampus.setStyleName("hpPainelTelefoneTextBoxCampus");
		
		lbTelefonecampus = new Label("Telefone:");
		lbTelefonecampus.setStyleName("lbTelefonecampus");
		
		tbTelefoneCampus = new TextBox();
		tbTelefoneCampus.setStyleName("tbTelefoneCampus");
		
		hpPainelTelefoneTextBoxCampus.add(lbTelefonecampus);//add item
		hpPainelTelefoneTextBoxCampus.add(tbTelefoneCampus);//add item
		
		hpPainelNomeDiretorTextBoxCampus = new HorizontalPanel();
		hpPainelNomeDiretorTextBoxCampus.setStyleName("hpPainelNomeDiretorTextBoxCampus");
		
		lbNomeDiretorCampus = new Label("Nome do Diretor(Câmpus)");
		lbNomeDiretorCampus.setStyleName("lbNomeDiretorCampus");
		
		tbNomeDoDiretorCampus = new TextBox();
		tbNomeDoDiretorCampus.setStyleName("tbNomeDoDiretorCampus");
		
		hpPainelNomeDiretorTextBoxCampus.add(lbNomeDiretorCampus);//add item
		hpPainelNomeDiretorTextBoxCampus.add(tbNomeCampus);//add item
		
		hpPainelCnpjCampus = new HorizontalPanel();
		hpPainelCnpjCampus.setStyleName("hpPainelCnpjCampus");
		
		lbCnpjCampus = new Label("CNPJ:");
		lbCnpjCampus.setStyleName("lbCnpjCampus");
		
		hpPainelCnpjCampus.add(lbCnpjCampus);//add item
		
		vpPainelInformacoesEContatosCampus = new VerticalPanel();
		vpPainelInformacoesEContatosCampus.setStyleName("vpPainelInformacoesEContatosCampus");

		vpPainelInformacoesEContatosCampus.add(hpPainelTituloPainelInformacoes); //add item
		vpPainelInformacoesEContatosCampus.add(hpPainelNomeTextBoxCampus); //add item
		vpPainelInformacoesEContatosCampus.add(hpPainelEmailTextBoxCampus);//add item
		vpPainelInformacoesEContatosCampus.add(hpPainelNomeDiretorTextBoxCampus);//add item
		vpPainelInformacoesEContatosCampus.add(hpPainelCnpjCampus);//add item
		
		//=======================================================================
		
		hpPainelTituloPainelEndereco = new HorizontalPanel();
		hpPainelTituloPainelEndereco.setStyleName("hpPainelTituloPainelEndereco");
		
		lbTituloPainelEndereco = new Label("Endereço");
		lbTituloPainelEndereco.setStyleName("lbTituloPainelEndereco");
		
		hpPainelTituloPainelEndereco.add(lbTituloPainelEndereco);//add item
		
		hpPainelEnderecoTextBoxCampus = new HorizontalPanel();
		hpPainelEnderecoTextBoxCampus.setStyleName("hpPainelEnderecoTextBoxCampus");
		
		lbEnderecoCampus = new Label("Endereço:");
		lbEnderecoCampus.setStyleName("lbEnderecoCampus");
		
		tbEnderecoCampus = new TextBox();
		tbEnderecoCampus.setStyleName("tbEnderecoCampus");
		
		hpPainelEnderecoTextBoxCampus.add(lbEnderecoCampus);//add item
		hpPainelEnderecoTextBoxCampus.add(tbEnderecoCampus);//add item
		
		hpPainelNumeroBairroTextBoxCampus = new HorizontalPanel();
		hpPainelNumeroBairroTextBoxCampus.setStyleName("hpPainelNumeroBairroTextBoxCampus");
		
		lbNumeroCampus = new Label("Nº:");
		lbNumeroCampus.setStyleName("lbNumeroCampus");
		
		tbNumeroCampus = new TextBox();
		tbNumeroCampus.setStyleName("tbNumeroCampus");
		
		lbBairroCampus = new Label("Bairro:");
		lbBairroCampus.setStyleName("lbBairroCampus");
		
		tbBairroCampus = new TextBox();
		tbBairroCampus.setStyleName("tbBairroCampus");
		
		hpPainelNumeroBairroTextBoxCampus.add(lbNumeroCampus);//add item
		hpPainelNumeroBairroTextBoxCampus.add(tbNumeroCampus);//add item
		hpPainelNumeroBairroTextBoxCampus.add(lbBairroCampus);//add item
		hpPainelNumeroBairroTextBoxCampus.add(tbBairroCampus);//add item
		
		hpPainelCidadeUfTextBoxListBoxCampus = new HorizontalPanel();
		hpPainelCidadeUfTextBoxListBoxCampus.setStyleName("hpPainelCidadeUfTextBoxListBoxCampus");
		
		lbCidadeCampus = new Label("Cidade:");
		lbCidadeCampus.setStyleName("lbCidadeCampus");
		
		tbCidadeCampus = new TextBox();
		tbCidadeCampus.setStyleName("tbCidadeCampus");
		
		lbUfCampus = new Label("UF:");
		lbUfCampus.setStyleName("lbUfCampus");
		
		tbUfCampus = new TextBox();
		tbUfCampus.setStyleName("tbUfCampus");
		
		hpPainelCidadeUfTextBoxListBoxCampus.add(lbCidadeCampus);//add item
		hpPainelCidadeUfTextBoxListBoxCampus.add(tbCidadeCampus);//add item
		hpPainelCidadeUfTextBoxListBoxCampus.add(lbUfCampus);//add item
		hpPainelCidadeUfTextBoxListBoxCampus.add(tbUfCampus);//add item
		
		vpPainelEnderecoCampus = new VerticalPanel();
		vpPainelEnderecoCampus.setStyleName("vpPainelEnderecoCampus");
		
		vpPainelEnderecoCampus.add(hpPainelTituloPainelEndereco);//add item
		vpPainelEnderecoCampus.add(hpPainelEnderecoTextBoxCampus);//add item
		vpPainelEnderecoCampus.add(hpPainelNumeroBairroTextBoxCampus);//add item
		vpPainelEnderecoCampus.add(hpPainelCidadeUfTextBoxListBoxCampus);//add item
		
		//========================================================================
		
		hpPainelBotoesCampus = new HorizontalPanel();
		hpPainelBotoesCampus.setStyleName("hpPainelBotoesCampus");
		
		btnCadastrarCampus = new Button("Cadastrar");
		btnCadastrarCampus.setStyleName("btnCadastrarCampus");
		
		btnCancelarCadastro = new Button("Cancelar");
		btnCancelarCadastro.setStyleName("btnCancelarCadastro");
		
		hpPainelBotoesCampus.add(btnCadastrarCampus);//add item
		hpPainelBotoesCampus.add(btnCancelarCadastro);//add item
		
		//======================================================================
		vpPainelCadastrodeCampus = new VerticalPanel();
		vpPainelCadastrodeCampus.setStyleName("vpPainelCadastrodeCampus");
		
		vpPainelCadastrodeCampus.add(vpPainelInformacoesEContatosCampus);//add item
		vpPainelCadastrodeCampus.add(vpPainelEnderecoCampus);//add item
		vpPainelCadastrodeCampus.add(hpPainelBotoesCampus);//add item
		
		
		this.add(vpPainelCadastrodeCampus);
		this.show();
		this.setGlassEnabled(true);
		this.setModal(false);
		this.setAnimationEnabled(true);
		
	}


	public HorizontalPanel getHpPainelTituloPopupCadastro() {
		return hpPainelTituloPopupCadastro;
	}


	public void setHpPainelTituloPopupCadastro(HorizontalPanel hpPainelTituloPopupCadastro) {
		this.hpPainelTituloPopupCadastro = hpPainelTituloPopupCadastro;
	}


	public HorizontalPanel getHpPainelTituloPainelInformacoes() {
		return hpPainelTituloPainelInformacoes;
	}


	public void setHpPainelTituloPainelInformacoes(HorizontalPanel hpPainelTituloPainelInformacoes) {
		this.hpPainelTituloPainelInformacoes = hpPainelTituloPainelInformacoes;
	}


	public HorizontalPanel getHpPainelNomeTextBoxCampus() {
		return hpPainelNomeTextBoxCampus;
	}


	public void setHpPainelNomeTextBoxCampus(HorizontalPanel hpPainelNomeTextBoxCampus) {
		this.hpPainelNomeTextBoxCampus = hpPainelNomeTextBoxCampus;
	}


	public HorizontalPanel getHpPainelEmailTextBoxCampus() {
		return hpPainelEmailTextBoxCampus;
	}


	public void setHpPainelEmailTextBoxCampus(HorizontalPanel hpPainelEmailTextBoxCampus) {
		this.hpPainelEmailTextBoxCampus = hpPainelEmailTextBoxCampus;
	}


	public HorizontalPanel getHpPainelTelefoneTextBoxCampus() {
		return hpPainelTelefoneTextBoxCampus;
	}


	public void setHpPainelTelefoneTextBoxCampus(HorizontalPanel hpPainelTelefoneTextBoxCampus) {
		this.hpPainelTelefoneTextBoxCampus = hpPainelTelefoneTextBoxCampus;
	}


	public HorizontalPanel getHpPainelNomeDiretorTextBoxCampus() {
		return hpPainelNomeDiretorTextBoxCampus;
	}


	public void setHpPainelNomeDiretorTextBoxCampus(HorizontalPanel hpPainelNomeDiretorTextBoxCampus) {
		this.hpPainelNomeDiretorTextBoxCampus = hpPainelNomeDiretorTextBoxCampus;
	}


	public HorizontalPanel getHpPainelCnpjCampus() {
		return hpPainelCnpjCampus;
	}


	public void setHpPainelCnpjCampus(HorizontalPanel hpPainelCnpjCampus) {
		this.hpPainelCnpjCampus = hpPainelCnpjCampus;
	}


	public HorizontalPanel getHpPainelTituloPainelEndereco() {
		return hpPainelTituloPainelEndereco;
	}


	public void setHpPainelTituloPainelEndereco(HorizontalPanel hpPainelTituloPainelEndereco) {
		this.hpPainelTituloPainelEndereco = hpPainelTituloPainelEndereco;
	}


	public HorizontalPanel getHpPainelEnderecoTextBoxCampus() {
		return hpPainelEnderecoTextBoxCampus;
	}


	public void setHpPainelEnderecoTextBoxCampus(HorizontalPanel hpPainelEnderecoTextBoxCampus) {
		this.hpPainelEnderecoTextBoxCampus = hpPainelEnderecoTextBoxCampus;
	}


	public HorizontalPanel getHpPainelNumeroBairroTextBoxCampus() {
		return hpPainelNumeroBairroTextBoxCampus;
	}


	public void setHpPainelNumeroBairroTextBoxCampus(HorizontalPanel hpPainelNumeroBairroTextBoxCampus) {
		this.hpPainelNumeroBairroTextBoxCampus = hpPainelNumeroBairroTextBoxCampus;
	}


	public HorizontalPanel getHpPainelCidadeUfTextBoxListBoxCampus() {
		return hpPainelCidadeUfTextBoxListBoxCampus;
	}


	public void setHpPainelCidadeUfTextBoxListBoxCampus(HorizontalPanel hpPainelCidadeUfTextBoxListBoxCampus) {
		this.hpPainelCidadeUfTextBoxListBoxCampus = hpPainelCidadeUfTextBoxListBoxCampus;
	}


	public HorizontalPanel getHpPainelBotoesCampus() {
		return hpPainelBotoesCampus;
	}


	public void setHpPainelBotoesCampus(HorizontalPanel hpPainelBotoesCampus) {
		this.hpPainelBotoesCampus = hpPainelBotoesCampus;
	}


	public VerticalPanel getVpPainelInformacoesEContatosCampus() {
		return vpPainelInformacoesEContatosCampus;
	}


	public void setVpPainelInformacoesEContatosCampus(VerticalPanel vpPainelInformacoesEContatosCampus) {
		this.vpPainelInformacoesEContatosCampus = vpPainelInformacoesEContatosCampus;
	}


	public VerticalPanel getVpPainelEnderecoCampus() {
		return vpPainelEnderecoCampus;
	}


	public void setVpPainelEnderecoCampus(VerticalPanel vpPainelEnderecoCampus) {
		this.vpPainelEnderecoCampus = vpPainelEnderecoCampus;
	}


	public VerticalPanel getVpPainelCadastrodeCampus() {
		return vpPainelCadastrodeCampus;
	}


	public void setVpPainelCadastrodeCampus(VerticalPanel vpPainelCadastrodeCampus) {
		this.vpPainelCadastrodeCampus = vpPainelCadastrodeCampus;
	}


	public Label getLbTituloPaginaCadastro() {
		return lbTituloPaginaCadastro;
	}


	public void setLbTituloPaginaCadastro(Label lbTituloPaginaCadastro) {
		this.lbTituloPaginaCadastro = lbTituloPaginaCadastro;
	}


	public Label getLbTituloPainelInformacoes() {
		return lbTituloPainelInformacoes;
	}


	public void setLbTituloPainelInformacoes(Label lbTituloPainelInformacoes) {
		this.lbTituloPainelInformacoes = lbTituloPainelInformacoes;
	}


	public Label getLbNomeCampus() {
		return lbNomeCampus;
	}


	public void setLbNomeCampus(Label lbNomeCampus) {
		this.lbNomeCampus = lbNomeCampus;
	}


	public Label getLbEmailCampus() {
		return lbEmailCampus;
	}


	public void setLbEmailCampus(Label lbEmailCampus) {
		this.lbEmailCampus = lbEmailCampus;
	}


	public Label getLbTelefonecampus() {
		return lbTelefonecampus;
	}


	public void setLbTelefonecampus(Label lbTelefonecampus) {
		this.lbTelefonecampus = lbTelefonecampus;
	}


	public Label getLbNomeDiretorCampus() {
		return lbNomeDiretorCampus;
	}


	public void setLbNomeDiretorCampus(Label lbNomeDiretorCampus) {
		this.lbNomeDiretorCampus = lbNomeDiretorCampus;
	}


	public Label getLbCnpjCampus() {
		return lbCnpjCampus;
	}


	public void setLbCnpjCampus(Label lbCnpjCampus) {
		this.lbCnpjCampus = lbCnpjCampus;
	}


	public Label getLbTituloPainelEndereco() {
		return lbTituloPainelEndereco;
	}


	public void setLbTituloPainelEndereco(Label lbTituloPainelEndereco) {
		this.lbTituloPainelEndereco = lbTituloPainelEndereco;
	}


	public Label getLbEnderecoCampus() {
		return lbEnderecoCampus;
	}


	public void setLbEnderecoCampus(Label lbEnderecoCampus) {
		this.lbEnderecoCampus = lbEnderecoCampus;
	}


	public Label getLbNumeroCampus() {
		return lbNumeroCampus;
	}


	public void setLbNumeroCampus(Label lbNumeroCampus) {
		this.lbNumeroCampus = lbNumeroCampus;
	}


	public Label getLbBairroCampus() {
		return lbBairroCampus;
	}


	public void setLbBairroCampus(Label lbBairroCampus) {
		this.lbBairroCampus = lbBairroCampus;
	}


	public Label getLbCidadeCampus() {
		return lbCidadeCampus;
	}


	public void setLbCidadeCampus(Label lbCidadeCampus) {
		this.lbCidadeCampus = lbCidadeCampus;
	}


	public Label getLbUfCampus() {
		return lbUfCampus;
	}


	public void setLbUfCampus(Label lbUfCampus) {
		this.lbUfCampus = lbUfCampus;
	}


	public TextBox getTbNomeCampus() {
		return tbNomeCampus;
	}


	public void setTbNomeCampus(TextBox tbNomeCampus) {
		this.tbNomeCampus = tbNomeCampus;
	}


	public TextBox getTbEmailCampus() {
		return tbEmailCampus;
	}


	public void setTbEmailCampus(TextBox tbEmailCampus) {
		this.tbEmailCampus = tbEmailCampus;
	}


	public TextBox getTbTelefoneCampus() {
		return tbTelefoneCampus;
	}


	public void setTbTelefoneCampus(TextBox tbTelefoneCampus) {
		this.tbTelefoneCampus = tbTelefoneCampus;
	}


	public TextBox getTbNomeDoDiretorCampus() {
		return tbNomeDoDiretorCampus;
	}


	public void setTbNomeDoDiretorCampus(TextBox tbNomeDoDiretorCampus) {
		this.tbNomeDoDiretorCampus = tbNomeDoDiretorCampus;
	}


	public TextBox getTbEnderecoCampus() {
		return tbEnderecoCampus;
	}


	public void setTbEnderecoCampus(TextBox tbEnderecoCampus) {
		this.tbEnderecoCampus = tbEnderecoCampus;
	}


	public TextBox getTbNumeroCampus() {
		return tbNumeroCampus;
	}


	public void setTbNumeroCampus(TextBox tbNumeroCampus) {
		this.tbNumeroCampus = tbNumeroCampus;
	}


	public TextBox getTbBairroCampus() {
		return tbBairroCampus;
	}


	public void setTbBairroCampus(TextBox tbBairroCampus) {
		this.tbBairroCampus = tbBairroCampus;
	}


	public TextBox getTbCidadeCampus() {
		return tbCidadeCampus;
	}


	public void setTbCidadeCampus(TextBox tbCidadeCampus) {
		this.tbCidadeCampus = tbCidadeCampus;
	}


	public TextBox getTbUfCampus() {
		return tbUfCampus;
	}


	public void setTbUfCampus(TextBox tbUfCampus) {
		this.tbUfCampus = tbUfCampus;
	}


	public Button getBtnCadastrarCampus() {
		return btnCadastrarCampus;
	}


	public void setBtnCadastrarCampus(Button btnCadastrarCampus) {
		this.btnCadastrarCampus = btnCadastrarCampus;
	}


	public Button getBtnCancelarCadastro() {
		return btnCancelarCadastro;
	}


	public void setBtnCancelarCadastro(Button btnCancelarCadastro) {
		this.btnCancelarCadastro = btnCancelarCadastro;
	}
	
	
}
