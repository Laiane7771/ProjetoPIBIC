package edu.ifg.formosa.participante.client.event;

import com.google.gwt.event.shared.GwtEvent;


public class InscreverAtividadeEvent extends GwtEvent<InscreverAtividadeEventHandler>{

	public static Type<InscreverAtividadeEventHandler> TYPE = new Type<InscreverAtividadeEventHandler>();

	public Type<InscreverAtividadeEventHandler> getAssociatedType(){
		return TYPE;
	}
	protected void dispatch(InscreverAtividadeEventHandler handler){
		handler.alterarEvento(this);
	}
}