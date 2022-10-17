package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        scanner.close();
        break;
      }

      String regex = "[^0-9]";
      String phoneNumber = input.replaceAll(regex, "");
      boolean numberLength = phoneNumber.length() > 11 || phoneNumber.length() < 10;
      boolean numberFirstSymbol = phoneNumber.charAt(0) != '7' && phoneNumber.charAt(0) != '8';

      if (phoneNumber.length() == 10) {

        System.out.println(phoneNumber.replaceFirst("", "7"));

      }   else if (numberLength || numberFirstSymbol) {

        System.out.println("Неверный формат номера");

      }  else if (phoneNumber.charAt(0) == '8') {

        System.out.println(phoneNumber.replaceFirst("8", "7"));

      }  else {

        System.out.println(phoneNumber);
      }
      }
      //TODO:напишите ваш код тут, результат вывести в консоль.
    }
  }

