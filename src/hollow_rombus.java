public class hollow_rombus {

  public static void hollow_rombus(int row,int col){

    for(int i=1; i<=row;i++){
      for(int j=1;j<=col-i;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=col;j++){
        if(i==1||i==row||j==1||j==col){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }


  public static void main(String[] args) {
    int row = 15;
    int col = 15;

    hollow_rombus(row,col);
  }
  
}
