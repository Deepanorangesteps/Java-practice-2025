package comparingobjects;

public class Student implements Comparable<Student>{
    int rollNo;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }


    @Override
    public String toString() {
        return marks+" ";
    }

    @Override
    public int compareTo(Student o) {
        System.out.println(" i am running compare to ");
        int diff =(int)(this.marks - o.marks);
        // here we check diff is equal to 0 means both are equal
        // if diff < 0 o is bigger else smaller
        return diff;
    }
}
