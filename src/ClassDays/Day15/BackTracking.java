package ClassDays.Day15;

/*
Permutation & Combination  --->  backtracking

Queen Permutation
There is a board of size 4 and then put queens and print all permutations

All before question we did implicit backtrack
It doesn't happen when recusrion can't undo those like in array or more.



 */
public class BackTracking {
    public static void main(String[] args) {
        int n=4;
        int tq=2;
        boolean[] board=new boolean[n];
        PrintQueenPermutation(board,tq,0,"");
    }
    public static void PrintQueenPermutation(boolean[] board, int tq,int qpsf,String ans){
        if(qpsf==tq){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if(board[i]==false){
                board[i]=true;
                PrintQueenPermutation(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf);
                board[i]=false; //backtrack statement
            }

//            if(board[i]==false){
//                board[i]=true;
//                qpsf++;
//                PrintQueenPermutation(board,tq,qpsf,ans+"b"+i+"q"+(qpsf-1));
//                board[i]=false; //backtrack statement
//                qpsf--;   //backtrack statement
//            }
        }
    }
}
