package student;

/**
 * Created by Andrey on 05.12.2015.
 */
public class Student {
    String name;
    int age;
    String phone;
    int runk;

    Student (String name, int age, String phone, int runk){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.runk = runk;
    };

    public String showStudent(){
      //  System.out.println(name + " " + age + " " + phone + " " + runk);
        return name + " " + age + " " + phone + " " + runk;
    }

}
