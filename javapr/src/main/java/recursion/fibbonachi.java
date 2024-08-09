package recursion;

public class fibbonachi {
// give in main argugment (0,1,n-2)
    public void fibonachi(int n,int a,int b){
           if(n==0){
               return;
           }
        int c=a+b;
        System.out.println(c);
        fibonachi(n-1,b,c);
    }
}
