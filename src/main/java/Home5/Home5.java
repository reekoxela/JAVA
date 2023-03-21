package Home5;

import java.util.*;

public class Home5 {
    public static void main(String[] args) {
        //myPhoneBook();
        sortEmloyees();
    }

    private static void sortEmloyees() {
        List<String> employees = Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                "Петр Петин", "Иван Ежов");

        Map<String, Integer> listNames = new HashMap<>();

        for(String empoyee : employees) {
            String name = empoyee.split("\\s")[0];
            listNames.put(name, listNames.getOrDefault(name,0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(listNames.entrySet());
        sortedList.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        for (Map.Entry<String, Integer> myMap : sortedList) {
            System.out.printf("%s: %s%n", myMap.getValue(), myMap.getKey());
        }
    }

    private static void myPhoneBook() {
        Map<String, ArrayList<String>> phoneBook = new HashMap<>();

        addPhoneNumber("Александр Иванов", "+79153973110", phoneBook);
        addPhoneNumber("Юлия Иванова", "+79153517464", phoneBook);
        addPhoneNumber("Тимофей Иванов", "+79999040710", phoneBook);
        addPhoneNumber("Александр Иванов", "+79999057210", phoneBook);
        addPhoneNumber("Тимофей Иванов", "+79161974010", phoneBook);

        printPhoneBook(phoneBook);
    }

    //Добавляем номера телефонов в телефонную книгу
    public static void addPhoneNumber(String persona, String phoneNumber, Map<String, ArrayList<String>> phoneBook) {
        if (phoneBook.containsKey(persona)) {
            phoneBook.get(persona).add(phoneNumber);
        } else {
            phoneBook.put(persona, new ArrayList<>(Arrays.asList(phoneNumber)));
        }

    }

    //Вывод списка контактов
    public static void printPhoneBook(Map<String, ArrayList<String>> phoneBook) {
        for (String persona : phoneBook.keySet()) {
            String phones = "";
            for (String phoneNumbers : phoneBook.get(persona)) {
                phones += phoneNumbers + " ";
            }
            System.out.println(persona + ": " + phones);
        }
    }
}