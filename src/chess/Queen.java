package chess;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Queen extends LongRangePiece implements IBishop, IRook {
    public Queen(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    protected Set<CoordinatesShift> getPiceMoves() {
        Set<CoordinatesShift> moves = getBishopMoves();
        moves.addAll(getRookMoves());
        return moves;
    }
}
