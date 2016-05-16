package edu.ifg.formosa.coordenador.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class PesquisarPercentualEvent extends GwtEvent<PesquisarPercentualEventHandler>{

	public static Type<PesquisarPercentualEventHandler> TYPE = new Type<PesquisarPercentualEventHandler>();

	public Type<PesquisarPercentualEventHandler> getAssociatedType(){
		return TYPE;
	}
	
	@Override
	protected void dispatch(PesquisarPercentualEventHandler handler) {
		handler.pesquisarPercentual(this);
		
	}

}
