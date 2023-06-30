/*
AIM: Code and analyze to find an optimal solution to Matrix chain multiplication using
dynamic programming.

*/
#include <bits/stdc++.h>
using namespace std;

int f(vector<int>& arr, int i, int j, vector<vector<int>>& dp){

    if(i == j)
        return 0;

    if(dp[i][j]!=-1)
        return dp[i][j];

    int mini = INT_MAX;
    for(int k = i; k<= j-1; k++){
    
        int ans = f(arr,i,k,dp) + f(arr, k+1,j,dp) + arr[i-1]*arr[k]*arr[j];
        
        mini = min(mini,ans);
    }

    return mini;

}

int matrixMultiplication(vector<int>& arr, int N){
    
    vector<vector<int>> dp(N,vector<int>(N,-1));
    
    for(int i=1; i<N; i++){
        dp[i][i] = 0;
    }

    for(int i=N-1; i>=1; i--){

        for(int j=i+1; j<N; j++){

            int mini = INT_MAX;

            for(int k = i; k<= j-1; k++){

                int ans = dp[i][k]+ dp[k+1][j] + arr[i-1]*arr[k]*arr[j];
                mini = min(mini,ans);
            }

            dp[i][j] = mini;
        }
    }
    
    return dp[1][N-1];
}

int main() {
    
    vector<int> arr = {11, 23, 35, 41, 54};
    int n = arr.size();
    cout<<"The minimum number of operations are "<<matrixMultiplication(arr,n);
    return 0;
}

/*

COMPLEXITY ANALYSIS:
Time complexity: O(n^3)
Reason: There are N*N states and we explicitly run a loop inside the function which will
run for N times, therefore at max ‘N*N*N’ new problems will be solved.
Space complexity: O(n^2)
Reason: We are using a 2D array ( O(N*N)) space.

*/

/*
ALGORITHM:
1. n length[p]-1
2. for i ← 1 to n
3. do m [i, i] ← 0
4. for l ← 2 to n // l is the chain length
5. do for i ← 1 to n-l + 1
6. do j ← i+ l -1
7. m[i,j] ← ∞
8. for k ← i to j-1
9. do q ← m [i, k] + m [k + 1, j] + pi-1 pk pj
10. If q < m [i,j]
11. then m [i,j] ← q
12. s [i,j] ← k
13. return m and s.
*/
