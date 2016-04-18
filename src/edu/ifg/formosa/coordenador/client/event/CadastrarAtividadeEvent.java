package edu.ifg.formosa.coordenador.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class CadastrarAtividadeEvent extends GwtEvent<CadastrarAtividadeEventHandler> {

	public final Type<CadastrarAtividadeEventHandler> TYPE = new Type<CadastrarAtividadeEventHandler>();

	public Type<CadastrarAtividadeEventHandler> getAssociatedType(){
		return TYPE;
	}

	@Override
	protected void dispatch(CadastrarAtividadeEventHandler handler) {
		handler.cadastrarAtividade(this);
		
	}
	
}
