package edu.ifg.formosa.coordenador.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class CadastrarMonitorEvent extends GwtEvent<CadastrarMonitorEventHandler>{

	public static Type<CadastrarMonitorEventHandler> TYPE = new Type<CadastrarMonitorEventHandler>();
	
	public Type<CadastrarMonitorEventHandler> getAssociatedType(){
		return TYPE;
	}

	@Override
	protected void dispatch(CadastrarMonitorEventHandler handler) {
		handler.cadastrarMonitor(this);
	}

}
