package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class AGGRCOW_AggressiveCows_SPOJ {
    public static boolean isITPossible(int[] stalls,int mid,int noc){
        int cow=1;
        int pos=stalls[0];
        int i=1;
        while(i<stalls.length){
            if(stalls[i]-pos>=mid) {
                cow++;
                pos = stalls[i];
            }
            if(cow==mid)
                return true;
            i++;
        }
        return false;
    }
    public static int largestMinimumDistance(int[] stalls,int noc){
        int low=1;
        int high=stalls[stalls.length-1]-stalls[0];
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(isITPossible(stalls,mid,noc)==true){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int nos = sc.nextInt();
            int noc = sc.nextInt();
            int[] stalls = new int[nos];
            for (int i = 0; i < stalls.length; i++) {
                stalls[i] = sc.nextInt();
            }
            Arrays.sort(stalls);            //for stalls as location is given which will be first low then high in real
            System.out.println(largestMinimumDistance(stalls,noc));
        }
    }
}
