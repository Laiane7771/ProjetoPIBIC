package edu.ifg.formosa.gerente.client.event;

import com.google.gwt.event.shared.GwtEvent;


public class AlterarEventoEvent extends GwtEvent<AlterarEventoEventHandler>{

	public static Type<AlterarEventoEventHandler> TYPE = new Type<AlterarEventoEventHandler>();

	public Type<AlterarEventoEventHandler> getAssociatedType(){
		return TYPE;
	}
	protected void dispatch(AlterarEventoEventHandler handler){
		handler.alterarEvento(this);
	}
}