package chess;

import java.util.Set;

public class Rook extends Piece{
    public Rook(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    protected Set<CoordinatesShift> getPiceMoves() {
        return Set.of();
    }
}
