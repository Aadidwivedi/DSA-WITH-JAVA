public class Array{
    public static void main(String[] args) {
        System.out.println("Print the updated marks");
        int marks[] = {97,98,99};
        updated(marks);
        for(int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }
    }
    public static void updated(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i] +1;
        }
    }
}