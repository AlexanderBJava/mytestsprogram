import java.util.Arrays;
import java.util.Scanner;

public class UprOtgaadaySlovo {
    public static void main(String[] args) {

       /* Написать код, который хранит массив букв - загаданное слово;
        спрашивает у пользователя букву,
        если такая буква входит в загаданное слово, то выводит на экран отгаданные буквы с указанием их расположения в слове;
        продолжает исполнение, пока пользователь не отгадает слово или не захочет прекратить игру, введя 0.
        Например,
                загадано слово молоко, пользователь ввел букву о, программа вывела на экран
        Верно, есть такая буква!
                _о_о_о
        Будете отгадывать дальше? (0 - для выхода или введите очередную букву)



        Создать массив символов с заранее известным словом можно так:

        char[] wordForGuessing = {'p', 'r', 'o', 'g', 'r', 'a', 'm'};
        А так вы можете создать массив, в котором будете помечать угаданные пользователем буквы:

        char[] guessedWord = new char[wordForGuessing.length];
        А чтобы определить конец игры нужно будет сравнить два массива на равенство:

        Arrays.equals(arr1, arr2) – позволяет сравнить два массива arr1 и arr2, возвращает true, если они совпадают
        Например, можно использовать в цикле, пока массивы не совпали продолжать игру:*/



        char[] wordForGuessing;
        wordForGuessing = new char[]{'p', 'r', 'o', 'g', 'r', 'a', 'm'};
        char[] guessedWord = new char[wordForGuessing.length];
        System.out.println(guessedWord);
        System.out.println(Arrays.toString(wordForGuessing));
        Scanner scan;
        scan = new Scanner(System.in);
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i]='_';
        }
        System.out.println(guessedWord);
        System.out.println("Отгадайте слово из " + wordForGuessing.length + " букв");
        int tryCount = 0;


        //char letter;
        //letter= scan.nextLine();

        while (!Arrays.equals(guessedWord, wordForGuessing)) {
// код игры
            tryCount = tryCount + 1;
            System.out.println("Попытка " + tryCount);
            System.out.println(guessedWord);
            System.out.println("Введите букву (или 0 для выхода)");

            String userInput = scan.nextLine();
            char userLetter;
            // здесь программа может сломаться, если пользователь не введет никакое число
            // а просто нажмет Enter
            userLetter = userInput.charAt(0);

            // выходим из игры, если введен 0
            if (userLetter == '0') {
                break;
            }

            // перебираем все буквы в слове
            for (int i = 0; i < wordForGuessing.length; i++) {
                // проверяем, есть ли такая буква в загаданном слове
                if (wordForGuessing[i] == userLetter) {
                    // меняем знак _ на угаданную букву
                    guessedWord[i] = userLetter;
                }
            }




        }
        if(Arrays.equals(guessedWord, wordForGuessing)){
            System.out.println("VICTORY");
        }












    }
}
