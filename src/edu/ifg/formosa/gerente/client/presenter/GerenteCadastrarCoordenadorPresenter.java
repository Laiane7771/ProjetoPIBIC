package edu.ifg.formosa.gerente.client.presenter;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.UmbrellaException;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.gerente.client.GerenteServiceAsync;
import edu.ifg.formosa.gerente.client.event.PesquisarCoordenadorEvent;
import edu.ifg.formosa.gerente.client.view.GerenteCadastrarCoordenadorView;
import edu.ifg.formosa.gerente.server.GerenteServiceImpl;
import edu.ifg.formosa.gerente.shared.Coordenador;

public class GerenteCadastrarCoordenadorPresenter  implements Presenter{

	private GerenteCadastrarCoordenadorView cadastrarCoordenador;
	private final HandlerManager eventBus;
	private final GerenteServiceAsync rpcService;
	
	public GerenteCadastrarCoordenadorPresenter(GerenteCadastrarCoordenadorView gccv, HandlerManager eventBus, GerenteServiceAsync rpcService){
		this.cadastrarCoordenador = gccv;
		this.eventBus = eventBus;
		this.rpcService = rpcService;
		bind();
	}

	public void bind(){
		
		cadastrarCoordenador.getBtnSalvarCoordenador().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				
				rpcService.adicionaCoordenador(cadastrarCoordenador(), new AsyncCallback<Boolean>() {
					
					@Override
					public void onSuccess(Boolean result) {
						if(result == true){
							Window.alert("Coordenador cadastrado com sucesso!");
						}	
					}
					
					@Override
					public void onFailure(Throwable caught) {
						Window.alert("Não foi possível cadastrar o coordenador");
						
					}
				});
				
			}
		});
		
		cadastrarCoordenador.getBtnVoltarCoordenador().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new PesquisarCoordenadorEvent());
				
			}
		});
		
	}
	public Coordenador cadastrarCoordenador(){
		try{
		Coordenador coordenador = new Coordenador();
		coordenador.getUsuario().setNome(cadastrarCoordenador.getTbNomeCompletoCoordenador().getText());
		coordenador.setMatriculaSiape(cadastrarCoordenador.getTbSiapeMatriculaCoordenador().getText());
		coordenador.getUsuario().setCpf(cadastrarCoordenador.getTbCpfCoordenador().getText());
		coordenador.getUsuario().getContatoPessoa().setEmail(cadastrarCoordenador.getTbEmailCoordenador().getText());
		coordenador.getUsuario().getContatoPessoa().setTelefonePessoa(cadastrarCoordenador.getTbTelefoneCoordenador().getText());
		coordenador.getUsuario().getEnderecoUsuario().setNumero(cadastrarCoordenador.getTbNumeroCoordenador().getText());
		coordenador.getUsuario().getEnderecoUsuario().setBairro(cadastrarCoordenador.getTbBairroCoordenador().getText());
		coordenador.getUsuario().getEnderecoUsuario().setCep(cadastrarCoordenador.getTbCepCoor().getText());
		coordenador.getUsuario().getEnderecoUsuario().getCidade().setNomeCidade(cadastrarCoordenador.getTbCidadeCoordenador().getText());
		coordenador.getUsuario().getEnderecoUsuario().getEstado().setNomeEstado(cadastrarCoordenador.getListUf().getValue(0));
		GWT.log(""+cadastrarCoordenador.getListUf().getValue(0));
			return coordenador;
		}
		catch(UmbrellaException u){
			Window.alert(""+ u.getMessage());
		}
		return null;
	}


	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		containerDois.add(cadastrarCoordenador.asWidget());
		bind();
	}
}
