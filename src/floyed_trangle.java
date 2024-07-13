public class floyed_trangle {
   
  public static void floyed(int num){
    int a=1;
    for(int i=1; i<=num; i++){
      for(int j=1;j<=i;j++){
        System.out.print( a+" ");
        a++;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int num = 5;
    floyed(num);
  }
  
}
