import java.util.Scanner;

public class factorial {


  public static int factorial(int num){
    int  fact =1;
    for(int i=1;i<=num;i++){
      fact = fact*i;
    }
     
    return fact;
  }
  



  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please! calculate the factorial no:");

    System.out.print("Please! Enter the number:");

    int num= input.nextInt();

    int fact = factorial(num);
    System.out.println("fact = "+fact);
  }
}
