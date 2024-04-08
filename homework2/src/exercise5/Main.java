package exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

        System.out.println("Введіть рядки (введіть 'end', щоб завершити):");
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            lines.add(line);
        }

        System.out.println("Введені рядки:");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}

