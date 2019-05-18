/*
    Find missing number(s) in an array with given total expected count.
    e.g (1,4,5),count = 5 ans = (2,3) 
 */
import java.util.*;

class MissingNum{
    public static void main(String ard[]) {
        int a[] = {1,2,5};
        int count = 5;
        // System.out.println(calculateOneMissingValue(a, count));
        printMoreThanOneMissing(a, count);
    }
    public static int calculateOneMissingValue(int a[], int count){
        int expectedSum = (count*(count + 1)/2);
        int actualSum =0;
        for(int c:a){
            actualSum = actualSum+c;
        }
        return expectedSum-actualSum;
    }
    public static void printMoreThanOneMissing(int a[], int count){
        BitSet b1 = new BitSet(count);
        BitSet b2 = new BitSet(count);
        for(int i =0 ;i<count;i++){
            b2.set(i+1);
        }
        for(int c:a){
            b1.set(c);
        }
        b2.xor(b1);
        System.out.println(b1.nextClearBit(2));
    }
}