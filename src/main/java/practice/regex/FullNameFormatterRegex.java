package practice.regex;

import java.util.Scanner;

public class FullNameFormatterRegex {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        scanner.close();
        break;
      }

      String regex = "[А-я-]+\\s[А-я-]+\\s[А-я-]+$";

      if (input.matches(regex)){
      String[] subStr = input.split("\\s");
        System.out.println("Фамилия: " + subStr[0] + System.lineSeparator() +
                            "Имя: " + subStr[1] + System.lineSeparator() +
                            "Отчество: " + subStr[2]);

      //TODO:напишите ваш код тут, результат вывести в консоль.
      //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
    } else {
        System.out.println("Введенная строка не является ФИО");
      }
  }
  }
}