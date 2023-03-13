import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
// import java.util.Random;

public class ex0 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        // Random random = new Random();
        long startTimeArray = System.nanoTime();
        for (int i = 0; i < 10_000; i++)
            arrayList.add(5);
        long endTimeArray = System.nanoTime();
        List<Integer> linkedList = new LinkedList<>();
        long startTimeLinked = System.nanoTime();
        for (int i = 0; i < 10_000; i++)
            linkedList.add(5);
        long endTimeLinked = System.nanoTime();
        System.out.println("Linked быстрее Array на: " + ((endTimeArray-startTimeArray)-(endTimeLinked-startTimeLinked)));
    }

}