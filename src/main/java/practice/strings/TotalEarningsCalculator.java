package practice.strings;

public class TotalEarningsCalculator {

    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(getTotalEarnings(text));
    }

    public static int getTotalEarnings(String text) {
            int totalEarnings = 0;
            String charset = "заработал";
            String charset2 = "Петя -";
            String charset3 = "Маша -";

            int start = text.indexOf(charset) + charset.length();
            int end = text.indexOf("руб", start);
            String encoding = text.substring(start, end);
            totalEarnings += Integer.parseInt(encoding.trim());

            int start2 = text.indexOf(charset2) + charset2.length();
            int end2 = text.indexOf("руб", start2);
            String encoding2 = text.substring(start2, end2);
            totalEarnings += Integer.parseInt(encoding2.trim());

            int start3 = text.indexOf(charset3) + charset3.length();
            int end3 = text.indexOf("руб", start3);
            String encoding3 = text.substring(start3, end3);
            return totalEarnings += Integer.parseInt(encoding3.trim());
    }
}
            //TODO: напишите ваш код, результат вывести в консоль



