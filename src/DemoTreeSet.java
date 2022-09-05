import java.util.*;

public class DemoTreeSet {
    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();
        System.out.println("stringSet.add(\"Ramesh\") = " + stringSet.add("Suresh"));
        System.out.println("stringSet.add(\"Suresh\") = " + stringSet.add("Ramesh"));
        System.out.println("stringSet.add(\"ramesh\") = " + stringSet.add("ramesh"));
        System.out.println("stringSet.add(\"suresh\") = " + stringSet.add("suresh"));
        System.out.println("stringSet.add(\"Vaibhav\") = " + stringSet.add("Vaibhav"));
        System.out.println("stringSet.add(\"Abhishek\") = " + stringSet.add("Abhishek"));
        System.out.println("stringSet.add(\"Ramesh\") = " + stringSet.add("Ramesh"));


        for (String element : stringSet) {
            System.out.println(element);
        }

        TreeSet<Student>  studentTreeSet = new TreeSet<>();
        System.out.println("studentTreeSet.add(new Student(12, \"Vaibhav\")) = " + studentTreeSet.add(new Student(12, "Vaibhav")));
        studentTreeSet.add(new Student(2, "Abhishek"));
        studentTreeSet.add(new Student(5, "Aman"));
        studentTreeSet.add(new Student(15, "Vipul"));
        System.out.println(studentTreeSet.add(new Student(2, "Abhishek")));
        for (Student student : studentTreeSet) {
            System.out.println(student);
        }


        Set<Student> studentHashSet = new HashSet<>();
        System.out.println("studentHashSet.add(new Student(15, \"Vipul\")) = " + studentHashSet.add(new Student(15, "Vipul")));
        studentHashSet.addAll(studentTreeSet);


        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.addAll(studentHashSet);
        for (Student student : studentArrayList) {
            System.out.println(student);
        }
        Comparator<Student> comp = new Comparator<Student>() {
            public int compare(Student s1, Student s2){
                return s2.getRollNo() - s1.getRollNo();
            }
        };

        Collections.sort(studentArrayList,comp);
        for (Student student : studentArrayList) {
            System.out.println(student);
        }
        Comparator<Student> studentComparatorOnRollNo = (s1,s2) -> s1.getRollNo() - s2.getRollNo();
        Comparator<Student> studentComparatorOnName = (n1, n2) -> n1.getName().compareTo(n2.getName());

        Collections.sort(studentArrayList,studentComparatorOnName);

        System.out.println("\n------------------------------------------------------------------\n");
        for (Student student : studentArrayList) {
            System.out.println(student);
        }
        Collections.sort(studentArrayList,(s1, s2) -> s2.getName().compareTo(s1.getName()) );
        studentArrayList.sort(studentComparatorOnRollNo);
        System.out.println("\n------------------------------------------------------------------\n");
        for (Student student : studentArrayList) {
            System.out.println(student);
        }

    }
}
