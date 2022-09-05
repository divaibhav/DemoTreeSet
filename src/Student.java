import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {

    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals called");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode called");
        return Objects.hash(rollNo, name);
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("this = " + this);
        System.out.println("o = " + o);
        return this.rollNo - o.rollNo;
    }
}
