import java.util.Scanner;

public class sumfun {
  public static void printhello(){
    System.out.println("Hello! Adarsh");
  }



  public static int sum(int num1,int num2){//parameter or formal parameter
    int sum= num1+num2;
    return sum;

   
    }

    public static void swap(int p,int q){
      int temp = p;
      p = q;
     q = temp;
     System.out.println("a = "+p);
     System.out.println("b = "+q);
    }


  
  public static void main(String[] args)//thi is main function
   {
    //Scanner input = new Scanner(System.in);
    
    // printhello();
    // printhello();

    //this is sum function
    // System.out.println("Please enter the two numbers:");

    // System.out.print("Please enter the first numbers:");
    // //this is first number

    // int num1 = input.nextInt();
    // System.out.print("Please enter the Second numbers:");
    //this is second number

    //int num2 = input.nextInt();
    //int sum = sum(num1,num2);//arguement or actual parameter

   // System.out.println("sum is:"+ sum);


   //swaping function in java;
   int a=8;
   int b = 32;

  swap(a,b);

    
  }
}
