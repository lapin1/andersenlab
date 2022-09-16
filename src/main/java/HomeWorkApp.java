import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    //task02
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println();
        System.out.println("Banana");
        System.out.println();
        System.out.println("Apple");
    }

    //task03
    public static void checkSumSign() {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Введите a >:");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка, введите значение типа int");
            scanner.next();
        }
        a = scanner.nextInt();

        System.out.println("Введите b >:");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка, введите значение типа int");
            scanner.next();
        }
        b = scanner.nextInt();

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //task04
    public static void printColor() {
        Scanner scanner = new Scanner(System.in);
        int value;

        System.out.println("Введите значение value >:");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка, введите значение типа int");
            scanner.next();
        }
        value = scanner.nextInt();

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    //task05
    public static void compareNumbers() {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Введите a >:");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка, введите значение типа int");
            scanner.next();
        }
        a = scanner.nextInt();

        System.out.println("Введите b >:");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка, введите значение типа int");
            scanner.next();
        }
        b = scanner.nextInt();

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

}
