public class binarySearch {
    public static void main(String[] args) {
        System.out.println("Print the Binary search number: ");
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 10;
        System.out.println("In Binary search your element is found:" + getBinary(numbers,key));
    }
    public  static  int getBinary(int numbers[],int key){
        int start = 0,end = numbers.length-1;

        while(start <= end){
            int mid= (start+end)/2;
            if(numbers[mid] == key){
                return mid;
            }if (numbers[mid]<key) {
                start= mid+1;
            } else {
                end= mid-1;
            }
        }

        return -1;
    }
}
