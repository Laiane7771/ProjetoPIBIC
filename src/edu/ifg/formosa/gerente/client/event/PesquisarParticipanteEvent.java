package edu.ifg.formosa.gerente.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;

public class PesquisarParticipanteEvent extends GwtEvent<PesquisarParticipanteEventHandler>{

	public static Type<PesquisarParticipanteEventHandler> TYPE = new Type<PesquisarParticipanteEventHandler>();

	public Type<PesquisarParticipanteEventHandler> getAssociatedType(){
		return TYPE;
	}
	protected void dispatch(PesquisarParticipanteEventHandler handler){
		handler.pesquisarParticipante(this);
	}
}
