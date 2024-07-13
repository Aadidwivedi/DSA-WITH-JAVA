import java.util.Scanner;

public class bianomal {

  public static void CalculateBinomial(int n,int r){

    int fn=1;
    int fr=1;
    int fc= 1;
   
    
    if(n>=r && (n>=0 && r>=0)){
    for(int i= 1;i<=n;i++){
      fn=fn*i;
      //System.out.println("fn = "+fn);
    }
    for(int j=1;j<=r;j++){
      fr=fr*j;
      //System.out.println("fr = "+ fr);
    }
    for(int k= 1;k<=(n-r);k++){
      fc = fc*k;
    }

    int ncr =  fn/(fr*fc);
    System.out.println("The value of ncr:" + ncr); 
  }else{
    System.out.println("This condation is not Eligable Please try again next value ");
  }
}

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please! Calculate the Bianomal theorem:");

    System.out.print("Please enter the number of n:");
    int n = input.nextInt();

    System.out.print("Please! Enter the number of r:");
    int r = input.nextInt();

    CalculateBinomial(n,r);
  
  }
  
}
