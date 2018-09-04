package br.ufpb.dcx.aps.carcassone;

public class Jogador {
	private Cor corJogador;
	private int pontosDoJogador = 0;
	private int meeplesDoJogador = 7;
	
	public Jogador(Cor corJogador) {
		this(corJogador, 0, 7);
	}

	public Jogador(Cor corJogador, Integer pontosDoJogador, Integer meeplesDoJogador) {
		this.corJogador = corJogador;
		this.pontosDoJogador = pontosDoJogador;
		this.meeplesDoJogador = meeplesDoJogador;
		
	}
	public Cor getCor() {
		return corJogador;
	}
	
	public int getPontos() {
		return pontosDoJogador;
	}
	
	public int quantidadeMeeples() {
		return meeplesDoJogador;
	}
	
	public void tirarMeeple() {
		--meeplesDoJogador;
	}
	
	public void reset() {
		 meeplesDoJogador = 7;
		 pontosDoJogador = 0;
	}
	
	public String toString() {
		return corJogador + "(" + pontosDoJogador + ", " + meeplesDoJogador + ")";
	}


}
