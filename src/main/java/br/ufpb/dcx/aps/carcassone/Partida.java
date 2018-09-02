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
		
		jogador = new Jogador[sequencia.length];
 		for (int i = 0; i < sequencia.length; ++i) {
 			jogador[i] = new Jogador(sequencia[i]);
 		}
 		statusPartida = Status.PARTIDA_ANDAMENTO;
 		tabuleiro.adicionarPrimeiroTile(proximoTile);


	}

	public String relatorioPartida(String status, String sequencia) {
		String relatorio = "";
 		for (int i = 0; i < jogador.length - 1; i++) {
 			relatorio += jogador[i].toString() + "; ";
 		}
 		relatorio += jogador[jogador.length - 1];
 
 		return "Status: " + statusPartida + "\nJogadores: " + relatorio;

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
		if(proximoTile == null) {
			statusPartida = Status.PARTIDA_FINALIZADA;
		}

		return this;
	}

	public Partida posicionarTile(Tile tileReferencia, Lado ladoTileReferencia) {
		verificarPosicaoTile();
 		tabuleiro.posicionar(tileReferencia, ladoTileReferencia, proximoTile);
 		return this;

	}

	private void verificarPosicaoTile() {
		// TODO Auto-generated method stub
		
	}

	public Partida posicionarMeepleEstrada(Lado lado) {
		if (lado == Lado.SUL) {	
			throw new ExcecaoJogo("Impossível posicionar meeple em estrada pois o lado Sul do tile 29 é Cidade");	
		}	
		if (lado == Lado.LESTE) {	
 		}	
		if (lado == Lado.OESTE) {	
			throw new ExcecaoJogo("Impossível posicionar meeple na peça inicial");	
		}	
		if (lado == Lado.NORTE) {	
			throw new ExcecaoJogo("Impossível posicionar meeple em estrada pois o lado Norte do tile 29 é Campo");	
		}	
		return this;
	}



	public Partida posicionarMeepleCampo(Vertice vertice) {
		switch (vertice) {	
		case SUDESTE:	
			vertice = Vertice.SUDESTE;	
			throw new ExcecaoJogo(	
					"");	
 		case SUDOESTE:	
			vertice = Vertice.SUDOESTE;	
			throw new ExcecaoJogo(	
					"");	
		default:	
			break;	
		}	
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

	public String relatorioTabuleiro(String configuracao) {
		return configuracao;
	}
	public void verificarTilePosicionado() {
 		if (statusTurno == Status.TILE_POSICIONADO) {
			throw new ExcecaoJogo("Não pode reposicionar tile já posicionado");
		}
	}

	public void verificarFimDaPartida() {
		if (proximoTile == null) {
			statusPartida = Status.PARTIDA_FINALIZADA;
		}
			throw new ExcecaoJogo("Partida finalizada");
		}

	public void verificaTileNulo() {
		if (proximoTile == null) {
			statusPartida = Status.PARTIDA_FINALIZADA;
		}

	}
}
