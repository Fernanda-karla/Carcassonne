package br.ufpb.dcx.aps.carcassone;

import br.ufpb.dcx.aps.carcassone.tabuleiro.TabuleiroFlexivel;
import br.ufpb.dcx.aps.carcassone.tabuleiro.Tile;

public class Partida {

	private BolsaDeTiles tiles;
	private Tile proximoTile;
	private TabuleiroFlexivel tabuleiro = new TabuleiroFlexivel("  ");
	Status statusTurno = Status.TILE_POSICIONADO;
	Status statusPartida;
	Jogador[] jogador;

	int indiceJogadorDaVez = 0;
	

	Partida(BolsaDeTiles tiles, Cor... sequencia) {
		this.tiles = tiles;
		pegarProximoTile();
		adicionarCorJogador(sequencia);
 		statusPartida = Status.PARTIDA_ANDAMENTO;
 		tabuleiro.adicionarPrimeiroTile(proximoTile);

	}

	public String relatorioPartida(String status, String sequencia) {
		return "Status: " + status + "\nJogadores: " + sequencia;
	}

	public String relatorioTurno(String jogador, String tile, String status) {
		return "Jogador: " + jogador + "\nTile: " + tile + "\nStatus: " + status;
	}
	
	public String relatorioTurno() {
		if(proximoTile == null) {
			statusPartida = Status.PARTIDA_FINALIZADA;
			throw new ExcecaoJogo("Partida finalizada");
		}
		return null;
	}

	public Partida girarTile() {
		
		if(statusTurno == Status.TILE_POSICIONADO) {
			throw new ExcecaoJogo("Não pode girar tile já posicionado");
		}
		if(proximoTile == null) {
			statusPartida = Status.PARTIDA_FINALIZADA;
			throw new ExcecaoJogo("Não pode girar tiles com a partida finalizada");
		}
		proximoTile.girar(); 

		return this;
	}

	private void pegarProximoTile() {
		proximoTile = tiles.pegar();
		if(proximoTile != null) {
			proximoTile.reset();
		}
	}

	public Partida finalizarTurno() {
		pegarProximoTile();
		indiceJogadorDaVez++;
		statusTurno = Status.TURNO_INICIO;
		seForNulo();
		return this;
	}

	public Partida posicionarTile(Tile tileReferencia, Lado ladoTileReferencia) {
		verificarPosicaoTile();
 		tabuleiro.posicionar(tileReferencia, ladoTileReferencia, proximoTile);
 		statusTurno = Status.TILE_POSICIONADO;
 		return this;

	}

	private void verificarPosicaoTile() {
		if (statusTurno == Status.TILE_POSICIONADO) {
			throw new ExcecaoJogo("Não pode reposicionar tile já posicionado");
		}
		
	}

	public Partida posicionarMeepleEstrada(Lado lado) {
		return this;
	}



	public Partida posicionarMeepleCampo(Vertice vertice) {
		return this;

	}

	public Partida posicionarMeepleCidade(Lado lado) {
		return this;
	}

	public Partida posicionarMeepleMosteiro() {
		return this;
	}

	public String getEstradas() {
		return null;
	}

	public String getCampos() {
		return null;
	}

	public String getCidades() {
		return null;
	}

	public String getMosteiros() {
		return null;
	}
	
	public String getPousadas(){
		return null;
	}

	public String relatorioTabuleiro() {
		return tabuleiro.toString();
	}
	
	public void adicionarCorJogador(Cor... sequencia ) {
		jogador = new Jogador[sequencia.length];
 		for (int i = 0; i < sequencia.length; ++i) {
 			jogador[i] = new Jogador(sequencia[i]);
 		}
	}
	
	public void seForNulo() {
		if(proximoTile == null) {
			statusPartida = Status.PARTIDA_FINALIZADA;
		}
	}
}
