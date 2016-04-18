package edu.ifg.formosa.gerente.client.event;

import com.google.gwt.event.shared.GwtEvent;


public class CadastrarCoordenadorEvent extends GwtEvent<CadastrarCoordenadorEventHandler>{

	public static Type<CadastrarCoordenadorEventHandler> TYPE = new Type<CadastrarCoordenadorEventHandler>();

	public Type<CadastrarCoordenadorEventHandler> getAssociatedType(){
		return TYPE;
	}
	protected void dispatch(CadastrarCoordenadorEventHandler handler){
		handler.cadastrarCoordenador(this);
	}
}