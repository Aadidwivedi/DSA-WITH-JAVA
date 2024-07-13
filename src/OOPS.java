public class OOPS {
  public static void main(String[] args) {
    Pen p1 = new Pen();
    p1.setcolor("blue");
    System.out.println(p1.getColor());
    p1.settip(5);
    System.out.println(p1.getTip());
    p1.setcolor("Yellow");
    System.out.println(p1.getColor());

  //  BankAccount myAccount = new BankAccount();
  //  myAccount.username = "Adarsh Dubey";
  //  myAccount.setpassword("Adsrsh#290290");
  }
  
}
// class BankAccount{
//   public String username;
//   private String password; 
//   public void setpassword(String password) {

//   }
// }

class Pen{
  private String color;
  private int tip;
  
  String getColor(){
    return this.color;
  }
  
  int getTip(){
    return this.tip;
  }
  void setcolor(String newcolor ){
    color = newcolor;
  }
  
  void settip(int newtip){
    tip = newtip;
  }
}


class student{
  String name;
  int age;
  float percentage;
    void calculatepercentage(int phy,int chm, int math){
      percentage = (phy+chm+math)/3;
    }

}
