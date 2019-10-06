/*
Given an array of N integers, find the pair of integers in the array which have minimum XOR value. Report the minimum XOR value.

Examples : 
Input 
0 2 5 7 
Output 
2 (0 XOR 2) 
Input 
0 4 7 9 
Output 
3 (4 XOR 7)
*/

public class MinXORvalue {
    public int findMinXor(ArrayList<Integer> A) {
        // Sort given array 
        Collections.sort(A); 
  
        int minXor = Integer.MAX_VALUE; 
        int val = 0; 
  
        // calculate min xor of consecutive pairs 
        for (int i = 0; i < A.size()-1; i++) { 
            val = A.get(i) ^ A.get(i+1); 
            minXor = Math.min(minXor, val); 
        } 
  
        return minXor; 
    }
}
