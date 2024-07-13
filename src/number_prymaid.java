public class number_prymaid {

  public static void number_prymaid(int num){
    
    int a =0;
    for(int i=1; i<=num;i++){
       
      for(int j=1;j<=num-i;j++){
        
        System.out.print(" ");
      } 
      
       a++;
      for(int j=1;j<=i;j++){
        
        System.out.print(a+" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    

    int num = 5;

    number_prymaid(num);
  }
  
}
