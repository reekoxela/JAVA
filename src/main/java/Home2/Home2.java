package Home2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Home2 {
    public static void main(String[] args) {
        /*
        String line = inputLine();
        if (palindrome(line.toLowerCase())) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не палиндром");
        }
        */
        String line = testStringCreate();
        saveStringToFile(line);
    }

    private static void saveStringToFile(String line) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("src/main/resources/test.txt");
            fw.write(line);
            System.out.println("Файл src/main/resources/test.txt записан");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fw.flush();
                fw.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static String testStringCreate() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 100; i++) {
            sb.append("TEST");
        }
        return sb.toString();
    }

    private static String inputLine() {
        Scanner inputLine = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = inputLine.next();
        inputLine.close();
        return line;
    }

    private static boolean palindrome(String line) {
        char[] array = line.toCharArray();
        for(int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
