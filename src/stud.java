public class stud {
  public static void main(String[] args) {
    student s1 = new student("Adarsh_Dubey");
    System.out.print(s1.name);

    student s2 = new student(12);
    System.out.print(s2.roll_no);
    System.out.println(s2.roll_no);

  }
 
}

class student{
  String name;
  int roll_no;

  student(String name){
     this.name = name;
     
  }
  student(int roll_no){
    this.roll_no = roll_no;
  }
}
