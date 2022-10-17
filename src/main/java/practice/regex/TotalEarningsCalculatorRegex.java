package practice.regex;

public class TotalEarningsCalculatorRegex {

  public static void main(String[] args) {

  }

  public static int calculateSalarySum(String text){
    int salarySum = 0;
    String[] subStr;
    String delimiter = " ";
    subStr = text.split(delimiter);
    for (int i = 0; i < subStr.length; i++) {
      if (Character.isDigit(subStr[i].charAt(0))) {
        salarySum += Integer.parseInt(subStr[i]);
      }
    }
    //TODO: реализуйте метод
    return salarySum;
  }
}