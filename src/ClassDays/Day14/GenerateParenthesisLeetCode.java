package ClassDays.Day14;

import java.util.*;
/*
Open and closed less than n and close must be less than open for close to come
                     ----
                   /      \
                (---       N
               /    \
            ((--     ()--
           /  \      /  \
          N (()-   ()(-  N
            / \    / \
           N (()) N   ()()
 */
public class GenerateParenthesisLeetCode {
    public static List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<String>();
        generate("",0,0,n,list);
        return list;
    }
    public static void generate(String ans,int open, int close, int n,List<String> list){
        if(open==n && close==n){
            list.add(ans);
            return;
        }
        if(open<n)
            generate(ans+"(",open+1,close,n,list);
        if(close<open)
            generate(ans+")",open,close+1,n,list);
    }

    public static void main(String[] args) {
        int n=3;
        List<String> list=generateParenthesis(n);
        System.out.println(list);
    }
}
