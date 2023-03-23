/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left=0, right=n, middle;
        
        while(left<=right){
            middle = left +(right-left)/2;
            if(isBadVersion(middle) == false && isBadVersion(middle+1) == true){return middle+1;}
            else if(isBadVersion(middle) == true){right = middle -1;}
            else if(isBadVersion(middle) == false && isBadVersion(middle+1) == false){left = middle+1;}
        }

        return -1;
    }
}
