package practice.strings;

import java.util.Scanner;

public class FullNameFormatter {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        scanner.close();
        break;
      }
      int space1 = input.indexOf(' ');
      int space2 = input.lastIndexOf(' ');
      int spaceCount = 0;

      for (int i = 0; i < input.length(); i++) {
        if (input.charAt(i) == ' '){
          spaceCount++;
        }
      } if (Character.isDigit(input.charAt(0)) || spaceCount != 2) {
        System.out.println("Введенная строка не является ФИО");
        break;
      }  else {
        String lastName = input.substring(0, space1);
        String name = input.substring(space1 + 1, space2);
        String otherName = input.substring(space2 + 1);
        System.out.println("Фамилия: " + lastName + "\n" +
                "Имя: " + name + "\n" +
                "Отчество: " + otherName);
      }
      //TODO:напишите ваш код тут, результат вывести в консоль.
      //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
    }
  }
}