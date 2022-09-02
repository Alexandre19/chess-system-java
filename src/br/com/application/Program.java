package br.com.application;

import br.com.chess.ChessMatch;


public class Program {

	public static void main(String[] args) {
	
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());

	}
	
	
}
