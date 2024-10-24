package chess;

import java.util.Set;
import java.util.TreeSet;

public class Game {
    private final Board board;

    private BoardConsoleRenderer renderer = new BoardConsoleRenderer();

    public Game(Board board) {
        this.board = board;
    }


    public void gameLoop() {
        boolean isWhiteTrue = true;

        while (true) {
            // render
            renderer.render(board);

            if (isWhiteTrue) {
                System.out.println("White to move");
            } else {
                System.out.println("Black to move");
            }
            //input
            Coordinates sourceCoordinates = InputCoordinates.inputPieceCoordinatesForColor(
                    isWhiteTrue ? Color.WHITE : Color.BLACK, board
            );
            Piece piece = board.getPiece(sourceCoordinates);
            Set<Coordinates> availableMoveSquares = piece.getAvailableMoveSquares(board);

            renderer.render(board, piece);
            Coordinates targetCoordinates = InputCoordinates.inputAvailableSquare(availableMoveSquares);
            //make move
            board.movePiece(sourceCoordinates, targetCoordinates);

            //pass move
            isWhiteTrue = !isWhiteTrue;
        }
    }
}
