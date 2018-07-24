//A : [10, 5, 1, 0, 2]
//(B, C) : (6, 8)
//[5, 1], [5, 1, 0], [5, 1, 0, 2]
//3

public class Solution {
    public int numRange(int[] A, int B, int C) {
        int totalSums = 0;
        
        for(int i=0; i<A.length; i++)
        {
            if(A[i] > C)
              continue;
            
            int sum = A[i];
            if (sum >= B && sum <= C)
                    totalSums++;
            for (int j = i+1; j< A.length; j++)
            {
                if ( A[j] > C) {
                  //i = j +1;
                  break;
                }
                else if((sum + A[j]) < B) {
                    sum = sum + A[j];
                }
                else if((sum + A[j]) > C) {
                   // i = j;
                    break;
                }
                else {
                    sum = sum + A[j];
                    totalSums++;
                }
                  
            }
            
        }
        return totalSums;
    }
}

