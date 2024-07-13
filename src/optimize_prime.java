import java.util.Scanner;

public class optimize_prime {

  public static Boolean isprime(int num){
    for(int i = 2;i<=Math.sqrt(num);i++){
      if(num %i == 0){
        return false;
      }
    }
    return true;
  }

  public static void primeInRange(int num){
    for(int i=2;i<=num;i++){
    if(isprime(i)){
      System.out.print(i+ " ");
    }
   }
   System.out.println();
  }
  


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please! Calculate the Prime no:");
    System.out.print("Please! Enter the number:");
    int num = input.nextInt();
    boolean isprime = isprime(num);
    if(isprime){
      System.out.println(num + ":This is Prime");
    }
    else{
    System.out.println(num + ":This is not Prime");
    } 
    primeInRange(34); 
  }
}
  
  

