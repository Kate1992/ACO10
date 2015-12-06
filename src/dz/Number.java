package dz;

/**
 * Created by Andrey on 05.12.2015.
 */
public class Number {

    int number;

    public int sum (Number a1){
       int sum = number + a1.number;
        System.out.println(sum);
        return sum;
    }
}
