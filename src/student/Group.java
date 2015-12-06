package student;

/**
 * Created by Andrey on 05.12.2015.
 */
public class Group {
    Student [] place = new Student[5];
    int freePlacesIndex = 0;


    public void addStudent(Student a){
        if (freePlacesIndex >= 0|| freePlacesIndex < place.length){
            place [freePlacesIndex] = a;
            freePlacesIndex = freePlacesIndex+1;
        }
    }

    public String shouGroup(){
        String s = "";
        for (int i = 0; i < place.length; i++) {
           s += place[i].showStudent()+ "\n";

        }
        return s;

    }


}
