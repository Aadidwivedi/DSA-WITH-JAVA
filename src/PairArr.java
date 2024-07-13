public class PairArr {
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10};
        printspairs(numbers);
    }
    public static void printspairs(int numbers[]){
        int total_pairs = 0;
        for(int i=0; i<numbers.length;i++){
          int curr = numbers[i];
          for(int j=i+1; j<numbers.length;j++){
              System.out.print("(" + curr + "," + numbers[j] + ")");
              total_pairs ++;
          }
            System.out.println();
        }
        System.out.println("total_pairs = "+ total_pairs+": ");
    }
}
