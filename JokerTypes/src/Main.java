import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myNumber = Arrays.asList(5, 2, 10);
        printList(myNumber);
    }

    public static void printList(List<?> list){
        for (Object obj: list) {
            System.out.println(obj);
        }
    }
}