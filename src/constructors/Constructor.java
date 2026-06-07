package constructors;

public class Constructor {
    public static void main(String[] args) {
Student alex = new Student();
        System.out.println(alex.name);
    }

    static class Student{
        int rollNo;
        String name;
        Float marks;
        Student(){
            // here we are calling a one constructor inside this constructor using this keyword
            // actually Student(18,"default name",100.0f); it seems like this internally
            this(18,"default name",100.0f);
        }
        Student(int rollNo,String name,Float marks){
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }
    }
}
