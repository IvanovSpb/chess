package chess;

import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.setupDefaultPiecesPositions();

//        BoardConsoleRenderer renderer = new BoardConsoleRenderer();
//        renderer.render(board);
//
//        Piece piece = board.getPiece(new Coordinates(File.G, 8));
//        Set<Coordinates> availableMoveSquares = piece.getAvailableMoveSquares(board);

        Game game = new Game(board);
        game.gameLoop();

    }
}