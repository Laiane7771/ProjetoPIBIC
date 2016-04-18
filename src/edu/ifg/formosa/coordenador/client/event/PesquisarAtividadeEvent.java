package edu.ifg.formosa.coordenador.client.event;

import com.google.gwt.event.shared.GwtEvent;


public class PesquisarAtividadeEvent extends GwtEvent<PesquisarAtividadeEventHandler>{

	public static Type<PesquisarAtividadeEventHandler> TYPE = new Type<PesquisarAtividadeEventHandler>();
	
	public Type<PesquisarAtividadeEventHandler> getAssociatedType(){
		return TYPE;
	}
	protected void dispatch(PesquisarAtividadeEventHandler handler){
		handler.pesquisarAtividade(this);
	}
}
