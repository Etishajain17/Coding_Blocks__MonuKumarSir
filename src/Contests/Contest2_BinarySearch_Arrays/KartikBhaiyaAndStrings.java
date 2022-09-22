package Contests.Contest2_BinarySearch_Arrays;

import java.util.Scanner;
/*
Kartik Bhaiya has a string consisting of only 'a' and 'b' as the characters. Kartik Bhaiya describes perfectness of a
string as the maximum length substring of equal characters. Kartik Bhaiya is given a number k which denotes the maximum
number of characters he can change. Find the maximum perfectness he can generate by changing no more than k characters.

Input Format
       The first line contains an integer denoting the value of K. The next line contains a string having only ‘a’ and
       ‘b’ as the characters.

Constraints
    2 ≤ N ≤ 10^6

Output Format
    A single integer denoting the maximum perfectness achievable.

Sample Input
    2
    abba

Sample Output
    4

Explanation
    We can swap the a's to b using the 2 swaps and obtain the string "bbbb". This would have all the b's and hence the answer 4.
    Alternatively, we can also swap the b's to make "aaaa". The final answer remains the same for both cases.
 */
public class KartikBhaiyaAndStrings {
    public static int perfectnessOfString(String str,char ch,int k){
        int si=0,ei=0,ans=0,flip=0;
        while(ei<str.length())
        {
            if(str.charAt(ei)==ch)
                flip++;
            while(flip>k){
                if(str.charAt(si)==ch)
                    flip--;
                si++;
            }
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        String str=sc.next();
        int flipa=perfectnessOfString(str,'a',k);
        int flipb=perfectnessOfString(str,'b',k);
        System.out.println(Math.max(flipa,flipb));
    }
}
