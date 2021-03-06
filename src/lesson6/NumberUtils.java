package lesson6;

public class NumberUtils {
    public static void printMin(int num1, int num2, int num3, int num4) {
        if (num1 < num2 && num1 < num3 && num1 < num4) {
            System.out.println(num1);
        }
        if (num2 < num1 && num2 < num3 && num2 < num4) {
            System.out.println(num2);
        }
        if (num3 < num1 && num3 < num2 && num3 < num4) {
            System.out.println(num3);
        }
        if (num4 < num1 && num4 < num2 && num4 < num3) {
            System.out.println(num4);
        }
    }

    public static boolean containsSymbolsInText(String text, String symbols) {
        for (int i = 0; i < symbols.length(); i++) {
            if (text.contains(symbols.charAt(i) + "")) {
                return true;
            }
        }
        return false;
    }
}