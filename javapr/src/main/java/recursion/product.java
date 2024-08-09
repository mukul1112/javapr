package recursion;

public class product {
    public int products(int x,int y){
        if(x<y){
            products(y,x);
        }
        if(y!=0){
            int productn1=products(x,y-1);

          return x+productn1;
        }
        else{
            return 0;
        }
    }
}
