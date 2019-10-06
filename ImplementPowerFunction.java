/*Implement pow(x, n) % d.

In other words, given x, n and d,

find (xn % d)

Note that remainders on division cannot be negative. 
In other words, make sure the answer you return is non negative.

Input : x = 2, n = 3, d = 3
Output : 2

2^3 % 3 = 8 % 3 = 2.
*/
public class ImplementPowerFunction {
    public int pow(int x, int n, int d) {
        if(n==0 && x==0){
            return 0;
        }
        
        
        if(n==0){
            return 1;
        }
        
        
        if(x==0){
             return 0;
        }
       
        long ans;
        if(n%2==0){
            long small=pow(x,n/2,d);
            ans=(small*small)%d;
        }
        else {
            long small=pow(x,n-1,d);
            ans=(x%d);
             ans=(small*ans)%d;
        }
        int answ=(int)((ans+d)%d);
        return answ;
    }
}
