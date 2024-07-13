public class diamond_pattern {

  public static void diamond_pattern(int num){
    for(int i =0;i<=num;i++){
      for(int j=1;j<=num-i;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=(2*i-1);j++){
        System.out.print("*");
      }
      System.out.println();
    }

    for(int i =num;i>=1;i--){
      for(int j=1;j<=num-i;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=(2*i-1);j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }



  public static void main(String[] args) {
    int num = 10;

    diamond_pattern(num);
  }
  
}
