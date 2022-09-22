package ClassDays.Day12;

/*
n=3 (HHH(NO),HHT(NO),HTH,HTT,THH(NO),THT,TTH,TTT)


                           (ques),(ans)
                                3,-
                        /               \
                    2,H                  2,T
                 /      \              /      \
               NA       1,HT        1,TH       1,TT
                       /    \     /    \      /    \
                   0,HTH  0,HTT  NA  0,THT  0,TTH  0,TTT
 */
public class RecursionAllPossibilitiesOfHeadAndTailForNButNotTwoConsecutiveHead {
    public static void printNoTwoConsecutiveHead(int n,String ans) {
        if(n == 0) {
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H')
            printNoTwoConsecutiveHead(n-1,ans+'H');
        printNoTwoConsecutiveHead(n-1,ans+'T');
    }

    public static void main(String[] args) {
        int n=3;
        printNoTwoConsecutiveHead(n,"");
    }
}
