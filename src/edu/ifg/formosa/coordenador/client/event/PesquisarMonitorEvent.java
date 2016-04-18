package edu.ifg.formosa.coordenador.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class PesquisarMonitorEvent extends GwtEvent<PesquisarMonitorEventHandler>{
	
	public static Type<PesquisarMonitorEventHandler> TYPE = new Type<PesquisarMonitorEventHandler>();

	public Type<PesquisarMonitorEventHandler> getAssociatedType(){
		return TYPE;
	}
	protected void dispatch(PesquisarMonitorEventHandler handler){
		handler.pesquisarMonitor(this);
	}
}
