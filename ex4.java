import java.util.Arrays;

// Реализовать стэк с помощью массива. 
// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().

public class ex4 { 
    public static void main(String[] args) {       
        Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("Размер массива: " + size(array));
        System.out.println("Массив пуст: " + empty(array));
        System.out.println("Добавить в массив элемент \"10\": " + Arrays.toString(push(array, 10)));
        System.out.println("Последний элемент массива: " + peek(array));
        System.out.println("Массив без последнего результата:" + Arrays.toString(pop(array)));
    }
    
    public static Integer size(Integer[] inputArray) {
        return inputArray.length;
    }
    public static boolean empty(Integer[] inputArray) {
        if (inputArray.length < 1) {
            return true;
        }
        return false;
    }
    public static Integer[] push(Integer[] inputArray, Integer newElement) {
        Integer[] newArray = new Integer[inputArray.length+1];
        System.arraycopy(inputArray, 0, newArray, 0, inputArray.length);
        newArray[inputArray.length] = newElement;
        return newArray;
    }
    public static Integer peek(Integer[] inputArray) {
        return inputArray[inputArray.length - 1];
    }
    public static Integer[] pop(Integer[] inputArray) {
        Integer[] newArray = new Integer[inputArray.length-1];
        System.arraycopy(inputArray, 0, newArray, 0, inputArray.length-1);
        return newArray;
    }
}
