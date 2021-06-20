public class King extends Piece implements ChessPiece{

    public King(int row, int column, boolean isWhite){
        super(row, column, "King", isWhite);
    }

    @Override
    public boolean canMove(int row, int col) {
        if(row > 9 || col > 9){
            return false;
        }
       int currentRow = this.getRow();
        int currentCol = this.getColumn();
        return Math.abs(row - currentRow) <= 1 || Math.abs(col - currentCol) <= 1;
    }

    @Override
    public boolean canKill(int row, int col) {
        if(canMove(row, col)){
           return true;
        }else{
            return false;
        }
    }
}