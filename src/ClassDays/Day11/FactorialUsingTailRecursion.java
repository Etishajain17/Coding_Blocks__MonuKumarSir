package ClassDays.Day11;

public class FactorialUsingTailRecursion {
    public static int fact(int n,int res){
        if(n==0)
            return res;
        return fact(n-1,n*res);             //tail recursion
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n,1));
    }
}
