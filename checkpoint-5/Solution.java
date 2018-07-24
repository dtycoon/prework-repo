public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int longestConsecutive(final int[] A) {
        HashSet<Integer> uniqueElem = new HashSet<Integer>();
        int largestSeq = 0;
        
        for (int i=0; i<A.length; ++i)
            uniqueElem.add(A[i]);
 
        for (int k=0; k<A.length; k++) {
            if (!uniqueElem.contains(A[k]-1)) {
                int count = 0;
                int elem = A[k];
                
                while (uniqueElem.contains(elem)) {
                    count++; 
                    elem++;
                }
                if (largestSeq < count) {
                    largestSeq = count;
                }
            }
        }
        return largestSeq;
    }
}
