import com.sun.jdi.IntegerValue;

public class SubArry {
    int k=0;
    public static void main(String[] args) {
        System.out.println("Please print the Sub Array:");
        int numbers[] = {2,4,6,8,10};
         SubArry(numbers);

    }
    public static void SubArry(int numbers[]){
        int currsum =0;
        int maxsum = Integer.MIN_VALUE;
        int total =0;
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                currsum = 0;
                for(int k=start;k<=end;k++) {
                    System.out.print(numbers[k] + " ");
                  currsum += numbers[k];
                }
                System.out.println(":currsum = "+currsum);
                if(maxsum<currsum){
                    maxsum= currsum;
                }

            }
            System.out.println();
        }
        System.out.println("max sum="+maxsum );
    }
}
