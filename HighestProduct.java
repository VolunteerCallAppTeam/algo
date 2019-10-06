
//Given an array of integers, return the highest product possible by multiplying 3 numbers from the array
//Example:

//[0, -1, 3, 100, 70, 50]

//=> 70*50*100 = 350000

public class HighestProduct {
    public int maxp3(ArrayList<Integer> a) {
        Collections.sort(a);
        int n = a.size();
       
        return Math.max((a.get(n-1) * a.get(n-2) * a.get(n-3)),
                        (a.get(n-1) * a.get(0) * a.get(1)));
    }
}
