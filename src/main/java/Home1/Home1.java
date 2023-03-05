package Home1;

import java.util.Random;
import java.util.Scanner;

public class Home1 {
    public static void main(String[] args) {
        //MaxMinInArray();
        //LeapYear();
        FindNumber();
    }

    private static void FindNumber() {
        int[] array = new int[] {3,2,2,3};
        PrintArray(array,"Исходный массив: ");
        int num = 3;
        int i = 0, j = array.length - 1;
        while(i < j){
            while(i < j & array[j] == num){
                j--;
            }
            if(array[i] == num){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            i++;
        }
        PrintArray(array,"Массив после обработки: ");
    }

    //Високосный или не високосный
    private static void LeapYear() {
        Scanner input = new Scanner(System.in);
        System.out.print("Укажите год: ");
        int year = input.nextInt();
        if (IsLeapYear(year)) {
            System.out.println(year + " - год не високосный");
        } else {
            System.out.println(year + " - год високосный");
        }
    }

    //Метод провряет является ли год високосным
    private static boolean IsLeapYear(int year) {
        if(((year % 4 == 0) & (year % 100 != 0)) | (year % 400 == 0)) {
            return false;
        } else {
            return true;
        }
    }

    //Поиск минимального и максимального элементов массива
    private static void MaxMinInArray() {
        int[] array = new int[10];
        RandomInputArray(array);
        int max = array[0], min = array[0];
        for(int i : array){
            if(i > max){
                max = i;
            } else if (i < min) {
                min = i;
            }
        }
        PrintArray(array,"Массив: ");
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
    }

    //Ввод массива случайным образом
    private static void RandomInputArray(int[] massive) {
        Random rm = new Random();
        for(int i = 0; i < massive.length; i++){
            massive[i] = rm.nextInt(100);
        }
    }

    //Печать массива
    private static void PrintArray(int[] massive, String mess) {
        System.out.print(mess);
        for(int i : massive){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}