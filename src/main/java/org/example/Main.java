package org.example;

public class Main {
    // Напишите пример перехвата и обработки исключения в блоке try-catch метода.

    public static void main(String[] args) {
        int[] numbers = new int[5];
        try {
            numbers[10] = 10;
            System.out.println("Значение добавлено");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс вне предела");
        }
    }

}