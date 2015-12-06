package student;

/**
 * Created by Andrey on 05.12.2015.
 */
public class GroupTest {
    public static void main(String[] args) {
        Student a = new Student("kate", 25, "2222", 5);
        Student b = new Student("kate", 21, "2222", 5);
        Student c = new Student("kate", 35, "2222", 5);
        Student d = new Student("kate", 27, "2222", 5);

        Group a1 = new Group();
        a1.addStudent(a);
        a1.addStudent(b);
        a1.addStudent(c);
        a1.addStudent(d);
        a1.addStudent(a);


        System.out.println(a1.shouGroup());
    }

}
