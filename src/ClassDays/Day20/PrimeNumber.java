package ClassDays.Day20;
/*
2 -> n-1
2 -> n/2

               n=a*b
      /         |         \
   a==b        a>b         a<b
(a=b=sqrt(n))  (b<sqrt(n)) (a<sqrt(n))

2 -> sqrt(n)

If we need to print from 1 to n then we will keep this code inside loop so complexity ->O(n*(sqrt n))
 */
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(37));
    }
    public static boolean isPrime(int n){
        int div=2;
        while(div*div<=n){
            if(n%div==0)
                return false;
            div++;
        }
        return true;
        //O(sqrt(n))
    }
}
