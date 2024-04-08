package exercise3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість чисел:");
        int n = scanner.nextInt();

        List<Integer> integerList = getIntegerList(n, scanner);
        int minimum = getMinimum(integerList);

        System.out.println("Мінімальне число: " + minimum);
    }

    public static List<Integer> getIntegerList(int n, Scanner scanner) {
        List<Integer> integerList = new LinkedList<>();
        System.out.println("Введіть " + n + " цілих чисел:");
        for (int i = 0; i < n; i++) {
            integerList.add(scanner.nextInt());
        }
        return integerList;
    }

    public static int getMinimum(List<Integer> integerList) {
        int min = Integer.MAX_VALUE;
        for (int num : integerList) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}

