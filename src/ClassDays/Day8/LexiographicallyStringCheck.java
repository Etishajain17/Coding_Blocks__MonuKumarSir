package ClassDays.Day8;

public class LexiographicallyStringCheck {
    public static int isCompareTo(String str1,String str2){
        int i=0,j=0;
        while(i<str1.length() && j<str2.length())
        {
            if(str1.charAt(i)>str2.charAt(j))
                return str1.charAt(i)-str2.charAt(j);
            else if(str1.charAt(i)<str2.charAt(j))
                return str1.charAt(i)-str2.charAt(j);
            i++;
            j++;
        }
        return str1.length()-str2.length();
    }
    public static void main(String[] args) {
        String s1="h";
        String s2="hiiii";
        System.out.println(isCompareTo(s1,s2));
        String str1="Kunal";
        String str2="kunal";
        System.out.println(isCompareTo(str1,str2));
    }
}
