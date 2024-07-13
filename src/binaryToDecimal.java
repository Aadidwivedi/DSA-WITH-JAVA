import java.util.Scanner;

public class binaryToDecimal {

  public static void converson(int binary){
    int decimal = 0;
    int mynumber = binary;
    int pow = 0;
    while(binary>0){
      int lastdigit = binary%10;
      decimal = decimal + (lastdigit*(int)Math.pow(2,pow));
      pow++;
      binary = binary/10;
    }

        System.out.print("decimal of " + mynumber +" = " +   decimal);
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please! Conver the Binary To Decimal\n \n");
    System.out.print("Please! Enter the Binary Number:");

    int binary = input.nextInt();

    converson(binary);
  }
  
}
