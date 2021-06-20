public class Rook extends Piece implements ChessPiece{

    public Rook(int row, int column, boolean isWhite){
        super(row, column, "Rook", isWhite);
    }

    @Override
    public boolean canMove(int row, int col) {
        if(row > 9 || col > 9){
            return false;
        }
        int currentRow = this.getRow();
        int currentCol = this.getColumn();
         if(currentRow == row || currentCol == col){
            return true;
        }else{
            return false;
        }
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