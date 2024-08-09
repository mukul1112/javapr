package recursion;

public class power {

    public int power(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return  0;
        }
        int product=power(x,n-1);
        return product*x;
    }
}
