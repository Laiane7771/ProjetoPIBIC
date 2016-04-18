package edu.ifg.formosa.principal.client.event;

import com.google.gwt.event.shared.GwtEvent;


public class ComoFuncionaEvent extends GwtEvent<ComoFuncionaEventHandler>{

	public static Type<ComoFuncionaEventHandler> TYPE = new Type<ComoFuncionaEventHandler>();

	public Type<ComoFuncionaEventHandler> getAssociatedType(){
		return TYPE;
	}
	protected void dispatch(ComoFuncionaEventHandler handler){
		handler.comoFunciona(this);
	}

}
