package ClassDays.Day20;
/*
Prime Sieve Algorithm or Sieve of Eratosthenes is an algorithm that searches for all prime numbers in the given limit.
This algorithm is very simple to compute the prime number.

n/2 + n/3 + n/5 + n/7 + ......+ n/11 + ....=log2(log(n))
nloglogn = n (approx.)

n=1024  log2log2(2^10)= log10 = 2.3 = n (approx.)
 */

public class PrimeSieveAlgorithm {
    public static void main(String[] args) {
        int n=100;
        primeSieve(n);
    }

    public static void primeSieve(int n){
        // kisi Index pe false set h too vo prime number consider krna h
        // kisi Index pe true set h too vo not prime number consider krna h
        boolean[] arr=new boolean[n+1];
        arr[0]=true;
        arr[1]=true;

        for (int i = 2; i*i < arr.length; i++) {
            if(arr[i]==false){
                for (int j = 2; i*j <=n ; j++) {
                    arr[i*j]=true;  //not prime set kiye ho
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==false)
                System.out.print(i+" ");
        }
    }
}
