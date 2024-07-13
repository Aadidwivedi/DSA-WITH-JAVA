public class linearSearch{
    public static void main(String[] args) {
       int numbers[] = {2,4,6,8,10,12,14,16};
       int key = 1;


       boolean lin =linearSearch(numbers,key);
       if(lin==true){
           System.out.println("Key value is found : " + key);
       }
       else{
           System.out.println("Key value is not found : " + key);
       }
    }
    public static boolean linearSearch(int numbers[] , int key){
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return true;
            }
        }
        return  false;
    }
}
