package Home4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Home4 {
    public static void main(String[] args) {
        //home4();
        reverseList();
    }

    private static void reverseList() {
        LinkedList<Integer> linkedListInt = new LinkedList<>();
        Random rm = new Random();
        for(int i = 0; i < 10; i++) {
            linkedListInt.add(rm.nextInt(100));
        }
        System.out.println("Исходный список: " + linkedListInt);
        //Collections.reverse(linkedListInt);
        LinkedList<Integer> reverseLinkedList = new LinkedList<>();
        for(int i = linkedListInt.size() - 1; i >= 0; i--) {
            reverseLinkedList.add(linkedListInt.get(i));
        }
        System.out.println("Перевернутый список: " + reverseLinkedList);
    }

    private static void home4() {
        Scanner input = new Scanner(System.in);
        LinkedList<String> lineList = new LinkedList<>();

        while (true) {
            System.out.print("Введите строку: ");
            String inputLine = input.nextLine();

            if (inputLine.isBlank()) {
                System.out.println("Строка не должна быть пустой");
                continue;
            }

            if (inputLine.equalsIgnoreCase("print")) {
                //Collections.reverse(lineList);
                //System.out.println("Перевернутый список: " + lineList.toString());
                System.out.println("Исходный список: " + lineList.toString());
                String temp = lineList.getFirst();
                lineList.set(0,lineList.get(lineList.size() - 1));
                lineList.set((lineList.size() - 1),temp);
                System.out.println("Измененный список: " + lineList.toString());
                input.close();
                break;
            }

            if (inputLine.equalsIgnoreCase("revert")) {
                System.out.println("Исходный список: " + lineList.toString());
                //lineList.removeLast();
                int previous = lineList.size() - 2;
                if (previous >= 0) {
                    lineList.remove(previous);
                    System.out.println("Удалили предыдущую строку: " + lineList.toString());
                    input.close();
                } else {
                    System.out.println("В списке " + lineList.size() + " строк");
                }
                break;
            }

            //lineList.addFirst(inputLine);
            lineList.add(inputLine);
        }
    }
}