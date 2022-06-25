package com.tree;

public class UniqueBinaryTree {

///Dynamic Programming
    //Time Complexity: O(N2)
//Space Complexity: O(N)
    static long numTrees(int n) {
        long [] dp = new long [n + 1];

        dp[0] = 1;
        dp[1] = 1;
        for(int i =2;i<=n;i++) {
            for(int j =1;j<=i;j++) {
                dp[i] += dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }
//Catalan Number
    //Time Complexity: O(N), where N is the number of nodes of the tree
    //Space Complexity: O(1), as no extra space is used in the program.
    static int numTrees1(int n) {
        int ans = 1;
        for(int i =0;i<n;i++) {
            ans = ans * 2*(2*i+1)/(i+2);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Count of structurally unique BSTs are : " +numTrees(n));
    }
}
