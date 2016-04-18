package edu.ifg.formosa.gerente.client.event;

import com.google.gwt.event.shared.GwtEvent;


public class PesquisarEventoEvent extends GwtEvent<PesquisarEventoEventHandler>{

	public static Type<PesquisarEventoEventHandler> TYPE = new Type<PesquisarEventoEventHandler>();

	public Type<PesquisarEventoEventHandler> getAssociatedType(){
		return TYPE;
	}
	protected void dispatch(PesquisarEventoEventHandler handler){
		handler.pesquisarEvento(this);
	}
}
