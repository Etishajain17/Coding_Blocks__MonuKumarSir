package ClassDays.Day17;

public class WrdSearchLeetCode {
    public static void main(String[] args) {
       char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
       String word="ABCCED";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]==word.charAt(0)) {
                    if(WordSearch(board, word, 0,i,j) == true) {
                        System.out.println(true);
                        return;
                    }
                }
            }
        }
        System.out.println(false);
    }
    private static boolean WordSearch(char[][] arr,String s,int idx,int cr,int cc){
//        if(idx==s.length()){
//            return true;
//        }
//        if (cr < 0 || cc < 0 || cr >= arr.length || cc >= arr[0].length){
//            return false;
//        }
//        boolean possible=false;
//        if(arr[cr][cc]==s.charAt(idx) || arr[cr][cc]==s.charAt(idx) || arr[cr][cc]==s.charAt(idx) || arr[cr][cc]==s.charAt(idx)){
//            char t=arr[cr][cc];
//            arr[cr][cc]='0';
//            possible=possible || WordSearch(arr,s,idx+1,cr,cc-1);
//            possible=possible || WordSearch(arr,s,idx+1,cr,cc+1);
//            possible=possible || WordSearch(arr,s,idx+1,cr-1,cc);
//            possible=possible || WordSearch(arr,s,idx+1,cr+1,cc);
//            arr[cr][cc]=t;
//        }
//        return possible;
        if(idx==s.length()){
            return true;
        }
        if (cr < 0 || cc < 0 || cr >= arr.length || cc >= arr[0].length || arr[cr][cc]!=s.charAt(idx)){
            return false;
        }
        arr[cr][cc]='*';
        int[] r={-1,1,0,0};
        int[] c={0,0,-1,1};
        boolean possible=false;
        for (int i = 0; i < c.length; i++) {
            possible=possible || WordSearch(arr,s,idx+1,cr+r[i],cc+c[i]);
        }
        arr[cr][cc]=s.charAt(idx);
        return possible;
    }
}
