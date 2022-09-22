package ClassDays.Day11;

/*
    In print N to1 , recursion is upfall as answer is getting calculated on the up side


    Tail Recursion -->last statement is return then tail recursion and no calculation after recursion.
 */
public class NTo1Recursion {
    public static void printNto1(int n){
        if(n==0)
            return ;
        System.out.println(n);
        printNto1(n-1);                              //tail recusrion
    }

    public static void main(String[] args) {
        int n=5;
        printNto1(n);
    }
}
