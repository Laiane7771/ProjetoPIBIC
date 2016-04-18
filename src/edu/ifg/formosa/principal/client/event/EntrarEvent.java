package edu.ifg.formosa.principal.client.event;

import com.google.gwt.event.shared.GwtEvent;


public class EntrarEvent extends GwtEvent<EntrarEventHandler> {

	public static Type<EntrarEventHandler> TYPE = new Type<EntrarEventHandler>();

	public Type<EntrarEventHandler> getAssociatedType(){
		return TYPE;
	}
	protected void dispatch(EntrarEventHandler handler){
		handler.entrar(this);
	}
}
