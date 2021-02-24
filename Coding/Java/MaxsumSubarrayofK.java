/**Problem: Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.

Example 1:

Input:
N = 4, K = 2
Arr = [100, 200, 300, 400]
Output:
700
Explanation:
Arr3  + Arr4 =700,
which is maximum.
 

Example 2:

Input:
N = 4, K = 4
Arr = [100, 200, 300, 400]
Output:
1000
Explanation:
Arr1 + Arr2 + Arr3  
+ Arr4 =1000,
which is maximum. */


class Solution{
    static int maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        int sum = 0;
        int i = 0;
        int j = 0;
        int maxsum = 0;
        while (j<N){
            sum += Arr.get(j);
            if (j-i+1 < K ){
                    j++;
                }
            else if (j-i+1 == K){
                maxsum = Math.max(sum, maxsum);
                sum -= Arr.get(i);
                i++;
                j++;
            }
            
        }
        return maxsum;
    }
}