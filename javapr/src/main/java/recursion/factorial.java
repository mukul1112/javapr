package recursion;

public class factorial {
    public int factorial(int n){
        if(n==1||n==0){
            return 1;
        }
        int fact=factorial( n-1);
        int facans=fact*n;
        return facans;
    }
}
