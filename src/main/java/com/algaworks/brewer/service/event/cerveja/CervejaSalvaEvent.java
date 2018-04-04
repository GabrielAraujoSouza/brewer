package com.algaworks.brewer.service.event.cerveja;

import com.algaworks.brewer.model.Cerveja;

public class CervejaSalvaEvent {

	private Cerveja cerveja;
	
	public CervejaSalvaEvent(Cerveja cerveja){
		this.cerveja = cerveja;
	}
	
	public Cerveja getCerveja() {
		return cerveja;
	}
}
