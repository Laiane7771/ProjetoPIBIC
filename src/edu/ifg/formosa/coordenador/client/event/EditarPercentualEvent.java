package edu.ifg.formosa.coordenador.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class EditarPercentualEvent extends GwtEvent<EditarPercentualEventHandler>{

	public static Type<EditarPercentualEventHandler> TYPE = new Type<EditarPercentualEventHandler>();

	public Type<EditarPercentualEventHandler> getAssociatedType(){
		return TYPE;
	}
	
	@Override
	protected void dispatch(EditarPercentualEventHandler handler) {
		handler.editarPercentual(this);
		
	}

}
