/**
 * Simulates basic piece movement validation for Chess (Pawn, King, Rook).
 */
public class ChessLogicBasic {
    private static final int SIZE = 8;

    public static boolean isValidRookMove(int x1, int y1, int x2, int y2) {
        // Rook moves horizontally or vertically
        return (x1 == x2 || y1 == y2) && (x1 != x2 || y1 != y2);
    }

    public static boolean isValidKingMove(int x1, int y1, int x2, int y2) {
        // King moves one square in any direction
        return Math.abs(x1 - x2) <= 1 && Math.abs(y1 - y2) <= 1 && (x1 != x2 || y1 != y2);
    }

    public static boolean isValidPawnMove(int x1, int y1, int x2, int y2, boolean isWhite) {
        // Simple pawn move: one forward
        if (isWhite) {
            return x2 == x1 && y2 == y1 + 1;
        } else {
            return x2 == x1 && y2 == y1 - 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Basic Chess Move Validator ---");

        System.out.println("Rook (0,0) to (0,5): " + isValidRookMove(0, 0, 0, 5));
        System.out.println("Rook (0,0) to (5,5): " + isValidRookMove(0, 0, 5, 5));

        System.out.println("King (4,4) to (5,5): " + isValidKingMove(4, 4, 5, 5));
        System.out.println("King (4,4) to (6,6): " + isValidKingMove(4, 4, 6, 6));

        System.out.println("White Pawn (1,1) to (1,2): " + isValidPawnMove(1, 1, 1, 2, true));
        System.out.println("Black Pawn (1,7) to (1,6): " + isValidPawnMove(1, 7, 1, 6, false));
    }
}
