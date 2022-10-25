package ClassDays.Day15;
/*
                (2,3,5,7) =10
 Print no of permutation of coins to combine a total . Coins are avialable in plenty.
 */
public class BackTracking3 {
    public static void main(String[] args) {
        int[] coins={2,3,5,7};
        int amount=10;
        PrintCoinPermutation(coins,amount,"");
    }

    public static void PrintCoinPermutation(int[] coin, int amount, String ans) {
        if(amount==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < coin.length; i++) {
            if(amount>=coin[i])
                PrintCoinPermutation(coin,amount-coin[i],ans+coin[i]);      //no backtracking becoz no such statement which
                                                                            //  recursion can't backtrack
        }
//        for (int i = 0; i < coin.length; i++) {
//            if(amount>=coin[i]) {
//                amount-=coin[i];
//                PrintCoinPermutation(coin, amount - coin[i], ans + coin[i]);      //backtracking becoz recursion can't backtrack
//                                                                                 // amount value so we need to add it again
//                amount+=coin[i];
//            }
//        }
    }
}
