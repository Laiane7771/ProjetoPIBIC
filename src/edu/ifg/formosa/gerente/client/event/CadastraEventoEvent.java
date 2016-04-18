package edu.ifg.formosa.gerente.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class CadastraEventoEvent extends GwtEvent<CadastrarEventoEventHandler>{

	public static Type<CadastrarEventoEventHandler> TYPE = new Type<CadastrarEventoEventHandler>();

	public Type<CadastrarEventoEventHandler> getAssociatedType(){
		return TYPE;
	}
	protected void dispatch(CadastrarEventoEventHandler handler){
		handler.cadastrarEvento(this);
	}
}
