import java.util.*;
public class largestArray {
    public static void main(String[] args) {
        System.out.println("Please find the largest array");

        int num[] = {1,2,6,3,5};

        System.out.println("Your largest Number is = " + getlargest(num));
        System.out.println("Your smallest Number is = " + smallest(num));
    }

    public static int getlargest(int num[]) {
        int largest=Integer.MIN_VALUE;
        for(int i=0; i< num.length;i++){
            if(largest < num[i]){
                largest = num[i];
            }
        }
       return largest;
    }
    public static int smallest(int num[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(smallest > num[i]){
                smallest= num[i];
            }
        }
       return smallest;
    }
}
