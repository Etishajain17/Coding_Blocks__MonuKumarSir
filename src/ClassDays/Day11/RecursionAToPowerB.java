package ClassDays.Day11;

public class RecursionAToPowerB {
    public static int powerAToB(int a,int b,int res){
        if(b==0)
            return res;
        return powerAToB(a,b-1,a*res);          //tail recursion
    }

    public static void main(String[] args) {
        int a=10,b=3;
        System.out.println(powerAToB(a,b,1));
    }
}
