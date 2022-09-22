package ClassDays.Day12;
/*
Not Added in ans when we function call it doesn't change in original
 */
/*
n=3 (HHH,HHT,HTH,HTT,THH,THT,TTH,TTT)


                          (ques),(ans)
                               3,-
                        /               \
                    2,H                  2,T
                 /      \              /      \
            1,HH       1,HT        1,TH       1,TT
           /    \     /    \     /    \      /    \
       0,HHH 0,HHT 0,HTH 0,HTT 0,THH 0,THT 0,TTH 0,TTT
 */
public class RecursionAllPossibilitiesOfHeadAndTailForN {
    public static void printHeadAndTail(int n,String ans) {
        if(n == 0) {
            System.out.println(ans);
            return;
        }
        printHeadAndTail(n-1,ans+'H');
        printHeadAndTail(n-1,ans+'T');
    }

    public static void main(String[] args) {
        int n=3;
        printHeadAndTail(n,"");
    }
}
