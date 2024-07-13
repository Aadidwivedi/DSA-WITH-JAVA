import java.util.Scanner;

public class prime {


  public static boolean calPrime(int num){
    boolean isPrime = true;
    for(int i=2;i<=num-1;i++){
     if(num % i == 0 ){
    isPrime = false;
    break;
    
   }
  }
   return isPrime;
}



  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please! Calculate the Prime no:");
    System.out.print("Please! Enter the number:");
    int num = input.nextInt();
    boolean isPrime = calPrime(num);
    if(isPrime){
      System.out.println(num + ":This is Prime");
    }
    else{
    System.out.println(num + ":This is not Prime");
    }  
  }
}
