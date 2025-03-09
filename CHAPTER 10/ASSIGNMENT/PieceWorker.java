
package Chapter_10.Assignment;


public class PieceWorker extends Employe {
    private final double wage;  // Wage per piece
    private final int pieces;    // Number of pieces produced

    public PieceWorker(String name, String ssn, double wage, int pieces) {
        super(name, ssn);
        this.wage = wage;
        this.pieces = pieces;
    }

    @Override
    public double earnings() {
        return wage * pieces; // Calculate earnings
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%nWage per piece: %.2f%nPieces produced: %d", wage, pieces);
    }
}