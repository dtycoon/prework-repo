public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int kthsmallest(final int[] A, int B) {
        int[] pqueue = new int[B];
        for (int i=0; i<B; i++) {
          pqueue[i] = Integer.MAX_VALUE;
        }
        
        for (int j=0; j< A.length; j++) {
                shortestK(pqueue, A[j], B);
        }
        return pqueue[0];
    }
    
    void shortestK(int[] pqueue, int value, int B)
    {
        if(value < pqueue[0]  )
        {
            pqueue[0] = value;
            slideDown(pqueue, 0, B);
        }
    }
 

    void slideDown(int[] pqueue, int index, int B)
    {
        if(index > B ) {
            return;
        }
        else {
            int left = 2*index + 1;
            int right = 2*index + 2;
            if(left < B && pqueue[index] <= pqueue[left] )
            {
              if(right < B && pqueue[index] <= pqueue[right] )
              {
              int temp = pqueue[right];
              pqueue[right] = pqueue[index];
              pqueue[index] = pqueue[left];
              pqueue[left] = temp;
              slideDown(pqueue, right,  B);
              slideDown(pqueue, left,  B);
                  
              }
              else
              {
                 int temp = pqueue[index];
                 pqueue[index] = pqueue[left];
                 pqueue[left] = temp;
                 slideDown(pqueue, left,  B);
              }
            }
        }
    }
    
}
