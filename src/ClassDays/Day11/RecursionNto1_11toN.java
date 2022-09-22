package ClassDays.Day11;

public class RecursionNto1_11toN {
    public static void printNto1_1toN(int n){
        if(n==0)
            return ;
        System.out.println(n);
        printNto1_1toN(n-1);
        System.out.println(n);                     //head recursion
    }

    public static void main(String[] args) {
        int n=5;
        printNto1_1toN(n);
    }
}
