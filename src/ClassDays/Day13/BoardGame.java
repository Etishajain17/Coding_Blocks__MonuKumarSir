package ClassDays.Day13;

/*
face of dice =3 i.e. 1,2,3 possible
print all possible ways to reach a value
eg. 4
{1111,112,121,211,13,31,22}

                                     0
                   /                 |                 \
                  1                  2                  3
            /     |    \      /      |     \      /     |     \
           2      3     4    3       4      N    4      N      N
        / | \   / | \      / | \
       3  4  N 4  N  N    4  N  N
     /|\
    4 N N
 */
public class BoardGame {
    public static void printPath(int curr,int end,String ans){
        if(curr==end){
            System.out.println(ans);
            return;
        }
        if(curr>end){
            return;
        }
//        printPath(curr+1,end,ans+1);
//        printPath(curr+2,end,ans+2);
//        printPath(curr+3,end,ans+3);
        for (int dice = 1; dice <end; dice++) {
            printPath(curr+dice,end,ans+dice);
        }
    }
    public static void main(String[] args) {
        int n=4;
        printPath(0,n,"");
    }
}
