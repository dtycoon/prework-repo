public class IncompleteSolutionPermutation {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> arrOfArrInt = new ArrayList<ArrayList<Integer>>();
        arrOfArrInt.add(A);
        createPermute(A, 0, arrOfArrInt);
        return arrOfArrInt;
    }
    
    public void createPermute (ArrayList<Integer> A, int start, 
                        ArrayList<ArrayList<Integer>>arrOfArrInt ) {
        if(start + 1 == A.size())
           return;
           
        for (int i = start ; i < A.size(); i++)
        {
          ArrayList<Integer> newObject = (ArrayList<Integer>) A.clone();
          System.out.println(newObject.toString());
          System.out.println("start = " + start );
          System.out.println(newObject.get(i));
           if(newObject.get(start) != newObject.get(i))
           {
               Integer temp = newObject.get(start);
               newObject.set(start, newObject.get(i));
               //newObject.set(i, A.get(start));
               newObject.set(i, temp);
               arrOfArrInt.add(newObject);
               createPermute (newObject, start + 1, arrOfArrInt);
           }
           
        }
        
    }
    
    
}
