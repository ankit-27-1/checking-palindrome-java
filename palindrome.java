class Solution {
    public boolean isPalindrome(int x) {
        int org=x;
       int y=0;
       int digit=0;
       while(x>0){
           digit=x%10;
           x=x/10;
           y=y*10+digit;
       }
       if(y==org){
       return true;
    }
    return false;
    }
}
