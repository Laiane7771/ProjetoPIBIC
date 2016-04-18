package edu.ifg.formosa.gerente.client.event;

import com.google.gwt.event.shared.GwtEvent;


public class PesquisarCoordenadorEvent extends GwtEvent<PesquisarCoordenadorEventHandler>{

	public static Type<PesquisarCoordenadorEventHandler> TYPE = new Type<PesquisarCoordenadorEventHandler>();

	public Type<PesquisarCoordenadorEventHandler> getAssociatedType(){
		return TYPE;
	}
	protected void dispatch(PesquisarCoordenadorEventHandler handler){
		handler.pesquisarCoordenador(this);
	}
}
