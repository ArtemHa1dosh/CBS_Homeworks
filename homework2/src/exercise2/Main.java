package exercise2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть 5 слів:");
        for (int i = 0; i < 5; i++) {
            words.add(scanner.nextLine());
        }

        doubleValues(words);

        System.out.println("Результат пoдвоєння слів:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void doubleValues(List<String> words) {
        int size = words.size();
        for (int i = 0; i < size*2; i += 2) {
            words.add(i, words.get(i));
        }
    }
}

