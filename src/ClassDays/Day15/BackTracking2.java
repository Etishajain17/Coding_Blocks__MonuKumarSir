package ClassDays.Day15;

public class BackTracking2 {
    public static void main(String[] args) {
        int n=5;
        int tq=3;
        boolean[] board=new boolean[n];
        PrintQueenCombination(board,tq,0,"",0);
    }
    public static void PrintQueenCombination(boolean[] board, int tq,int qpsf,String ans,int j) {
        if (qpsf == tq) {
            System.out.println(ans);
            return;
        }
        for (int i = j; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true;
                PrintQueenCombination(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf,i+1);
                board[i] = false; //backtrack statement
            }
            // j for not repeating the same value
        }
//        for (int i = j; i < board.length; i++) {
//            if (board[i] == false) {
//                board[i] = true;
//                PrintQueenCombination(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf,j);
//                board[i] = false; //backtrack statement
//            }
//            j++;       // for not repeating the same value
//        }
    }
}
