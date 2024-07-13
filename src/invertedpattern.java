public class invertedpattern {

  public static void halfpramid(int num){
    
    for(int i=1; i<=num; i++){
      for(int j=1;j<=num-i;j++){
        System.out.print(" ");
      }
      for (int j=1;j<=i;j++) {
          System.out.print("*");
      }
      System.out.println();

    }
    
  }
  public static void main(String[] args) {
    System.out.println("Print the inverted Pattern:");

    int num = 5;

    halfpramid(num);
  }
}
