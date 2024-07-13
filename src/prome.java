import java.util.Scanner;

public class prome {

  public static boolean isprime(int num){

     boolean isprime = true;
     for(int i= 2; i<num;i++){
      if(num%i==0){
        return false;
      }
     }
    return true;
  }
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Please calculate the Number is prime or Not:");
    System.out.println("Please Enter the Number:");

    int num = input.nextInt();
    System.out.println(isprime(num));
    
  }
  
}
