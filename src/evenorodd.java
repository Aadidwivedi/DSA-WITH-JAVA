public class evenorodd {

  public static boolean evodd(int a){
   
    if(a%2==0){
      return true;
    }
    return false;
    
  }


  public static void main(String[] args) {
    System.out.println("please print the value true or false");
    int a=1;
    System.out.println(evodd(a));
  }
  
}
