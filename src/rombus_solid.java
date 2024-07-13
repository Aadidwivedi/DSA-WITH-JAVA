public class rombus_solid {
  

  public static void solid_rombus(int num){
    for(int i=1;i<=num;i++){
      for(int j=num-i;j>=1;j--){
        System.out.print(" ");
      }
      for(int j=1;j<=num;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int num = 15;

    solid_rombus(num);
  }
}
