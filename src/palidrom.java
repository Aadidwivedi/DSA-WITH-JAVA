public class palidrom {


  public static void palidrom(int num){

    for(int i=0; i<=num;i++){
      for(int j=1;j<=num-i;j++){
        System.out.print(" ");
      }
      for(int j=i;j>=1;j--){
        System.out.print(j);
      }
      for(int j=2;j<=i;j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    
    int num =5;

    palidrom(num);
  }
  
}