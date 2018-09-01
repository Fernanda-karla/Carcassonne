package br.ufpb.dcx.aps.carcassone;

public enum Status {
	
	PARTIDA_ANDAMENTO("Em_Andamento"), TURNO_INICIO("Início_Turno"), PARTIDA_FINALIZADA(
			"Partida_Finalizada"), TILE_POSICIONADO("Tile_posicionado"), MEEPLE_POSICIONADO("Meeple_Posicionado");

	final private String nomeStatus;

	Status(String status) {
		this.nomeStatus = status;
	}

	public String getStatus() {
		return this.nomeStatus;
	}

	@Override
	public String toString() {
		return this.nomeStatus;
	}


}
