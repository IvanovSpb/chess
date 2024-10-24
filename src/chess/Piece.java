package chess;

import java.util.HashSet;
import java.util.Set;

abstract public class Piece {
    public Color color;
    public Coordinates coordinates;

    public Piece(Color color, Coordinates coordinates) {
        this.color = color;
        this.coordinates = coordinates;
    }

    public Set<Coordinates> getAvailableMoveSquares(Board board) {
        Set<Coordinates> result = new HashSet<>();

        for (CoordinatesShift shift : getPiceMoves()) {
            if (coordinates.canShift(shift)){
                Coordinates newCoordinates = coordinates.shift(shift);

                if(isSquareAvailableForMove(newCoordinates, board)){
                    result.add(newCoordinates);
                }
            }
        }
        return result;

    }

    protected boolean isSquareAvailableForMove(Coordinates coordinates, Board board) {
        return board.isSquareEmpty(coordinates) || board.getPiece(coordinates).color != color;
    }

    protected abstract Set<CoordinatesShift> getPiceMoves();


}
