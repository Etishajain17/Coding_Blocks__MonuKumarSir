package ClassDays.Day19;
/*
    To find time and space Complexity
    - Asymtotic Notation
    - Experimental Notation

        Experimental Way
        (Note the system start time and end time and subtarct both)--> depending upon system changes

    Hardware dependent--> Experimental
    Hardware independent--> Asymtotic
 */
public class TimeAndSpaceComplexity {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {

        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);

    }
}
/*
        Asymtotic Notation
        - best case  --> omega f(n)>= c.g(n)    omega(g(n))=f(n)
        - average case  --> theta
        - worst case  --> Big oh f(n)<= c.g(n)   O(g(n))=f(n)  strictly upper bound

        t(time) vs n(size of code) graph
 */