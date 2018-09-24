package tests;

import java.util.Arrays;
import java.util.Scanner;

public class Upr5 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Упражнение 5");
            System.out.println("Игрок номер 1 введите слово:");

            // здесь программа может сломаться, если пользователь не введет никакое число
            // а просто нажмет Enter
            String userInputW = scanner.nextLine();

            char[] wordForGuessing;
            wordForGuessing = userInputW.toCharArray(); // Хуярим ЧАР в заранее созданный МАССИВ
            //char[] chars = "hello".toCharArray(); Хуярим ЧАР в заранее созданный МАССИВ
            //char[] wordForGuessing = {'p', 'r', 'o', 'g', 'r', 'a', 'm'};
            // или полная запись вот так:
            // char[] wordForGuessing = new char[]{'p', 'r', 'o', 'g', 'r', 'a', 'm'};
            //System.out.println(wordForGuessing);
            System.out.println("Игрок два. Отгадайте слово из " + wordForGuessing.length + " букв");

            // для разгадывания слова делаем такого же размера массив символов
            // и заполняем его подчеркиваниями, раз пока ни одной буквы не угаданно
            char[] guessedWord = new char[wordForGuessing.length];
            for (int i = 0; i < guessedWord.length; i++) {
                guessedWord[i] = '_';
            }

            // обнуляем счетчик попыток
            int tryCount = 0;

            // крутимся в цикле, пока массивы не совпадают, помним, что знак ! – это частичка "НЕ",
            // которая означает отрицание
            // Arrays.equals() – позволяет сравнить два массива, возвращает true, если они совпадают
            while (!Arrays.equals(guessedWord, wordForGuessing)) {
                tryCount = tryCount + 1;
                System.out.println("Попытка " + tryCount);
                System.out.println(guessedWord);
                System.out.println("Введите букву (или 0 для выхода)");

                String userInput = scanner.nextLine();
                char userLetter;
                // здесь программа может сломаться, если пользователь не введет никакое число
                // а просто нажмет Enter
                userLetter = userInput.charAt(0);//Возвращает нулевой символ из строки в ЧАР

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

            if (Arrays.equals(guessedWord, wordForGuessing)) {
                System.out.println("Слово " + String.valueOf(wordForGuessing) + " отгадано за " + tryCount + " попыток");
            } else {
                System.out.println("Попробуйте еще раз");
            }
        }


}

/*  Смена игрока:
int currentPlayer = 1;
        while (true) {
            System.out.println("Игрок " + currentPlayer + " введите загаданное слово");
            wordForGuessing = scanner.nextLine();

            // Метод wordForGuessing.toCharArray() можно вызвать у любой строки
            // он любую строку превратить в массив символов
            guessWord(wordForGuessing.toCharArray());

            // Если вы помните тернарный оператор из 3-го занятия,
            // то можно сделать так
            currentPlayer = (currentPlayer == 1) ? 2 : 1;
        }*/
