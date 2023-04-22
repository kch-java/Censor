import java.util.Scanner;

public class Censor {

    private static final String REPLACEMENT = "***";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите текст: ");
        String text = input.nextLine();
        System.out.println("Введите нецензурное слово, которое требуется заменить: ");
        String word = input.nextLine();
        input.close();

        // переводим всё в нижний регистр
        text = text.toLowerCase();
        word = word.toLowerCase();

        int count = 0;
        while (text.contains(word)) {
            text = text.replace(word, REPLACEMENT);
            count++;
        }

        System.out.println("Найдено и заменено нецензурных слов: " + count);
        System.out.println(text);
    }
}