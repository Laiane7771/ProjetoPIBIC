package edu.ifg.formosa.gerente.client.event;

import com.google.gwt.event.shared.GwtEvent;


public class ImprimirCrachaCoordenadorEvent extends GwtEvent<ImprimirCrachaCoordenadorEventHandler>{

	public static Type<ImprimirCrachaCoordenadorEventHandler> TYPE = new Type<ImprimirCrachaCoordenadorEventHandler>();

	public Type<ImprimirCrachaCoordenadorEventHandler> getAssociatedType(){
		return TYPE;
	}
	protected void dispatch(ImprimirCrachaCoordenadorEventHandler handler){
		handler.imprimirCrachaCoordenador(this);
	}
}