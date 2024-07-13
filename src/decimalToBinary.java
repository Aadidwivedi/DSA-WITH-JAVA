import java.util.Scanner;

public class decimalToBinary{


  public static void dectobin(int dec){

    int mynumber = dec;

    int pow =0;

    int binary = 0;
    while(dec>0){
      int rem = dec%2;
      binary = binary + (int)(rem*Math.pow(10,pow));
      pow++;
      dec = dec/2;
     }
     System.out.println(mynumber + " : Decimal No To convert binary NO:"+ binary);

  }


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please! convert the value of dec to binary:");

    
    

    System.out.print("Please enter the value of decimal number:");
    int dec = input.nextInt();
    dectobin(dec);
  }
}