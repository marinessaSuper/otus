package homework2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;

        String[] questions = {
                "1. Когда была основана станция Автово?",
                "2. Когда была основана станция Проспект Ветеранов?",
                "3. Какая самая глубока станция?",
        };

        String[][] answerOptions = {{"1. 1953", "2. 1956", "3. 1955"},
                {"1. 1955", "2. 1956", "3. 1977"},
                {"1. Лен проспект", "2. Адмиралтейская", "3. Невский проспект"}};

        int[] correctAnswers = {3, 1, 2};

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < answerOptions[i].length; j++) {
                System.out.println(answerOptions[i][j]);
            }

            int number = 0;
            System.out.print("Ваш ответ: ");
            while (sc.hasNext()) {
                if (sc.hasNextInt()) {
                    number = sc.nextInt();
                    if (number <= 0 || number > answerOptions[i].length) {
                        System.out.println("Извините, но это явно не варинат ответ. Попробуйте снова:");
                        continue;
                    } else {
                        System.out.println("Спасибо! Вы ввели число " + number);

                    }
                    break;
                } else {
                    sc.next();
                    System.out.println("Извините, но это явно не число. Попробуйте снова:");
                    continue;
                }
            }

            if (correctAnswers[i] == number) {
                correctCount++;
            } else {
                wrongCount++;
            }

        }
        /**
         *Выводим общий результат
         */
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}