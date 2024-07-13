public class sumof {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     addition(num);
    }
    public static void addition(int num[]){
        int i = 0;
        int sum =0;
        while(num[i]< num.length){

             sum = sum+num[i];

            i++;
        }
        System.out.println("sum = "+sum);
    }
}
