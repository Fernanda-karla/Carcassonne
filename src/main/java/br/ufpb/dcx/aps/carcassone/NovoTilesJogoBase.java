package br.ufpb.dcx.aps.carcassone;

import br.ufpb.dcx.aps.carcassone.tabuleiro.Tile;
import br.ufpb.dcx.aps.carcassone.tabuleiro.TipoTile;

public interface NovoTilesJogoBase {
	
	Cor AMARELO = Cor.AMARELO;
	Cor AZUL = Cor.AZUL;
	Cor PRETO = Cor.PRETO;
	Cor VERDE = Cor.VERDE;
	Cor VERMELHO = Cor.VERMELHO;

	Lado NORTE = Lado.NORTE;
	Lado LESTE = Lado.LESTE;
	Lado SUL = Lado.SUL;
	Lado OESTE = Lado.OESTE;
	
	Vertice NORDESTE = Vertice.NORDESTE;
	Vertice SUDESTE = Vertice.SUDESTE;
	Vertice SUDOESTE = Vertice.SUDOESTE;
	Vertice NOROESTE = Vertice.NOROESTE;
	
	Origem BASE = Origem.BASE;

	TipoLadoCarcassonne CAMPO = TipoLadoCarcassonne.CAMPO;
	TipoLadoCarcassonne CIDADE = TipoLadoCarcassonne.CIDADE;
	TipoLadoCarcassonne ESTRADA = TipoLadoCarcassonne.ESTRADA;
	
	Pousadas COM_POUSADA = Pousadas.COM_POUSADA;
	Pousadas SEM_POUSADA = Pousadas.SEM_POUSADA;
	
	boolean COM_ESCUDO = true;
	boolean SEM_ESCUDO = false;

	boolean COM_MOSTEIRO = true;
	boolean SEM_MOSTEIRO = false;

	Cidades UMA_CIDADE = Cidades.UMA_CIDADE;
	Cidades DUAS_CIDADES = Cidades.DUAS_CIDADES;
	Cidades TRES_CIDADES = Cidades.TRES_CIDADES;
	Cidades QUATRO_CIDADES = Cidades.QUATRO_CIDADES;
	Cidades SEM_CIDADES = Cidades.SEM_CIDADES;
	
	//1 peça
	TipoTile RRTTL50 = new TipoTileCarcassonneComPousada(BASE, CIDADE, ESTRADA, CIDADE, ESTRADA, SEM_ESCUDO, SEM_MOSTEIRO, DUAS_CIDADES, SEM_POUSADA);
	//2 peça
	TipoTile RRRT50 = new TipoTileCarcassonneComPousada(BASE, CAMPO, ESTRADA, CAMPO, ESTRADA, SEM_ESCUDO, SEM_MOSTEIRO, SEM_CIDADES, COM_POUSADA);
	//3 PEÇA
	TipoTile FFRR50 = new TipoTileCarcassonneComPousada(BASE, ESTRADA, CAMPO, CAMPO, ESTRADA, SEM_ESCUDO, SEM_MOSTEIRO, SEM_CIDADES, COM_POUSADA);
	//4 PEÇA
	TipoTile SSSLC50 = new TipoTileCarcassonneComPousada(BASE, CIDADE, CIDADE, ESTRADA, CAMPO, SEM_ESCUDO, SEM_MOSTEIRO, UMA_CIDADE, SEM_POUSADA);
	//5 PEÇA
	TipoTile STRFC50 = new TipoTileCarcassonneComPousada(BASE, CIDADE, ESTRADA, CIDADE, ESTRADA, COM_ESCUDO, SEM_MOSTEIRO, UMA_CIDADE, SEM_POUSADA);
	//6 PEÇA
	TipoTile RCFFT50 = new TipoTileCarcassonneComPousada(BASE, CAMPO, CIDADE , CAMPO, ESTRADA, SEM_ESCUDO, SEM_MOSTEIRO, UMA_CIDADE, SEM_POUSADA);
	//7 PEÇA
	TipoTile FCFR50 = new TipoTileCarcassonneComPousada(BASE, ESTRADA, CIDADE, CIDADE, ESTRADA, COM_ESCUDO, SEM_MOSTEIRO, UMA_CIDADE, COM_POUSADA);
	//8 PEÇA
	TipoTile CFRT50 = new TipoTileCarcassonneComPousada(BASE, ESTRADA, CIDADE, CAMPO, ESTRADA, SEM_ESCUDO, SEM_MOSTEIRO, UMA_CIDADE, COM_POUSADA);
	//9 PEÇA
	TipoTile DFRC50 = new TipoTileCarcassonneComPousada(BASE, CIDADE, CIDADE, CAMPO, ESTRADA, SEM_ESCUDO, SEM_MOSTEIRO, UMA_CIDADE, COM_POUSADA);
	//10 PEÇA
	TipoTile RRTFD50 = new TipoTileCarcassonneComPousada(BASE, CIDADE, CIDADE, CIDADE, CIDADE, SEM_ESCUDO, SEM_MOSTEIRO, QUATRO_CIDADES, SEM_POUSADA);
	//11 PEÇA
	TipoTile SSFFT50 = new TipoTileCarcassonneComPousada(BASE, CIDADE, CIDADE, CIDADE, CAMPO, COM_ESCUDO, SEM_MOSTEIRO, DUAS_CIDADES, SEM_POUSADA);
	//12 PEÇA
	TipoTile CCFRS50 = new TipoTileCarcassonneComPousada(BASE, CIDADE, CIDADE, CIDADE, CAMPO, SEM_ESCUDO, SEM_MOSTEIRO, TRES_CIDADES, SEM_POUSADA);
	//13 PEÇA
	TipoTile CFSFT50 = new TipoTileCarcassonneComPousada(BASE, CAMPO, CAMPO, CAMPO, CAMPO, SEM_ESCUDO, SEM_MOSTEIRO, SEM_CIDADES, SEM_POUSADA);
	//14 PEÇA
	TipoTile FFRRT50 = new TipoTileCarcassonneComPousada(BASE, CAMPO, CAMPO, CAMPO, CAMPO, SEM_ESCUDO, SEM_MOSTEIRO, SEM_CIDADES, SEM_POUSADA);
	//15 PEÇA
	TipoTile FFFF50 = new TipoTileCarcassonneComPousada(BASE, ESTRADA, CAMPO, ESTRADA, ESTRADA, SEM_ESCUDO, SEM_MOSTEIRO, SEM_CIDADES, COM_POUSADA);
	//16 PEÇA
	TipoTile RRFTL50 = new TipoTileCarcassonneComPousada(BASE, CIDADE, CIDADE, CAMPO, CAMPO, SEM_ESCUDO, SEM_MOSTEIRO, UMA_CIDADE, SEM_POUSADA);
	//17 PEÇA
	TipoTile FRFST50 = new TipoTileCarcassonneComPousada(BASE, CAMPO, ESTRADA, CAMPO, ESTRADA, SEM_ESCUDO, COM_MOSTEIRO, SEM_CIDADES, SEM_POUSADA);
	//18 PEÇA
	TipoTile CCFTR50 = new TipoTileCarcassonneComPousada(BASE, ESTRADA, ESTRADA, ESTRADA, ESTRADA, SEM_ESCUDO, SEM_MOSTEIRO, SEM_CIDADES, SEM_POUSADA);
	
	
	Tile t73 = new Tile("73", RRTTL50);
	Tile t74 = new Tile("74", RRRT50);
	Tile t75 = new Tile("75", FFRR50);
	Tile t76 = new Tile("76", SSSLC50);
	Tile t77 = new Tile("77", STRFC50);
	Tile t78 = new Tile("78", RCFFT50);
	Tile t79 = new Tile("79", FCFR50);
	Tile t80 = new Tile("80", CFRT50);
	Tile t81 = new Tile("81", DFRC50);
	Tile t82 = new Tile("82", RRTFD50);
	Tile t83 = new Tile("83", SSFFT50);
	Tile t84 = new Tile("84", CCFRS50);
	Tile t85 = new Tile("85", CFSFT50);
	Tile t86 = new Tile("86", CFSFT50);
	Tile t87 = new Tile("87", FFRRT50);
	Tile t88 = new Tile("88", FFFF50);
	Tile t89 = new Tile("89", RRFTL50);
	Tile t90 = new Tile("90", FRFST50);
	Tile t91 = new Tile("91", CCFTR50);
}
