package ClassDays.Day21;

public class PowerInLogNUsingRecursion {
    public static void main(String[] args) {
        System.out.println(power(3,9));
    }
    public static int power(int a,int b){
        if(b==0)
            return 1;
        int ans=power(a,b/2);
        ans=ans*ans;
        if(b%2==1)
            ans=ans*a;
        return ans;
    }
}
