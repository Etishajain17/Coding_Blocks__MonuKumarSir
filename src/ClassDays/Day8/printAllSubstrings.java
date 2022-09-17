package ClassDays.Day8;

import java.util.Scanner;

public class printAllSubstrings {
    public static void SubString(String str){
        for(int len=1;len<=str.length();len++){
            for (int j = len; j <=str.length() ; j++) {
                int i=j-len;
                System.out.println(str.substring(i,j));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        SubString(s);
    }
}
