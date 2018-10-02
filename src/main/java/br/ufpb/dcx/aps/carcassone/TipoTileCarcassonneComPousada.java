package br.ufpb.dcx.aps.carcassone;

import br.ufpb.dcx.aps.carcassone.tabuleiro.TipoLado;
import br.ufpb.dcx.aps.carcassone.tabuleiro.TipoTile;

public class TipoTileCarcassonneComPousada extends TipoTile{
	
	private Origem origem;

	private boolean escudo;
	private boolean mosteiro;
	private Cidades cidadeContinua;
	private Pousadas pousadas;

	public TipoTileCarcassonneComPousada() {
	}

	public TipoTileCarcassonneComPousada(Origem origem, TipoLado ladoNorte, TipoLado ladoLeste, TipoLado ladoSul, TipoLado ladoOeste,
			boolean escudo, boolean mosteiro, Cidades cidadeContinua, Pousadas pousadas) {
		super(ladoNorte, ladoLeste, ladoSul, ladoOeste);
		this.origem = origem;
		this.escudo = escudo;
		this.mosteiro = mosteiro;
		this.cidadeContinua = cidadeContinua;
		this.pousadas = pousadas;
	}
	
	public Origem getOrigem() {
		return origem;
	}

	public void setOrigem(Origem origem) {
		this.origem = origem;
	}

	public boolean isEscudo() {
		return escudo;
	}

	public void setEscudo(boolean escudo) {
		this.escudo = escudo;
	}

	public boolean isMosteiro() {
		return mosteiro;
	}

	public void setMosteiro(boolean mosteiro) {
		this.mosteiro = mosteiro;
	}

	public Cidades isCidadeContinua() {
		return cidadeContinua;
	}

	public void setCidadeContinua(Cidades cidadeContinua) {
		this.cidadeContinua = cidadeContinua;
	}

	public Pousadas getPousada() {
		return pousadas;
	}
	
	public void setPousadas(Pousadas pousadas) {
		this.pousadas = pousadas;
	}

}
