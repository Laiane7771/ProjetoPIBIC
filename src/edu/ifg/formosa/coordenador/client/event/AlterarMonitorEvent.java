package edu.ifg.formosa.coordenador.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class AlterarMonitorEvent extends GwtEvent<AlterarMonitorEventHandler>{

	public static Type<AlterarMonitorEventHandler> TYPE = new Type<AlterarMonitorEventHandler>();

	public Type<AlterarMonitorEventHandler> getAssociatedType(){
		return TYPE;
	}
	
	@Override
	protected void dispatch(AlterarMonitorEventHandler handler) {
		handler.alterarMonitor(this);
		
	}

}
