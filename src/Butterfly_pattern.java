public class Butterfly_pattern {
 

 public static void Butterfly_patter(int num){
   
  // first loop for iteration
  for(int i=1; i<=num;i++){
    //print first star
    for(int j=1; j<=i;j++){
      System.out.print("*");
    }//print space 2(num-i)=space
    for(int j=1;j<=2*(num-i);j++){
      System.out.print(" ");
    }// print second star
    for(int j=1;j<=i;j++){
      System.out.print("*");
    }
    System.out.println();
  }
  for(int i=num;i>=1;i--){
    // this is iteration  
    for(int j=1;j<=i;j++){
      //print first star
      System.out.print("*");
    }//print space 2(num-i)=space
    for(int j=1;j<=2*(num-i);j++){
      System.out.print(" ");
    }// print second star
    for(int j=1;j<=i;j++){
      System.out.print("*");
    } //this is next line
    System.out.println();
  }
 }
  

  public static void main(String[] args) {
    int num = 50;

    Butterfly_patter(num);
  }
  
}
