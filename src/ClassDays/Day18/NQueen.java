package ClassDays.Day18;

public class NQueen {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        NQueenPrblm(board,n,0);
    }

    public static void NQueenPrblm(boolean[][] board,int tq,int row){
        if(tq==0){
            Display(board);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board,row,col)==true){
                board[row][col]=true;
                NQueenPrblm(board,tq-1,row+1);
                board[row][col]=false;
            }
        }
    }

    public static boolean isSafe(boolean[][] board,int row,int col){
        int r=row;
        //vertical
        while(r>=0){
            if(board[r][col]==true){
                return false;
            }
            r--;
        }

        //Left Diagonal
        r=row;
        int c=col;
        while(r>=0 && c>=0){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c--;
        }

        //Right Diagonal
        r=row;
        c=col;
        while(r>=0 && c<board.length){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }

    public static void Display(boolean[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}