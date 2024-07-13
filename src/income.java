import java.util.Scanner;

public class income {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the Amount:");
    int income = input.nextInt();
    
    int tax = 0;

    if(income<=500000){
      System.out.println(income + " 0%  tax");
    }else if (income>=500000 && income<1000000) {
      tax =(int)(income*0.2);
      System.out.println(tax+":Your tax is 10%");
    }else{
      tax = (int)(income*0.3);
      System.out.println(tax+" :your tax is 30%");
    }
  }
  
}
