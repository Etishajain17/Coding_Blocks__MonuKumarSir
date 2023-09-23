package ClassDays.Day56;

//https://hack.codingblocks.com/app/contests/2883/281/problem
//It's Valentine's Day in Russia today. as we all know number of girls in Russia is more than number of boys 😜
// hence boys have an extra advantage while choosing girl for the valentine evening. Each boy has certain number of
// chocolates and each girl has certain number of candies. Now you being the anchor of evening wants to pair all the
// boys with girls such that the sum of absolute difference between boy's chocolate and girl's candy in a pair is minimized.
// Ofcourse some of the girls will remain unpaired but that's okay as we are in Russia 😜
//
//  Input Format
//     The first line consists of two integers N and M. then follow N integers in second line. Then follow M integers in third line. M >= N
//
//  Constraints
//     1 <= N <= 5000
//     1 <= M <= 5000
//     M >= N
//     1 <= chocolates <= 1000000
//     1 <= candies <= 1000000
//
//  Output Format
//     The only line which consists of required sum of absolute differences.
//
//  Sample Input
//     2 5
//     4 5
//     1 2 3 4 5
//   Sample Output
//     0
//
//    Explanation
//      we can pair boy numbered 1 with girl numbered 4 and boy numbered 2 with girl numbered 5


//cant apply greedy because
//eg.  7  8
//     1  10  18
//so we cnt sort and apply greedy

//but we need to sort because
//2 11 3
//5 7  3 2

//select or reject for a boy choice


import java.util.Arrays;

public class ValentineMagicLeetcodeProblem {
    public static void main(String[] args) {
        int[] boys={2,11,3};
        int[] girls={5,7,3,2};
        Arrays.sort(boys);
        Arrays.sort(girls);
        System.out.println(minDiff(boys,girls,0,0));
    }
    public static int minDiff(int[] boys,int[] girls,int i,int j){
        if (i==boys.length){
            return 0;
        }
        if (j==girls.length){
            return 10000000;
        }
        int pair= Math.abs(boys[i]-girls[j])+minDiff(boys,girls,i+1,j+1);
        int noPair=minDiff(boys,girls,i,j+1);
        return Math.min(pair,noPair);
    }

}
