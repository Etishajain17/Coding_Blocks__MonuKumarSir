package ClassDays.Day14;

/*
OOR--> Out Of Range
                0
             /    \
            1      9
          /  \   /  \
        10   19 90   99
       / \
    100  109
    / \   |
1000 OOR 00R
 */
public class LexicographicalNumbersLeetCode {
    public static void generateLexicographical(int curr,int n){
        if(curr>n)
            return;
        System.out.println(curr+" ");
        int i=0;
        if(curr==0)
            i=1;
        for (; i <= 9; i++) {
            generateLexicographical(curr*10+i,n);
        }
    }
    public static void main(String[] args) {
        generateLexicographical(0,1000);
    }
}
