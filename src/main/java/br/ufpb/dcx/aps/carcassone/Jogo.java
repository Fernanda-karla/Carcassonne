package br.ufpb.dcx.aps.carcassone;

public class Jogo {

	public Partida criarPartida(BolsaDeTiles tiles, Cor... sequencia) {
		if(tiles == null) {
			throw new ExcecaoJogo("A bolsa de tiles deve ser fornecida na criação de uma partida");
		}
		
		if(sequencia.length < 2) {
			throw new ExcecaoJogo("Cada partida deve ter uma sequência de pelo menos dois jogadores");
		}
		
		for(int k =0; k < (sequencia.length -1); ++k) {
			for(int x = k+1; x < sequencia.length; ++x) {
				if(sequencia[k] == sequencia[x]) {
					throw new ExcecaoJogo("Não pode haver repetição de cores na sequência de jogadores");
				}
			}
		}
		return new Partida(tiles);
	}



}
