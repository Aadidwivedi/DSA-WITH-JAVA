public class funOverloding {
  

  public static int sum(int a, int b){
    return a+b;
  }
  public static int sum (int a, int b,int c){
    return a+b+c;
  }
  public static float sum(float a,float b){
    return a+b;
  }
    public static float sum(float a,float b, float c){
      return a+b+c;
    }
  
  public static void main(String[] args) {
    System.out.println("sum :"+ sum(3.6f,51f));
    System.out.println("sum :" + sum(3,4,6));
    System.out.println("sum :"+ sum(3.6f,51f));
    System.out.println("sum :" + sum(3,4,6));
  }
}
