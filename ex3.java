import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.

public class ex3 {
    public static void main(String[] args) {
        Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        ex1(array);
        ex2(array);
    }

    public static void ex1(Integer[] inputArray) {
        Stack<Integer> stack = new Stack<>();
        for (Integer item : inputArray) {
            stack.push(item);
        }
        System.out.println(stack);
    }

    public static void ex2(Integer[] inputArray) {
        Queue<Integer> stack = new LinkedList<>();
        for (Integer item : inputArray) {
            stack.add(item);
        }
        System.out.println(stack);
    }
}
