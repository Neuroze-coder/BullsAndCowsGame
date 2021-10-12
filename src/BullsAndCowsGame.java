import java.util.Scanner;

public class BullsAndCowsGame {
    public static void main(String[] args) {
        int bulls = 0;
        int cows = 0;
        int guesses = 1;
        boolean notFound = true;
        System.out.println("Привет, выбери уровень игры от 3 до 5 включительно");
        Scanner scanner = new Scanner(System.in);
        int levelGame = scanner.nextInt();
        if (levelGame == 3) {
            System.out.println("Уровень игры 3");
            leveGame3(guesses, notFound);
        } else if (levelGame == 4) {
            System.out.println("Уровень игры 4");
            leveGame4(guesses, notFound);
        } else if (levelGame == 5) {
            System.out.println("Уровень игры 3");
            leveGame5(guesses, notFound);
        } else {
            System.out.println("Вы ввели не верный уровень");
        }
    }

    private static void leveGame3(int guesses, boolean notFound) {
        int bulls;
        int cows;
        Scanner scan = new Scanner(System.in);
        produceRandomTarget(100, 1000, 900);
        System.out.println("Компьютер ввел  " + chosenNum); // подсказка

        while (true) {
            System.out.println("Введи предположительное число (попытка " + guesses + ")");
            String guessedNumber = scan.nextLine();
            if (guessedNumber.equals("сдаюсь")) {
                System.out.println("Ты проиграл используя " + guesses + " попыток.");
                break;
            }
            bulls = computeBulls(guessedNumber, chosenNum);
            cows = computeCows(guessedNumber, chosenNum);

            if (guesses >= 10) {
                System.out.println("Bulls = " + bulls + "\tCows = " + cows);
                System.out.println("Ты проиграл использовав " + guesses + " попыток");
                System.out.println("The correct number was: " + chosenNum);
                notFound = false;
            } else if (hasRepeatingDigits(guessedNumber)) {
                System.out.println("Ваше число не должно содержать повторяющиеся числа");
            } else if (guessedNumber.length() != 3) {
                System.out.println("Ваше число должно содержать 3 цифр");
            } else if (containsNonDigits(guessedNumber)) {
                System.out.println("Вы ввели не число");
            } else if (bulls == 3) {
                System.out.println("Bulls = " + bulls + "\tCows = " + cows);
                System.out.println("Поздравляю! Ты выиграл используя " + guesses + " попыток.");
                notFound = false;
            } else if (!hasRepeatingDigits(guessedNumber) && !containsNonDigits(guessedNumber)) {
                System.out.println("Bulls = " + bulls + "\tCows = " + cows);
                guesses++;
            }
        }
        scan.close();
    }
    private static void leveGame4(int guesses, boolean notFound) {
        int bulls;
        int cows;
        Scanner scan = new Scanner(System.in);
        produceRandomTarget(1000, 10000, 9000);
        System.out.println("Компьютер ввел  " + chosenNum); // подсказка

        while (true) {
            System.out.println("Введи предположительное число (попытка " + guesses + ")");
            String guessedNumber = scan.nextLine();
            if (guessedNumber.equals("сдаюсь")) {
                System.out.println("Ты проиграл используя " + guesses + " попыток.");
                break;
            }
            bulls = computeBulls(guessedNumber, chosenNum);
            cows = computeCows(guessedNumber, chosenNum);
            if (guesses >= 10) {
                System.out.println("Bulls = " + bulls + "\tCows = " + cows);
                System.out.println("Ты проиграл использовав " + guesses + " попыток");
                System.out.println("The correct number was: " + chosenNum);
                break;
            } else if (hasRepeatingDigits(guessedNumber)) {
                System.out.println("Ваше число не должно содержать повторяющиеся числа");
            } else if (guessedNumber.length() != 4) {
                System.out.println("Ваше число должно содержать 4 цифры");
            } else if (containsNonDigits(guessedNumber)) {
                System.out.println("Вы ввели не число");
            } else if (bulls == 4) {
                System.out.println("Bulls = " + bulls + "\tCows = " + cows);
                System.out.println("Поздравляю! Ты выиграл используя " + guesses + " попыток.");
                break;
            } else if (!hasRepeatingDigits(guessedNumber) && !containsNonDigits(guessedNumber)) {
                System.out.println("Bulls = " + bulls + "\tCows = " + cows);
                guesses++;
            }
        }
        scan.close();
    }
    private static void leveGame5(int guesses, boolean notFound) {
        int bulls;
        int cows;
        Scanner scan = new Scanner(System.in);
        produceRandomTarget(10000, 100000, 90000);
        System.out.println("Компьютер ввел  " + chosenNum); // подсказка

        while (true) {
            System.out.println("Введи предположительное число (попытка " + guesses + ")");
            String guessedNumber = scan.nextLine();
            if (guessedNumber.equals("сдаюсь")) {
                System.out.println("Ты проиграл используя " + guesses + " попыток.");
                break;
            }
            bulls = computeBulls(guessedNumber, chosenNum);
            cows = computeCows(guessedNumber, chosenNum);

            if (guesses >= 10) {
                System.out.println("Bulls = " + bulls + "\tCows = " + cows);
                System.out.println("Ты проиграл использовав " + guesses + " попыток");
                System.out.println("The correct number was: " + chosenNum);
                break;
            } else if (hasRepeatingDigits(guessedNumber)) {
                System.out.println("Ваше число не должно содержать повторяющиеся числа");
            } else if (guessedNumber.length() != 5) {
                System.out.println("Ваше число должно содержать 5 цифр");
            } else if (containsNonDigits(guessedNumber)) {
                System.out.println("Вы ввели не число");
            } else if (bulls == 5) {
                System.out.println("Bulls = " + bulls + "\tCows = " + cows);
                System.out.println("Поздравляю! Ты выиграл используя " + guesses + " попыток.");
                break;
            } else if (!hasRepeatingDigits(guessedNumber) && !containsNonDigits(guessedNumber)) {
                System.out.println("Bulls = " + bulls + "\tCows = " + cows);
                guesses++;
            }
        }
        scan.close();
    }

    private static String chosenNum = "";

    private static String produceRandomTarget(int i1, int i2, int i3) { // генерирую рандомное число
        int randomNumber = i1 + ((int) (Math.random() * i2) % i3);
        chosenNum = Integer.toString(randomNumber);
        while (hasRepeatingDigits(chosenNum)) {
            produceRandomTarget(i1, i2, i3);
        }
        return chosenNum;
    }

    private static boolean hasRepeatingDigits(String num) { // проверка на повтор
        for (int i = 0; i < num.length() - 1; i++) {
            for (int j = i + 1; j < num.length(); j++) {
                if (num.charAt(i) == num.charAt(j)) {
                    return true;
                }
            }
        }
        return false;

    }

    private static boolean containsNonDigits(String num) { // нахождение текста
        if (!num.matches("^[0-9]+$")) {
            return true;
        }
        return false;
    }

    private static int computeBulls(String num1, String num2) { // ищем быков
        int bullCounter = 0;

        for (int i = 0; i < num1.length(); i++) {
            if (num1.charAt(i) == num2.charAt(i)) {
                bullCounter++;
            }
        }
        return bullCounter;
    }

    private static int computeCows(String num1, String num2) { // ищем коров
        int cowsCounter = 0;
        for (int i = 0; i < num1.length(); i++) {
            for (int j = 0; j < num2.length(); j++) {
                if (i != j) {
                    if (num1.charAt(i) == num2.charAt(j)) {
                        cowsCounter++;
                    }
                }
            }
        }
        return cowsCounter;
    }

}

