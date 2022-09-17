package Day6;

public class FirstBadVersionLeetCode {
    public static boolean isBadVersion(int x){
        return true;
    }
    public static int firstBadVersion(int n)
    {
        int lo=1;
        int hi=n;
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isBadVersion(mid)==true){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
}
