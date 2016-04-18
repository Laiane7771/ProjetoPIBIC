package edu.ifg.formosa.gerente.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class CadastraParticipanteEvent extends GwtEvent<CadastrarParticipanteEventHandler>{

	public static Type<CadastrarParticipanteEventHandler> TYPE = new Type<CadastrarParticipanteEventHandler>();

	public Type<CadastrarParticipanteEventHandler> getAssociatedType(){
		return TYPE;
	}
	protected void dispatch(CadastrarParticipanteEventHandler handler){
		handler.cadastrarParticipante(this);
	}
}
