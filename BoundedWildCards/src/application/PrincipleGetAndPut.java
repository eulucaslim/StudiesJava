package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrincipleGetAndPut {
    // Contravariância
    public static void main(String[] args){
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();
        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny){
        for (Number num: source){
            destiny.add(num);
        }
    }
    public static void printList(List<?> list){
        for( Object obj: list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
