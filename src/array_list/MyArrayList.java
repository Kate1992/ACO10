package array_list;

import java.util.Objects;

/**
 * Created by Катя on 11.01.2016.
 */
public class MyArrayList {

    private int size;
    Object [] list;


    public void add (Object o){
        if (size == 0){
            size ++;
            this.list = new Object[size];
            list [0] = o;
        } else {
            Object [] list2 = new Object[size + 1];
            for (int i = 0; i < list.length; i++) {
                list2[i] = list[i];
            }
            list2 [size] = o;
            this.list = list2;
            size++;
        }
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void clear(){
        size = 0;
    }
    public Object get(int index){
        if (size < index || index == 0){
            System.err.println("Index not found");
            return -1;
        }else {
            return list[index - 1];
        }

    }
    public int size(){
        return size;
    }
    public int indexOf(Object o){
        for (int i = 0; i <list.length ; i++) {
            if (list [i].equals(o)){
                return i+1;
            }
        }
        return -1;
    }
    public boolean contains(Object o){
        for (int i = 0; i <list.length ; i++) {
            if (list [i].equals(o)){
                return true;
            }
        }
        return false;
    }
    public void set(int index, Object o) {
        if (size < index || index == 0) {
            System.err.println("Index not found");
        }else {
        list[index - 1] = o;
        }
    }
}
