package chess;

import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Board board = new Board();
//        board.setupDefaultPiecesPositions();

        Board board = (new BoardFactory()).fromFEN(//"rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1"
                "3k4/6r1/8/1P2Q3/2B5/6P1/2R1r3/3K4 w - - 0 1" );

        BoardConsoleRenderer renderer = new BoardConsoleRenderer();
//        renderer.render(board);

//        Piece piece = board.getPiece(new Coordinates(File.G, 8));
//        Set<Coordinates> availableMoveSquares = piece.getAvailableMoveSquares(board);

        Game game = new Game(board);
        game.gameLoop();

    }
}