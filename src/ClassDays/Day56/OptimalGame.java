package ClassDays.Day56;

//https://hack.codingblocks.com/app/contests/2883/1254/problem

//        Piyush and Nimit are playing a coin game. They are given n coins with values x1, x2 …. xn where 'n' is always even.
//        They take alternate terms. In each turn, a player picks either the first coin or the last coin from the row and
//        removes it from the row. The value of coin is received by that player. Determine the maximum value that Piyush
//        can win with if he moves first. Both the players play optimally.
//
//        Input Format
//        First line contains the number of coins 'n'.
//        Second line contains n space separated integers where ith index denotes the value of ith coin.
//
//        Constraints
//        1 < N <= 30 , N is always even
//        0 <= Ai <= 1000000
//
//        Output Format
//        Print a single line with the maximum possible value that Piyush can win with.
//
//        Sample Input
//        4
//        1 2 3 4
//        Sample Output
//        6
//        Explanation
//        Piyush will pick the coin 4. Then Nimit can pick either 1 or 3. In both the cases piyush picks coin 2 and wins with a total of 6.

//2*min(i+2,j) , (i+1,j-1)
//2*min(i+)
public class OptimalGame {
    public static void main(String[] args) {

    }
}
