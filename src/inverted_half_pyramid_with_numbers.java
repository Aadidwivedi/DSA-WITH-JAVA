public class inverted_half_pyramid_with_numbers {


  public static void pyd_num(int num){
    for(int i =1;i<=num;i++){
      for(int j=1;j<=num-i;j++ ){
        System.out.print(j);
      }
      System.out.println();
    }
      
  }
  public static void main(String[] args) {
    int num = 6;
    pyd_num(num);
  }
  
}
