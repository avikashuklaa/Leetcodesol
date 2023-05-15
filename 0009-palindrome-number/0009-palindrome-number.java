class Solution {
    public boolean isPalindrome(int x) {
        int a = x;
        int ans=0;
        while(a>0){
            int d = a%10;
            ans = ans*10+d;
            a = a/10;
        }

        if(ans==x){
            return true;
        }
        else{
            return false;
        }
    }
}