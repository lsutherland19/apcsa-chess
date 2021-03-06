public class Queen extends Piece implements ChessPiece{

    public Queen(int row, int column, boolean isWhite){
        super(row, column, "Queen", isWhite);
    }

    @Override
    public boolean canMove(int row, int col) {
        if(row > 9 || col > 9) {
            return false;
        }
        int currentRow = this.getRow();
        int currentCol = this.getColumn();
      if(currentRow == row || currentCol == col || (Math.abs(currentRow-row) == Math.abs(currentCol - col))){
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