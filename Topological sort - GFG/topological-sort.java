//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            String st[] = read.readLine().trim().split("\\s+");
            int edg = Integer.parseInt(st[0]);
            int nov = Integer.parseInt(st[1]);

            for (int i = 0; i < nov; i++)
                list.add(i, new ArrayList<Integer>());

            int p = 0;
            for (int i = 1; i <= edg; i++) {
                String s[] = read.readLine().trim().split("\\s+");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                list.get(u).add(v);
            }

            int[] res = new Solution().topoSort(nov, list);

            if (check(list, nov, res) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
    static boolean check(ArrayList<ArrayList<Integer>> list, int V, int[] res) {
        
        if(V!=res.length)
        return false;
        
        int[] map = new int[V];
        for (int i = 0; i < V; i++) {
            map[res[i]] = i;
        }
        for (int i = 0; i < V; i++) {
            for (int v : list.get(i)) {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
}

// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        
        int[] deg = new int[V];
        
        for(ArrayList<Integer> temp : adj){
            for(Integer e : temp){
                deg[e]++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        
        bfs(adj, deg, ans, V);
        int i=0;
        int[] anss = new int[V];
        for(int e : ans){
            anss[i++]=e;
        }
        
        return anss;
        
       
    }
    
    public static void bfs(ArrayList<ArrayList<Integer>> adj, int[] deg, ArrayList<Integer> ans, int V){
        
        Queue<Integer> q = new ArrayDeque<>();
        
        for(int i=0; i<V; i++){
            if(deg[i]==0){
                q.add(i);
            }
        }
        
        while(q.size()>0){
            int temp = q.poll();
            ans.add(temp);
            
            for(int nbr : adj.get(temp)){
                if(--deg[nbr]==0){
                    q.add(nbr);
                }
            }
            
        }
    }
    
    // public static void dfs(ArrayList<ArrayList<Integer>> adj, int v, boolean[] vis, Stack<Integer> st){
    //     vis[v]=true;
        
    //     for(Integer nbr : adj.get(v)){
    //         if(vis[nbr] != true){
    //             dfs(adj, nbr, vis, st);
    //         }
    //     }
    //     st.push(v);
    // }
}
