import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class ex1 {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String temp = "";
        String[] tempArray;
        temp = scanner.nextLine();
        while (true) {
            System.out.println("Введите значение формата text~num:");
            if (temp.equals("q")) {
                break;
            }
            try {
                tempArray = temp.split("~");
            } catch (Exception e) {
                System.out.println("Нет ~");
                continue;
            }
            if (!tempArray[0].equals("print")) {
                if (linkedList.size() < Integer.parseInt(tempArray[1]))
                    for (int i = linkedList.size(); i < Integer.parseInt(tempArray[1]); i++) {
                        linkedList.add(null);
                    }
                linkedList.add(Integer.parseInt(tempArray[1]), tempArray[0]);
            } else {
                System.out.println(linkedList.get(Integer.parseInt(tempArray[1])));
            }
            System.out.println(linkedList.toString());
        }
        scanner.close();
    }
}
