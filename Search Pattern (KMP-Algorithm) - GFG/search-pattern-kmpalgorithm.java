//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            if(res.size()==0)
                System.out.print(-1);
            else {
                for(int i = 0;i<res.size();i++)
                    System.out.print(res.get(i) + " ");
            }
            System.out.println();    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public void findlps(String pat, int n, int[] lps){
        
        int i=0;
        int j=1;
        lps[0]=0;
        while(j<n){
            if(pat.charAt(j)==(pat.charAt(i))){
                i++;
                lps[j] = i;
                j++;
            }
            else{
                if(i == 0){
                    lps[j] = 0;
                    j++;
                }
                else{
                    i = lps[i-1];
                }
            }
        }
        
        
    }
    
    public void kmp(String pat, String txt, int m, int[] lps, ArrayList<Integer> ans){
        
        int i=0;
        int j=0;
        
        while(i<m){
            
            if(pat.charAt(j)==(txt.charAt(i))){
                i++;
                j++;
            }
            if(j == pat.length()){
                ans.add(i-j +1);
                j = lps[j-1];
            }
           
            else if(i<m && pat.charAt(j)!=(txt.charAt(i))){
                if(j == 0){
                    i=i+1;
                }
                else{
                    j = lps[j-1];
                }
            }
        }
        
    }
    ArrayList<Integer> search(String pat, String txt)
    {
        // your code here
        int n = pat.length();
        int m = txt.length();
        int[] lps = new int[n];
        ArrayList<Integer> ans = new ArrayList<>();
        
        findlps(pat, n, lps);
        
        kmp(pat, txt, m, lps, ans);
        
        return ans;
    }
}