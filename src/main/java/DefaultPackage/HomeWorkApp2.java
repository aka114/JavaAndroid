package DefaultPackage;

public class HomeWorkApp2 {
    public static void main(String[] args) {

        int argA = 4;
        int argB = 9;
        boolean isValueInsideRange = valueInsideRange(argA, argB);

        int argC = -1;
        printTypeOfValue(argC);

        int argD = 45;
        boolean isNegative = valueIsNegative(argD);

        String messageString = "Hello world!";
        int numberOfRepeats = 3;
        printStringWithRepeat(messageString, numberOfRepeats);

        int year = 800;
        boolean isLeapYear = thisIsLeapYear(year);
    }

    private static boolean thisIsLeapYear(int year) {
        return year % 4 == 0 & (year % 100 > 0 | year % 400 == 0);
    }

    private static void printStringWithRepeat(String messageString, int numberOfRepeats) {
        int count = 0;
        while (count < numberOfRepeats) {
            System.out.println(messageString);
            count++;
        }
    }

    private static boolean valueIsNegative(int argD) {
        return argD < 0;
    }

    private static void printTypeOfValue(int argC) {
        String typeValue = "Положительное";
        if (argC <0) {
            typeValue = "Отрицательное";
        }
        System.out.println(typeValue);
    }

    private static boolean valueInsideRange(int argA, int argB) {
        int sumAB = argB + argB;
        return sumAB >= 10 && sumAB <= 20;
    }
}
