package ClassDays.Day11;

/*
    Recursion is just like PMI
    smaller problem , its answer and self work , then bigger problem solved
    base case

    Primitive Datatypes and func call --> Stack Memory
    Non-Primitive Datatypes --> Heap Memory

    Stack Memory full(~ 10^4 calls run in stacks approx.) if we didn't provide base case and so function calls
    exceeded(became more than 10^4 )


    In factorial, recursion is downfall as answer is getting calculated on the down side
 */
public class Recursion {
    public static int fact(int n){
        if(n==0)
            return 1;
        int fn=fact(n-1);
        return n*fn;                           //head recursion
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(fact(n));
    }
}
