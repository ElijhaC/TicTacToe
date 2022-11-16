package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        if (this.matrix[0][0] == 'X' && this.matrix[0][1] == 'X' && this.matrix[0][2] == 'X')
            return true;
        if (this.matrix[1][0] == 'X' && this.matrix[1][1] == 'X' && this.matrix[1][2] == 'X')
            return true;
        if (this.matrix[2][0] == 'X' && this.matrix[2][1] == 'X' && this.matrix[2][2] == 'X')
            return true;
        if (this.matrix[0][0] == 'X' && this.matrix[1][0] == 'X' && this.matrix[2][0] == 'X')
            return true;
        if (this.matrix[0][1] == 'X' && this.matrix[1][1] == 'X' && this.matrix[2][1] == 'X')
            return true;
        if (this.matrix[0][2] == 'X' && this.matrix[1][2] == 'X' && this.matrix[2][2] == 'X')
            return true;
        if (this.matrix[0][0] == 'X' && this.matrix[1][1] == 'X' && this.matrix[2][2] == 'X')
            return true;
        if (this.matrix[0][2] == 'X' && this.matrix[1][1] == 'X' && this.matrix[2][0] == 'X')
            return true;
        return false;
    }

    public Boolean isInFavorOfO() {
        if (this.matrix[0][0] == 'O' && this.matrix[0][1] == 'O' && this.matrix[0][2] == 'O')
            return true;
        if (this.matrix[1][0] == 'O' && this.matrix[1][1] == 'O' && this.matrix[1][2] == 'O')
            return true;
        if (this.matrix[2][0] == 'O' && this.matrix[2][1] == 'O' && this.matrix[2][2] == 'O')
            return true;
        if (this.matrix[0][0] == 'O' && this.matrix[1][0] == 'O' && this.matrix[2][0] == 'O')
            return true;
        if (this.matrix[0][1] == 'O' && this.matrix[1][1] == 'O' && this.matrix[2][1] == 'O')
            return true;
        if (this.matrix[0][2] == 'O' && this.matrix[1][2] == 'O' && this.matrix[2][2] == 'O')
            return true;
        if (this.matrix[0][0] == 'O' && this.matrix[1][1] == 'O' && this.matrix[2][2] == 'O')
            return true;
        if (this.matrix[0][2] == 'O' && this.matrix[1][1] == 'O' && this.matrix[2][0] == 'O')
            return true;
        return false;
    }

    public Boolean isTie() {
        if (isInFavorOfO() == false && isInFavorOfX() == false)
            return true;
        return false;
    }

    public String getWinner() {
        if (isInFavorOfX())
            return "X";
        if (isInFavorOfO())
            return "O";
        return "";
    }

}
