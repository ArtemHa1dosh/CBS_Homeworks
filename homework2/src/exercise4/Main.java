package exercise4;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> families = new HashMap<>();

        System.out.println("Введіть дані про 5 міст та сім'ї (приклад: Місто Прізвище):");
        for (int i = 0; i < 5; i++) {
            String city = scanner.next();
            String family = scanner.next();
            families.put(city, family);
        }

        // Введення міста для пошуку сім'ї
        System.out.println("Введіть місто для пошуку сім'ї:");
        String city = scanner.next();

        // Виведення сім'ї, що живе у введеному місті
        String family = families.get(city);
        if (family != null) {
            System.out.println(family);
        } else {
            System.out.println("Hе знайдено.");
        }
    }
}
