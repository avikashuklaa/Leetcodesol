//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N; 
            N = Integer.parseInt(br.readLine());
            
            
            int[] S = IntArray.input(br, N);
            
            
            int[] F = IntArray.input(br, N);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.maxMeetings(N, S, F);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        // code here
        int[][] arr=new int[N][3];
        ArrayList<Integer> temp=new ArrayList<>();
        
        for(int i=0; i<N; i++){
            arr[i][0]=i+1;
            arr[i][1]=S[i];
            arr[i][2]=F[i];
        }
        
        Arrays.sort(arr, Comparator.comparingInt(o -> o[2]));
        int r = arr[0][2];
        temp.add(arr[0][0]);
        
        for(int i=0; i<arr.length; i++){
            if(arr[i][1]>r){
                temp.add(arr[i][0]);
                r=arr[i][2];
            }
        }
        
        Collections.sort(temp);
        return temp;
    }
}
        
