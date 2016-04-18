package edu.ifg.formosa.gerente.client.event;

import com.google.gwt.event.shared.GwtEvent;


public class ImprimirCrachaParticipanteEvent extends GwtEvent<ImprimirCrachaParticipanteEventHandler>{

	public static Type<ImprimirCrachaParticipanteEventHandler> TYPE = new Type<ImprimirCrachaParticipanteEventHandler>();

	public Type<ImprimirCrachaParticipanteEventHandler> getAssociatedType(){
		return TYPE;
	}
	protected void dispatch(ImprimirCrachaParticipanteEventHandler handler){
		handler.imprimirCrachaParticipante(this);
	}
}