public class hollow_rectangle {


  public static void hollrect(int totrow,int totcols){
    for(int i = 1;i<= totrow;i++ ){
     for(int j=1;j<=totcols;j++){
      if(i==1||i==totrow||j==1||j==totcols){
        System.out.print("*");
      }else{
        System.out.print(" ");
      }
      
    }
       System.out.println();
    }
 }
   

  public static void main(String[] args) {

    int totcols = 5;
    int totrow=9;
    hollrect(totrow, totcols); 
  }
  
}
