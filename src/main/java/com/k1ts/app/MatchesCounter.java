package com.k1ts.app;

public class MatchesCounter {

    private final int squares;

    public MatchesCounter(int squares) {
        this.squares = squares;
    }

    public int countMatches() {
        return getMatches();
    }

    private int getCeilSide() {
        double sqrtSide = Math.sqrt(squares);

        if ((int) sqrtSide < sqrtSide) {
            return (int) sqrtSide + 1;
        }

        return (int) sqrtSide;
    }

    private int getCeilSquares() {
        int side = getCeilSide();
        return side * side;
    }

    private int getMatchesPerCeilSquares() {
        int ceilSide = getCeilSide();

        return 2 * ceilSide * (ceilSide + 1);
    }

    private int getMatches() {
        if (squares == getCeilSquares()) {
            return getMatchesPerCeilSquares();
        }

        int matchesPerCeilSquares = getMatchesPerCeilSquares();
        int ceilSquares = getCeilSquares();
        int negateSquares = ceilSquares - squares;
        int ceilSide = getCeilSide();

        if (negateSquares < ceilSide) {
            return matchesPerCeilSquares - 2 * negateSquares;
        }

        return matchesPerCeilSquares - 2 * (negateSquares - 1) - 3;
    }
}
