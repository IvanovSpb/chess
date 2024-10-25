package chess;

public abstract class GameStateChecker {
    protected abstract GameState check(Board board, Color color);
}
