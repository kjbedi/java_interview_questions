import java.util.*;

class GCD {
    public static void main(String []args){
        CalculateGCD c = new CalculateGCD();
        int[] a = {2,4,6,8,16};
        int result = a[0];
        int counter = 0;
        for(int e: a){
            if(counter!=0){
                result = c.gcd(result,e);
            }
            counter++;
        }
        System.out.println(result); 
    }
}