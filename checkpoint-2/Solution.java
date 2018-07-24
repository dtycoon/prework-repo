public class Solution {
    public int[][] prettyPrint(int A) {
        int[][] myArray = new int[2*A-1][2*A-1];
        
        for (int i=0; i<A; i++) {
            inputValue(myArray, i, 2*A -2, A );
        }
           
           return myArray;
    }
    
    private void inputValue( int[][] myarray, int index, int max, int A)
    {
        for (int i=index; i<= max -index; i++)
        {
            myarray[index][i] = A - index;
            myarray[i][index] = A - index;
            
            
            myarray[i][max -index] = A - index;
            myarray[max - index][i] = A - index;
        }
    }
}

