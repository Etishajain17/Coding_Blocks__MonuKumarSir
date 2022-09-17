package Day6;
/*
x^k <= n find maximize x
Just change the value with k to find the largest element whose kth root is less than n
 */
public class SquareRoot {
    public static int root(int n){
        int lo=1;
        int hi=n;
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(Math.pow(mid,2)<=n){
                ans=mid;
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=47;
        System.out.println(root(n));
    }

}
