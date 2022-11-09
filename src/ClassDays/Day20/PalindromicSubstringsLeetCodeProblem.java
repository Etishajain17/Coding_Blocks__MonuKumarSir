package ClassDays.Day20;
/*
Leetcode 647. Palindromic Substrings

time complexity is n^2
Using DP, spce complexity will be their od n^2
Axis-Orbit Concept(Monu bhaiya)
 */
public class PalindromicSubstringsLeetCodeProblem {
    public static void main(String[] args) {
        String s="nitin";
        System.out.println(countPalindromic(s));
    }
    public static int countPalindromic(String s){
        int count=0;

        //for odd length palindromes
        for (int axis = 0; axis < s.length(); axis++) {
            for (int orbit = 0; orbit < s.length() && axis-orbit>=0 && axis+orbit<s.length(); orbit++) {
                if(s.charAt(axis-orbit)!=s.charAt(axis+orbit))
                    break;
                count++;
            }
        }

        //for even length palindromes
        for (double axis = 0.5; axis < s.length(); axis++) {
            for (double orbit = 0.5; orbit < s.length() && axis-orbit>=0 && axis+orbit<s.length(); orbit++) {
                if(s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit)))
                    break;
                count++;
            }
        }

        return count;
    }
}
