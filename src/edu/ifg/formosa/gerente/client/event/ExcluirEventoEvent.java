package edu.ifg.formosa.gerente.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class ExcluirEventoEvent extends GwtEvent<ExcluirEventoEventHandler>{

	public static Type<ExcluirEventoEventHandler> TYPE = new Type<ExcluirEventoEventHandler>();

	public Type<ExcluirEventoEventHandler> getAssociatedType(){
		return TYPE;
	}
	protected void dispatch(ExcluirEventoEventHandler handler){
		handler.excluirEvento(this);
	}

}

