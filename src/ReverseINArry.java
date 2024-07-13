public class ReverseINArry  {
    public static void main(String[] args) {
        System.out.println("Print Array in Reverse");
        int num[] = {2,4,6,8,10};
        reverse(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+ " ");
        }
        System.out.println();
    }
    public static void reverse(int num[]){
        int start =0, end = num.length-1;
        while (start<end){
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;
            start++;
            end--;
        }
    }
}
