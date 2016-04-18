package edu.ifg.formosa.gerente.client.event;

import com.google.gwt.event.shared.GwtEvent;


public class ImprimirCertificadoCoordenadorEvent extends GwtEvent<ImprimirCertificadoCoordenadorEventHandler>{

	public static Type<ImprimirCertificadoCoordenadorEventHandler> TYPE = new Type<ImprimirCertificadoCoordenadorEventHandler>();

	public Type<ImprimirCertificadoCoordenadorEventHandler> getAssociatedType(){
		return TYPE;
	}
	protected void dispatch(ImprimirCertificadoCoordenadorEventHandler handler){
		handler.imprimirCertificadoCoordenador(this);
	}
}