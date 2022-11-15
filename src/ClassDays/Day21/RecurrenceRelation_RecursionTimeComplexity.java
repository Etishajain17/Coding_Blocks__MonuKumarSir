package ClassDays.Day21;
/*
Factorial,Fibonacci,Merge Sort,Binary Search

All in Day11 --> O(n)
Fibonacci--> 2^0 + 2^1 + .... + 2^h = 2^0(2^(h+1)-1)/2-1 = 2^h+1 -1 = 2^h =2^n
iff from one node going m calls then m^n complexity.

Fibonacci
F(n)=F(n-1)+F(n-2)
T(n)=T(n-1)+T(n-2)+1
T(n-1)=T(n-2)+T(n-3)+1
.......
.......
T(3)=T(2)+T(1)+1
T(2)=T(1)+T(0)+1
T(1)=1
T(0)=1

T(n)=T(n-1)+T(n-2)+1
T(n-1)+T(n-2)<T(n-1)+T(n-1)
T(n)=T(n-1)+T(n-1)+1
T(n)=2*T(n-1)+1
2*T(n-1)=2*T(n-2)*2+1*2
2^2T(n-2)=2*T(n-3)*2^2+1*2^2
.....
.....
2^(n-1)*T(1)=1*2^n-1
T(n)=2^0 + 2^1 + .... + 2^n-1=2^n -1 =2^n


Factorial && Power && ..
T(n)=T(n-1)+1
T(n-1)=T(n-2)+1
.........
.........
T(n)=1+1+....1(n times)
T(n)=n

Merge Sort
T(n)=T(n/2)+T(n/2)+n
(2^1)T(n)=2*T(n/2)+n
T(n/2)=2*T(n/4)+n/2
T(n/4)=2*T(n/8)+n/4
.....
.....
2^k*T(1)=(n/2^k)*2^k
2^k=n
k=logn
T(n)=n*k
T(n)=nlogn
 */
public class RecurrenceRelation_RecursionTimeComplexity {
    public static void main(String[] args) {
        System.out.println("...");
    }
}