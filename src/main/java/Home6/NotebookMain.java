package Home6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotebookMain {
    public static void main(String[] args) {

        Notebook honor16 = new Notebook("Honor", "HYM-W56", "AMD Ryzen 5 5600H", 16,
                "SSD", 512, true, 16, 75800.00);
        Notebook xiaomiRedmiBook = new Notebook("Xiaomi", "RedmiBook 15", "Intel Core i5 11320H",
                8, "SSD", 512, true, 15, 54990.00);
        Notebook appleAir13 = new Notebook("Apple", "MacBook Air 13", "M1",
                256, "SSD", 256, true, 13, 80900.00);
        Notebook asusVivobook = new Notebook("Asus", "E410MA-BV1841W", "Intel Pentium Silver N5030",
                4, "HDD", 500, false, 14, 31490.00);
        Notebook AsusZEPHYRUS = new Notebook("Asus", "ROG ZEPHYRUS M16", "Intel Core i9 11900H",
                16, "SSD", 1000, true, 16, 185989.00);
        Notebook msiTitan = new Notebook("MSI", "Titan GT77 12UHS-208RU", "Intel Core i9 12900HX",
                64, "SSD", 3000, true, 17, 399990.00);
        Notebook appleProA2485 = new Notebook("Apple", "MacBook Pro A2485", "M1 Max 10 core",
                64, "SSD", 512, true, 16, 349990.00);

        List<Notebook> laptopList = new ArrayList<>();

        laptopList.add(honor16);
        laptopList.add(xiaomiRedmiBook);
        laptopList.add(appleAir13);
        laptopList.add(asusVivobook);
        laptopList.add(AsusZEPHYRUS);
        laptopList.add(msiTitan);
        laptopList.add(appleProA2485);

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\nВыберите условия поиска (1-6):\n1. Процессор\n2. Объем оперативной памяти" +
                    "\n3. Тип накопителя\n4. Объем накопителя\n5. Цена\n6. Выход");
            System.out.print("\nВаш выбор: ");
            int point = Integer.parseInt(input.nextLine());

            if (point < 1 || point > 6) {
                System.out.println("\nВведите пункты от 1 до 6");
                continue;
            } else if (point == 1) {
                System.out.print("Укажите процесор: ");
                String paramCPU = input.nextLine();
                for (Notebook cpu : laptopList) {
                    if (cpu.getCpu().toLowerCase().contains(paramCPU.toLowerCase())) {
                        System.out.println(cpu.printInformation());
                    }
                }
            } else if (point == 2) {
                System.out.print("Объем оперативной памяти: ");
                int paramRAM = Integer.parseInt(input.nextLine());
                for (Notebook ram : laptopList) {
                    if (ram.getRam() == paramRAM) {
                        System.out.println(ram.printInformation());
                    }
                }
            } else if (point == 3) {
                System.out.print("Укажите тип накопителя: ");
                String paramDrive = input.nextLine();
                for (Notebook typeDrive : laptopList) {
                    if (typeDrive.getDriveType().toLowerCase().contains(paramDrive.toLowerCase())) {
                        System.out.println(typeDrive.printInformation());
                    }
                }
            } else if (point == 4) {
                System.out.print("Укажите объем накопителя: ");
                int volDrive = Integer.parseInt(input.nextLine());
                for (Notebook volumeDrive : laptopList) {
                    if (volumeDrive.getVolumeDrive() == volDrive) {
                        System.out.println(volumeDrive.printInformation());
                    }
                }
            } else if (point == 5) {
                System.out.print("Цена до: ");
                double paramPrice = Double.parseDouble(input.nextLine());
                for (Notebook price: laptopList) {
                    if (price.getPrice() <= paramPrice) {
                        System.out.println(price.printInformation());
                    }
                }
            } else if (point == 6) {
                System.out.println("До встречи!");
                input.close();
                break;
            }
        }
    }
}
