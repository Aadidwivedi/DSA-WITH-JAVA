public class palindrome {

  public static boolean palindromep(int num){
    int rev =0;
    int numb = num;
    while(num != 0){
     int  rem = num % 10;

     rev = rev*10 + rem;
     
     num = num/10;
     if(num == rev){
      return true;
     }
     return numb == rev;
     
    }
  }
  

  public static void main(String[] args) {
    System.out.println("please print the palindrome:");

    int num = 121;
    boolean n= palindromep(num);
    System.out.println(n);
    
  }  
  
}
