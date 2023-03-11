package Home3;

import java.util.*;

public class Home3 {
    public static void main(String[] args) {
        //deleteEvenNumbers();
        //listMinMaxAverage();
        onlyStringInList();
    }

    private static void onlyStringInList() {
        ArrayList<String> array = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Введите " + (i + 1) + " элемент списка: ");
            array.add(input.next());
        }
        input.close();
        System.out.println("Исходный список: " + array);
        int number = 0;
        int i = 0;
        while (i < array.size()) {
            try {
                number = Integer.parseInt(array.get(i));
                array.remove(i);
            }
            catch (Exception ex) {
                i++;
            }
        }
        System.out.println("Только строки: " + array);
    }

    private static void listMinMaxAverage() {
        ArrayList<Integer> array = initialList(10);
        System.out.println("Исходный список: " + array);
        System.out.println("Минимальный элемент: " + Collections.min(array));
        System.out.println("Максимальный элемент: " + Collections.max(array));
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        System.out.println("Среднее арифметическое: " + (double) sum / array.size());
    }

    private static void deleteEvenNumbers() {
        ArrayList<Integer> array = initialList(10);
        System.out.println("Исходный список: " + array);
        int i = 0;
        while (i < array.size()) {
            if (array.get(i) % 2 == 0) {
                array.remove(i);
            } else {
                i++;
            }
        }
        System.out.println("Только нечетные элементы: " + array);
    }

    private static ArrayList<Integer> initialList(int length) {
        Random random = new Random();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            array.add(random.nextInt(50));
        }
        return array;
    }
}
