package edu.ifg.formosa.coordenador.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class AlterarAtividadeEvent extends GwtEvent<AlterarAtividadeEventHandler>{

	public static Type<AlterarAtividadeEventHandler> TYPE = new Type<AlterarAtividadeEventHandler>();

	public Type<AlterarAtividadeEventHandler> getAssociatedType(){
		return TYPE;
	}
	
	@Override
	protected void dispatch(AlterarAtividadeEventHandler handler) {
		handler.alterarAtividade(this);
		
	}

}
