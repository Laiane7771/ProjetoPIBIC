package edu.ifg.formosa.gerente.client.event;

import com.google.gwt.event.shared.GwtEvent;


public class ImprimirCertificadoParticipanteEvent extends GwtEvent<ImprimirCertificadoParticipanteEventHandler>{

	public static Type<ImprimirCertificadoParticipanteEventHandler> TYPE = new Type<ImprimirCertificadoParticipanteEventHandler>();

	public Type<ImprimirCertificadoParticipanteEventHandler> getAssociatedType(){
		return TYPE;
	}
	protected void dispatch(ImprimirCertificadoParticipanteEventHandler handler){
		handler.imprimirCertificadoParticipante(this);
	}
}